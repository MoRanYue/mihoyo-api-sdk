// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameCNEventsContext } from "../../api/mihoyoGameCNEventsContext.js";
import { getMonthDetail, getMonthInfo } from "../../api/zenlessLedgerApi/operations.js";
import {
  ZenlessLedgerApiGetMonthDetailOptionalParams,
  ZenlessLedgerApiGetMonthInfoOptionalParams,
} from "../../api/zenlessLedgerApi/options.js";
import {
  ApiResponseJsonObject,
  ApiResponseZenlessLedgerMonthInfoData,
} from "../../models/uigf/mihoyo/models.js";

/** Interface representing a ZenlessLedgerApi operations. */
export interface ZenlessLedgerApiOperations {
  getMonthDetail: (
    cookie: string,
    typeParam: string,
    currentPage: number,
    options?: ZenlessLedgerApiGetMonthDetailOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  getMonthInfo: (
    cookie: string,
    options?: ZenlessLedgerApiGetMonthInfoOptionalParams,
  ) => Promise<ApiResponseZenlessLedgerMonthInfoData>;
}

function _getZenlessLedgerApi(context: MihoyoGameCNEventsContext) {
  return {
    getMonthDetail: (
      cookie: string,
      typeParam: string,
      currentPage: number,
      options?: ZenlessLedgerApiGetMonthDetailOptionalParams,
    ) => getMonthDetail(context, cookie, typeParam, currentPage, options),
    getMonthInfo: (cookie: string, options?: ZenlessLedgerApiGetMonthInfoOptionalParams) =>
      getMonthInfo(context, cookie, options),
  };
}

export function _getZenlessLedgerApiOperations(
  context: MihoyoGameCNEventsContext,
): ZenlessLedgerApiOperations {
  return {
    ..._getZenlessLedgerApi(context),
  };
}
