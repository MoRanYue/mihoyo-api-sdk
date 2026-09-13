// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoGameGenshinLegacyRecordContext,
  MihoyoGameGenshinLegacyRecordClientOptionalParams,
  createMihoyoGameGenshinLegacyRecord,
} from "./api/index.js";
import {
  LegacyCardApiOperations,
  _getLegacyCardApiOperations,
} from "./classic/legacyCardApi/index.js";
import { WebCardApiOperations, _getWebCardApiOperations } from "./classic/webCardApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoGameGenshinLegacyRecordClientOptionalParams } from "./api/mihoyoGameGenshinLegacyRecordContext.js";

export class MihoyoGameGenshinLegacyRecordClient {
  private _client: MihoyoGameGenshinLegacyRecordContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoGameGenshinLegacyRecordClientOptionalParams = {}) {
    this._client = createMihoyoGameGenshinLegacyRecord(options);
    this.pipeline = this._client.pipeline;
    this.webCardApi = _getWebCardApiOperations(this._client);
    this.legacyCardApi = _getLegacyCardApiOperations(this._client);
  }

  /** The operation groups for webCardApi */
  public readonly webCardApi: WebCardApiOperations;
  /** The operation groups for legacyCardApi */
  public readonly legacyCardApi: LegacyCardApiOperations;
}
