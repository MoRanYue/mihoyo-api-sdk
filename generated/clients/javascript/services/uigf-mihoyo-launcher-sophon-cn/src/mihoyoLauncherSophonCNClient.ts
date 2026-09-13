// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoLauncherSophonCNContext,
  MihoyoLauncherSophonCNClientOptionalParams,
  createMihoyoLauncherSophonCN,
} from "./api/index.js";
import { BuildApiOperations, _getBuildApiOperations } from "./classic/buildApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoLauncherSophonCNClientOptionalParams } from "./api/mihoyoLauncherSophonCNContext.js";

export class MihoyoLauncherSophonCNClient {
  private _client: MihoyoLauncherSophonCNContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoLauncherSophonCNClientOptionalParams = {}) {
    this._client = createMihoyoLauncherSophonCN(options);
    this.pipeline = this._client.pipeline;
    this.buildApi = _getBuildApiOperations(this._client);
  }

  /** The operation groups for buildApi */
  public readonly buildApi: BuildApiOperations;
}
