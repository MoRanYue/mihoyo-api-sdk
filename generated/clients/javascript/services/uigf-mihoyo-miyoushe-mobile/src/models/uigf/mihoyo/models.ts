// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../static-helpers/serialization/serialize-record.js";
import {
  MobileAppSplashData,
  mobileAppSplashDataDeserializer,
  MobileGameListData,
  mobileGameListDataDeserializer,
  MobileMyselfPageConfigData,
  mobileMyselfPageConfigDataDeserializer,
  MobileUnreadMessageData,
  mobileUnreadMessageDataDeserializer,
  MobileMissionsStateData,
  mobileMissionsStateDataDeserializer,
  EmptyData,
  emptyDataDeserializer,
  MobileStartupData,
  mobileStartupDataDeserializer,
  MobileWindowPrepareData,
  mobileWindowPrepareDataDeserializer,
  MobileWindowShowData,
  mobileWindowShowDataDeserializer,
  MobileUserSettingsData,
  mobileUserSettingsDataDeserializer,
  MobileDiscussionData,
  mobileDiscussionDataDeserializer,
  MobileEmoticonData,
  mobileEmoticonDataDeserializer,
  MobileFeedPostsData,
  mobileFeedPostsDataDeserializer,
  MobileUserInstantListData,
  mobileUserInstantListDataDeserializer,
  MobileVillaSitePushData,
  mobileVillaSitePushDataDeserializer,
  MobileVideoPermissionData,
  mobileVideoPermissionDataDeserializer,
  MobileGameCenterData,
  mobileGameCenterDataDeserializer,
  MobileTeenagerInfoData,
  mobileTeenagerInfoDataDeserializer,
  MobileUnreadInfoData,
  mobileUnreadInfoDataDeserializer,
  MobileBusinessesData,
  mobileBusinessesDataDeserializer,
  MobileNotificationSettingsData,
  mobileNotificationSettingsDataDeserializer,
  MobileReplyPermissionData,
  mobileReplyPermissionDataDeserializer,
  MobileEntityReviewData,
  mobileEntityReviewDataDeserializer,
  MobilePreloadConfigData,
  mobilePreloadConfigDataDeserializer,
} from "./api/response/models.js";

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileAppSplashData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileAppSplashData;
}

export function apiResponseMobileAppSplashDataDeserializer(
  item: any,
): ApiResponseMobileAppSplashData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileAppSplashDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileGameListData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileGameListData;
}

export function apiResponseMobileGameListDataDeserializer(
  item: any,
): ApiResponseMobileGameListData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileGameListDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileMyselfPageConfigData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileMyselfPageConfigData;
}

export function apiResponseMobileMyselfPageConfigDataDeserializer(
  item: any,
): ApiResponseMobileMyselfPageConfigData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileMyselfPageConfigDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileUnreadMessageData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileUnreadMessageData;
}

export function apiResponseMobileUnreadMessageDataDeserializer(
  item: any,
): ApiResponseMobileUnreadMessageData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileUnreadMessageDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileMissionsStateData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileMissionsStateData;
}

export function apiResponseMobileMissionsStateDataDeserializer(
  item: any,
): ApiResponseMobileMissionsStateData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileMissionsStateDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseEmptyData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: EmptyData;
}

export function apiResponseEmptyDataDeserializer(item: any): ApiResponseEmptyData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: emptyDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileStartupData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileStartupData;
}

export function apiResponseMobileStartupDataDeserializer(item: any): ApiResponseMobileStartupData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileStartupDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileWindowPrepareData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileWindowPrepareData;
}

export function apiResponseMobileWindowPrepareDataDeserializer(
  item: any,
): ApiResponseMobileWindowPrepareData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileWindowPrepareDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileWindowShowData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileWindowShowData;
}

export function apiResponseMobileWindowShowDataDeserializer(
  item: any,
): ApiResponseMobileWindowShowData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileWindowShowDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileUserSettingsData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileUserSettingsData;
}

export function apiResponseMobileUserSettingsDataDeserializer(
  item: any,
): ApiResponseMobileUserSettingsData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileUserSettingsDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileDiscussionData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileDiscussionData;
}

