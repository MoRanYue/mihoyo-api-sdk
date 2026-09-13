// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoUncategorizedUGCContext,
  MihoyoUncategorizedUGCClientOptionalParams,
  createMihoyoUncategorizedUGC,
} from "./api/index.js";
import { LevelApiOperations, _getLevelApiOperations } from "./classic/levelApi/index.js";
import { TokenApiOperations, _getTokenApiOperations } from "./classic/tokenApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoUncategorizedUGCClientOptionalParams } from "./api/mihoyoUncategorizedUGCContext.js";

export class MihoyoUncategorizedUGCClient {
  private _client: MihoyoUncategorizedUGCContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoUncategorizedUGCClientOptionalParams = {}) {
    this._client = createMihoyoUncategorizedUGC(options);
    this.pipeline = this._client.pipeline;
    this.levelApi = _getLevelApiOperations(this._client);
    this.tokenApi = _getTokenApiOperations(this._client);
  }

  /** The operation groups for levelApi */
  public readonly levelApi: LevelApiOperations;
  /** The operation groups for tokenApi */
  public readonly tokenApi: TokenApiOperations;
}
