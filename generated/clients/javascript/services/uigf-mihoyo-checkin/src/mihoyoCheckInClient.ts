// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoCheckInContext,
  MihoyoCheckInClientOptionalParams,
  createMihoyoCheckIn,
} from "./api/index.js";
import { CheckInApiOperations, _getCheckInApiOperations } from "./classic/checkInApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoCheckInClientOptionalParams } from "./api/mihoyoCheckInContext.js";

export class MihoyoCheckInClient {
  private _client: MihoyoCheckInContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoCheckInClientOptionalParams = {}) {
    this._client = createMihoyoCheckIn(options);
    this.pipeline = this._client.pipeline;
    this.checkInApi = _getCheckInApiOperations(this._client);
  }

  /** The operation groups for checkInApi */
  public readonly checkInApi: CheckInApiOperations;
}
