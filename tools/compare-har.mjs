import { readFile, readdir } from "node:fs/promises";
import { basename, extname, resolve } from "node:path";
import { fileURLToPath } from "node:url";
import { parse } from "yaml";

const serviceHostPattern = /(?:mihoyo|hoyoverse|miyoushe|yuanshen)\.com$/i;
const knownHostAliases = new Map([
  ["https://data-abtest-api.mihoyo.com", "https://abtest-api-data.mihoyo.com"],
]);
const staticExtensions = new Set([
  ".avif", ".css", ".gif", ".html", ".ico", ".jpeg", ".jpg", ".js", ".json", ".map", ".mp4", ".png", ".svg", ".webm", ".webp", ".woff", ".woff2",
]);
const httpMethods = new Set(["delete", "get", "head", "options", "patch", "post", "put"]);

function sorted(values) {
  return [...new Set(values)].sort((left, right) => left.localeCompare(right));
}

function parseJsonWithoutDetails(text, description) {
  try {
    return JSON.parse(text.charCodeAt(0) === 0xfeff ? text.slice(1) : text);
  } catch {
    throw new Error(`${description} is not valid JSON.`);
  }
}

function isApiCandidate(request, url) {
  const method = String(request.method ?? "").toLowerCase();
  return (
    method !== "options" &&
    httpMethods.has(method) &&
    serviceHostPattern.test(url.hostname) &&
    !staticExtensions.has(extname(url.pathname).toLowerCase())
  );
}

function extractBodyShape(postData) {
  if (!postData?.text) return { kind: "empty", fields: [] };

  try {
    const value = JSON.parse(postData.text);
    if (Array.isArray(value)) return { kind: "array", fields: [], shape: jsonValueShape(value) };
    if (value && typeof value === "object") {
      return { kind: "object", fields: sorted(Object.keys(value)), shape: jsonValueShape(value) };
    }
  } catch {
    // A body can be signed, compressed, or otherwise opaque. Do not expose it.
  }

  return { kind: "opaque", fields: [] };
}

function jsonValueShape(value) {
  if (value === null) return { kinds: ["null"] };
  if (Array.isArray(value)) {
    return {
      kinds: ["array"],
      ...(value.length ? { items: value.map(jsonValueShape).reduce(mergeJsonShapes) } : {}),
    };
  }
  if (typeof value === "object") {
    return {
      kinds: ["object"],
      properties: Object.fromEntries(Object.entries(value)
        .map(([name, property]) => [name, jsonValueShape(property)])
        .sort(([left], [right]) => left.localeCompare(right))),
    };
  }
  if (typeof value === "number") return { kinds: [Number.isInteger(value) ? "integer" : "number"] };
  return { kinds: [typeof value] };
}

function mergeJsonShapes(left, right) {
  if (!left) return right;
  if (!right) return left;

  const kinds = sorted([...left.kinds, ...right.kinds]);
  const merged = { kinds };
  if (kinds.includes("array")) {
    const items = mergeJsonShapes(left.items, right.items);
    if (items) merged.items = items;
  }
  if (kinds.includes("object")) {
    const propertyNames = sorted([
      ...Object.keys(left.properties ?? {}),
      ...Object.keys(right.properties ?? {}),
    ]);
    merged.properties = Object.fromEntries(propertyNames.map((name) => [
      name,
      mergeJsonShapes(left.properties?.[name], right.properties?.[name]),
    ]));
  }
  return merged;
}

function extractResponseShape(content) {
  if (!content?.text) return { kind: "empty" };
  if (content.encoding) return { kind: "opaque" };
  try {
    return { kind: "json", shape: jsonValueShape(JSON.parse(content.text)) };
  } catch {
    return { kind: "opaque" };
  }
}

/**
 * Extracts API-shaped MiHoYo-family requests without retaining query values,
 * headers, cookies, or payload values from a HAR file.
 */
