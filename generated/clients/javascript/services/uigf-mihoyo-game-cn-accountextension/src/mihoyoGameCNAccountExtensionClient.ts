// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoGameCNAccountExtensionContext,
  MihoyoGameCNAccountExtensionClientOptionalParams,
  createMihoyoGameCNAccountExtension,
} from "./api/index.js";
import { PatchApiOperations, _getPatchApiOperations } from "./classic/patchApi/index.js";
import { RedDotApiOperations, _getRedDotApiOperations } from "./classic/redDotApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoGameCNAccountExtensionClientOptionalParams } from "./api/mihoyoGameCNAccountExtensionContext.js";

export class MihoyoGameCNAccountExtensionClient {
  private _client: MihoyoGameCNAccountExtensionContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoGameCNAccountExtensionClientOptionalParams = {}) {
    this._client = createMihoyoGameCNAccountExtension(options);
    this.pipeline = this._client.pipeline;
    this.patchApi = _getPatchApiOperations(this._client);
    this.redDotApi = _getRedDotApiOperations(this._client);
  }

  /** The operation groups for patchApi */
  public readonly patchApi: PatchApiOperations;
  /** The operation groups for redDotApi */
  public readonly redDotApi: RedDotApiOperations;
}
