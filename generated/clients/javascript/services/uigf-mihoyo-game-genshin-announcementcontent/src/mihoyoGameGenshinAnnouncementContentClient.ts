// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoGameGenshinAnnouncementContentContext,
  MihoyoGameGenshinAnnouncementContentClientOptionalParams,
  createMihoyoGameGenshinAnnouncementContent,
} from "./api/index.js";
import { ContentApiOperations, _getContentApiOperations } from "./classic/contentApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoGameGenshinAnnouncementContentClientOptionalParams } from "./api/mihoyoGameGenshinAnnouncementContentContext.js";

export class MihoyoGameGenshinAnnouncementContentClient {
  private _client: MihoyoGameGenshinAnnouncementContentContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoGameGenshinAnnouncementContentClientOptionalParams = {}) {
    this._client = createMihoyoGameGenshinAnnouncementContent(options);
    this.pipeline = this._client.pipeline;
    this.contentApi = _getContentApiOperations(this._client);
  }

  /** The operation groups for contentApi */
  public readonly contentApi: ContentApiOperations;
}
