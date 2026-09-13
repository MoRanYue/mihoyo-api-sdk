// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoGameGenshinAnnouncementsContext,
  MihoyoGameGenshinAnnouncementsClientOptionalParams,
  createMihoyoGameGenshinAnnouncements,
} from "./api/index.js";
import {
  AnnouncementApiOperations,
  _getAnnouncementApiOperations,
} from "./classic/announcementApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoGameGenshinAnnouncementsClientOptionalParams } from "./api/mihoyoGameGenshinAnnouncementsContext.js";

export class MihoyoGameGenshinAnnouncementsClient {
  private _client: MihoyoGameGenshinAnnouncementsContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoGameGenshinAnnouncementsClientOptionalParams = {}) {
    this._client = createMihoyoGameGenshinAnnouncements(options);
    this.pipeline = this._client.pipeline;
    this.announcementApi = _getAnnouncementApiOperations(this._client);
  }

  /** The operation groups for announcementApi */
  public readonly announcementApi: AnnouncementApiOperations;
}
