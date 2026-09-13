// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameCNRecordsContext } from "../../api/mihoyoGameCNRecordsContext.js";
import {
  getChallengePeak,
  getSimulatedUniverse,
  getApocalypticShadow,
  getPureFiction,
  getForgottenHall,
  getDailyNote,
  getIndex,
} from "../../api/starRailApi/operations.js";
import {
  StarRailApiGetChallengePeakOptionalParams,
  StarRailApiGetSimulatedUniverseOptionalParams,
  StarRailApiGetApocalypticShadowOptionalParams,
  StarRailApiGetPureFictionOptionalParams,
  StarRailApiGetForgottenHallOptionalParams,
  StarRailApiGetDailyNoteOptionalParams,
  StarRailApiGetIndexOptionalParams,
} from "../../api/starRailApi/options.js";
import { ApiResponseJsonObject } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a StarRailApi operations. */
export interface StarRailApiOperations {
  getChallengePeak: (
    cookie: string,
    server: string,
    roleId: string,
    options?: StarRailApiGetChallengePeakOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  getSimulatedUniverse: (
    cookie: string,
    server: string,
    roleId: string,
    options?: StarRailApiGetSimulatedUniverseOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  getApocalypticShadow: (
    cookie: string,
    server: string,
    roleId: string,
    options?: StarRailApiGetApocalypticShadowOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  getPureFiction: (
    cookie: string,
    server: string,
    roleId: string,
    options?: StarRailApiGetPureFictionOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  getForgottenHall: (
    cookie: string,
    server: string,
    roleId: string,
    options?: StarRailApiGetForgottenHallOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  getDailyNote: (
    cookie: string,
    server: string,
    roleId: string,
    options?: StarRailApiGetDailyNoteOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  getIndex: (
    cookie: string,
    server: string,
    roleId: string,
    options?: StarRailApiGetIndexOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
}

function _getStarRailApi(context: MihoyoGameCNRecordsContext) {
  return {
    getChallengePeak: (
      cookie: string,
      server: string,
      roleId: string,
      options?: StarRailApiGetChallengePeakOptionalParams,
    ) => getChallengePeak(context, cookie, server, roleId, options),
    getSimulatedUniverse: (
      cookie: string,
      server: string,
      roleId: string,
      options?: StarRailApiGetSimulatedUniverseOptionalParams,
    ) => getSimulatedUniverse(context, cookie, server, roleId, options),
    getApocalypticShadow: (
      cookie: string,
      server: string,
      roleId: string,
      options?: StarRailApiGetApocalypticShadowOptionalParams,
    ) => getApocalypticShadow(context, cookie, server, roleId, options),
    getPureFiction: (
      cookie: string,
      server: string,
      roleId: string,
      options?: StarRailApiGetPureFictionOptionalParams,
    ) => getPureFiction(context, cookie, server, roleId, options),
    getForgottenHall: (
      cookie: string,
      server: string,
      roleId: string,
      options?: StarRailApiGetForgottenHallOptionalParams,
    ) => getForgottenHall(context, cookie, server, roleId, options),
    getDailyNote: (
      cookie: string,
      server: string,
      roleId: string,
      options?: StarRailApiGetDailyNoteOptionalParams,
    ) => getDailyNote(context, cookie, server, roleId, options),
    getIndex: (
      cookie: string,
      server: string,
      roleId: string,
      options?: StarRailApiGetIndexOptionalParams,
    ) => getIndex(context, cookie, server, roleId, options),
  };
}

export function _getStarRailApiOperations(
  context: MihoyoGameCNRecordsContext,
): StarRailApiOperations {
  return {
    ..._getStarRailApi(context),
  };
}
