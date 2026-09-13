// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameGlobalCommunityRecordsContext } from "../../api/mihoyoGameGlobalCommunityRecordsContext.js";
import {
  getSimulatedUniverse,
  getApocalypticShadow,
  getPureFiction,
  getForgottenHall,
} from "../../api/starRailChallengeApi/operations.js";
import {
  StarRailChallengeApiGetSimulatedUniverseOptionalParams,
  StarRailChallengeApiGetApocalypticShadowOptionalParams,
  StarRailChallengeApiGetPureFictionOptionalParams,
  StarRailChallengeApiGetForgottenHallOptionalParams,
} from "../../api/starRailChallengeApi/options.js";
import { ApiResponseJsonObject } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a StarRailChallengeApi operations. */
export interface StarRailChallengeApiOperations {
  getSimulatedUniverse: (
    cookie: string,
    server: string,
    roleId: string,
    options?: StarRailChallengeApiGetSimulatedUniverseOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  getApocalypticShadow: (
    cookie: string,
    server: string,
    roleId: string,
    options?: StarRailChallengeApiGetApocalypticShadowOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  getPureFiction: (
    cookie: string,
    server: string,
    roleId: string,
    options?: StarRailChallengeApiGetPureFictionOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  getForgottenHall: (
    cookie: string,
    server: string,
    roleId: string,
    options?: StarRailChallengeApiGetForgottenHallOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
}

function _getStarRailChallengeApi(context: MihoyoGameGlobalCommunityRecordsContext) {
  return {
    getSimulatedUniverse: (
      cookie: string,
      server: string,
      roleId: string,
      options?: StarRailChallengeApiGetSimulatedUniverseOptionalParams,
    ) => getSimulatedUniverse(context, cookie, server, roleId, options),
    getApocalypticShadow: (
      cookie: string,
      server: string,
      roleId: string,
      options?: StarRailChallengeApiGetApocalypticShadowOptionalParams,
    ) => getApocalypticShadow(context, cookie, server, roleId, options),
    getPureFiction: (
      cookie: string,
      server: string,
      roleId: string,
      options?: StarRailChallengeApiGetPureFictionOptionalParams,
    ) => getPureFiction(context, cookie, server, roleId, options),
    getForgottenHall: (
      cookie: string,
      server: string,
      roleId: string,
      options?: StarRailChallengeApiGetForgottenHallOptionalParams,
    ) => getForgottenHall(context, cookie, server, roleId, options),
  };
}

export function _getStarRailChallengeApiOperations(
  context: MihoyoGameGlobalCommunityRecordsContext,
): StarRailChallengeApiOperations {
  return {
    ..._getStarRailChallengeApi(context),
  };
}