export function apiResponseMobileDiscussionDataDeserializer(
  item: any,
): ApiResponseMobileDiscussionData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileDiscussionDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileEmoticonData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileEmoticonData;
}

export function apiResponseMobileEmoticonDataDeserializer(
  item: any,
): ApiResponseMobileEmoticonData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileEmoticonDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileFeedPostsData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileFeedPostsData;
}

export function apiResponseMobileFeedPostsDataDeserializer(
  item: any,
): ApiResponseMobileFeedPostsData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileFeedPostsDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileUserInstantListData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileUserInstantListData;
}

export function apiResponseMobileUserInstantListDataDeserializer(
  item: any,
): ApiResponseMobileUserInstantListData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileUserInstantListDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileVillaSitePushData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileVillaSitePushData;
}

export function apiResponseMobileVillaSitePushDataDeserializer(
  item: any,
): ApiResponseMobileVillaSitePushData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileVillaSitePushDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileVideoPermissionData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileVideoPermissionData;
}

export function apiResponseMobileVideoPermissionDataDeserializer(
  item: any,
): ApiResponseMobileVideoPermissionData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileVideoPermissionDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileGameCenterData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileGameCenterData;
}

export function apiResponseMobileGameCenterDataDeserializer(
  item: any,
): ApiResponseMobileGameCenterData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileGameCenterDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileTeenagerInfoData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileTeenagerInfoData;
}

export function apiResponseMobileTeenagerInfoDataDeserializer(
  item: any,
): ApiResponseMobileTeenagerInfoData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileTeenagerInfoDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileUnreadInfoData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileUnreadInfoData;
}

export function apiResponseMobileUnreadInfoDataDeserializer(
  item: any,
): ApiResponseMobileUnreadInfoData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileUnreadInfoDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileBusinessesData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileBusinessesData;
}

export function apiResponseMobileBusinessesDataDeserializer(
  item: any,
): ApiResponseMobileBusinessesData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileBusinessesDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseCommunityUser {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: CommunityUser;
}

export function apiResponseCommunityUserDeserializer(item: any): ApiResponseCommunityUser {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: communityUserDeserializer(item["data"]),
  };
}

/** A user profile returned by community-account APIs. */
export interface CommunityUser {
  uid: string;
  nickname?: string;
  introduce?: string;
  avatarUrl?: string;
  gender?: number;
  levelExp?: JsonObject;
  communityInfo?: JsonObject;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function communityUserDeserializer(item: any): CommunityUser {
  return {
    additionalProperties: serializeRecord(item, [
      "uid",
      "nickname",
      "introduce",
      "avatar_url",
      "gender",
      "level_exp",
      "community_info",
    ]),
    uid: item["uid"],
    nickname: item["nickname"],
    introduce: item["introduce"],
    avatarUrl: item["avatar_url"],
    gender: item["gender"],
    levelExp: !item["level_exp"] ? item["level_exp"] : jsonObjectDeserializer(item["level_exp"]),
    communityInfo: !item["community_info"]
      ? item["community_info"]
      : jsonObjectDeserializer(item["community_info"]),
  };
}

/** A JSON object whose vendor-defined properties are preserved by generated clients. */
export interface JsonObject {
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function jsonObjectDeserializer(item: any): JsonObject {
  return {
    additionalProperties: serializeRecord(item, []),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileNotificationSettingsData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileNotificationSettingsData;
}

export function apiResponseMobileNotificationSettingsDataDeserializer(
  item: any,
): ApiResponseMobileNotificationSettingsData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileNotificationSettingsDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileReplyPermissionData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileReplyPermissionData;
}

export function apiResponseMobileReplyPermissionDataDeserializer(
  item: any,
): ApiResponseMobileReplyPermissionData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileReplyPermissionDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobileEntityReviewData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobileEntityReviewData;
}

export function apiResponseMobileEntityReviewDataDeserializer(
  item: any,
): ApiResponseMobileEntityReviewData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobileEntityReviewDataDeserializer(item["data"]),
  };
}

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseMobilePreloadConfigData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: MobilePreloadConfigData;
}

export function apiResponseMobilePreloadConfigDataDeserializer(
  item: any,
): ApiResponseMobilePreloadConfigData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: mobilePreloadConfigDataDeserializer(item["data"]),
  };
}
