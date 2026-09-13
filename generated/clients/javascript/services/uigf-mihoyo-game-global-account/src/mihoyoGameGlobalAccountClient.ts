// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoGameGlobalAccountContext,
  MihoyoGameGlobalAccountClientOptionalParams,
  createMihoyoGameGlobalAccount,
} from "./api/index.js";
import { BindingApiOperations, _getBindingApiOperations } from "./classic/bindingApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoGameGlobalAccountClientOptionalParams } from "./api/mihoyoGameGlobalAccountContext.js";

export class MihoyoGameGlobalAccountClient {
  private _client: MihoyoGameGlobalAccountContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoGameGlobalAccountClientOptionalParams = {}) {
    this._client = createMihoyoGameGlobalAccount(options);
    this.pipeline = this._client.pipeline;
    this.bindingApi = _getBindingApiOperations(this._client);
  }

  /** The operation groups for bindingApi */
  public readonly bindingApi: BindingApiOperations;
}
