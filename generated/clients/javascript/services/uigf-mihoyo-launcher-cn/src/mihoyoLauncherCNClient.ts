// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoLauncherCNContext,
  MihoyoLauncherCNClientOptionalParams,
  createMihoyoLauncherCN,
} from "./api/index.js";
import { MetadataApiOperations, _getMetadataApiOperations } from "./classic/metadataApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoLauncherCNClientOptionalParams } from "./api/mihoyoLauncherCNContext.js";

export class MihoyoLauncherCNClient {
  private _client: MihoyoLauncherCNContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoLauncherCNClientOptionalParams = {}) {
    this._client = createMihoyoLauncherCN(options);
    this.pipeline = this._client.pipeline;
    this.metadataApi = _getMetadataApiOperations(this._client);
  }

  /** The operation groups for metadataApi */
  public readonly metadataApi: MetadataApiOperations;
}
