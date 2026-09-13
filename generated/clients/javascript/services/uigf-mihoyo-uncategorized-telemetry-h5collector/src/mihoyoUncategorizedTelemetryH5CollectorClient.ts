// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoUncategorizedTelemetryH5CollectorContext,
  MihoyoUncategorizedTelemetryH5CollectorClientOptionalParams,
  createMihoyoUncategorizedTelemetryH5Collector,
} from "./api/index.js";
import { UploadApiOperations, _getUploadApiOperations } from "./classic/uploadApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoUncategorizedTelemetryH5CollectorClientOptionalParams } from "./api/mihoyoUncategorizedTelemetryH5CollectorContext.js";

export class MihoyoUncategorizedTelemetryH5CollectorClient {
  private _client: MihoyoUncategorizedTelemetryH5CollectorContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoUncategorizedTelemetryH5CollectorClientOptionalParams = {}) {
    this._client = createMihoyoUncategorizedTelemetryH5Collector(options);
    this.pipeline = this._client.pipeline;
    this.uploadApi = _getUploadApiOperations(this._client);
  }

  /** The operation groups for uploadApi */
  public readonly uploadApi: UploadApiOperations;
}
