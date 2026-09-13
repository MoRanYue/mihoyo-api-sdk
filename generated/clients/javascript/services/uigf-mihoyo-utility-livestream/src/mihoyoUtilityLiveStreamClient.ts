// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoUtilityLiveStreamContext,
  MihoyoUtilityLiveStreamClientOptionalParams,
  createMihoyoUtilityLiveStream,
} from "./api/index.js";
import {
  RedemptionCodeApiOperations,
  _getRedemptionCodeApiOperations,
} from "./classic/redemptionCodeApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoUtilityLiveStreamClientOptionalParams } from "./api/mihoyoUtilityLiveStreamContext.js";

export class MihoyoUtilityLiveStreamClient {
  private _client: MihoyoUtilityLiveStreamContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoUtilityLiveStreamClientOptionalParams = {}) {
    this._client = createMihoyoUtilityLiveStream(options);
    this.pipeline = this._client.pipeline;
    this.redemptionCodeApi = _getRedemptionCodeApiOperations(this._client);
  }

  /** The operation groups for redemptionCodeApi */
  public readonly redemptionCodeApi: RedemptionCodeApiOperations;
}
