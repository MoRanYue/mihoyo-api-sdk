// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoGameCNRecordsContext,
  MihoyoGameCNRecordsClientOptionalParams,
  createMihoyoGameCNRecords,
} from "./api/index.js";
import {
  HonkaiImpactApiOperations,
  _getHonkaiImpactApiOperations,
} from "./classic/honkaiImpactApi/index.js";
import { StarRailApiOperations, _getStarRailApiOperations } from "./classic/starRailApi/index.js";
import { ZenlessApiOperations, _getZenlessApiOperations } from "./classic/zenlessApi/index.js";
import {
  ZenlessMobileApiOperations,
  _getZenlessMobileApiOperations,
} from "./classic/zenlessMobileApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoGameCNRecordsClientOptionalParams } from "./api/mihoyoGameCNRecordsContext.js";

export class MihoyoGameCNRecordsClient {
  private _client: MihoyoGameCNRecordsContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoGameCNRecordsClientOptionalParams = {}) {
    this._client = createMihoyoGameCNRecords(options);
    this.pipeline = this._client.pipeline;
    this.zenlessMobileApi = _getZenlessMobileApiOperations(this._client);
    this.zenlessApi = _getZenlessApiOperations(this._client);
    this.starRailApi = _getStarRailApiOperations(this._client);
    this.honkaiImpactApi = _getHonkaiImpactApiOperations(this._client);
  }

  /** The operation groups for zenlessMobileApi */
  public readonly zenlessMobileApi: ZenlessMobileApiOperations;
  /** The operation groups for zenlessApi */
  public readonly zenlessApi: ZenlessApiOperations;
  /** The operation groups for starRailApi */
  public readonly starRailApi: StarRailApiOperations;
  /** The operation groups for honkaiImpactApi */
  public readonly honkaiImpactApi: HonkaiImpactApiOperations;
}
