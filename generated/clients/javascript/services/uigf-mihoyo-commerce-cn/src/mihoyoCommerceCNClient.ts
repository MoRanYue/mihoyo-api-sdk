// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoCommerceCNContext,
  MihoyoCommerceCNClientOptionalParams,
  createMihoyoCommerceCN,
} from "./api/index.js";
import { ShopApiOperations, _getShopApiOperations } from "./classic/shopApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoCommerceCNClientOptionalParams } from "./api/mihoyoCommerceCNContext.js";

export class MihoyoCommerceCNClient {
  private _client: MihoyoCommerceCNContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(endpointParam: string, options: MihoyoCommerceCNClientOptionalParams = {}) {
    this._client = createMihoyoCommerceCN(endpointParam, options);
    this.pipeline = this._client.pipeline;
    this.shopApi = _getShopApiOperations(this._client);
  }

  /** The operation groups for shopApi */
  public readonly shopApi: ShopApiOperations;
}
