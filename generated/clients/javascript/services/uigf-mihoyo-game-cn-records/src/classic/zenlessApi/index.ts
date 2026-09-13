// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameCNRecordsContext } from "../../api/mihoyoGameCNRecordsContext.js";
import {
  getThresholdSimulationDetail,
  getThresholdSimulationSummary,
  getDeadlyAssault,
  getShiyuDefense,
  getGachaRecord,
  getDailyNote,
  getIndex,
} from "../../api/zenlessApi/operations.js";
import {
  ZenlessApiGetThresholdSimulationDetailOptionalParams,
  ZenlessApiGetThresholdSimulationSummaryOptionalParams,
  ZenlessApiGetDeadlyAssaultOptionalParams,
  ZenlessApiGetShiyuDefenseOptionalParams,
  ZenlessApiGetGachaRecordOptionalParams,
  ZenlessApiGetDailyNoteOptionalParams,
  ZenlessApiGetIndexOptionalParams,
} from "../../api/zenlessApi/options.js";
import {
  ApiResponseJsonObject,
  ApiResponseZenlessIndexData,
  ApiResponseZenlessDailyNoteData,
  ApiResponseGachaLogPage,
  ApiResponseZenlessShiyuDefenseData,
} from "../../models/uigf/mihoyo/models.js";

/** Interface representing a ZenlessApi operations. */
export interface ZenlessApiOperations {
  getThresholdSimulationDetail: (
    cookie: string,
    region: string,
    uid: string,
    voidFrontId: number,
    options?: ZenlessApiGetThresholdSimulationDetailOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  getThresholdSimulationSummary: (
    cookie: string,
    region: string,
    uid: string,
    options?: ZenlessApiGetThresholdSimulationSummaryOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  getDeadlyAssault: (
    cookie: string,
    scheduleType: number,
    region: string,
    uid: string,
    options?: ZenlessApiGetDeadlyAssaultOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  getShiyuDefense: (
    cookie: string,
    server: string,
    roleId: string,
    options?: ZenlessApiGetShiyuDefenseOptionalParams,
  ) => Promise<ApiResponseZenlessShiyuDefenseData>;
  getGachaRecord: (
    cookie: string,
    uid: string,
    region: string,
    gachaType: number,
    options?: ZenlessApiGetGachaRecordOptionalParams,
  ) => Promise<ApiResponseGachaLogPage>;
  getDailyNote: (
    cookie: string,
    server: string,
    roleId: string,
    options?: ZenlessApiGetDailyNoteOptionalParams,
  ) => Promise<ApiResponseZenlessDailyNoteData>;
  getIndex: (
    cookie: string,
    server: string,
    roleId: string,
    options?: ZenlessApiGetIndexOptionalParams,
  ) => Promise<ApiResponseZenlessIndexData>;
}

function _getZenlessApi(context: MihoyoGameCNRecordsContext) {
  return {
    getThresholdSimulationDetail: (
      cookie: string,
      region: string,
      uid: string,
      voidFrontId: number,
      options?: ZenlessApiGetThresholdSimulationDetailOptionalParams,
    ) => getThresholdSimulationDetail(context, cookie, region, uid, voidFrontId, options),
    getThresholdSimulationSummary: (
      cookie: string,
      region: string,
      uid: string,
      options?: ZenlessApiGetThresholdSimulationSummaryOptionalParams,
    ) => getThresholdSimulationSummary(context, cookie, region, uid, options),
    getDeadlyAssault: (
      cookie: string,
      scheduleType: number,
      region: string,
      uid: string,
      options?: ZenlessApiGetDeadlyAssaultOptionalParams,
    ) => getDeadlyAssault(context, cookie, scheduleType, region, uid, options),
    getShiyuDefense: (
      cookie: string,
      server: string,
      roleId: string,
      options?: ZenlessApiGetShiyuDefenseOptionalParams,
    ) => getShiyuDefense(context, cookie, server, roleId, options),
    getGachaRecord: (
      cookie: string,
      uid: string,
      region: string,
      gachaType: number,
      options?: ZenlessApiGetGachaRecordOptionalParams,
    ) => getGachaRecord(context, cookie, uid, region, gachaType, options),
    getDailyNote: (
      cookie: string,
      server: string,
      roleId: string,
      options?: ZenlessApiGetDailyNoteOptionalParams,
    ) => getDailyNote(context, cookie, server, roleId, options),
    getIndex: (
      cookie: string,
      server: string,
      roleId: string,
      options?: ZenlessApiGetIndexOptionalParams,
    ) => getIndex(context, cookie, server, roleId, options),
  };
}

export function _getZenlessApiOperations(
  context: MihoyoGameCNRecordsContext,
): ZenlessApiOperations {
  return {
    ..._getZenlessApi(context),
  };
}
