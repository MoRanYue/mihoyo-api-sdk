// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoUncategorizedTelemetryCommunityContext,
  MihoyoUncategorizedTelemetryCommunityClientOptionalParams,
  createMihoyoUncategorizedTelemetryCommunity,
} from "./api/index.js";
import { UploadApiOperations, _getUploadApiOperations } from "./classic/uploadApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoUncategorizedTelemetryCommunityClientOptionalParams } from "./api/mihoyoUncategorizedTelemetryCommunityContext.js";

export class MihoyoUncategorizedTelemetryCommunityClient {
  private _client: MihoyoUncategorizedTelemetryCommunityContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoUncategorizedTelemetryCommunityClientOptionalParams = {}) {
    this._client = createMihoyoUncategorizedTelemetryCommunity(options);
    this.pipeline = this._client.pipeline;
    this.uploadApi = _getUploadApiOperations(this._client);
  }

  /** The operation groups for uploadApi */
  public readonly uploadApi: UploadApiOperations;
}
