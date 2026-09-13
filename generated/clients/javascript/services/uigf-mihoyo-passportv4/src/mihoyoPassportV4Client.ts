// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoPassportV4Context,
  MihoyoPassportV4ClientOptionalParams,
  createMihoyoPassportV4,
} from "./api/index.js";
import { SessionApiOperations, _getSessionApiOperations } from "./classic/sessionApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoPassportV4ClientOptionalParams } from "./api/mihoyoPassportV4Context.js";

export class MihoyoPassportV4Client {
  private _client: MihoyoPassportV4Context;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoPassportV4ClientOptionalParams = {}) {
    this._client = createMihoyoPassportV4(options);
    this.pipeline = this._client.pipeline;
    this.sessionApi = _getSessionApiOperations(this._client);
  }

  /** The operation groups for sessionApi */
  public readonly sessionApi: SessionApiOperations;
}