export function collectHarEndpoints(har) {
  const endpoints = new Map();
  let totalEntries = 0;

  for (const entry of har.log?.entries ?? []) {
    totalEntries += 1;
    const request = entry.request ?? {};
    let url;
    try {
      url = new URL(request.url);
    } catch {
      continue;
    }
    if (!isApiCandidate(request, url)) continue;

    const method = String(request.method ?? "GET").toLowerCase();
    const key = `${method} ${url.origin}${url.pathname}`;
    const endpoint = endpoints.get(key) ?? {
      method,
      origin: url.origin,
      path: url.pathname,
      count: 0,
      query: new Set(),
      statuses: new Set(),
      bodyKind: "empty",
      bodyFields: new Set(),
      bodyShape: undefined,
      responseKind: "empty",
      responseShape: undefined,
    };
    endpoint.count += 1;
    for (const parameter of request.queryString ?? []) endpoint.query.add(parameter.name);
    if ((request.queryString?.length ?? 0) === 0) {
      for (const name of url.searchParams.keys()) endpoint.query.add(name);
    }
    if (entry.response?.status !== undefined) endpoint.statuses.add(entry.response.status);

    const body = extractBodyShape(request.postData);
    if (body.kind !== "empty") endpoint.bodyKind = body.kind;
    for (const field of body.fields) endpoint.bodyFields.add(field);
    if (body.shape) endpoint.bodyShape = mergeJsonShapes(endpoint.bodyShape, body.shape);
    const response = extractResponseShape(entry.response?.content);
    if (response.kind !== "empty") endpoint.responseKind = response.kind;
    if (response.shape) endpoint.responseShape = mergeJsonShapes(endpoint.responseShape, response.shape);
    endpoints.set(key, endpoint);
  }

  return {
    totalEntries,
    endpoints: [...endpoints.values()]
      .map((endpoint) => ({
        ...endpoint,
        query: sorted(endpoint.query),
        statuses: [...endpoint.statuses].sort((left, right) => left - right),
        bodyFields: sorted(endpoint.bodyFields),
      }))
      .sort((left, right) => `${left.method} ${left.origin}${left.path}`.localeCompare(`${right.method} ${right.origin}${right.path}`)),
  };
}

function resolveSchema(schema, document) {
  if (!schema?.$ref) return schema;
  const prefix = "#/components/schemas/";
  if (!schema.$ref.startsWith(prefix)) return schema;
  const resolved = document.components?.schemas?.[schema.$ref.slice(prefix.length)];
  return resolved ? resolveSchema(resolved, document) : schema;
}

function resolveParameter(parameter, document) {
  if (!parameter?.$ref) return parameter;
  const prefix = "#/components/parameters/";
  if (!parameter.$ref.startsWith(prefix)) return parameter;
  return document.components?.parameters?.[parameter.$ref.slice(prefix.length)] ?? parameter;
}

function declaredBodyContract(operation, document) {
  const content = operation.requestBody?.content ?? {};
  const mediaType = content["application/json"] ?? Object.values(content)[0];
  const schema = resolveSchema(mediaType?.schema, document);
  const bodySchema = schema?.items ?? schema;
  const body = collectBodySchemaContract(bodySchema, document);
  return {
    fields: body.fields,
    allowsAdditionalProperties: body.allowsAdditionalProperties,
  };
}

function collectBodySchemaContract(schema, document) {
  const resolved = resolveSchema(schema, document);
  if (!resolved) return { fields: [], allowsAdditionalProperties: false };

  const inherited = (resolved.allOf ?? []).map((part) => collectBodySchemaContract(part, document));
  return {
    fields: sorted([
      ...Object.keys(resolved.properties ?? {}),
      ...inherited.flatMap((part) => part.fields),
    ]),
    allowsAdditionalProperties: Boolean(resolved.additionalProperties) || inherited.some((part) => part.allowsAdditionalProperties),
  };
}

