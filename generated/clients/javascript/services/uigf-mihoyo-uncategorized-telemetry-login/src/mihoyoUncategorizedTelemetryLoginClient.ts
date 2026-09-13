// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoUncategorizedTelemetryLoginContext,
  MihoyoUncategorizedTelemetryLoginClientOptionalParams,
  createMihoyoUncategorizedTelemetryLogin,
} from "./api/index.js";
import { UploadApiOperations, _getUploadApiOperations } from "./classic/uploadApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoUncategorizedTelemetryLoginClientOptionalParams } from "./api/mihoyoUncategorizedTelemetryLoginContext.js";

export class MihoyoUncategorizedTelemetryLoginClient {
  private _client: MihoyoUncategorizedTelemetryLoginContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoUncategorizedTelemetryLoginClientOptionalParams = {}) {
    this._client = createMihoyoUncategorizedTelemetryLogin(options);
    this.pipeline = this._client.pipeline;
    this.uploadApi = _getUploadApiOperations(this._client);
  }

  /** The operation groups for uploadApi */
  public readonly uploadApi: UploadApiOperations;
}
