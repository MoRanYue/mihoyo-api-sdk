// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoLauncherGlobalContext,
  MihoyoLauncherGlobalClientOptionalParams,
  createMihoyoLauncherGlobal,
} from "./api/index.js";
import { MetadataApiOperations, _getMetadataApiOperations } from "./classic/metadataApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoLauncherGlobalClientOptionalParams } from "./api/mihoyoLauncherGlobalContext.js";

export class MihoyoLauncherGlobalClient {
  private _client: MihoyoLauncherGlobalContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoLauncherGlobalClientOptionalParams = {}) {
    this._client = createMihoyoLauncherGlobal(options);
    this.pipeline = this._client.pipeline;
    this.metadataApi = _getMetadataApiOperations(this._client);
  }

  /** The operation groups for metadataApi */
  public readonly metadataApi: MetadataApiOperations;
}
