// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoGameCNMiYouSheAccountContext,
  MihoyoGameCNMiYouSheAccountClientOptionalParams,
  createMihoyoGameCNMiYouSheAccount,
} from "./api/index.js";
import { AuthKeyApiOperations, _getAuthKeyApiOperations } from "./classic/authKeyApi/index.js";
import { BindingApiOperations, _getBindingApiOperations } from "./classic/bindingApi/index.js";
import { ReleaseApiOperations, _getReleaseApiOperations } from "./classic/releaseApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoGameCNMiYouSheAccountClientOptionalParams } from "./api/mihoyoGameCNMiYouSheAccountContext.js";

export class MihoyoGameCNMiYouSheAccountClient {
  private _client: MihoyoGameCNMiYouSheAccountContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoGameCNMiYouSheAccountClientOptionalParams = {}) {
    this._client = createMihoyoGameCNMiYouSheAccount(options);
    this.pipeline = this._client.pipeline;
    this.releaseApi = _getReleaseApiOperations(this._client);
    this.authKeyApi = _getAuthKeyApiOperations(this._client);
    this.bindingApi = _getBindingApiOperations(this._client);
  }

  /** The operation groups for releaseApi */
  public readonly releaseApi: ReleaseApiOperations;
  /** The operation groups for authKeyApi */
  public readonly authKeyApi: AuthKeyApiOperations;
  /** The operation groups for bindingApi */
  public readonly bindingApi: BindingApiOperations;
}
