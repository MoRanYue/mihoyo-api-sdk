// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext as Client } from "../index.js";
import {
  MobileLoginRequest,
  mobileLoginRequestSerializer,
} from "../../models/uigf/mihoyo/api/request/models.js";
import {
  ApiResponseEmptyData,
  apiResponseEmptyDataDeserializer,
  ApiResponseMobileBusinessesData,
  apiResponseMobileBusinessesDataDeserializer,
  ApiResponseCommunityUser,
  apiResponseCommunityUserDeserializer,
  ApiResponseMobileNotificationSettingsData,
  apiResponseMobileNotificationSettingsDataDeserializer,
  ApiResponseMobileReplyPermissionData,
  apiResponseMobileReplyPermissionDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import {
  MobileUserApiLoginOptionalParams,
  MobileUserApiGetReplyPermissionOptionalParams,
  MobileUserApiGetNotificationSettingsOptionalParams,
  MobileUserApiGetUserFullInfoOptionalParams,
  MobileUserApiGetUserBusinessesOptionalParams,
} from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _loginSend(
  context: Client,
  ds: string,
  body: MobileLoginRequest,
  options: MobileUserApiLoginOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/user/api/login")
    .post({
      ...operationOptionsToRequestParameters(options),
      contentType: "application/json",
      headers: {
        ...(options?.cookie !== undefined ? { cookie: options?.cookie } : {}),
        ds: ds,
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
      body: mobileLoginRequestSerializer(body),
    });
}

export async function _loginDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseEmptyData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseEmptyDataDeserializer(result.body);
}

export async function login(
  context: Client,
  ds: string,
  body: MobileLoginRequest,
  options: MobileUserApiLoginOptionalParams = { requestOptions: {} },
): Promise<ApiResponseEmptyData> {
  const result = await _loginSend(context, ds, body, options);
  return _loginDeserialize(result);
}

export function _getReplyPermissionSend(
  context: Client,
  ds: string,
  options: MobileUserApiGetReplyPermissionOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/user/api/replyPermission")
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

export async function _getReplyPermissionDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileReplyPermissionData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileReplyPermissionDataDeserializer(result.body);
}

export async function getReplyPermission(
  context: Client,
  ds: string,
  options: MobileUserApiGetReplyPermissionOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileReplyPermissionData> {
  const result = await _getReplyPermissionSend(context, ds, options);
  return _getReplyPermissionDeserialize(result);
}

export function _getNotificationSettingsSend(
  context: Client,
  ds: string,
  uid: number,
  options: MobileUserApiGetNotificationSettingsOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/user/api/notify/settings{?uid}",
    {
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

export async function _getNotificationSettingsDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileNotificationSettingsData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileNotificationSettingsDataDeserializer(result.body);
}

export async function getNotificationSettings(
  context: Client,
  ds: string,
  uid: number,
  options: MobileUserApiGetNotificationSettingsOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileNotificationSettingsData> {
  const result = await _getNotificationSettingsSend(context, ds, uid, options);
  return _getNotificationSettingsDeserialize(result);
}

export function _getUserFullInfoSend(
  context: Client,
  ds: string,
  uid: number,
  options: MobileUserApiGetUserFullInfoOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/user/api/getUserFullInfo{?uid}",
    {
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

export async function _getUserFullInfoDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseCommunityUser> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseCommunityUserDeserializer(result.body);
}

export async function getUserFullInfo(
  context: Client,
  ds: string,
  uid: number,
  options: MobileUserApiGetUserFullInfoOptionalParams = { requestOptions: {} },
): Promise<ApiResponseCommunityUser> {
  const result = await _getUserFullInfoSend(context, ds, uid, options);
  return _getUserFullInfoDeserialize(result);
}

export function _getUserBusinessesSend(
  context: Client,
  ds: string,
  uid: number,
  options: MobileUserApiGetUserBusinessesOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/user/api/getUserBusinesses{?uid}",
    {
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

export async function _getUserBusinessesDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileBusinessesData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileBusinessesDataDeserializer(result.body);
}

export async function getUserBusinesses(
  context: Client,
  ds: string,
  uid: number,
  options: MobileUserApiGetUserBusinessesOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileBusinessesData> {
  const result = await _getUserBusinessesSend(context, ds, uid, options);
  return _getUserBusinessesDeserialize(result);
}
