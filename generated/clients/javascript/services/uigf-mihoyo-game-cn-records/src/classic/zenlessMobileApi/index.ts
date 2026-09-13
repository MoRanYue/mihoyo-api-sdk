// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameCNRecordsContext } from "../../api/mihoyoGameCNRecordsContext.js";
import {
  getThresholdSimulationPeriodSummary,
  getDeadlyAssaultSummary,
  getGachaCalendar,
  getExplorationDetail,
  getClimbingTowerDetail,
  getActivityCalendar,
  getAbyssSeasonTwoSummary,
  getAbyssSummary,
} from "../../api/zenlessMobileApi/operations.js";
import {
  ZenlessMobileApiGetThresholdSimulationPeriodSummaryOptionalParams,
  ZenlessMobileApiGetDeadlyAssaultSummaryOptionalParams,
  ZenlessMobileApiGetGachaCalendarOptionalParams,
  ZenlessMobileApiGetExplorationDetailOptionalParams,
  ZenlessMobileApiGetClimbingTowerDetailOptionalParams,
  ZenlessMobileApiGetActivityCalendarOptionalParams,
  ZenlessMobileApiGetAbyssSeasonTwoSummaryOptionalParams,
  ZenlessMobileApiGetAbyssSummaryOptionalParams,
} from "../../api/zenlessMobileApi/options.js";
import {
  ApiResponseZenlessAbyssSummaryData,
  ApiResponseZenlessAbyssSeasonTwoSummaryData,
  ApiResponseZenlessActivityCalendarData,
  ApiResponseZenlessClimbingTowerDetailData,
  ApiResponseZenlessExplorationDetailData,
  ApiResponseZenlessGachaCalendarData,
  ApiResponseZenlessDeadlyAssaultSummaryData,
  ApiResponseZenlessThresholdSimulationPeriodSummaryData,
} from "../../models/uigf/mihoyo/models.js";

/** Interface representing a ZenlessMobileApi operations. */
export interface ZenlessMobileApiOperations {
  getThresholdSimulationPeriodSummary: (
    region: string,
    scheduleType: number,
    uid: number,
    options?: ZenlessMobileApiGetThresholdSimulationPeriodSummaryOptionalParams,
  ) => Promise<ApiResponseZenlessThresholdSimulationPeriodSummaryData>;
  getDeadlyAssaultSummary: (
    region: string,
    scheduleType: number,
    uid: number,
    options?: ZenlessMobileApiGetDeadlyAssaultSummaryOptionalParams,
  ) => Promise<ApiResponseZenlessDeadlyAssaultSummaryData>;
  getGachaCalendar: (
    region: string,
    uid: number,
    options?: ZenlessMobileApiGetGachaCalendarOptionalParams,
  ) => Promise<ApiResponseZenlessGachaCalendarData>;
  getExplorationDetail: (
    region: string,
    uid: number,
    options?: ZenlessMobileApiGetExplorationDetailOptionalParams,
  ) => Promise<ApiResponseZenlessExplorationDetailData>;
  getClimbingTowerDetail: (
    region: string,
    uid: number,
    options?: ZenlessMobileApiGetClimbingTowerDetailOptionalParams,
  ) => Promise<ApiResponseZenlessClimbingTowerDetailData>;
  getActivityCalendar: (
    region: string,
    uid: number,
    options?: ZenlessMobileApiGetActivityCalendarOptionalParams,
  ) => Promise<ApiResponseZenlessActivityCalendarData>;
  getAbyssSeasonTwoSummary: (
    region: string,
    uid: number,
    options?: ZenlessMobileApiGetAbyssSeasonTwoSummaryOptionalParams,
  ) => Promise<ApiResponseZenlessAbyssSeasonTwoSummaryData>;
  getAbyssSummary: (
    roleId: string,
    server: string,
    options?: ZenlessMobileApiGetAbyssSummaryOptionalParams,
  ) => Promise<ApiResponseZenlessAbyssSummaryData>;
}

function _getZenlessMobileApi(context: MihoyoGameCNRecordsContext) {
  return {
    getThresholdSimulationPeriodSummary: (
      region: string,
      scheduleType: number,
      uid: number,
      options?: ZenlessMobileApiGetThresholdSimulationPeriodSummaryOptionalParams,
    ) => getThresholdSimulationPeriodSummary(context, region, scheduleType, uid, options),
    getDeadlyAssaultSummary: (
      region: string,
      scheduleType: number,
      uid: number,
      options?: ZenlessMobileApiGetDeadlyAssaultSummaryOptionalParams,
    ) => getDeadlyAssaultSummary(context, region, scheduleType, uid, options),
    getGachaCalendar: (
      region: string,
      uid: number,
      options?: ZenlessMobileApiGetGachaCalendarOptionalParams,
    ) => getGachaCalendar(context, region, uid, options),
    getExplorationDetail: (
      region: string,
      uid: number,
      options?: ZenlessMobileApiGetExplorationDetailOptionalParams,
    ) => getExplorationDetail(context, region, uid, options),
    getClimbingTowerDetail: (
      region: string,
      uid: number,
      options?: ZenlessMobileApiGetClimbingTowerDetailOptionalParams,
    ) => getClimbingTowerDetail(context, region, uid, options),
    getActivityCalendar: (
      region: string,
      uid: number,
      options?: ZenlessMobileApiGetActivityCalendarOptionalParams,
    ) => getActivityCalendar(context, region, uid, options),
    getAbyssSeasonTwoSummary: (
      region: string,
      uid: number,
      options?: ZenlessMobileApiGetAbyssSeasonTwoSummaryOptionalParams,
    ) => getAbyssSeasonTwoSummary(context, region, uid, options),
    getAbyssSummary: (
      roleId: string,
      server: string,
      options?: ZenlessMobileApiGetAbyssSummaryOptionalParams,
    ) => getAbyssSummary(context, roleId, server, options),
  };
}

export function _getZenlessMobileApiOperations(
  context: MihoyoGameCNRecordsContext,
): ZenlessMobileApiOperations {
  return {
    ..._getZenlessMobileApi(context),
  };
}
