// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameGenshinRecordContext as Client } from "../index.js";
import {
  CharacterListRequest,
  characterListRequestSerializer,
  CharacterDetailRequest,
  characterDetailRequestSerializer,
} from "../../models/uigf/mihoyo/game/models.js";
import {
  ApiResponseGenshinRecordIndexData,
  apiResponseGenshinRecordIndexDataDeserializer,
  ApiResponseCharacterList,
  apiResponseCharacterListDeserializer,
  ApiResponseGenshinDailyNoteData,
  apiResponseGenshinDailyNoteDataDeserializer,
  ApiResponseGenshinSpiralAbyssData,
  apiResponseGenshinSpiralAbyssDataDeserializer,
  ApiResponseGenshinTheaterData,
  apiResponseGenshinTheaterDataDeserializer,
  ApiResponseGenshinCharacterMasterData,
  apiResponseGenshinCharacterMasterDataDeserializer,
  ApiResponseGenshinStygianData,
  apiResponseGenshinStygianDataDeserializer,
  ApiResponseGenshinStygianPopularityData,
  apiResponseGenshinStygianPopularityDataDeserializer,
  ApiResponseGenshinActivityCalendarData,
  apiResponseGenshinActivityCalendarDataDeserializer,
  ApiResponseJsonObject,
  apiResponseJsonObjectDeserializer,
  ApiResponseGenshinExternalContentData,
  apiResponseGenshinExternalContentDataDeserializer,
  ApiResponseGenshinRoleBasicInfoData,
  apiResponseGenshinRoleBasicInfoDataDeserializer,
  ApiResponseGenshinToolData,
  apiResponseGenshinToolDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import {
  GameRecordApiGetToolOptionalParams,
  GameRecordApiGetRoleBasicInfoOptionalParams,
  GameRecordApiGetExternalContentOptionalParams,
  GameRecordApiGetCharacterTpsOptionalParams,
  GameRecordApiGetActivityCalendarOptionalParams,
  GameRecordApiGetStygianPopularityOptionalParams,
  GameRecordApiGetStygianOnslaughtOptionalParams,
  GameRecordApiGetCharacterMasterOptionalParams,
  GameRecordApiGetImaginariumTheaterOptionalParams,
  GameRecordApiGetSpiralAbyssOptionalParams,
  GameRecordApiGetDailyNoteOptionalParams,
  GameRecordApiGetCharacterDetailsOptionalParams,
  GameRecordApiListCharactersOptionalParams,
  GameRecordApiGetIndexOptionalParams,
} from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getToolSend(
  context: Client,
  cookie: string,
  options: GameRecordApiGetToolOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/game_record/app/genshin/api/tool")
    .get({
      ...operationOptionsToRequestParameters(options),
      headers: {
        cookie: cookie,
        ...(options?.ds !== undefined ? { ds: options?.ds } : {}),
        ...(options?.challenge !== undefined ? { "x-rpc-challenge": options?.challenge } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getToolDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseGenshinToolData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseGenshinToolDataDeserializer(result.body);
}

export async function getTool(
  context: Client,
  cookie: string,
  options: GameRecordApiGetToolOptionalParams = { requestOptions: {} },
): Promise<ApiResponseGenshinToolData> {
  const result = await _getToolSend(context, cookie, options);
  return _getToolDeserialize(result);
}

export function _getRoleBasicInfoSend(
  context: Client,
  cookie: string,
  roleId: string,
  server: string,
  options: GameRecordApiGetRoleBasicInfoOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/game_record/app/genshin/api/roleBasicInfo{?role_id,server}",
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

export async function _getRoleBasicInfoDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseGenshinRoleBasicInfoData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseGenshinRoleBasicInfoDataDeserializer(result.body);
}

export async function getRoleBasicInfo(
  context: Client,
  cookie: string,
  roleId: string,
  server: string,
  options: GameRecordApiGetRoleBasicInfoOptionalParams = { requestOptions: {} },
): Promise<ApiResponseGenshinRoleBasicInfoData> {
  const result = await _getRoleBasicInfoSend(context, cookie, roleId, server, options);
  return _getRoleBasicInfoDeserialize(result);
}

export function _getExternalContentSend(
  context: Client,
  cookie: string,
  itemId: number,
  itemType: number,
  options: GameRecordApiGetExternalContentOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/game_record/app/genshin/api/external_content{?item_id,item_type}",
    {
      item_id: itemId,
      item_type: itemType,
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

export async function _getExternalContentDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseGenshinExternalContentData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseGenshinExternalContentDataDeserializer(result.body);
}

export async function getExternalContent(
  context: Client,
  cookie: string,
  itemId: number,
  itemType: number,
  options: GameRecordApiGetExternalContentOptionalParams = { requestOptions: {} },
): Promise<ApiResponseGenshinExternalContentData> {
  const result = await _getExternalContentSend(context, cookie, itemId, itemType, options);
  return _getExternalContentDeserialize(result);
}

export function _getCharacterTpsSend(
  context: Client,
  cookie: string,
  server: string,
  roleId: string,
  options: GameRecordApiGetCharacterTpsOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/game_record/app/genshin/api/tps{?server,role_id}",
    {
      server: server,
      role_id: roleId,
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

export async function _getCharacterTpsDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseJsonObject> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseJsonObjectDeserializer(result.body);
}

export async function getCharacterTps(
  context: Client,
  cookie: string,
  server: string,
  roleId: string,
  options: GameRecordApiGetCharacterTpsOptionalParams = { requestOptions: {} },
): Promise<ApiResponseJsonObject> {
  const result = await _getCharacterTpsSend(context, cookie, server, roleId, options);
  return _getCharacterTpsDeserialize(result);
}

export function _getActivityCalendarSend(
  context: Client,
  cookie: string,
  body: CharacterListRequest,
  options: GameRecordApiGetActivityCalendarOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/game_record/app/genshin/api/act_calendar")
    .post({
      ...operationOptionsToRequestParameters(options),
      contentType: "application/json",
      headers: {
        cookie: cookie,
        ...(options?.ds !== undefined ? { ds: options?.ds } : {}),
        ...(options?.challenge !== undefined ? { "x-rpc-challenge": options?.challenge } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
      body: characterListRequestSerializer(body),
    });
}

export async function _getActivityCalendarDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseGenshinActivityCalendarData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseGenshinActivityCalendarDataDeserializer(result.body);
}

export async function getActivityCalendar(
  context: Client,
  cookie: string,
  body: CharacterListRequest,
  options: GameRecordApiGetActivityCalendarOptionalParams = { requestOptions: {} },
): Promise<ApiResponseGenshinActivityCalendarData> {
  const result = await _getActivityCalendarSend(context, cookie, body, options);
  return _getActivityCalendarDeserialize(result);
}

export function _getStygianPopularitySend(
  context: Client,
  server: string,
  roleId: number,
  options: GameRecordApiGetStygianPopularityOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/game_record/app/genshin/api/hard_challenge/popularity{?server,role_id}",
    {
      server: server,
      role_id: roleId,
    },
    {
      allowReserved: options?.requestOptions?.skipUrlEncoding,
    },
  );
  return context
    .path(path)
    .get({
      ...operationOptionsToRequestParameters(options),
      headers: { accept: "application/json", ...options.requestOptions?.headers },
    });
}

export async function _getStygianPopularityDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseGenshinStygianPopularityData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseGenshinStygianPopularityDataDeserializer(result.body);
}

export async function getStygianPopularity(
  context: Client,
  server: string,
  roleId: number,
  options: GameRecordApiGetStygianPopularityOptionalParams = { requestOptions: {} },
): Promise<ApiResponseGenshinStygianPopularityData> {
  const result = await _getStygianPopularitySend(context, server, roleId, options);
  return _getStygianPopularityDeserialize(result);
}

export function _getStygianOnslaughtSend(
  context: Client,
  cookie: string,
  server: string,
  roleId: string,
  options: GameRecordApiGetStygianOnslaughtOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/game_record/app/genshin/api/hard_challenge{?schedule_type,need_detail,need_all,server,role_id}",
    {
      schedule_type: options?.scheduleType,
      need_detail: options?.needDetail,
      need_all: options?.needAll,
      server: server,
      role_id: roleId,
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

export async function _getStygianOnslaughtDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseGenshinStygianData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseGenshinStygianDataDeserializer(result.body);
}

export async function getStygianOnslaught(
  context: Client,
  cookie: string,
  server: string,
  roleId: string,
  options: GameRecordApiGetStygianOnslaughtOptionalParams = { requestOptions: {} },
): Promise<ApiResponseGenshinStygianData> {
  const result = await _getStygianOnslaughtSend(context, cookie, server, roleId, options);
  return _getStygianOnslaughtDeserialize(result);
}

export function _getCharacterMasterSend(
  context: Client,
  cookie: string,
  server: string,
  roleId: string,
  options: GameRecordApiGetCharacterMasterOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/game_record/app/genshin/api/char_master{?server,role_id}",
    {
      server: server,
      role_id: roleId,
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

export async function _getCharacterMasterDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseGenshinCharacterMasterData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseGenshinCharacterMasterDataDeserializer(result.body);
}

export async function getCharacterMaster(
  context: Client,
  cookie: string,
  server: string,
  roleId: string,
  options: GameRecordApiGetCharacterMasterOptionalParams = { requestOptions: {} },
): Promise<ApiResponseGenshinCharacterMasterData> {
  const result = await _getCharacterMasterSend(context, cookie, server, roleId, options);
  return _getCharacterMasterDeserialize(result);
}

export function _getImaginariumTheaterSend(
  context: Client,
  cookie: string,
  server: string,
  roleId: string,
  options: GameRecordApiGetImaginariumTheaterOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/game_record/app/genshin/api/role_combat{?active,schedule_type,need_detail,need_all,server,role_id}",
    {
      active: options?.active,
      schedule_type: options?.scheduleType,
      need_detail: options?.needDetail,
      need_all: options?.needAll,
      server: server,
      role_id: roleId,
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

export async function _getImaginariumTheaterDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseGenshinTheaterData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseGenshinTheaterDataDeserializer(result.body);
}

export async function getImaginariumTheater(
  context: Client,
  cookie: string,
  server: string,
  roleId: string,
  options: GameRecordApiGetImaginariumTheaterOptionalParams = { requestOptions: {} },
): Promise<ApiResponseGenshinTheaterData> {
  const result = await _getImaginariumTheaterSend(context, cookie, server, roleId, options);
  return _getImaginariumTheaterDeserialize(result);
}

export function _getSpiralAbyssSend(
  context: Client,
  cookie: string,
  server: string,
  roleId: string,
  options: GameRecordApiGetSpiralAbyssOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/game_record/app/genshin/api/spiralAbyss{?schedule_type,need_detail,need_all,server,role_id}",
    {
      schedule_type: options?.scheduleType,
      need_detail: options?.needDetail,
      need_all: options?.needAll,
      server: server,
      role_id: roleId,
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

export async function _getSpiralAbyssDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseGenshinSpiralAbyssData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseGenshinSpiralAbyssDataDeserializer(result.body);
}

export async function getSpiralAbyss(
  context: Client,
  cookie: string,
  server: string,
  roleId: string,
  options: GameRecordApiGetSpiralAbyssOptionalParams = { requestOptions: {} },
): Promise<ApiResponseGenshinSpiralAbyssData> {
  const result = await _getSpiralAbyssSend(context, cookie, server, roleId, options);
  return _getSpiralAbyssDeserialize(result);
}

export function _getDailyNoteSend(
  context: Client,
  cookie: string,
  server: string,
  roleId: string,
  options: GameRecordApiGetDailyNoteOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/game_record/app/genshin/api/dailyNote{?server,role_id}",
    {
      server: server,
      role_id: roleId,
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

export async function _getDailyNoteDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseGenshinDailyNoteData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseGenshinDailyNoteDataDeserializer(result.body);
}

export async function getDailyNote(
  context: Client,
  cookie: string,
  server: string,
  roleId: string,
  options: GameRecordApiGetDailyNoteOptionalParams = { requestOptions: {} },
): Promise<ApiResponseGenshinDailyNoteData> {
  const result = await _getDailyNoteSend(context, cookie, server, roleId, options);
  return _getDailyNoteDeserialize(result);
}

export function _getCharacterDetailsSend(
  context: Client,
  cookie: string,
  body: CharacterDetailRequest,
  options: GameRecordApiGetCharacterDetailsOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/game_record/app/genshin/api/character/detail")
    .post({
      ...operationOptionsToRequestParameters(options),
      contentType: "application/json",
      headers: {
        cookie: cookie,
        ...(options?.ds !== undefined ? { ds: options?.ds } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
      body: characterDetailRequestSerializer(body),
    });
}

export async function _getCharacterDetailsDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseCharacterList> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseCharacterListDeserializer(result.body);
}

/** Character IDs should be sent in batches of at most 40, as used by TeyvatGuide. */
export async function getCharacterDetails(
  context: Client,
  cookie: string,
  body: CharacterDetailRequest,
  options: GameRecordApiGetCharacterDetailsOptionalParams = { requestOptions: {} },
): Promise<ApiResponseCharacterList> {
  const result = await _getCharacterDetailsSend(context, cookie, body, options);
  return _getCharacterDetailsDeserialize(result);
}

export function _listCharactersSend(
  context: Client,
  cookie: string,
  body: CharacterListRequest,
  options: GameRecordApiListCharactersOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/game_record/app/genshin/api/character/list")
    .post({
      ...operationOptionsToRequestParameters(options),
      contentType: "application/json",
      headers: {
        cookie: cookie,
        ...(options?.ds !== undefined ? { ds: options?.ds } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
      body: characterListRequestSerializer(body),
    });
}

export async function _listCharactersDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseCharacterList> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseCharacterListDeserializer(result.body);
}

export async function listCharacters(
  context: Client,
  cookie: string,
  body: CharacterListRequest,
  options: GameRecordApiListCharactersOptionalParams = { requestOptions: {} },
): Promise<ApiResponseCharacterList> {
  const result = await _listCharactersSend(context, cookie, body, options);
  return _listCharactersDeserialize(result);
}

export function _getIndexSend(
  context: Client,
  cookie: string,
  server: string,
  roleId: string,
  options: GameRecordApiGetIndexOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/game_record/app/genshin/api/index{?avatar_list_type,server,role_id}",
    {
      avatar_list_type: options?.avatarListType,
      server: server,
      role_id: roleId,
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

export async function _getIndexDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseGenshinRecordIndexData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseGenshinRecordIndexDataDeserializer(result.body);
}

export async function getIndex(
  context: Client,
  cookie: string,
  server: string,
  roleId: string,
  options: GameRecordApiGetIndexOptionalParams = { requestOptions: {} },
): Promise<ApiResponseGenshinRecordIndexData> {
  const result = await _getIndexSend(context, cookie, server, roleId, options);
  return _getIndexDeserialize(result);
}
