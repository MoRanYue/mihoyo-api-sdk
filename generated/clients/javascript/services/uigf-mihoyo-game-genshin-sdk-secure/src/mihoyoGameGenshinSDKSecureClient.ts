// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoGameGenshinSDKSecureContext,
  MihoyoGameGenshinSDKSecureClientOptionalParams,
  createMihoyoGameGenshinSDKSecure,
} from "./api/index.js";
import { SecureApiOperations, _getSecureApiOperations } from "./classic/secureApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoGameGenshinSDKSecureClientOptionalParams } from "./api/mihoyoGameGenshinSDKSecureContext.js";

export class MihoyoGameGenshinSDKSecureClient {
  private _client: MihoyoGameGenshinSDKSecureContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoGameGenshinSDKSecureClientOptionalParams = {}) {
    this._client = createMihoyoGameGenshinSDKSecure(options);
    this.pipeline = this._client.pipeline;
    this.secureApi = _getSecureApiOperations(this._client);
  }

  /** The operation groups for secureApi */
  public readonly secureApi: SecureApiOperations;
}
