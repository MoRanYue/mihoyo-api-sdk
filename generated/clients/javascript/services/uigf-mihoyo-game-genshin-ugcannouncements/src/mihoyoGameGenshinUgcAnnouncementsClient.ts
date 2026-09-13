// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoGameGenshinUgcAnnouncementsContext,
  MihoyoGameGenshinUgcAnnouncementsClientOptionalParams,
  createMihoyoGameGenshinUgcAnnouncements,
} from "./api/index.js";
import { UgcApiOperations, _getUgcApiOperations } from "./classic/ugcApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoGameGenshinUgcAnnouncementsClientOptionalParams } from "./api/mihoyoGameGenshinUgcAnnouncementsContext.js";

export class MihoyoGameGenshinUgcAnnouncementsClient {
  private _client: MihoyoGameGenshinUgcAnnouncementsContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoGameGenshinUgcAnnouncementsClientOptionalParams = {}) {
    this._client = createMihoyoGameGenshinUgcAnnouncements(options);
    this.pipeline = this._client.pipeline;
    this.ugcApi = _getUgcApiOperations(this._client);
  }

  /** The operation groups for ugcApi */
  public readonly ugcApi: UgcApiOperations;
}
