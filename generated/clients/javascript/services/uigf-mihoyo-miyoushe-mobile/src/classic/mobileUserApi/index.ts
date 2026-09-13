// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext } from "../../api/mihoyoMiYouSheMobileContext.js";
import {
  login,
  getReplyPermission,
  getNotificationSettings,
  getUserFullInfo,
  getUserBusinesses,
} from "../../api/mobileUserApi/operations.js";
import {
  MobileUserApiLoginOptionalParams,
  MobileUserApiGetReplyPermissionOptionalParams,
  MobileUserApiGetNotificationSettingsOptionalParams,
  MobileUserApiGetUserFullInfoOptionalParams,
  MobileUserApiGetUserBusinessesOptionalParams,
} from "../../api/mobileUserApi/options.js";
import { MobileLoginRequest } from "../../models/uigf/mihoyo/api/request/models.js";
import {
  ApiResponseEmptyData,
  ApiResponseMobileBusinessesData,
  ApiResponseCommunityUser,
  ApiResponseMobileNotificationSettingsData,
  ApiResponseMobileReplyPermissionData,
} from "../../models/uigf/mihoyo/models.js";

/** Interface representing a MobileUserApi operations. */
export interface MobileUserApiOperations {
  login: (
    body: MobileLoginRequest,
    options?: MobileUserApiLoginOptionalParams,
  ) => Promise<ApiResponseEmptyData>;
  getReplyPermission: (
    options?: MobileUserApiGetReplyPermissionOptionalParams,
  ) => Promise<ApiResponseMobileReplyPermissionData>;
  getNotificationSettings: (
    uid: number,
    options?: MobileUserApiGetNotificationSettingsOptionalParams,
  ) => Promise<ApiResponseMobileNotificationSettingsData>;
  getUserFullInfo: (
    uid: number,
    options?: MobileUserApiGetUserFullInfoOptionalParams,
  ) => Promise<ApiResponseCommunityUser>;
  getUserBusinesses: (
    uid: number,
    options?: MobileUserApiGetUserBusinessesOptionalParams,
  ) => Promise<ApiResponseMobileBusinessesData>;
}

function _getMobileUserApi(context: MihoyoMiYouSheMobileContext) {
  return {
    login: (body: MobileLoginRequest, options?: MobileUserApiLoginOptionalParams) =>
      login(context, body, options),
    getReplyPermission: (options?: MobileUserApiGetReplyPermissionOptionalParams) =>
      getReplyPermission(context, options),
    getNotificationSettings: (
      uid: number,
      options?: MobileUserApiGetNotificationSettingsOptionalParams,
    ) => getNotificationSettings(context, uid, options),
    getUserFullInfo: (uid: number, options?: MobileUserApiGetUserFullInfoOptionalParams) =>
      getUserFullInfo(context, uid, options),
    getUserBusinesses: (uid: number, options?: MobileUserApiGetUserBusinessesOptionalParams) =>
      getUserBusinesses(context, uid, options),
  };
}

export function _getMobileUserApiOperations(
  context: MihoyoMiYouSheMobileContext,
): MobileUserApiOperations {
  return {
    ..._getMobileUserApi(context),
  };
}