function serverOrigin(server) {
  if (!server?.url || server.url.includes("{")) return undefined;
  try {
    return new URL(server.url).origin;
  } catch {
    return undefined;
  }
}

function sameServiceOrigin(left, right) {
  return left === right || Boolean(left && right) && (
    knownHostAliases.get(left) === right || knownHostAliases.get(right) === left
  );
}

/** Reads emitted OpenAPI documents into a host-aware operation index. */
export async function loadOpenApiOperations(openapiDirectory) {
  const operations = [];
  for (const file of await readdir(openapiDirectory)) {
    if (!file.startsWith("openapi.") || !file.endsWith(".yaml")) continue;
    const document = parse(await readFile(resolve(openapiDirectory, file), "utf8"));
    const servers = document.servers?.length ? document.servers : [{}];
    for (const [path, pathItem] of Object.entries(document.paths ?? {})) {
      for (const [method, operation] of Object.entries(pathItem ?? {})) {
        if (!httpMethods.has(method) || !operation) continue;
        const query = sorted(
          (operation.parameters ?? [])
            .map((parameter) => resolveParameter(parameter, document))
            .filter((parameter) => parameter.in === "query")
            .map((parameter) => parameter.name),
        );
        for (const server of servers) {
          operations.push({
            service: document.info?.title ?? basename(file, ".yaml"),
            method,
            path,
            origin: serverOrigin(server),
            query,
            ...(() => {
              const body = declaredBodyContract(operation, document);
              return { bodyFields: body.fields, bodyAllowsAdditionalProperties: body.allowsAdditionalProperties };
            })(),
          });
        }
      }
    }
  }
  return operations;
}

function difference(left, right) {
  const rightSet = new Set(right);
  return left.filter((value) => !rightSet.has(value));
}

function pathMatches(template, path) {
  const templateParts = template.split("/");
  const pathParts = path.split("/");
  return templateParts.length === pathParts.length && templateParts.every((part, index) => (
    (part.startsWith("{") && part.endsWith("}")) || part === pathParts[index]
  ));
}

/** Compares redacted HAR endpoint metadata with emitted OpenAPI operations. */
export function compareEndpoints(harEndpoints, operations) {
  return harEndpoints.map((endpoint) => {
    const routeMatches = operations.filter(
      (operation) => operation.method === endpoint.method && pathMatches(operation.path, endpoint.path),
    );
    const exactMatches = routeMatches.filter((operation) => sameServiceOrigin(operation.origin, endpoint.origin));
    const dynamicMatches = routeMatches.filter((operation) => operation.origin === undefined);
    const matches = exactMatches.length ? exactMatches : dynamicMatches.length ? dynamicMatches : routeMatches;
    const declaredQuery = sorted(matches.flatMap((operation) => operation.query));
    const declaredBodyFields = sorted(matches.flatMap((operation) => operation.bodyFields));
    const allowsAdditionalBodyFields = matches.some((operation) => operation.bodyAllowsAdditionalProperties);
    const status = exactMatches.length
      ? "covered"
      : dynamicMatches.length
        ? "covered-by-dynamic-server"
        : routeMatches.length
          ? "host-mismatch"
          : "missing";

    return {
      method: endpoint.method,
      origin: endpoint.origin,
      path: endpoint.path,
      count: endpoint.count,
      statuses: endpoint.statuses,
      status,
      services: sorted(matches.map((operation) => operation.service)),
      undocumentedQuery: difference(endpoint.query, declaredQuery),
      undocumentedBodyFields: allowsAdditionalBodyFields ? [] : difference(endpoint.bodyFields, declaredBodyFields),
      bodyKind: endpoint.bodyKind,
      bodyShape: endpoint.bodyShape,
      responseKind: endpoint.responseKind,
      responseShape: endpoint.responseShape,
    };
  });
}

