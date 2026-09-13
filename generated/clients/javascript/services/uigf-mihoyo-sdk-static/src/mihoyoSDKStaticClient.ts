// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoSDKStaticContext,
  MihoyoSDKStaticClientOptionalParams,
  createMihoyoSDKStatic,
} from "./api/index.js";
import {
  ConfigurationApiOperations,
  _getConfigurationApiOperations,
} from "./classic/configurationApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoSDKStaticClientOptionalParams } from "./api/mihoyoSDKStaticContext.js";

export class MihoyoSDKStaticClient {
  private _client: MihoyoSDKStaticContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoSDKStaticClientOptionalParams = {}) {
    this._client = createMihoyoSDKStatic(options);
    this.pipeline = this._client.pipeline;
    this.configurationApi = _getConfigurationApiOperations(this._client);
  }

  /** The operation groups for configurationApi */
  public readonly configurationApi: ConfigurationApiOperations;
}
