// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext } from "../../api/mihoyoMiYouSheMobileContext.js";
import {
  showWindow,
  prepareWindow,
  getAppStartupData,
  deviceLogout,
  deviceLogin,
  getUserMissionsState,
  getUnreadMessageCount,
  getMyselfPageConfig,
  getGameList,
  getAppSplash,
} from "../../api/mobileApiHub/operations.js";
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
} from "../../api/mobileApiHub/options.js";
import {
  MobileDeviceSessionRequest,
  MobileStartupRequest,
  MobileWindowPrepareRequest,
  MobileWindowShowRequest,
} from "../../models/uigf/mihoyo/api/request/models.js";
import {
  ApiResponseMobileAppSplashData,
  ApiResponseMobileGameListData,
  ApiResponseMobileMyselfPageConfigData,
  ApiResponseMobileUnreadMessageData,
  ApiResponseMobileMissionsStateData,
  ApiResponseEmptyData,
  ApiResponseMobileStartupData,
  ApiResponseMobileWindowPrepareData,
  ApiResponseMobileWindowShowData,
} from "../../models/uigf/mihoyo/models.js";

/** Interface representing a MobileApiHub operations. */
export interface MobileApiHubOperations {
  showWindow: (
    body: MobileWindowShowRequest,
    options?: MobileApiHubShowWindowOptionalParams,
  ) => Promise<ApiResponseMobileWindowShowData>;
  prepareWindow: (
    body: MobileWindowPrepareRequest,
    options?: MobileApiHubPrepareWindowOptionalParams,
  ) => Promise<ApiResponseMobileWindowPrepareData>;
  getAppStartupData: (
    body: MobileStartupRequest,
    options?: MobileApiHubGetAppStartupDataOptionalParams,
  ) => Promise<ApiResponseMobileStartupData>;
  deviceLogout: (
    body: MobileDeviceSessionRequest,
    options?: MobileApiHubDeviceLogoutOptionalParams,
  ) => Promise<ApiResponseEmptyData>;
  deviceLogin: (
    body: MobileDeviceSessionRequest,
    options?: MobileApiHubDeviceLoginOptionalParams,
  ) => Promise<ApiResponseEmptyData>;
  getUserMissionsState: (
    options?: MobileApiHubGetUserMissionsStateOptionalParams,
  ) => Promise<ApiResponseMobileMissionsStateData>;
  getUnreadMessageCount: (
    firstViewTs: number,
    uid: number,
    options?: MobileApiHubGetUnreadMessageCountOptionalParams,
  ) => Promise<ApiResponseMobileUnreadMessageData>;
  getMyselfPageConfig: (
    options?: MobileApiHubGetMyselfPageConfigOptionalParams,
  ) => Promise<ApiResponseMobileMyselfPageConfigData>;
  getGameList: (
    options?: MobileApiHubGetGameListOptionalParams,
  ) => Promise<ApiResponseMobileGameListData>;
  getAppSplash: (
    options?: MobileApiHubGetAppSplashOptionalParams,
  ) => Promise<ApiResponseMobileAppSplashData>;
}

function _getMobileApiHub(context: MihoyoMiYouSheMobileContext) {
  return {
    showWindow: (body: MobileWindowShowRequest, options?: MobileApiHubShowWindowOptionalParams) =>
      showWindow(context, body, options),
    prepareWindow: (
      body: MobileWindowPrepareRequest,
      options?: MobileApiHubPrepareWindowOptionalParams,
    ) => prepareWindow(context, body, options),
    getAppStartupData: (
      body: MobileStartupRequest,
      options?: MobileApiHubGetAppStartupDataOptionalParams,
    ) => getAppStartupData(context, body, options),
    deviceLogout: (
      body: MobileDeviceSessionRequest,
      options?: MobileApiHubDeviceLogoutOptionalParams,
    ) => deviceLogout(context, body, options),
    deviceLogin: (
      body: MobileDeviceSessionRequest,
      options?: MobileApiHubDeviceLoginOptionalParams,
    ) => deviceLogin(context, body, options),
    getUserMissionsState: (options?: MobileApiHubGetUserMissionsStateOptionalParams) =>
      getUserMissionsState(context, options),
    getUnreadMessageCount: (
      firstViewTs: number,
      uid: number,
      options?: MobileApiHubGetUnreadMessageCountOptionalParams,
    ) => getUnreadMessageCount(context, firstViewTs, uid, options),
    getMyselfPageConfig: (options?: MobileApiHubGetMyselfPageConfigOptionalParams) =>
      getMyselfPageConfig(context, options),
    getGameList: (options?: MobileApiHubGetGameListOptionalParams) => getGameList(context, options),
    getAppSplash: (options?: MobileApiHubGetAppSplashOptionalParams) =>
      getAppSplash(context, options),
  };
}

export function _getMobileApiHubOperations(
  context: MihoyoMiYouSheMobileContext,
): MobileApiHubOperations {
  return {
    ..._getMobileApiHub(context),
  };
}
