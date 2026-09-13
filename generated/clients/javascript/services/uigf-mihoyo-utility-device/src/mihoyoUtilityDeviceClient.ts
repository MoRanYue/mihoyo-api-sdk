// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoUtilityDeviceContext,
  MihoyoUtilityDeviceClientOptionalParams,
  createMihoyoUtilityDevice,
} from "./api/index.js";
import {
  FingerprintApiOperations,
  _getFingerprintApiOperations,
} from "./classic/fingerprintApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoUtilityDeviceClientOptionalParams } from "./api/mihoyoUtilityDeviceContext.js";

export class MihoyoUtilityDeviceClient {
  private _client: MihoyoUtilityDeviceContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoUtilityDeviceClientOptionalParams = {}) {
    this._client = createMihoyoUtilityDevice(options);
    this.pipeline = this._client.pipeline;
    this.fingerprintApi = _getFingerprintApiOperations(this._client);
  }

  /** The operation groups for fingerprintApi */
  public readonly fingerprintApi: FingerprintApiOperations;
}
