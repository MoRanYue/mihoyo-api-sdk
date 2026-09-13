// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameCNRecordsContext as Client } from "../index.js";
import {
  ApiResponseZenlessAbyssSummaryData,
  apiResponseZenlessAbyssSummaryDataDeserializer,
  ApiResponseZenlessAbyssSeasonTwoSummaryData,
  apiResponseZenlessAbyssSeasonTwoSummaryDataDeserializer,
  ApiResponseZenlessActivityCalendarData,
  apiResponseZenlessActivityCalendarDataDeserializer,
  ApiResponseZenlessClimbingTowerDetailData,
  apiResponseZenlessClimbingTowerDetailDataDeserializer,
  ApiResponseZenlessExplorationDetailData,
  apiResponseZenlessExplorationDetailDataDeserializer,
  ApiResponseZenlessGachaCalendarData,
  apiResponseZenlessGachaCalendarDataDeserializer,
  ApiResponseZenlessDeadlyAssaultSummaryData,
  apiResponseZenlessDeadlyAssaultSummaryDataDeserializer,
  ApiResponseZenlessThresholdSimulationPeriodSummaryData,
  apiResponseZenlessThresholdSimulationPeriodSummaryDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import {
  ZenlessMobileApiGetThresholdSimulationPeriodSummaryOptionalParams,
  ZenlessMobileApiGetDeadlyAssaultSummaryOptionalParams,
  ZenlessMobileApiGetGachaCalendarOptionalParams,
  ZenlessMobileApiGetExplorationDetailOptionalParams,
  ZenlessMobileApiGetClimbingTowerDetailOptionalParams,
  ZenlessMobileApiGetActivityCalendarOptionalParams,
  ZenlessMobileApiGetAbyssSeasonTwoSummaryOptionalParams,
  ZenlessMobileApiGetAbyssSummaryOptionalParams,
} from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getThresholdSimulationPeriodSummarySend(
  context: Client,
  region: string,
  scheduleType: number,
  uid: number,
  options: ZenlessMobileApiGetThresholdSimulationPeriodSummaryOptionalParams = {
    requestOptions: {},
  },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/event/game_record_zzz/api/zzz/void_front_battle_period_abstract_info{?region,schedule_type,uid}",
    {
      region: region,
      schedule_type: scheduleType,
      uid: uid,
    },
    {
      allowReserved: options?.requestOptions?.skipUrlEncoding,
    },
  );
  return context
    .path(path)
    .get({
      ...operationOptionsToRequestParameters(options),
      headers: {
        ...(options?.cookie !== undefined ? { cookie: options?.cookie } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getThresholdSimulationPeriodSummaryDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseZenlessThresholdSimulationPeriodSummaryData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseZenlessThresholdSimulationPeriodSummaryDataDeserializer(result.body);
}

export async function getThresholdSimulationPeriodSummary(
  context: Client,
  region: string,
  scheduleType: number,
  uid: number,
  options: ZenlessMobileApiGetThresholdSimulationPeriodSummaryOptionalParams = {
    requestOptions: {},
  },
): Promise<ApiResponseZenlessThresholdSimulationPeriodSummaryData> {
  const result = await _getThresholdSimulationPeriodSummarySend(
    context,
    region,
    scheduleType,
    uid,
    options,
  );
  return _getThresholdSimulationPeriodSummaryDeserialize(result);
}

export function _getDeadlyAssaultSummarySend(
  context: Client,
  region: string,
  scheduleType: number,
  uid: number,
  options: ZenlessMobileApiGetDeadlyAssaultSummaryOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/event/game_record_zzz/api/zzz/hadal_mem_abstract_info{?region,schedule_type,uid}",
    {
      region: region,
      schedule_type: scheduleType,
      uid: uid,
    },
    {
      allowReserved: options?.requestOptions?.skipUrlEncoding,
    },
  );
  return context
    .path(path)
    .get({
      ...operationOptionsToRequestParameters(options),
      headers: {
        ...(options?.cookie !== undefined ? { cookie: options?.cookie } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getDeadlyAssaultSummaryDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseZenlessDeadlyAssaultSummaryData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseZenlessDeadlyAssaultSummaryDataDeserializer(result.body);
}

export async function getDeadlyAssaultSummary(
  context: Client,
  region: string,
  scheduleType: number,
  uid: number,
  options: ZenlessMobileApiGetDeadlyAssaultSummaryOptionalParams = { requestOptions: {} },
): Promise<ApiResponseZenlessDeadlyAssaultSummaryData> {
  const result = await _getDeadlyAssaultSummarySend(context, region, scheduleType, uid, options);
  return _getDeadlyAssaultSummaryDeserialize(result);
}

export function _getGachaCalendarSend(
  context: Client,
  region: string,
  uid: number,
  options: ZenlessMobileApiGetGachaCalendarOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/event/game_record_zzz/api/zzz/gacha_calendar{?region,uid}",
    {
      region: region,
      uid: uid,
    },
    {
      allowReserved: options?.requestOptions?.skipUrlEncoding,
    },
  );
  return context
    .path(path)
    .get({
      ...operationOptionsToRequestParameters(options),
      headers: {
        ...(options?.cookie !== undefined ? { cookie: options?.cookie } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getGachaCalendarDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseZenlessGachaCalendarData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseZenlessGachaCalendarDataDeserializer(result.body);
}

export async function getGachaCalendar(
  context: Client,
  region: string,
  uid: number,
  options: ZenlessMobileApiGetGachaCalendarOptionalParams = { requestOptions: {} },
): Promise<ApiResponseZenlessGachaCalendarData> {
  const result = await _getGachaCalendarSend(context, region, uid, options);
  return _getGachaCalendarDeserialize(result);
}

export function _getExplorationDetailSend(
  context: Client,
  region: string,
  uid: number,
  options: ZenlessMobileApiGetExplorationDetailOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/event/game_record_zzz/api/zzz/exploration_detail{?region,uid}",
    {
      region: region,
      uid: uid,
    },
    {
      allowReserved: options?.requestOptions?.skipUrlEncoding,
    },
  );
  return context
    .path(path)
    .get({
      ...operationOptionsToRequestParameters(options),
      headers: {
        ...(options?.cookie !== undefined ? { cookie: options?.cookie } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getExplorationDetailDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseZenlessExplorationDetailData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseZenlessExplorationDetailDataDeserializer(result.body);
}

export async function getExplorationDetail(
  context: Client,
  region: string,
  uid: number,
  options: ZenlessMobileApiGetExplorationDetailOptionalParams = { requestOptions: {} },
): Promise<ApiResponseZenlessExplorationDetailData> {
  const result = await _getExplorationDetailSend(context, region, uid, options);
  return _getExplorationDetailDeserialize(result);
}

export function _getClimbingTowerDetailSend(
  context: Client,
  region: string,
  uid: number,
  options: ZenlessMobileApiGetClimbingTowerDetailOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/event/game_record_zzz/api/zzz/climbing_tower_detail{?region,uid}",
    {
      region: region,
      uid: uid,
    },
    {
      allowReserved: options?.requestOptions?.skipUrlEncoding,
    },
  );
  return context
    .path(path)
    .get({
      ...operationOptionsToRequestParameters(options),
      headers: {
        ...(options?.cookie !== undefined ? { cookie: options?.cookie } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getClimbingTowerDetailDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseZenlessClimbingTowerDetailData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseZenlessClimbingTowerDetailDataDeserializer(result.body);
}

export async function getClimbingTowerDetail(
  context: Client,
  region: string,
  uid: number,
  options: ZenlessMobileApiGetClimbingTowerDetailOptionalParams = { requestOptions: {} },
): Promise<ApiResponseZenlessClimbingTowerDetailData> {
  const result = await _getClimbingTowerDetailSend(context, region, uid, options);
  return _getClimbingTowerDetailDeserialize(result);
}

export function _getActivityCalendarSend(
  context: Client,
  region: string,
  uid: number,
  options: ZenlessMobileApiGetActivityCalendarOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/event/game_record_zzz/api/zzz/activity_calendar{?region,uid}",
    {
      region: region,
      uid: uid,
    },
    {
      allowReserved: options?.requestOptions?.skipUrlEncoding,
    },
  );
  return context
    .path(path)
    .get({
      ...operationOptionsToRequestParameters(options),
      headers: {
        ...(options?.cookie !== undefined ? { cookie: options?.cookie } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getActivityCalendarDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseZenlessActivityCalendarData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseZenlessActivityCalendarDataDeserializer(result.body);
}

export async function getActivityCalendar(
  context: Client,
  region: string,
  uid: number,
  options: ZenlessMobileApiGetActivityCalendarOptionalParams = { requestOptions: {} },
): Promise<ApiResponseZenlessActivityCalendarData> {
  const result = await _getActivityCalendarSend(context, region, uid, options);
  return _getActivityCalendarDeserialize(result);
}

export function _getAbyssSeasonTwoSummarySend(
  context: Client,
  region: string,
  uid: number,
  options: ZenlessMobileApiGetAbyssSeasonTwoSummaryOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/event/game_record_zzz/api/zzz/abysss2_abstract{?region,uid}",
    {
      region: region,
      uid: uid,
    },
    {
      allowReserved: options?.requestOptions?.skipUrlEncoding,
    },
  );
  return context
    .path(path)
    .get({
      ...operationOptionsToRequestParameters(options),
      headers: {
        ...(options?.cookie !== undefined ? { cookie: options?.cookie } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getAbyssSeasonTwoSummaryDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseZenlessAbyssSeasonTwoSummaryData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseZenlessAbyssSeasonTwoSummaryDataDeserializer(result.body);
}

export async function getAbyssSeasonTwoSummary(
  context: Client,
  region: string,
  uid: number,
  options: ZenlessMobileApiGetAbyssSeasonTwoSummaryOptionalParams = { requestOptions: {} },
): Promise<ApiResponseZenlessAbyssSeasonTwoSummaryData> {
  const result = await _getAbyssSeasonTwoSummarySend(context, region, uid, options);
  return _getAbyssSeasonTwoSummaryDeserialize(result);
}

export function _getAbyssSummarySend(
  context: Client,
  roleId: string,
  server: string,
  options: ZenlessMobileApiGetAbyssSummaryOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/event/game_record_zzz/api/zzz/abyss_abstract{?role_id,server}",
    {
      role_id: roleId,
      server: server,
    },
    {
      allowReserved: options?.requestOptions?.skipUrlEncoding,
    },
  );
  return context
    .path(path)
    .get({
      ...operationOptionsToRequestParameters(options),
      headers: {
        ...(options?.cookie !== undefined ? { cookie: options?.cookie } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getAbyssSummaryDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseZenlessAbyssSummaryData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseZenlessAbyssSummaryDataDeserializer(result.body);
}

export async function getAbyssSummary(
  context: Client,
  roleId: string,
  server: string,
  options: ZenlessMobileApiGetAbyssSummaryOptionalParams = { requestOptions: {} },
): Promise<ApiResponseZenlessAbyssSummaryData> {
  const result = await _getAbyssSummarySend(context, roleId, server, options);
  return _getAbyssSummaryDeserialize(result);
}
