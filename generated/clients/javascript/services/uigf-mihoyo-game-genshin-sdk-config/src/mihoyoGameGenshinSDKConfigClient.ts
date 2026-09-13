// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoGameGenshinSDKConfigContext,
  MihoyoGameGenshinSDKConfigClientOptionalParams,
  createMihoyoGameGenshinSDKConfig,
} from "./api/index.js";
import { ConfigApiOperations, _getConfigApiOperations } from "./classic/configApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoGameGenshinSDKConfigClientOptionalParams } from "./api/mihoyoGameGenshinSDKConfigContext.js";

export class MihoyoGameGenshinSDKConfigClient {
  private _client: MihoyoGameGenshinSDKConfigContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoGameGenshinSDKConfigClientOptionalParams = {}) {
    this._client = createMihoyoGameGenshinSDKConfig(options);
    this.pipeline = this._client.pipeline;
    this.configApi = _getConfigApiOperations(this._client);
  }

  /** The operation groups for configApi */
  public readonly configApi: ConfigApiOperations;
}
