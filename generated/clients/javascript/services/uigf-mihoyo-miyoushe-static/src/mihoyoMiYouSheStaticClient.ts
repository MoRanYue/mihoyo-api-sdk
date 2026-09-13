// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoMiYouSheStaticContext,
  MihoyoMiYouSheStaticClientOptionalParams,
  createMihoyoMiYouSheStatic,
} from "./api/index.js";
import {
  StaticApiHubOperations,
  _getStaticApiHubOperations,
} from "./classic/staticApiHub/index.js";
import {
  StaticMiscApiOperations,
  _getStaticMiscApiOperations,
} from "./classic/staticMiscApi/index.js";
import {
  StaticPreloadApiOperations,
  _getStaticPreloadApiOperations,
} from "./classic/staticPreloadApi/index.js";
import {
  StaticSearchApiOperations,
  _getStaticSearchApiOperations,
} from "./classic/staticSearchApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoMiYouSheStaticClientOptionalParams } from "./api/mihoyoMiYouSheStaticContext.js";

export class MihoyoMiYouSheStaticClient {
  private _client: MihoyoMiYouSheStaticContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoMiYouSheStaticClientOptionalParams = {}) {
    this._client = createMihoyoMiYouSheStatic(options);
    this.pipeline = this._client.pipeline;
    this.staticSearchApi = _getStaticSearchApiOperations(this._client);
    this.staticPreloadApi = _getStaticPreloadApiOperations(this._client);
    this.staticMiscApi = _getStaticMiscApiOperations(this._client);
    this.staticApiHub = _getStaticApiHubOperations(this._client);
  }

  /** The operation groups for staticSearchApi */
  public readonly staticSearchApi: StaticSearchApiOperations;
  /** The operation groups for staticPreloadApi */
  public readonly staticPreloadApi: StaticPreloadApiOperations;
  /** The operation groups for staticMiscApi */
  public readonly staticMiscApi: StaticMiscApiOperations;
  /** The operation groups for staticApiHub */
  public readonly staticApiHub: StaticApiHubOperations;
}
