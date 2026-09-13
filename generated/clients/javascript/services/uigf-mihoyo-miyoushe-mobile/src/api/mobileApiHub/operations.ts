// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext as Client } from "../index.js";
import {
  MobileDeviceSessionRequest,
  mobileDeviceSessionRequestSerializer,
  MobileStartupRequest,
  mobileStartupRequestSerializer,
  MobileWindowPrepareRequest,
  mobileWindowPrepareRequestSerializer,
  MobileWindowShowRequest,
  mobileWindowShowRequestSerializer,
} from "../../models/uigf/mihoyo/api/request/models.js";
import {
  ApiResponseMobileAppSplashData,
  apiResponseMobileAppSplashDataDeserializer,
  ApiResponseMobileGameListData,
  apiResponseMobileGameListDataDeserializer,
  ApiResponseMobileMyselfPageConfigData,
  apiResponseMobileMyselfPageConfigDataDeserializer,
  ApiResponseMobileUnreadMessageData,
  apiResponseMobileUnreadMessageDataDeserializer,
  ApiResponseMobileMissionsStateData,
  apiResponseMobileMissionsStateDataDeserializer,
  ApiResponseEmptyData,
  apiResponseEmptyDataDeserializer,
  ApiResponseMobileStartupData,
  apiResponseMobileStartupDataDeserializer,
  ApiResponseMobileWindowPrepareData,
  apiResponseMobileWindowPrepareDataDeserializer,
  ApiResponseMobileWindowShowData,
  apiResponseMobileWindowShowDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import {
  MobileApiHubShowWindowOptionalParams,
  MobileApiHubPrepareWindowOptionalParams,
  MobileApiHubGetAppStartupDataOptionalParams,
  MobileApiHubDeviceLogoutOptionalParams,
  MobileApiHubDeviceLoginOptionalParams,
  MobileApiHubGetUserMissionsStateOptionalParams,
  MobileApiHubGetUnreadMessageCountOptionalParams,
  MobileApiHubGetMyselfPageConfigOptionalParams,
  MobileApiHubGetGameListOptionalParams,
  MobileApiHubGetAppSplashOptionalParams,
} from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _showWindowSend(
  context: Client,
  ds: string,
  body: MobileWindowShowRequest,
  options: MobileApiHubShowWindowOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/apihub/api/window/show")
    .post({
      ...operationOptionsToRequestParameters(options),
      contentType: "application/json",
      headers: {
        ...(options?.cookie !== undefined ? { cookie: options?.cookie } : {}),
        ds: ds,
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
      body: mobileWindowShowRequestSerializer(body),
    });
}

export async function _showWindowDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileWindowShowData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileWindowShowDataDeserializer(result.body);
}

export async function showWindow(
  context: Client,
  ds: string,
  body: MobileWindowShowRequest,
  options: MobileApiHubShowWindowOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileWindowShowData> {
  const result = await _showWindowSend(context, ds, body, options);
  return _showWindowDeserialize(result);
}

export function _prepareWindowSend(
  context: Client,
  ds: string,
  body: MobileWindowPrepareRequest,
  options: MobileApiHubPrepareWindowOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/apihub/api/window/prepare")
    .post({
      ...operationOptionsToRequestParameters(options),
      contentType: "application/json",
      headers: {
        ...(options?.cookie !== undefined ? { cookie: options?.cookie } : {}),
        ds: ds,
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
      body: mobileWindowPrepareRequestSerializer(body),
    });
}

export async function _prepareWindowDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileWindowPrepareData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileWindowPrepareDataDeserializer(result.body);
}

export async function prepareWindow(
  context: Client,
  ds: string,
  body: MobileWindowPrepareRequest,
  options: MobileApiHubPrepareWindowOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileWindowPrepareData> {
  const result = await _prepareWindowSend(context, ds, body, options);
  return _prepareWindowDeserialize(result);
}

export function _getAppStartupDataSend(
  context: Client,
  ds: string,
  body: MobileStartupRequest,
  options: MobileApiHubGetAppStartupDataOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/apihub/api/getAppStartupData")
    .post({
      ...operationOptionsToRequestParameters(options),
      contentType: "application/json",
      headers: {
        ...(options?.cookie !== undefined ? { cookie: options?.cookie } : {}),
        ds: ds,
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
      body: mobileStartupRequestSerializer(body),
    });
}

export async function _getAppStartupDataDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileStartupData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileStartupDataDeserializer(result.body);
}

export async function getAppStartupData(
  context: Client,
  ds: string,
  body: MobileStartupRequest,
  options: MobileApiHubGetAppStartupDataOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileStartupData> {
  const result = await _getAppStartupDataSend(context, ds, body, options);
  return _getAppStartupDataDeserialize(result);
}

export function _deviceLogoutSend(
  context: Client,
  ds: string,
  body: MobileDeviceSessionRequest,
  options: MobileApiHubDeviceLogoutOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/apihub/api/deviceLogout")
    .post({
      ...operationOptionsToRequestParameters(options),
      contentType: "application/json",
      headers: {
        ...(options?.cookie !== undefined ? { cookie: options?.cookie } : {}),
        ds: ds,
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
      body: mobileDeviceSessionRequestSerializer(body),
    });
}

export async function _deviceLogoutDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseEmptyData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseEmptyDataDeserializer(result.body);
}

export async function deviceLogout(
  context: Client,
  ds: string,
  body: MobileDeviceSessionRequest,
  options: MobileApiHubDeviceLogoutOptionalParams = { requestOptions: {} },
): Promise<ApiResponseEmptyData> {
  const result = await _deviceLogoutSend(context, ds, body, options);
  return _deviceLogoutDeserialize(result);
}

export function _deviceLoginSend(
  context: Client,
  ds: string,
  body: MobileDeviceSessionRequest,
  options: MobileApiHubDeviceLoginOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/apihub/api/deviceLogin")
    .post({
      ...operationOptionsToRequestParameters(options),
      contentType: "application/json",
      headers: {
        ...(options?.cookie !== undefined ? { cookie: options?.cookie } : {}),
        ds: ds,
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
      body: mobileDeviceSessionRequestSerializer(body),
    });
}

export async function _deviceLoginDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseEmptyData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseEmptyDataDeserializer(result.body);
}

export async function deviceLogin(
  context: Client,
  ds: string,
  body: MobileDeviceSessionRequest,
  options: MobileApiHubDeviceLoginOptionalParams = { requestOptions: {} },
): Promise<ApiResponseEmptyData> {
  const result = await _deviceLoginSend(context, ds, body, options);
  return _deviceLoginDeserialize(result);
}

export function _getUserMissionsStateSend(
  context: Client,
  ds: string,
  options: MobileApiHubGetUserMissionsStateOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/apihub/sapi/getUserMissionsState")
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

export async function _getUserMissionsStateDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileMissionsStateData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileMissionsStateDataDeserializer(result.body);
}

export async function getUserMissionsState(
  context: Client,
  ds: string,
  options: MobileApiHubGetUserMissionsStateOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileMissionsStateData> {
  const result = await _getUserMissionsStateSend(context, ds, options);
  return _getUserMissionsStateDeserialize(result);
}

export function _getUnreadMessageCountSend(
  context: Client,
  ds: string,
  firstViewTs: number,
  uid: number,
  options: MobileApiHubGetUnreadMessageCountOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/apihub/api/unreadMessageCnt{?first_view_ts,uid}",
    {
      first_view_ts: firstViewTs,
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
        ds: ds,
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getUnreadMessageCountDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileUnreadMessageData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileUnreadMessageDataDeserializer(result.body);
}

export async function getUnreadMessageCount(
  context: Client,
  ds: string,
  firstViewTs: number,
  uid: number,
  options: MobileApiHubGetUnreadMessageCountOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileUnreadMessageData> {
  const result = await _getUnreadMessageCountSend(context, ds, firstViewTs, uid, options);
  return _getUnreadMessageCountDeserialize(result);
}

export function _getMyselfPageConfigSend(
  context: Client,
  ds: string,
  options: MobileApiHubGetMyselfPageConfigOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/apihub/api/myselfPageConfig")
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

export async function _getMyselfPageConfigDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileMyselfPageConfigData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileMyselfPageConfigDataDeserializer(result.body);
}

export async function getMyselfPageConfig(
  context: Client,
  ds: string,
  options: MobileApiHubGetMyselfPageConfigOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileMyselfPageConfigData> {
  const result = await _getMyselfPageConfigSend(context, ds, options);
  return _getMyselfPageConfigDeserialize(result);
}

export function _getGameListSend(
  context: Client,
  ds: string,
  options: MobileApiHubGetGameListOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/apihub/api/getGameList")
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

export async function _getGameListDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileGameListData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileGameListDataDeserializer(result.body);
}

export async function getGameList(
  context: Client,
  ds: string,
  options: MobileApiHubGetGameListOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileGameListData> {
  const result = await _getGameListSend(context, ds, options);
  return _getGameListDeserialize(result);
}

export function _getAppSplashSend(
  context: Client,
  ds: string,
  options: MobileApiHubGetAppSplashOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/apihub/api/getAppSplash")
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

export async function _getAppSplashDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileAppSplashData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileAppSplashDataDeserializer(result.body);
}

export async function getAppSplash(
  context: Client,
  ds: string,
  options: MobileApiHubGetAppSplashOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileAppSplashData> {
  const result = await _getAppSplashSend(context, ds, options);
  return _getAppSplashDeserialize(result);
}
