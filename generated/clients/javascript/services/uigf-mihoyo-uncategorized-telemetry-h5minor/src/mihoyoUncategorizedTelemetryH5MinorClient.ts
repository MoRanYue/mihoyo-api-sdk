// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoUncategorizedTelemetryH5MinorContext,
  MihoyoUncategorizedTelemetryH5MinorClientOptionalParams,
  createMihoyoUncategorizedTelemetryH5Minor,
} from "./api/index.js";
import { BatchApiOperations, _getBatchApiOperations } from "./classic/batchApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoUncategorizedTelemetryH5MinorClientOptionalParams } from "./api/mihoyoUncategorizedTelemetryH5MinorContext.js";

export class MihoyoUncategorizedTelemetryH5MinorClient {
  private _client: MihoyoUncategorizedTelemetryH5MinorContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoUncategorizedTelemetryH5MinorClientOptionalParams = {}) {
    this._client = createMihoyoUncategorizedTelemetryH5Minor(options);
    this.pipeline = this._client.pipeline;
    this.batchApi = _getBatchApiOperations(this._client);
  }

  /** The operation groups for batchApi */
  public readonly batchApi: BatchApiOperations;
}
