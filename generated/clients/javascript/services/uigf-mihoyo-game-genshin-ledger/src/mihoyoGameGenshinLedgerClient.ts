// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoGameGenshinLedgerContext,
  MihoyoGameGenshinLedgerClientOptionalParams,
  createMihoyoGameGenshinLedger,
} from "./api/index.js";
import { LedgerApiOperations, _getLedgerApiOperations } from "./classic/ledgerApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoGameGenshinLedgerClientOptionalParams } from "./api/mihoyoGameGenshinLedgerContext.js";

export class MihoyoGameGenshinLedgerClient {
  private _client: MihoyoGameGenshinLedgerContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoGameGenshinLedgerClientOptionalParams = {}) {
    this._client = createMihoyoGameGenshinLedger(options);
    this.pipeline = this._client.pipeline;
    this.ledgerApi = _getLedgerApiOperations(this._client);
  }

  /** The operation groups for ledgerApi */
  public readonly ledgerApi: LedgerApiOperations;
}
