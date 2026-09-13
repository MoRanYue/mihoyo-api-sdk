// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoGameGenshinRecordContext,
  MihoyoGameGenshinRecordClientOptionalParams,
  createMihoyoGameGenshinRecord,
} from "./api/index.js";
import { CardApiOperations, _getCardApiOperations } from "./classic/cardApi/index.js";
import {
  GameRecordApiOperations,
  _getGameRecordApiOperations,
} from "./classic/gameRecordApi/index.js";
import { GcgApiOperations, _getGcgApiOperations } from "./classic/gcgApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoGameGenshinRecordClientOptionalParams } from "./api/mihoyoGameGenshinRecordContext.js";

export class MihoyoGameGenshinRecordClient {
  private _client: MihoyoGameGenshinRecordContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoGameGenshinRecordClientOptionalParams = {}) {
    this._client = createMihoyoGameGenshinRecord(options);
    this.pipeline = this._client.pipeline;
    this.cardApi = _getCardApiOperations(this._client);
    this.gcgApi = _getGcgApiOperations(this._client);
    this.gameRecordApi = _getGameRecordApiOperations(this._client);
  }

  /** The operation groups for cardApi */
  public readonly cardApi: CardApiOperations;
  /** The operation groups for gcgApi */
  public readonly gcgApi: GcgApiOperations;
  /** The operation groups for gameRecordApi */
  public readonly gameRecordApi: GameRecordApiOperations;
}
