// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameGenshinRecordContext as Client } from "../index.js";
import {
  ApiResponseGcgBasicInfoData,
  apiResponseGcgBasicInfoDataDeserializer,
  ApiResponseGcgCardBackListData,
  apiResponseGcgCardBackListDataDeserializer,
  ApiResponseGcgCardListData,
  apiResponseGcgCardListDataDeserializer,
  ApiResponseGcgChallengeRecordData,
  apiResponseGcgChallengeRecordDataDeserializer,
  ApiResponseGcgChallengeScheduleData,
  apiResponseGcgChallengeScheduleDataDeserializer,
  ApiResponseGcgDeckListData,
  apiResponseGcgDeckListDataDeserializer,
  ApiResponseGcgCoversData,
  apiResponseGcgCoversDataDeserializer,
  ApiResponseGcgMatchListData,
  apiResponseGcgMatchListDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import {
  GcgApiGetMatchListOptionalParams,
  GcgApiGetCoversOptionalParams,
  GcgApiGetDeckListOptionalParams,
  GcgApiGetChallengeScheduleOptionalParams,
  GcgApiGetChallengeRecordOptionalParams,
  GcgApiGetCardListOptionalParams,
  GcgApiGetCardBackListOptionalParams,
  GcgApiGetBasicInfoOptionalParams,
} from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getMatchListSend(
  context: Client,
  cookie: string,
  roleId: string,
  server: string,
  options: GcgApiGetMatchListOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/game_record/app/genshin/api/gcg/matchList{?role_id,server}",
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
        cookie: cookie,
        ...(options?.ds !== undefined ? { ds: options?.ds } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getMatchListDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseGcgMatchListData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseGcgMatchListDataDeserializer(result.body);
}

export async function getMatchList(
  context: Client,
  cookie: string,
  roleId: string,
  server: string,
  options: GcgApiGetMatchListOptionalParams = { requestOptions: {} },
): Promise<ApiResponseGcgMatchListData> {
  const result = await _getMatchListSend(context, cookie, roleId, server, options);
  return _getMatchListDeserialize(result);
}

export function _getCoversSend(
  context: Client,
  cookie: string,
  roleId: string,
  server: string,
  options: GcgApiGetCoversOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/game_record/app/genshin/api/gcg/getGCGCovers{?role_id,server}",
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
        cookie: cookie,
        ...(options?.ds !== undefined ? { ds: options?.ds } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getCoversDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseGcgCoversData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseGcgCoversDataDeserializer(result.body);
}

export async function getCovers(
  context: Client,
  cookie: string,
  roleId: string,
  server: string,
  options: GcgApiGetCoversOptionalParams = { requestOptions: {} },
): Promise<ApiResponseGcgCoversData> {
  const result = await _getCoversSend(context, cookie, roleId, server, options);
  return _getCoversDeserialize(result);
}

export function _getDeckListSend(
  context: Client,
  cookie: string,
  roleId: string,
  server: string,
  options: GcgApiGetDeckListOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/game_record/app/genshin/api/gcg/deckList{?role_id,server}",
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
        cookie: cookie,
        ...(options?.ds !== undefined ? { ds: options?.ds } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getDeckListDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseGcgDeckListData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseGcgDeckListDataDeserializer(result.body);
}

export async function getDeckList(
  context: Client,
  cookie: string,
  roleId: string,
  server: string,
  options: GcgApiGetDeckListOptionalParams = { requestOptions: {} },
): Promise<ApiResponseGcgDeckListData> {
  const result = await _getDeckListSend(context, cookie, roleId, server, options);
  return _getDeckListDeserialize(result);
}

export function _getChallengeScheduleSend(
  context: Client,
  cookie: string,
  roleId: string,
  server: string,
  options: GcgApiGetChallengeScheduleOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/game_record/app/genshin/api/gcg/challenge/schedule{?role_id,server}",
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
        cookie: cookie,
        ...(options?.ds !== undefined ? { ds: options?.ds } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getChallengeScheduleDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseGcgChallengeScheduleData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseGcgChallengeScheduleDataDeserializer(result.body);
}

export async function getChallengeSchedule(
  context: Client,
  cookie: string,
  roleId: string,
  server: string,
  options: GcgApiGetChallengeScheduleOptionalParams = { requestOptions: {} },
): Promise<ApiResponseGcgChallengeScheduleData> {
  const result = await _getChallengeScheduleSend(context, cookie, roleId, server, options);
  return _getChallengeScheduleDeserialize(result);
}

export function _getChallengeRecordSend(
  context: Client,
  cookie: string,
  scheduleId: number,
  roleId: string,
  server: string,
  options: GcgApiGetChallengeRecordOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/game_record/app/genshin/api/gcg/challenge/record{?schedule_id,role_id,server}",
    {
      schedule_id: scheduleId,
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
        cookie: cookie,
        ...(options?.ds !== undefined ? { ds: options?.ds } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getChallengeRecordDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseGcgChallengeRecordData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseGcgChallengeRecordDataDeserializer(result.body);
}

export async function getChallengeRecord(
  context: Client,
  cookie: string,
  scheduleId: number,
  roleId: string,
  server: string,
  options: GcgApiGetChallengeRecordOptionalParams = { requestOptions: {} },
): Promise<ApiResponseGcgChallengeRecordData> {
  const result = await _getChallengeRecordSend(
    context,
    cookie,
    scheduleId,
    roleId,
    server,
    options,
  );
  return _getChallengeRecordDeserialize(result);
}

export function _getCardListSend(
  context: Client,
  cookie: string,
  limit: number,
  needAction: boolean,
  needAvatar: boolean,
  needStats: boolean,
  offset: number,
  roleId: string,
  server: string,
  options: GcgApiGetCardListOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/game_record/app/genshin/api/gcg/cardList{?limit,need_action,need_avatar,need_stats,offset,role_id,server}",
    {
      limit: limit,
      need_action: needAction,
      need_avatar: needAvatar,
      need_stats: needStats,
      offset: offset,
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
        cookie: cookie,
        ...(options?.ds !== undefined ? { ds: options?.ds } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getCardListDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseGcgCardListData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseGcgCardListDataDeserializer(result.body);
}

export async function getCardList(
  context: Client,
  cookie: string,
  limit: number,
  needAction: boolean,
  needAvatar: boolean,
  needStats: boolean,
  offset: number,
  roleId: string,
  server: string,
  options: GcgApiGetCardListOptionalParams = { requestOptions: {} },
): Promise<ApiResponseGcgCardListData> {
  const result = await _getCardListSend(
    context,
    cookie,
    limit,
    needAction,
    needAvatar,
    needStats,
    offset,
    roleId,
    server,
    options,
  );
  return _getCardListDeserialize(result);
}

export function _getCardBackListSend(
  context: Client,
  cookie: string,
  roleId: string,
  server: string,
  options: GcgApiGetCardBackListOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/game_record/app/genshin/api/gcg/cardBackList{?role_id,server}",
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
        cookie: cookie,
        ...(options?.ds !== undefined ? { ds: options?.ds } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getCardBackListDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseGcgCardBackListData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseGcgCardBackListDataDeserializer(result.body);
}

export async function getCardBackList(
  context: Client,
  cookie: string,
  roleId: string,
  server: string,
  options: GcgApiGetCardBackListOptionalParams = { requestOptions: {} },
): Promise<ApiResponseGcgCardBackListData> {
  const result = await _getCardBackListSend(context, cookie, roleId, server, options);
  return _getCardBackListDeserialize(result);
}

export function _getBasicInfoSend(
  context: Client,
  cookie: string,
  roleId: string,
  server: string,
  options: GcgApiGetBasicInfoOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/game_record/app/genshin/api/gcg/basicInfo{?role_id,server}",
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
        cookie: cookie,
        ...(options?.ds !== undefined ? { ds: options?.ds } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getBasicInfoDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseGcgBasicInfoData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseGcgBasicInfoDataDeserializer(result.body);
}

export async function getBasicInfo(
  context: Client,
  cookie: string,
  roleId: string,
  server: string,
  options: GcgApiGetBasicInfoOptionalParams = { requestOptions: {} },
): Promise<ApiResponseGcgBasicInfoData> {
  const result = await _getBasicInfoSend(context, cookie, roleId, server, options);
  return _getBasicInfoDeserialize(result);
}
