// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoGameGenshinDispatchCurrentRegionContext,
  MihoyoGameGenshinDispatchCurrentRegionClientOptionalParams,
  createMihoyoGameGenshinDispatchCurrentRegion,
} from "./api/index.js";
import {
  CurrentRegionApiOperations,
  _getCurrentRegionApiOperations,
} from "./classic/currentRegionApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoGameGenshinDispatchCurrentRegionClientOptionalParams } from "./api/mihoyoGameGenshinDispatchCurrentRegionContext.js";

export class MihoyoGameGenshinDispatchCurrentRegionClient {
  private _client: MihoyoGameGenshinDispatchCurrentRegionContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoGameGenshinDispatchCurrentRegionClientOptionalParams = {}) {
    this._client = createMihoyoGameGenshinDispatchCurrentRegion(options);
    this.pipeline = this._client.pipeline;
    this.currentRegionApi = _getCurrentRegionApiOperations(this._client);
  }

  /** The operation groups for currentRegionApi */
  public readonly currentRegionApi: CurrentRegionApiOperations;
}
