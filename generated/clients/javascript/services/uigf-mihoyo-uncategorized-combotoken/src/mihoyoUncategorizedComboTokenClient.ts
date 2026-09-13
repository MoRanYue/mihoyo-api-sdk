// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoUncategorizedComboTokenContext,
  MihoyoUncategorizedComboTokenClientOptionalParams,
  createMihoyoUncategorizedComboToken,
} from "./api/index.js";
import {
  ComboTokenApiOperations,
  _getComboTokenApiOperations,
} from "./classic/comboTokenApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoUncategorizedComboTokenClientOptionalParams } from "./api/mihoyoUncategorizedComboTokenContext.js";

export class MihoyoUncategorizedComboTokenClient {
  private _client: MihoyoUncategorizedComboTokenContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoUncategorizedComboTokenClientOptionalParams = {}) {
    this._client = createMihoyoUncategorizedComboToken(options);
    this.pipeline = this._client.pipeline;
    this.comboTokenApi = _getComboTokenApiOperations(this._client);
  }

  /** The operation groups for comboTokenApi */
  public readonly comboTokenApi: ComboTokenApiOperations;
}
