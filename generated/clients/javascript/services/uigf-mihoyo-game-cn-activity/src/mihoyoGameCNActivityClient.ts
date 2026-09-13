// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoGameCNActivityContext,
  MihoyoGameCNActivityClientOptionalParams,
  createMihoyoGameCNActivity,
} from "./api/index.js";
import { StrategyApiOperations, _getStrategyApiOperations } from "./classic/strategyApi/index.js";
import {
  ZenlessFeedbackApiOperations,
  _getZenlessFeedbackApiOperations,
} from "./classic/zenlessFeedbackApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoGameCNActivityClientOptionalParams } from "./api/mihoyoGameCNActivityContext.js";

export class MihoyoGameCNActivityClient {
  private _client: MihoyoGameCNActivityContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoGameCNActivityClientOptionalParams = {}) {
    this._client = createMihoyoGameCNActivity(options);
    this.pipeline = this._client.pipeline;
    this.zenlessFeedbackApi = _getZenlessFeedbackApiOperations(this._client);
    this.strategyApi = _getStrategyApiOperations(this._client);
  }

  /** The operation groups for zenlessFeedbackApi */
  public readonly zenlessFeedbackApi: ZenlessFeedbackApiOperations;
  /** The operation groups for strategyApi */
  public readonly strategyApi: StrategyApiOperations;
}
