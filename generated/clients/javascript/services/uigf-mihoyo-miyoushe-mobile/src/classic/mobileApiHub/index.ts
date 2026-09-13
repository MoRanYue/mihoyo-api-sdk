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
    ds: string,
    body: MobileWindowShowRequest,
    options?: MobileApiHubShowWindowOptionalParams,
  ) => Promise<ApiResponseMobileWindowShowData>;
  prepareWindow: (
    ds: string,
    body: MobileWindowPrepareRequest,
    options?: MobileApiHubPrepareWindowOptionalParams,
  ) => Promise<ApiResponseMobileWindowPrepareData>;
  getAppStartupData: (
    ds: string,
    body: MobileStartupRequest,
    options?: MobileApiHubGetAppStartupDataOptionalParams,
  ) => Promise<ApiResponseMobileStartupData>;
  deviceLogout: (
    ds: string,
    body: MobileDeviceSessionRequest,
    options?: MobileApiHubDeviceLogoutOptionalParams,
  ) => Promise<ApiResponseEmptyData>;
  deviceLogin: (
    ds: string,
    body: MobileDeviceSessionRequest,
    options?: MobileApiHubDeviceLoginOptionalParams,
  ) => Promise<ApiResponseEmptyData>;
  getUserMissionsState: (
    ds: string,
    options?: MobileApiHubGetUserMissionsStateOptionalParams,
  ) => Promise<ApiResponseMobileMissionsStateData>;
  getUnreadMessageCount: (
    ds: string,
    firstViewTs: number,
    uid: number,
    options?: MobileApiHubGetUnreadMessageCountOptionalParams,
  ) => Promise<ApiResponseMobileUnreadMessageData>;
  getMyselfPageConfig: (
    ds: string,
    options?: MobileApiHubGetMyselfPageConfigOptionalParams,
  ) => Promise<ApiResponseMobileMyselfPageConfigData>;
  getGameList: (
    ds: string,
    options?: MobileApiHubGetGameListOptionalParams,
  ) => Promise<ApiResponseMobileGameListData>;
  getAppSplash: (
    ds: string,
    options?: MobileApiHubGetAppSplashOptionalParams,
  ) => Promise<ApiResponseMobileAppSplashData>;
}

function _getMobileApiHub(context: MihoyoMiYouSheMobileContext) {
  return {
    showWindow: (
      ds: string,
      body: MobileWindowShowRequest,
      options?: MobileApiHubShowWindowOptionalParams,
    ) => showWindow(context, ds, body, options),
    prepareWindow: (
      ds: string,
      body: MobileWindowPrepareRequest,
      options?: MobileApiHubPrepareWindowOptionalParams,
    ) => prepareWindow(context, ds, body, options),
    getAppStartupData: (
      ds: string,
      body: MobileStartupRequest,
      options?: MobileApiHubGetAppStartupDataOptionalParams,
    ) => getAppStartupData(context, ds, body, options),
    deviceLogout: (
      ds: string,
      body: MobileDeviceSessionRequest,
      options?: MobileApiHubDeviceLogoutOptionalParams,
    ) => deviceLogout(context, ds, body, options),
    deviceLogin: (
      ds: string,
      body: MobileDeviceSessionRequest,
      options?: MobileApiHubDeviceLoginOptionalParams,
    ) => deviceLogin(context, ds, body, options),
    getUserMissionsState: (ds: string, options?: MobileApiHubGetUserMissionsStateOptionalParams) =>
      getUserMissionsState(context, ds, options),
    getUnreadMessageCount: (
      ds: string,
      firstViewTs: number,
      uid: number,
      options?: MobileApiHubGetUnreadMessageCountOptionalParams,
    ) => getUnreadMessageCount(context, ds, firstViewTs, uid, options),
    getMyselfPageConfig: (ds: string, options?: MobileApiHubGetMyselfPageConfigOptionalParams) =>
      getMyselfPageConfig(context, ds, options),
    getGameList: (ds: string, options?: MobileApiHubGetGameListOptionalParams) =>
      getGameList(context, ds, options),
    getAppSplash: (ds: string, options?: MobileApiHubGetAppSplashOptionalParams) =>
      getAppSplash(context, ds, options),
  };
}

export function _getMobileApiHubOperations(
  context: MihoyoMiYouSheMobileContext,
): MobileApiHubOperations {
  return {
    ..._getMobileApiHub(context),
  };
}
