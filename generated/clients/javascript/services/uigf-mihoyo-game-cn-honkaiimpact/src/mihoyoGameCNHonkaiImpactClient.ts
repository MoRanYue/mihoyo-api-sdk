// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoGameCNHonkaiImpactContext,
  MihoyoGameCNHonkaiImpactClientOptionalParams,
  createMihoyoGameCNHonkaiImpact,
} from "./api/index.js";
import {
  DailyNoteApiOperations,
  _getDailyNoteApiOperations,
} from "./classic/dailyNoteApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoGameCNHonkaiImpactClientOptionalParams } from "./api/mihoyoGameCNHonkaiImpactContext.js";

export class MihoyoGameCNHonkaiImpactClient {
  private _client: MihoyoGameCNHonkaiImpactContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoGameCNHonkaiImpactClientOptionalParams = {}) {
    this._client = createMihoyoGameCNHonkaiImpact(options);
    this.pipeline = this._client.pipeline;
    this.dailyNoteApi = _getDailyNoteApiOperations(this._client);
  }

  /** The operation groups for dailyNoteApi */
  public readonly dailyNoteApi: DailyNoteApiOperations;
}
