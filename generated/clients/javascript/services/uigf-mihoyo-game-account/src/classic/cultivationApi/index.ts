// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameAccountContext } from "../../api/mihoyoGameAccountContext.js";
import {
  syncAvatarList,
  listWeapons,
  listAvatars,
  batchCompute,
} from "../../api/cultivationApi/operations.js";
import {
  CultivationApiSyncAvatarListOptionalParams,
  CultivationApiListWeaponsOptionalParams,
  CultivationApiListAvatarsOptionalParams,
  CultivationApiBatchComputeOptionalParams,
} from "../../api/cultivationApi/options.js";
import { CalculateRequest } from "../../models/uigf/mihoyo/game/models.js";
import { ApiResponseJsonObject } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a CultivationApi operations. */
export interface CultivationApiOperations {
  syncAvatarList: (
    cookie: string,
    ds: string,
    body: CalculateRequest,
    options?: CultivationApiSyncAvatarListOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  listWeapons: (
    cookie: string,
    ds: string,
    body: CalculateRequest,
    options?: CultivationApiListWeaponsOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  listAvatars: (
    cookie: string,
    ds: string,
    body: CalculateRequest,
    options?: CultivationApiListAvatarsOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  /** Calculates material consumption for a batch of characters and weapons. */
  batchCompute: (
    cookie: string,
    ds: string,
    body: CalculateRequest,
    options?: CultivationApiBatchComputeOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
}

function _getCultivationApi(context: MihoyoGameAccountContext) {
  return {
    syncAvatarList: (
      cookie: string,
      ds: string,
      body: CalculateRequest,
      options?: CultivationApiSyncAvatarListOptionalParams,
    ) => syncAvatarList(context, cookie, ds, body, options),
    listWeapons: (
      cookie: string,
      ds: string,
      body: CalculateRequest,
      options?: CultivationApiListWeaponsOptionalParams,
    ) => listWeapons(context, cookie, ds, body, options),
    listAvatars: (
      cookie: string,
      ds: string,
      body: CalculateRequest,
      options?: CultivationApiListAvatarsOptionalParams,
    ) => listAvatars(context, cookie, ds, body, options),
    batchCompute: (
      cookie: string,
      ds: string,
      body: CalculateRequest,
      options?: CultivationApiBatchComputeOptionalParams,
    ) => batchCompute(context, cookie, ds, body, options),
  };
}

export function _getCultivationApiOperations(
  context: MihoyoGameAccountContext,
): CultivationApiOperations {
  return {
    ..._getCultivationApi(context),
  };
}
