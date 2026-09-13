import assert from "node:assert/strict";
import test from "node:test";
import { mkdtemp, rm, writeFile } from "node:fs/promises";
import { tmpdir } from "node:os";
import { join } from "node:path";
import { collectHarEndpoints, compareEndpoints, loadOpenApiOperations } from "./compare-har.mjs";

test("HAR comparison excludes static assets and never retains request values", () => {
  const collected = collectHarEndpoints({
    log: {
      entries: [
        {
          request: {
            method: "GET",
            url: "https://api-takumi.mihoyo.com/event/example?token=secret-value&lang=zh-cn",
            queryString: [{ name: "token", value: "secret-value" }, { name: "lang", value: "zh-cn" }],
          },
          response: {
            status: 200,
            content: { text: '{"retcode":0,"data":{"token":"secret-value","enabled":true}}' },
          },
        },
        {
          request: { method: "GET", url: "https://webstatic.mihoyo.com/event/example.js" },
          response: { status: 200 },
        },
        {
          request: { method: "GET", url: "https://bbs-static.miyoushe.com/op/video.mp4" },
          response: { status: 200 },
        },
        {
          request: { method: "OPTIONS", url: "https://api-takumi.mihoyo.com/event/example" },
          response: { status: 204 },
        },
      ],
    },
  });

  assert.equal(collected.endpoints.length, 1);
  assert.deepEqual(collected.endpoints[0].query, ["lang", "token"]);
  assert.deepEqual(collected.endpoints[0].responseShape, {
    kinds: ["object"],
    properties: {
      data: {
        kinds: ["object"],
        properties: {
          enabled: { kinds: ["boolean"] },
          token: { kinds: ["string"] },
        },
      },
      retcode: { kinds: ["integer"] },
    },
  });
  assert.deepEqual(collected.endpoints[0].bodyShape, undefined);
  assert.equal(JSON.stringify(collected), JSON.stringify(collected).replaceAll("secret-value", ""));
});

test("HAR comparison retains request shapes without request values", () => {
  const collected = collectHarEndpoints({
    log: {
      entries: [{
        request: {
          method: "POST",
          url: "https://api-takumi.mihoyo.com/example",
          postData: { text: '{"token":"secret-value","config":{"enabled":true}}' },
        },
        response: { status: 200 },
      }],
    },
  });

  assert.deepEqual(collected.endpoints[0].bodyShape, {
    kinds: ["object"],
    properties: {
      config: { kinds: ["object"], properties: { enabled: { kinds: ["boolean"] } } },
      token: { kinds: ["string"] },
    },
  });
  assert.equal(JSON.stringify(collected), JSON.stringify(collected).replaceAll("secret-value", ""));
});

test("HAR comparison reports host and parameter mismatches", () => {
  const report = compareEndpoints(
    [{ method: "get", origin: "https://static.mihoyo.com", path: "/example", count: 1, statuses: [200], query: ["known", "new"], bodyKind: "object", bodyFields: ["known", "new"] }],
    [{ service: "Example", method: "get", origin: "https://api.mihoyo.com", path: "/example", query: ["known"], bodyFields: ["known"] }],
  );

  assert.equal(report[0].status, "host-mismatch");
  assert.deepEqual(report[0].undocumentedQuery, ["new"]);
  assert.deepEqual(report[0].undocumentedBodyFields, ["new"]);
});

test("HAR comparison recognizes documented MiHoYo host aliases", () => {
  const report = compareEndpoints(
    [{ method: "post", origin: "https://data-abtest-api.mihoyo.com", path: "/data_abtest_api/config/experiment/list", count: 1, statuses: [200], query: [], bodyKind: "object", bodyFields: [] }],
    [{ service: "Experiment", method: "post", origin: "https://abtest-api-data.mihoyo.com", path: "/data_abtest_api/config/experiment/list", query: [], bodyFields: [], bodyAllowsAdditionalProperties: false }],
  );

  assert.equal(report[0].status, "covered");
});

test("HAR comparison recognizes parameterized OpenAPI paths", () => {
  const report = compareEndpoints(
    [{ method: "post", origin: "https://sdk.mihoyo.com", path: "/hk4e_cn/mdk/example", count: 1, statuses: [200], query: [], bodyKind: "empty", bodyFields: [] }],
    [{ service: "Dynamic", method: "post", origin: undefined, path: "/{gameBiz}/mdk/example", query: [], bodyFields: [], bodyAllowsAdditionalProperties: false }],
  );

  assert.equal(report[0].status, "covered-by-dynamic-server");
});

test("HAR comparison recognizes properties inherited through OpenAPI allOf", async () => {
  const directory = await mkdtemp(join(tmpdir(), "uigf-har-openapi-"));
  try {
    await writeFile(join(directory, "openapi.inheritance.yaml"), `
openapi: 3.0.0
info: { title: Example, version: 1.0.0 }
paths:
  /example:
    post:
      requestBody:
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/Derived'
      responses: { '200': { description: OK } }
components:
  schemas:
    Base:
      type: object
      properties: { inherited: { type: string } }
    Derived:
      type: object
      properties: { direct: { type: string } }
      allOf:
        - $ref: '#/components/schemas/Base'
`);
    const [operation] = await loadOpenApiOperations(directory);
    assert.deepEqual(operation.bodyFields, ["direct", "inherited"]);
  } finally {
    await rm(directory, { recursive: true, force: true });
  }
});
