import type { ClientOptions } from "@azure-rest/core-client";
import type { PipelinePolicy, PipelineRequest } from "@azure/core-rest-pipeline";
import { createDsHeader, type DsGeneration } from "./ds.js";
import { dsGenerations } from "./dsOperationMap.js";

/** Configures generated clients to sign DS-protected requests automatically. */
export class DsSigner {
  /** Creates client options that sign any DS-enabled operation whose DS header is omitted. */
  static createClientOptions(salt: string): ClientOptions {
    return { additionalPolicies: [{ policy: createDsSigningPolicy(salt), position: "perRetry" }] };
  }

  /** Adds automatic DS signing without replacing existing client options or policies. */
  static configure(options: ClientOptions, salt: string): ClientOptions {
    return {
      ...options,
      additionalPolicies: [...(options.additionalPolicies ?? []),
        { policy: createDsSigningPolicy(salt), position: "perRetry" }],
    };
  }
}

/** Creates an Azure pipeline policy for callers who configure their own pipeline. */
export function createDsSigningPolicy(salt: string): PipelinePolicy {
  if (salt.length === 0) throw new Error("DS salt must be provided by the caller.");

  return {
    name: "uigfDsSigningPolicy",
    async sendRequest(request, next) {
      const generation = dsGenerations.get(new URL(request.url).pathname);
      const existing = request.headers.get("DS");
      if (generation !== undefined && (existing === undefined || existing.length === 0)) {
        request.headers.set("DS", createDsHeader({
          salt,
          generation: generation as DsGeneration,
          body: generation === 2 ? readRequestBody(request) : "",
          query: new URL(request.url).search,
        }));
      }
      return next(request);
    },
  };
}

function readRequestBody(request: PipelineRequest): string {
  const body = request.body;
  if (body === undefined || body === null) return "";
  if (typeof body === "string") return body;
  if (body instanceof ArrayBuffer || ArrayBuffer.isView(body)) return new TextDecoder().decode(body);
  throw new TypeError("Automatic V2 DS signing requires a serialized string or byte request body.");
}
