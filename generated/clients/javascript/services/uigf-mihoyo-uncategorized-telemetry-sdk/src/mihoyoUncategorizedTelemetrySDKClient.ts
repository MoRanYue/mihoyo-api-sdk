// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoUncategorizedTelemetrySDKContext,
  MihoyoUncategorizedTelemetrySDKClientOptionalParams,
  createMihoyoUncategorizedTelemetrySDK,
} from "./api/index.js";
import { UploadApiOperations, _getUploadApiOperations } from "./classic/uploadApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoUncategorizedTelemetrySDKClientOptionalParams } from "./api/mihoyoUncategorizedTelemetrySDKContext.js";

export class MihoyoUncategorizedTelemetrySDKClient {
  private _client: MihoyoUncategorizedTelemetrySDKContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoUncategorizedTelemetrySDKClientOptionalParams = {}) {
    this._client = createMihoyoUncategorizedTelemetrySDK(options);
    this.pipeline = this._client.pipeline;
    this.uploadApi = _getUploadApiOperations(this._client);
  }

  /** The operation groups for uploadApi */
  public readonly uploadApi: UploadApiOperations;
}
