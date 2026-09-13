// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export {
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
} from "./operations.js";
export type {
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
