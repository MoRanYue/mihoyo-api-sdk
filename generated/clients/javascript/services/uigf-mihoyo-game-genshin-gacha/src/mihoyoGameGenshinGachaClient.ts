// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoGameGenshinGachaContext,
  MihoyoGameGenshinGachaClientOptionalParams,
  createMihoyoGameGenshinGacha,
} from "./api/index.js";
import { GachaLogApiOperations, _getGachaLogApiOperations } from "./classic/gachaLogApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoGameGenshinGachaClientOptionalParams } from "./api/mihoyoGameGenshinGachaContext.js";

export class MihoyoGameGenshinGachaClient {
  private _client: MihoyoGameGenshinGachaContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoGameGenshinGachaClientOptionalParams = {}) {
    this._client = createMihoyoGameGenshinGacha(options);
    this.pipeline = this._client.pipeline;
    this.gachaLogApi = _getGachaLogApiOperations(this._client);
  }

  /** The operation groups for gachaLogApi */
  public readonly gachaLogApi: GachaLogApiOperations;
}
