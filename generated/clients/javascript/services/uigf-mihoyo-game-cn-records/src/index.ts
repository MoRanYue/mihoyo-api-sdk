// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoGameCNRecordsClient } from "./mihoyoGameCNRecordsClient.js";
export type {
  ApiResponseJsonObject,
  JsonObject,
  ApiResponseZenlessIndexData,
  ApiResponseZenlessDailyNoteData,
  ApiResponseGachaLogPage,
  GachaLogPage,
  GachaItem,
  ApiResponseZenlessShiyuDefenseData,
  ApiResponseZenlessAbyssSummaryData,
  ApiResponseZenlessAbyssSeasonTwoSummaryData,
  ApiResponseZenlessActivityCalendarData,
  ApiResponseZenlessClimbingTowerDetailData,
  ApiResponseZenlessExplorationDetailData,
  ApiResponseZenlessGachaCalendarData,
  ApiResponseZenlessDeadlyAssaultSummaryData,
  ApiResponseZenlessThresholdSimulationPeriodSummaryData,
} from "./models/uigf/mihoyo/index.js";
export type {
  ZenlessIndexData,
  ZenlessDailyNoteData,
  ZenlessShiyuDefenseData,
  ZenlessAbyssSummaryData,
  ZenlessAbyssSeasonTwoSummaryData,
  ZenlessActivityCalendarData,
  ZenlessClimbingTowerDetailData,
  ZenlessExplorationDetailData,
  ZenlessGachaCalendarData,
  ZenlessDeadlyAssaultSummaryData,
  ZenlessThresholdSimulationPeriodSummaryData,
} from "./models/uigf/mihoyo/game/response/index.js";
export type { MihoyoGameCNRecordsClientOptionalParams } from "./api/index.js";
export type { HonkaiImpactApiGetIndexOptionalParams } from "./api/honkaiImpactApi/index.js";
export type {
  StarRailApiGetChallengePeakOptionalParams,
  StarRailApiGetSimulatedUniverseOptionalParams,
  StarRailApiGetApocalypticShadowOptionalParams,
  StarRailApiGetPureFictionOptionalParams,
  StarRailApiGetForgottenHallOptionalParams,
  StarRailApiGetDailyNoteOptionalParams,
  StarRailApiGetIndexOptionalParams,
} from "./api/starRailApi/index.js";
export type {
  ZenlessApiGetThresholdSimulationDetailOptionalParams,
  ZenlessApiGetThresholdSimulationSummaryOptionalParams,
  ZenlessApiGetDeadlyAssaultOptionalParams,
  ZenlessApiGetShiyuDefenseOptionalParams,
  ZenlessApiGetGachaRecordOptionalParams,
  ZenlessApiGetDailyNoteOptionalParams,
  ZenlessApiGetIndexOptionalParams,
} from "./api/zenlessApi/index.js";
export type {
  ZenlessMobileApiGetThresholdSimulationPeriodSummaryOptionalParams,
  ZenlessMobileApiGetDeadlyAssaultSummaryOptionalParams,
  ZenlessMobileApiGetGachaCalendarOptionalParams,
  ZenlessMobileApiGetExplorationDetailOptionalParams,
  ZenlessMobileApiGetClimbingTowerDetailOptionalParams,
  ZenlessMobileApiGetActivityCalendarOptionalParams,
  ZenlessMobileApiGetAbyssSeasonTwoSummaryOptionalParams,
  ZenlessMobileApiGetAbyssSummaryOptionalParams,
} from "./api/zenlessMobileApi/index.js";
export type {
  HonkaiImpactApiOperations,
  StarRailApiOperations,
  ZenlessApiOperations,
  ZenlessMobileApiOperations,
} from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
