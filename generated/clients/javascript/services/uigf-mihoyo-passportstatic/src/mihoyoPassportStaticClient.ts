// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoPassportStaticContext,
  MihoyoPassportStaticClientOptionalParams,
  createMihoyoPassportStatic,
} from "./api/index.js";
import { SwitchApiOperations, _getSwitchApiOperations } from "./classic/switchApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoPassportStaticClientOptionalParams } from "./api/mihoyoPassportStaticContext.js";

export class MihoyoPassportStaticClient {
  private _client: MihoyoPassportStaticContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoPassportStaticClientOptionalParams = {}) {
    this._client = createMihoyoPassportStatic(options);
    this.pipeline = this._client.pipeline;
    this.switchApi = _getSwitchApiOperations(this._client);
  }

  /** The operation groups for switchApi */
  public readonly switchApi: SwitchApiOperations;
}
