// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameCNActivityContext } from "../../api/mihoyoGameCNActivityContext.js";
import { getHomeNavbar, getHomeInfo, getLatestContent } from "../../api/strategyApi/operations.js";
import {
  StrategyApiGetHomeNavbarOptionalParams,
  StrategyApiGetHomeInfoOptionalParams,
  StrategyApiGetLatestContentOptionalParams,
} from "../../api/strategyApi/options.js";
import {
  ApiResponseStrategyLatestContentData,
  ApiResponseStrategyHomeInfoData,
  ApiResponseStrategyHomeNavbarData,
} from "../../models/uigf/mihoyo/models.js";

/** Interface representing a StrategyApi operations. */
export interface StrategyApiOperations {
  getHomeNavbar: (
    appSn: string,
    options?: StrategyApiGetHomeNavbarOptionalParams,
  ) => Promise<ApiResponseStrategyHomeNavbarData>;
  getHomeInfo: (
    appSn: string,
    options?: StrategyApiGetHomeInfoOptionalParams,
  ) => Promise<ApiResponseStrategyHomeInfoData>;
  getLatestContent: (
    appSn: string,
    options?: StrategyApiGetLatestContentOptionalParams,
  ) => Promise<ApiResponseStrategyLatestContentData>;
}

function _getStrategyApi(context: MihoyoGameCNActivityContext) {
  return {
    getHomeNavbar: (appSn: string, options?: StrategyApiGetHomeNavbarOptionalParams) =>
      getHomeNavbar(context, appSn, options),
    getHomeInfo: (appSn: string, options?: StrategyApiGetHomeInfoOptionalParams) =>
      getHomeInfo(context, appSn, options),
    getLatestContent: (appSn: string, options?: StrategyApiGetLatestContentOptionalParams) =>
      getLatestContent(context, appSn, options),
  };
}

export function _getStrategyApiOperations(
  context: MihoyoGameCNActivityContext,
): StrategyApiOperations {
  return {
    ..._getStrategyApi(context),
  };
}
