// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface MobileAppSplashData */
export interface MobileAppSplashData {
  hasSplash?: boolean;
  splashes?: any[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileAppSplashDataDeserializer(item: any): MobileAppSplashData {
  return {
    additionalProperties: serializeRecord(item, ["has_splash", "splashes"]),
    hasSplash: item["has_splash"],
    splashes: !item["splashes"]
      ? item["splashes"]
      : item["splashes"].map((p: any) => {
          return p;
        }),
  };
}

/** model interface MobileGameListData */
export interface MobileGameListData {
  list?: MobileGame[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileGameListDataDeserializer(item: any): MobileGameListData {
  return {
    additionalProperties: serializeRecord(item, ["list"]),
    list: !item["list"] ? item["list"] : mobileGameArrayDeserializer(item["list"]),
  };
}

export function mobileGameArrayDeserializer(result: Array<MobileGame>): any[] {
  return result.map((item) => {
    return mobileGameDeserializer(item);
  });
}

/** model interface MobileGame */
export interface MobileGame {
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileGameDeserializer(item: any): MobileGame {
  return {
    additionalProperties: serializeRecord(item, []),
  };
}

/** model interface MobileMyselfPageConfigData */
export interface MobileMyselfPageConfigData {
  appPersonalEntry?: Record<string, any>;
  appPersonalUnread?: Record<string, any>;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileMyselfPageConfigDataDeserializer(item: any): MobileMyselfPageConfigData {
  return {
    additionalProperties: serializeRecord(item, ["app_personal_entry", "app_personal_unread"]),
    appPersonalEntry: !item["app_personal_entry"]
      ? item["app_personal_entry"]
      : Object.fromEntries(
          Object.entries(item["app_personal_entry"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    appPersonalUnread: !item["app_personal_unread"]
      ? item["app_personal_unread"]
      : Object.fromEntries(
          Object.entries(item["app_personal_unread"]).map(([k, p]: [string, any]) => [k, p]),
        ),
  };
}

/** model interface MobileUnreadMessageData */
export interface MobileUnreadMessageData {
  chatUnread?: Record<string, any>;
  notificationUnread?: Record<string, any>;
  semNotification?: Record<string, any>;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileUnreadMessageDataDeserializer(item: any): MobileUnreadMessageData {
  return {
    additionalProperties: serializeRecord(item, [
      "chat_unread",
      "notification_unread",
      "sem_notification",
    ]),
    chatUnread: !item["chat_unread"]
      ? item["chat_unread"]
      : Object.fromEntries(
          Object.entries(item["chat_unread"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    notificationUnread: !item["notification_unread"]
      ? item["notification_unread"]
      : Object.fromEntries(
          Object.entries(item["notification_unread"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    semNotification: !item["sem_notification"]
      ? item["sem_notification"]
      : Object.fromEntries(
          Object.entries(item["sem_notification"]).map(([k, p]: [string, any]) => [k, p]),
        ),
  };
}

/** model interface MobileMissionsStateData */
export interface MobileMissionsStateData {
  alreadyReceivedPoints?: number;
  canGetPoints?: number;
  isUnclaimed?: boolean;
  states?: Record<string, any>[];
  todayTotalPoints?: number;
  totalPoints?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileMissionsStateDataDeserializer(item: any): MobileMissionsStateData {
  return {
    additionalProperties: serializeRecord(item, [
      "already_received_points",
      "can_get_points",
      "is_unclaimed",
      "states",
      "today_total_points",
      "total_points",
    ]),
    alreadyReceivedPoints: item["already_received_points"],
    canGetPoints: item["can_get_points"],
    isUnclaimed: item["is_unclaimed"],
    states: !item["states"]
      ? item["states"]
      : item["states"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    todayTotalPoints: item["today_total_points"],
    totalPoints: item["total_points"],
  };
}

/** model interface EmptyData */
export interface EmptyData {
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function emptyDataDeserializer(item: any): EmptyData {
  return {
    additionalProperties: serializeRecord(item, []),
  };
}

/** model interface MobileStartupData */
export interface MobileStartupData {
  respMap?: Record<string, any>;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileStartupDataDeserializer(item: any): MobileStartupData {
  return {
    additionalProperties: serializeRecord(item, ["resp_map"]),
    respMap: !item["resp_map"]
      ? item["resp_map"]
      : Object.fromEntries(Object.entries(item["resp_map"]).map(([k, p]: [string, any]) => [k, p])),
  };
}

/** model interface MobileWindowPrepareData */
export interface MobileWindowPrepareData {
  androidPkg?: any[];
  iosApp?: any[];
  ticket?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileWindowPrepareDataDeserializer(item: any): MobileWindowPrepareData {
  return {
    additionalProperties: serializeRecord(item, ["android_pkg", "ios_app", "ticket"]),
    androidPkg: !item["android_pkg"]
      ? item["android_pkg"]
      : item["android_pkg"].map((p: any) => {
          return p;
        }),
    iosApp: !item["ios_app"]
      ? item["ios_app"]
      : item["ios_app"].map((p: any) => {
          return p;
        }),
    ticket: item["ticket"],
  };
}

/** model interface MobileWindowShowData */
export interface MobileWindowShowData {
  bubbleList?: any[];
  list?: any[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileWindowShowDataDeserializer(item: any): MobileWindowShowData {
  return {
    additionalProperties: serializeRecord(item, ["bubble_list", "list"]),
    bubbleList: !item["bubble_list"]
      ? item["bubble_list"]
      : item["bubble_list"].map((p: any) => {
          return p;
        }),
    list: !item["list"]
      ? item["list"]
      : item["list"].map((p: any) => {
          return p;
        }),
  };
}

/** model interface MobileUserSettingsData */
export interface MobileUserSettingsData {
  isMergeUnfollow?: boolean;
  isReceiveFromUnfollow?: boolean;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileUserSettingsDataDeserializer(item: any): MobileUserSettingsData {
  return {
    additionalProperties: serializeRecord(item, ["is_merge_unfollow", "is_receive_from_unfollow"]),
    isMergeUnfollow: item["is_merge_unfollow"],
    isReceiveFromUnfollow: item["is_receive_from_unfollow"],
  };
}

/** model interface MobileDiscussionData */
export interface MobileDiscussionData {
  discussion?: MobileDiscussion;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileDiscussionDataDeserializer(item: any): MobileDiscussionData {
  return {
    additionalProperties: serializeRecord(item, ["discussion"]),
    discussion: !item["discussion"]
      ? item["discussion"]
      : mobileDiscussionDeserializer(item["discussion"]),
  };
}

/** model interface MobileDiscussion */
export interface MobileDiscussion {
  createdAt?: number;
  defaultFeedForumId?: number;
  defaultFeedTab?: number;
  desc?: string;
  descType?: number;
  discussionId?: number;
  forums?: any[];
  gameId?: number;
  hotPosts?: any[];
  icon?: string;
  subject?: string;
  talkingForumId?: string;
  talkingPrompt?: string;
  updatedAt?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileDiscussionDeserializer(item: any): MobileDiscussion {
  return {
    additionalProperties: serializeRecord(item, [
      "created_at",
      "default_feed_forum_id",
      "default_feed_tab",
      "desc",
      "desc_type",
      "discussion_id",
      "forums",
      "game_id",
      "hot_posts",
      "icon",
      "subject",
      "talking_forum_id",
      "talking_prompt",
      "updated_at",
    ]),
    createdAt: item["created_at"],
    defaultFeedForumId: item["default_feed_forum_id"],
    defaultFeedTab: item["default_feed_tab"],
    desc: item["desc"],
    descType: item["desc_type"],
    discussionId: item["discussion_id"],
    forums: !item["forums"]
      ? item["forums"]
      : item["forums"].map((p: any) => {
          return p;
        }),
    gameId: item["game_id"],
    hotPosts: !item["hot_posts"]
      ? item["hot_posts"]
      : item["hot_posts"].map((p: any) => {
          return p;
        }),
    icon: item["icon"],
    subject: item["subject"],
    talkingForumId: item["talking_forum_id"],
    talkingPrompt: item["talking_prompt"],
    updatedAt: item["updated_at"],
  };
}

/** model interface MobileEmoticonData */
export interface MobileEmoticonData {
  list?: any[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileEmoticonDataDeserializer(item: any): MobileEmoticonData {
  return {
    additionalProperties: serializeRecord(item, ["list"]),
    list: !item["list"]
      ? item["list"]
      : item["list"].map((p: any) => {
          return p;
        }),
  };
}

/** model interface MobileFeedPostsData */
export interface MobileFeedPostsData {
  databox?: Record<string, string>;
  isOriginal?: boolean;
  isResourceUnchanged?: boolean;
  lastId?: string;
  list?: Record<string, any>[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileFeedPostsDataDeserializer(item: any): MobileFeedPostsData {
  return {
    additionalProperties: serializeRecord(item, [
      "databox",
      "is_original",
      "is_resource_unchanged",
      "last_id",
      "list",
    ]),
    databox: !item["databox"]
      ? item["databox"]
      : Object.fromEntries(Object.entries(item["databox"]).map(([k, p]: [string, any]) => [k, p])),
    isOriginal: item["is_original"],
    isResourceUnchanged: item["is_resource_unchanged"],
    lastId: item["last_id"],
    list: !item["list"]
      ? item["list"]
      : item["list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
  };
}

/** model interface MobileUserInstantListData */
export interface MobileUserInstantListData {
  isLast?: boolean;
  list?: Record<string, any>[];
  nextOffset?: number;
  topPost?: any;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileUserInstantListDataDeserializer(item: any): MobileUserInstantListData {
  return {
    additionalProperties: serializeRecord(item, ["is_last", "list", "next_offset", "top_post"]),
    isLast: item["is_last"],
    list: !item["list"]
      ? item["list"]
      : item["list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    nextOffset: item["next_offset"],
    topPost: item["top_post"],
  };
}

/** model interface MobileVillaSitePushData */
export interface MobileVillaSitePushData {
  list?: any[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileVillaSitePushDataDeserializer(item: any): MobileVillaSitePushData {
  return {
    additionalProperties: serializeRecord(item, ["list"]),
    list: !item["list"]
      ? item["list"]
      : item["list"].map((p: any) => {
          return p;
        }),
  };
}

/** model interface MobileVideoPermissionData */
export interface MobileVideoPermissionData {
  canPublish?: boolean;
  toast?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileVideoPermissionDataDeserializer(item: any): MobileVideoPermissionData {
  return {
    additionalProperties: serializeRecord(item, ["can_publish", "toast"]),
    canPublish: item["can_publish"],
    toast: item["toast"],
  };
}

/** model interface MobileGameCenterData */
export interface MobileGameCenterData {
  autoDownloadEnableMap?: Record<string, any>;
  downloadMode?: string;
  gameDownloadExperiment?: Record<string, any>;
  list?: Record<string, any>[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileGameCenterDataDeserializer(item: any): MobileGameCenterData {
  return {
    additionalProperties: serializeRecord(item, [
      "auto_download_enable_map",
      "download_mode",
      "game_download_experiment",
      "list",
    ]),
    autoDownloadEnableMap: !item["auto_download_enable_map"]
      ? item["auto_download_enable_map"]
      : Object.fromEntries(
          Object.entries(item["auto_download_enable_map"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    downloadMode: item["download_mode"],
    gameDownloadExperiment: !item["game_download_experiment"]
      ? item["game_download_experiment"]
      : Object.fromEntries(
          Object.entries(item["game_download_experiment"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    list: !item["list"]
      ? item["list"]
      : item["list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
  };
}

/** model interface MobileTeenagerInfoData */
export interface MobileTeenagerInfoData {
  availableDuration?: number;
  disableEndTime?: number;
  disableStartTime?: number;
  isEnabled?: boolean;
  isForce?: boolean;
  isRealName?: boolean;
  isTeenager?: boolean;
  loopPeriod?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileTeenagerInfoDataDeserializer(item: any): MobileTeenagerInfoData {
  return {
    additionalProperties: serializeRecord(item, [
      "available_duration",
      "disable_end_time",
      "disable_start_time",
      "is_enabled",
      "is_force",
      "is_real_name",
      "is_teenager",
      "loop_period",
    ]),
    availableDuration: item["available_duration"],
    disableEndTime: item["disable_end_time"],
    disableStartTime: item["disable_start_time"],
    isEnabled: item["is_enabled"],
    isForce: item["is_force"],
    isRealName: item["is_real_name"],
    isTeenager: item["is_teenager"],
    loopPeriod: item["loop_period"],
  };
}

/** model interface MobileUnreadInfoData */
export interface MobileUnreadInfoData {
  latestUpdateUserInfo?: MobileUnreadInfoUser;
  unreadNum?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileUnreadInfoDataDeserializer(item: any): MobileUnreadInfoData {
  return {
    additionalProperties: serializeRecord(item, ["latest_update_user_info", "unread_num"]),
    latestUpdateUserInfo: !item["latest_update_user_info"]
      ? item["latest_update_user_info"]
      : mobileUnreadInfoUserDeserializer(item["latest_update_user_info"]),
    unreadNum: item["unread_num"],
  };
}

/** model interface MobileUnreadInfoUser */
export interface MobileUnreadInfoUser {
  avatarUrl?: string;
  uid?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileUnreadInfoUserDeserializer(item: any): MobileUnreadInfoUser {
  return {
    additionalProperties: serializeRecord(item, ["avatar_url", "uid"]),
    avatarUrl: item["avatar_url"],
    uid: item["uid"],
  };
}

/** model interface MobileBusinessesData */
export interface MobileBusinessesData {
  businesses?: string[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileBusinessesDataDeserializer(item: any): MobileBusinessesData {
  return {
    additionalProperties: serializeRecord(item, ["businesses"]),
    businesses: !item["businesses"]
      ? item["businesses"]
      : item["businesses"].map((p: any) => {
          return p;
        }),
  };
}

/** model interface MobileNotificationSettingsData */
export interface MobileNotificationSettingsData {
  settings?: Record<string, any>;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileNotificationSettingsDataDeserializer(
  item: any,
): MobileNotificationSettingsData {
  return {
    additionalProperties: serializeRecord(item, ["settings"]),
    settings: !item["settings"]
      ? item["settings"]
      : Object.fromEntries(Object.entries(item["settings"]).map(([k, p]: [string, any]) => [k, p])),
  };
}

/** model interface MobileReplyPermissionData */
export interface MobileReplyPermissionData {
  instant?: any[];
  maxImageNumber?: number;
  post?: any[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileReplyPermissionDataDeserializer(item: any): MobileReplyPermissionData {
  return {
    additionalProperties: serializeRecord(item, ["instant", "max_image_number", "post"]),
    instant: !item["instant"]
      ? item["instant"]
      : item["instant"].map((p: any) => {
          return p;
        }),
    maxImageNumber: item["max_image_number"],
    post: !item["post"]
      ? item["post"]
      : item["post"].map((p: any) => {
          return p;
        }),
  };
}

/** model interface MobileEntityReviewData */
export interface MobileEntityReviewData {
  isLast?: boolean;
  list?: any[];
  nextOffset?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileEntityReviewDataDeserializer(item: any): MobileEntityReviewData {
  return {
    additionalProperties: serializeRecord(item, ["is_last", "list", "next_offset"]),
    isLast: item["is_last"],
    list: !item["list"]
      ? item["list"]
      : item["list"].map((p: any) => {
          return p;
        }),
    nextOffset: item["next_offset"],
  };
}

/** model interface MobilePreloadConfigData */
export interface MobilePreloadConfigData {
  needPreload?: boolean;
  needUpdate?: boolean;
  rnPreload?: Record<string, any>[];
  rnUpdateInfos?: any[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobilePreloadConfigDataDeserializer(item: any): MobilePreloadConfigData {
  return {
    additionalProperties: serializeRecord(item, [
      "need_preload",
      "need_update",
      "rn_preload",
      "rn_update_infos",
    ]),
    needPreload: item["need_preload"],
    needUpdate: item["need_update"],
    rnPreload: !item["rn_preload"]
      ? item["rn_preload"]
      : item["rn_preload"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    rnUpdateInfos: !item["rn_update_infos"]
      ? item["rn_update_infos"]
      : item["rn_update_infos"].map((p: any) => {
          return p;
        }),
  };
}
