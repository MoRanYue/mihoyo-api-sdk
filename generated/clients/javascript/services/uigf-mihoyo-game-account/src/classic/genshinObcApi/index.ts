// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameAccountContext } from "../../api/mihoyoGameAccountContext.js";
import { getHomePositions, getGachaPool } from "../../api/genshinObcApi/operations.js";
import {
  GenshinObcApiGetHomePositionsOptionalParams,
  GenshinObcApiGetGachaPoolOptionalParams,
} from "../../api/genshinObcApi/options.js";
import { ApiResponseJsonObject } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a GenshinObcApi operations. */
export interface GenshinObcApiOperations {
  getHomePositions: (
    appSn: string,
    options?: GenshinObcApiGetHomePositionsOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  getGachaPool: (
    appSn: string,
    options?: GenshinObcApiGetGachaPoolOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
}

function _getGenshinObcApi(context: MihoyoGameAccountContext) {
  return {
    getHomePositions: (appSn: string, options?: GenshinObcApiGetHomePositionsOptionalParams) =>
      getHomePositions(context, appSn, options),
    getGachaPool: (appSn: string, options?: GenshinObcApiGetGachaPoolOptionalParams) =>
      getGachaPool(context, appSn, options),
  };
}

export function _getGenshinObcApiOperations(
  context: MihoyoGameAccountContext,
): GenshinObcApiOperations {
  return {
    ..._getGenshinObcApi(context),
  };
}
