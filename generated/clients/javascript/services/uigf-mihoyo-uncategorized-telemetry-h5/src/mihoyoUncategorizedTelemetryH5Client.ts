// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoUncategorizedTelemetryH5Context,
  MihoyoUncategorizedTelemetryH5ClientOptionalParams,
  createMihoyoUncategorizedTelemetryH5,
} from "./api/index.js";
import { BatchApiOperations, _getBatchApiOperations } from "./classic/batchApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoUncategorizedTelemetryH5ClientOptionalParams } from "./api/mihoyoUncategorizedTelemetryH5Context.js";

export class MihoyoUncategorizedTelemetryH5Client {
  private _client: MihoyoUncategorizedTelemetryH5Context;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoUncategorizedTelemetryH5ClientOptionalParams = {}) {
    this._client = createMihoyoUncategorizedTelemetryH5(options);
    this.pipeline = this._client.pipeline;
    this.batchApi = _getBatchApiOperations(this._client);
  }

  /** The operation groups for batchApi */
  public readonly batchApi: BatchApiOperations;
}
