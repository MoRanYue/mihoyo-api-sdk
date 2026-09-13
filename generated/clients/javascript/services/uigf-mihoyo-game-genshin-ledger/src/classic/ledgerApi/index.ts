// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameGenshinLedgerContext } from "../../api/mihoyoGameGenshinLedgerContext.js";
import { getMonthDetail, getMonthInfo } from "../../api/ledgerApi/operations.js";
import {
  LedgerApiGetMonthDetailOptionalParams,
  LedgerApiGetMonthInfoOptionalParams,
} from "../../api/ledgerApi/options.js";
import { ApiResponseJsonObject } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a LedgerApi operations. */
export interface LedgerApiOperations {
  getMonthDetail: (
    cookie: string,
    ds: string,
    month: number,
    page: number,
    typeParam: number,
    bindUid: string,
    bindRegion: string,
    options?: LedgerApiGetMonthDetailOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  getMonthInfo: (
    cookie: string,
    ds: string,
    bindUid: string,
    bindRegion: string,
    options?: LedgerApiGetMonthInfoOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
}

function _getLedgerApi(context: MihoyoGameGenshinLedgerContext) {
  return {
    getMonthDetail: (
      cookie: string,
      ds: string,
      month: number,
      page: number,
      typeParam: number,
      bindUid: string,
      bindRegion: string,
      options?: LedgerApiGetMonthDetailOptionalParams,
    ) => getMonthDetail(context, cookie, ds, month, page, typeParam, bindUid, bindRegion, options),
    getMonthInfo: (
      cookie: string,
      ds: string,
      bindUid: string,
      bindRegion: string,
      options?: LedgerApiGetMonthInfoOptionalParams,
    ) => getMonthInfo(context, cookie, ds, bindUid, bindRegion, options),
  };
}

export function _getLedgerApiOperations(
  context: MihoyoGameGenshinLedgerContext,
): LedgerApiOperations {
  return {
    ..._getLedgerApi(context),
  };
}
