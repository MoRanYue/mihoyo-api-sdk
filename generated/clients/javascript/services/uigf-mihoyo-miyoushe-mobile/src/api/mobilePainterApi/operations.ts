// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext as Client } from "../index.js";
import {
  ApiResponseMobileFeedPostsData,
  apiResponseMobileFeedPostsDataDeserializer,
  ApiResponseMobileUserInstantListData,
  apiResponseMobileUserInstantListDataDeserializer,
  ApiResponseMobileVillaSitePushData,
  apiResponseMobileVillaSitePushDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import {
  MobilePainterApiGetVillaSitePushOptionalParams,
  MobilePainterApiGetUserInstantListOptionalParams,
  MobilePainterApiGetFeedPostsOptionalParams,
} from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getVillaSitePushSend(
  context: Client,
  ds: string,
  options: MobilePainterApiGetVillaSitePushOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/painter/api/villa/notification/site_push")
    .get({
      ...operationOptionsToRequestParameters(options),
      headers: {
        ...(options?.cookie !== undefined ? { cookie: options?.cookie } : {}),
        ds: ds,
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getVillaSitePushDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileVillaSitePushData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileVillaSitePushDataDeserializer(result.body);
}

export async function getVillaSitePush(
  context: Client,
  ds: string,
  options: MobilePainterApiGetVillaSitePushOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileVillaSitePushData> {
  const result = await _getVillaSitePushSend(context, ds, options);
  return _getVillaSitePushDeserialize(result);
}

export function _getUserInstantListSend(
  context: Client,
  ds: string,
  gameRegion: string,
  gameUid: number,
  offset: number,
  size: number,
  uid: number,
  viewType: number,
  options: MobilePainterApiGetUserInstantListOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/painter/api/user_instant/list{?game_region,game_uid,offset,size,uid,view_type}",
    {
      game_region: gameRegion,
      game_uid: gameUid,
      offset: offset,
      size: size,
      uid: uid,
      view_type: viewType,
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
        ds: ds,
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getUserInstantListDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileUserInstantListData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileUserInstantListDataDeserializer(result.body);
}

export async function getUserInstantList(
  context: Client,
  ds: string,
  gameRegion: string,
  gameUid: number,
  offset: number,
  size: number,
  uid: number,
  viewType: number,
  options: MobilePainterApiGetUserInstantListOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileUserInstantListData> {
  const result = await _getUserInstantListSend(
    context,
    ds,
    gameRegion,
    gameUid,
    offset,
    size,
    uid,
    viewType,
    options,
  );
  return _getUserInstantListDeserialize(result);
}

export function _getFeedPostsSend(
  context: Client,
  ds: string,
  algorithmType: number,
  cpu: string,
  device: string,
  filter: string,
  freshAction: number,
  gids: number,
  isFirstInitialize: boolean,
  isTriggeredByResource: boolean,
  lastId: string,
  options: MobilePainterApiGetFeedPostsOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/painter/api/feeds/posts{?algorithm_type,cpu,device,filter,fresh_action,gids,is_first_initialize,is_triggered_by_resource,last_id}",
    {
      algorithm_type: algorithmType,
      cpu: cpu,
      device: device,
      filter: filter,
      fresh_action: freshAction,
      gids: gids,
      is_first_initialize: isFirstInitialize,
      is_triggered_by_resource: isTriggeredByResource,
      last_id: lastId,
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
        ds: ds,
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getFeedPostsDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileFeedPostsData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileFeedPostsDataDeserializer(result.body);
}

export async function getFeedPosts(
  context: Client,
  ds: string,
  algorithmType: number,
  cpu: string,
  device: string,
  filter: string,
  freshAction: number,
  gids: number,
  isFirstInitialize: boolean,
  isTriggeredByResource: boolean,
  lastId: string,
  options: MobilePainterApiGetFeedPostsOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileFeedPostsData> {
  const result = await _getFeedPostsSend(
    context,
    ds,
    algorithmType,
    cpu,
    device,
    filter,
    freshAction,
    gids,
    isFirstInitialize,
    isTriggeredByResource,
    lastId,
    options,
  );
  return _getFeedPostsDeserialize(result);
}
