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
    ds: string,
    body: MobileLoginRequest,
    options?: MobileUserApiLoginOptionalParams,
  ) => Promise<ApiResponseEmptyData>;
  getReplyPermission: (
    ds: string,
    options?: MobileUserApiGetReplyPermissionOptionalParams,
  ) => Promise<ApiResponseMobileReplyPermissionData>;
  getNotificationSettings: (
    ds: string,
    uid: number,
    options?: MobileUserApiGetNotificationSettingsOptionalParams,
  ) => Promise<ApiResponseMobileNotificationSettingsData>;
  getUserFullInfo: (
    ds: string,
    uid: number,
    options?: MobileUserApiGetUserFullInfoOptionalParams,
  ) => Promise<ApiResponseCommunityUser>;
  getUserBusinesses: (
    ds: string,
    uid: number,
    options?: MobileUserApiGetUserBusinessesOptionalParams,
  ) => Promise<ApiResponseMobileBusinessesData>;
}

function _getMobileUserApi(context: MihoyoMiYouSheMobileContext) {
  return {
    login: (ds: string, body: MobileLoginRequest, options?: MobileUserApiLoginOptionalParams) =>
      login(context, ds, body, options),
    getReplyPermission: (ds: string, options?: MobileUserApiGetReplyPermissionOptionalParams) =>
      getReplyPermission(context, ds, options),
    getNotificationSettings: (
      ds: string,
      uid: number,
      options?: MobileUserApiGetNotificationSettingsOptionalParams,
    ) => getNotificationSettings(context, ds, uid, options),
    getUserFullInfo: (
      ds: string,
      uid: number,
      options?: MobileUserApiGetUserFullInfoOptionalParams,
    ) => getUserFullInfo(context, ds, uid, options),
    getUserBusinesses: (
      ds: string,
      uid: number,
      options?: MobileUserApiGetUserBusinessesOptionalParams,
    ) => getUserBusinesses(context, ds, uid, options),
  };
}

export function _getMobileUserApiOperations(
  context: MihoyoMiYouSheMobileContext,
): MobileUserApiOperations {
  return {
    ..._getMobileUserApi(context),
  };
}
