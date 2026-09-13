// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoLauncherSophonGlobalContext,
  MihoyoLauncherSophonGlobalClientOptionalParams,
  createMihoyoLauncherSophonGlobal,
} from "./api/index.js";
import { BuildApiOperations, _getBuildApiOperations } from "./classic/buildApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoLauncherSophonGlobalClientOptionalParams } from "./api/mihoyoLauncherSophonGlobalContext.js";

export class MihoyoLauncherSophonGlobalClient {
  private _client: MihoyoLauncherSophonGlobalContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoLauncherSophonGlobalClientOptionalParams = {}) {
    this._client = createMihoyoLauncherSophonGlobal(options);
    this.pipeline = this._client.pipeline;
    this.buildApi = _getBuildApiOperations(this._client);
  }

  /** The operation groups for buildApi */
  public readonly buildApi: BuildApiOperations;
}