export async function compareHarFile(harPath, openapiDirectory) {
  const harText = await readFile(harPath, "utf8");
  const har = parseJsonWithoutDetails(harText, "HAR file");
  const collected = collectHarEndpoints(har);
  const operations = await loadOpenApiOperations(openapiDirectory);
  return {
    harPath,
    entryCount: collected.totalEntries,
    openApiOperationCount: operations.length,
    endpoints: compareEndpoints(collected.endpoints, operations),
  };
}

function formatReport(report) {
  const totals = Object.groupBy(report.endpoints, (endpoint) => endpoint.status);
  const summary = ["covered", "covered-by-dynamic-server", "host-mismatch", "missing"]
    .map((status) => `${status}=${totals[status]?.length ?? 0}`)
    .join(", ");
  const lines = [
    `HAR entries: ${report.entryCount}; API candidates: ${report.endpoints.length}; OpenAPI operations: ${report.openApiOperationCount}.`,
    summary,
  ];

  for (const endpoint of report.endpoints) {
    const details = [];
    if (endpoint.services.length) details.push(`services=${endpoint.services.join(",")}`);
    if (endpoint.undocumentedQuery.length) details.push(`query missing from contract=${endpoint.undocumentedQuery.join(",")}`);
    if (endpoint.undocumentedBodyFields.length) details.push(`body fields missing from contract=${endpoint.undocumentedBodyFields.join(",")}`);
    if (endpoint.bodyKind === "array" || endpoint.bodyKind === "opaque") details.push(`body=${endpoint.bodyKind}`);
    lines.push(`[${endpoint.status}] ${endpoint.method.toUpperCase()} ${endpoint.origin}${endpoint.path}${details.length ? ` | ${details.join("; ")}` : ""}`);
  }
  return lines.join("\n");
}

function responseShapeReport(report) {
  return {
    harPath: report.harPath,
    endpoints: report.endpoints
      .filter((endpoint) => endpoint.responseShape)
      .map(({ method, origin, path, responseKind, responseShape }) => ({
        method,
        origin,
        path,
        responseKind,
        responseShape,
      })),
  };
}

function requestShapeReport(report) {
  return {
    harPath: report.harPath,
    endpoints: report.endpoints
      .filter((endpoint) => endpoint.bodyShape)
      .map(({ method, origin, path, bodyKind, bodyShape }) => ({
        method,
        origin,
        path,
        bodyKind,
        bodyShape,
      })),
  };
}

async function main() {
  const [harPath, ...argumentsList] = process.argv.slice(2);
  if (!harPath) {
    throw new Error("Usage: node tools/compare-har.mjs <capture.har> [--openapi <directory>] [--json] [--request-shapes] [--response-shapes]");
  }
  const json = argumentsList.includes("--json");
  const requestShapes = argumentsList.includes("--request-shapes");
  const responseShapes = argumentsList.includes("--response-shapes");
  const openapiFlag = argumentsList.indexOf("--openapi");
  const openapiDirectory = openapiFlag === -1
    ? resolve(process.cwd(), "generated", "openapi")
    : resolve(argumentsList[openapiFlag + 1] ?? "");
  if (openapiFlag !== -1 && !argumentsList[openapiFlag + 1]) {
    throw new Error("--openapi requires a directory.");
  }

  const report = await compareHarFile(resolve(harPath), openapiDirectory);
  console.log(requestShapes
    ? JSON.stringify(requestShapeReport(report), null, 2)
    : responseShapes
    ? JSON.stringify(responseShapeReport(report), null, 2)
    : json
      ? JSON.stringify(report, null, 2)
      : formatReport(report));
}

const invokedPath = process.argv[1] && resolve(process.argv[1]);
if (invokedPath === fileURLToPath(import.meta.url)) {
  main().catch((error) => {
    console.error(error instanceof Error ? error.message : "Unable to compare HAR file.");
    process.exitCode = 1;
  });
}
