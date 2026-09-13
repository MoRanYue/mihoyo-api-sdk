// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoUncategorizedTelemetryCrashContext,
  MihoyoUncategorizedTelemetryCrashClientOptionalParams,
  createMihoyoUncategorizedTelemetryCrash,
} from "./api/index.js";
import { CrashApiOperations, _getCrashApiOperations } from "./classic/crashApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoUncategorizedTelemetryCrashClientOptionalParams } from "./api/mihoyoUncategorizedTelemetryCrashContext.js";

export class MihoyoUncategorizedTelemetryCrashClient {
  private _client: MihoyoUncategorizedTelemetryCrashContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoUncategorizedTelemetryCrashClientOptionalParams = {}) {
    this._client = createMihoyoUncategorizedTelemetryCrash(options);
    this.pipeline = this._client.pipeline;
    this.crashApi = _getCrashApiOperations(this._client);
  }

  /** The operation groups for crashApi */
  public readonly crashApi: CrashApiOperations;
}
