// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import {
  MihoyoGameGlobalCommunityRecordsContext,
  MihoyoGameGlobalCommunityRecordsClientOptionalParams,
  createMihoyoGameGlobalCommunityRecords,
} from "./api/index.js";
import {
  GenshinChallengeApiOperations,
  _getGenshinChallengeApiOperations,
} from "./classic/genshinChallengeApi/index.js";
import {
  HonkaiImpactApiOperations,
  _getHonkaiImpactApiOperations,
} from "./classic/honkaiImpactApi/index.js";
import {
  StarRailChallengeApiOperations,
  _getStarRailChallengeApiOperations,
} from "./classic/starRailChallengeApi/index.js";
import { UserApiOperations, _getUserApiOperations } from "./classic/userApi/index.js";
import { Pipeline } from "@azure/core-rest-pipeline";

export type { MihoyoGameGlobalCommunityRecordsClientOptionalParams } from "./api/mihoyoGameGlobalCommunityRecordsContext.js";

export class MihoyoGameGlobalCommunityRecordsClient {
  private _client: MihoyoGameGlobalCommunityRecordsContext;
  /** The pipeline used by this client to make requests */
  public readonly pipeline: Pipeline;

  constructor(options: MihoyoGameGlobalCommunityRecordsClientOptionalParams = {}) {
    this._client = createMihoyoGameGlobalCommunityRecords(options);
    this.pipeline = this._client.pipeline;
    this.honkaiImpactApi = _getHonkaiImpactApiOperations(this._client);
    this.starRailChallengeApi = _getStarRailChallengeApiOperations(this._client);
    this.genshinChallengeApi = _getGenshinChallengeApiOperations(this._client);
    this.userApi = _getUserApiOperations(this._client);
  }

  /** The operation groups for honkaiImpactApi */
  public readonly honkaiImpactApi: HonkaiImpactApiOperations;
  /** The operation groups for starRailChallengeApi */
  public readonly starRailChallengeApi: StarRailChallengeApiOperations;
  /** The operation groups for genshinChallengeApi */
  public readonly genshinChallengeApi: GenshinChallengeApiOperations;
  /** The operation groups for userApi */
  public readonly userApi: UserApiOperations;
}
