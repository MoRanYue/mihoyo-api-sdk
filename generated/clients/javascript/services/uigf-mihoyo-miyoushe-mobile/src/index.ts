// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoMiYouSheMobileClient } from "./mihoyoMiYouSheMobileClient.js";
export type {
  ApiResponseMobileAppSplashData,
  ApiResponseMobileGameListData,
  ApiResponseMobileMyselfPageConfigData,
  ApiResponseMobileUnreadMessageData,
  ApiResponseMobileMissionsStateData,
  ApiResponseEmptyData,
  ApiResponseMobileStartupData,
  ApiResponseMobileWindowPrepareData,
  ApiResponseMobileWindowShowData,
  ApiResponseMobileUserSettingsData,
  ApiResponseMobileDiscussionData,
  ApiResponseMobileEmoticonData,
  ApiResponseMobileFeedPostsData,
  ApiResponseMobileUserInstantListData,
  ApiResponseMobileVillaSitePushData,
  ApiResponseMobileVideoPermissionData,
  ApiResponseMobileGameCenterData,
  ApiResponseMobileTeenagerInfoData,
  ApiResponseMobileUnreadInfoData,
  ApiResponseMobileBusinessesData,
  ApiResponseCommunityUser,
  CommunityUser,
  JsonObject,
  ApiResponseMobileNotificationSettingsData,
  ApiResponseMobileReplyPermissionData,
  ApiResponseMobileEntityReviewData,
  ApiResponseMobilePreloadConfigData,
} from "./models/uigf/mihoyo/index.js";
export type {
  MobileDeviceSessionRequest,
  MobileStartupRequest,
  MobileStartupRequestItem,
  MobileStartupRequestPayload,
  MobileStartupImageTemplateRequest,
  MobileWindowPrepareRequest,
  MobileWindowShowRequest,
  MobileLoginRequest,
  MobilePreloadConfigRequest,
  MobilePreloadResourceInfo,
} from "./models/uigf/mihoyo/api/request/index.js";
export type {
  MobileAppSplashData,
  MobileGameListData,
  MobileGame,
  MobileMyselfPageConfigData,
  MobileUnreadMessageData,
  MobileMissionsStateData,
  EmptyData,
  MobileStartupData,
  MobileWindowPrepareData,
  MobileWindowShowData,
  MobileUserSettingsData,
  MobileDiscussionData,
  MobileDiscussion,
  MobileEmoticonData,
  MobileFeedPostsData,
  MobileUserInstantListData,
  MobileVillaSitePushData,
  MobileVideoPermissionData,
  MobileGameCenterData,
  MobileTeenagerInfoData,
  MobileUnreadInfoData,
  MobileUnreadInfoUser,
  MobileBusinessesData,
  MobileNotificationSettingsData,
  MobileReplyPermissionData,
  MobileEntityReviewData,
  MobilePreloadConfigData,
} from "./models/uigf/mihoyo/api/response/index.js";
export type { MihoyoMiYouSheMobileClientOptionalParams } from "./api/index.js";
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
} from "./api/mobileApiHub/index.js";
export type { MobileChatApiGetUserSettingsOptionalParams } from "./api/mobileChatApi/index.js";
export type { MobileForumApiGetDiscussionByGameOptionalParams } from "./api/mobileForumApi/index.js";
export type { MobileMiscApiGetRecentEmoticonsOptionalParams } from "./api/mobileMiscApi/index.js";
export type {
  MobilePainterApiGetVillaSitePushOptionalParams,
  MobilePainterApiGetUserInstantListOptionalParams,
  MobilePainterApiGetFeedPostsOptionalParams,
} from "./api/mobilePainterApi/index.js";
export type { MobilePostApiGetPublishVideoPermissionOptionalParams } from "./api/mobilePostApi/index.js";
export type { MobilePreloadApiGetLatestConfigOptionalParams } from "./api/mobilePreloadApi/index.js";
export type { MobileReceptionApiGetGameCenterOptionalParams } from "./api/mobileReceptionApi/index.js";
export type { MobileTeenagerApiGetInfoOptionalParams } from "./api/mobileTeenagerApi/index.js";
export type { MobileTimelineApiGetUnreadInfoOptionalParams } from "./api/mobileTimelineApi/index.js";
export type {
  MobileUserApiLoginOptionalParams,
  MobileUserApiGetReplyPermissionOptionalParams,
  MobileUserApiGetNotificationSettingsOptionalParams,
  MobileUserApiGetUserFullInfoOptionalParams,
  MobileUserApiGetUserBusinessesOptionalParams,
} from "./api/mobileUserApi/index.js";
export type { MobileUserInstantApiGetEntityReviewOptionalParams } from "./api/mobileUserInstantApi/index.js";
export type {
  MobileApiHubOperations,
  MobileChatApiOperations,
  MobileForumApiOperations,
  MobileMiscApiOperations,
  MobilePainterApiOperations,
  MobilePostApiOperations,
  MobilePreloadApiOperations,
  MobileReceptionApiOperations,
  MobileTeenagerApiOperations,
  MobileTimelineApiOperations,
  MobileUserApiOperations,
  MobileUserInstantApiOperations,
} from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
