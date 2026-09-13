// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameGenshinAnnouncementsContext as Client } from "../index.js";
import {
  ApiResponseAnnouncementListData,
  apiResponseAnnouncementListDataDeserializer,
  ApiResponseAnnouncementAlertData,
  apiResponseAnnouncementAlertDataDeserializer,
  ApiResponseAnnouncementPictureData,
  apiResponseAnnouncementPictureDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import {
  AnnouncementApiGetAlertPictureOptionalParams,
  AnnouncementApiGetAlertOptionalParams,
  AnnouncementApiListOptionalParams,
} from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getAlertPictureSend(
  context: Client,
  game: string,
  gameBiz: string,
  lang: string,
  bundleId: string,
  platform: "pc" | "android" | "ios",
  region: string,
  options: AnnouncementApiGetAlertPictureOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/common/hk4e_cn/announcement/api/getAlertPic{?game,game_biz,lang,bundle_id,platform,region,level,uid,channel_id}",
    {
      game: game,
      game_biz: gameBiz,
      lang: lang,
      bundle_id: bundleId,
      platform: platform,
      region: region,
      level: options?.level,
      uid: options?.uid,
      channel_id: options?.channelId,
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

export async function _getAlertPictureDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseAnnouncementPictureData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseAnnouncementPictureDataDeserializer(result.body);
}

export async function getAlertPicture(
  context: Client,
  game: string,
  gameBiz: string,
  lang: string,
  bundleId: string,
  platform: "pc" | "android" | "ios",
  region: string,
  options: AnnouncementApiGetAlertPictureOptionalParams = { requestOptions: {} },
): Promise<ApiResponseAnnouncementPictureData> {
  const result = await _getAlertPictureSend(
    context,
    game,
    gameBiz,
    lang,
    bundleId,
    platform,
    region,
    options,
  );
  return _getAlertPictureDeserialize(result);
}

export function _getAlertSend(
  context: Client,
  game: string,
  gameBiz: string,
  lang: string,
  bundleId: string,
  platform: "pc" | "android" | "ios",
  region: string,
  options: AnnouncementApiGetAlertOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/common/hk4e_cn/announcement/api/getAlertAnn{?game,game_biz,lang,bundle_id,platform,region,level,uid,channel_id}",
    {
      game: game,
      game_biz: gameBiz,
      lang: lang,
      bundle_id: bundleId,
      platform: platform,
      region: region,
      level: options?.level,
      uid: options?.uid,
      channel_id: options?.channelId,
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

export async function _getAlertDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseAnnouncementAlertData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseAnnouncementAlertDataDeserializer(result.body);
}

export async function getAlert(
  context: Client,
  game: string,
  gameBiz: string,
  lang: string,
  bundleId: string,
  platform: "pc" | "android" | "ios",
  region: string,
  options: AnnouncementApiGetAlertOptionalParams = { requestOptions: {} },
): Promise<ApiResponseAnnouncementAlertData> {
  const result = await _getAlertSend(
    context,
    game,
    gameBiz,
    lang,
    bundleId,
    platform,
    region,
    options,
  );
  return _getAlertDeserialize(result);
}

export function _listSend(
  context: Client,
  game: string,
  gameBiz: string,
  lang: string,
  bundleId: string,
  platform: "pc" | "android" | "ios",
  region: string,
  options: AnnouncementApiListOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/common/hk4e_cn/announcement/api/getAnnList{?game,game_biz,lang,bundle_id,platform,region,level,uid,channel_id}",
    {
      game: game,
      game_biz: gameBiz,
      lang: lang,
      bundle_id: bundleId,
      platform: platform,
      region: region,
      level: options?.level,
      uid: options?.uid,
      channel_id: options?.channelId,
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

export async function _listDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseAnnouncementListData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseAnnouncementListDataDeserializer(result.body);
}

export async function list(
  context: Client,
  game: string,
  gameBiz: string,
  lang: string,
  bundleId: string,
  platform: "pc" | "android" | "ios",
  region: string,
  options: AnnouncementApiListOptionalParams = { requestOptions: {} },
): Promise<ApiResponseAnnouncementListData> {
  const result = await _listSend(context, game, gameBiz, lang, bundleId, platform, region, options);
  return _listDeserialize(result);
}
