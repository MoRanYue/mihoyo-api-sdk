// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoGameGenshinDispatchRegionListContext,
  MihoyoGameGenshinDispatchRegionListClientOptionalParams,
  createMihoyoGameGenshinDispatchRegionList,
} from "./api/index.js";
import {
  RegionListApiOperations,
  _getRegionListApiOperations,
} from "./classic/regionListApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoGameGenshinDispatchRegionListClientOptionalParams } from "./api/mihoyoGameGenshinDispatchRegionListContext.js";

export class MihoyoGameGenshinDispatchRegionListClient {
  private _client: MihoyoGameGenshinDispatchRegionListContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoGameGenshinDispatchRegionListClientOptionalParams = {}) {
    this._client = createMihoyoGameGenshinDispatchRegionList(options);
    this.pipeline = this._client.pipeline;
    this.regionListApi = _getRegionListApiOperations(this._client);
  }

  /** The operation groups for regionListApi */
  public readonly regionListApi: RegionListApiOperations;
}
