// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface StrategyLatestContentData */
export interface StrategyLatestContentData {
  list?: StrategyContentItem[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function strategyLatestContentDataDeserializer(item: any): StrategyLatestContentData {
  return {
    additionalProperties: serializeRecord(item, ["list"]),
    list: !item["list"] ? item["list"] : strategyContentItemArrayDeserializer(item["list"]),
  };
}

export function strategyContentItemArrayDeserializer(result: Array<StrategyContentItem>): any[] {
  return result.map((item) => {
    return strategyContentItemDeserializer(item);
  });
}

/** model interface StrategyContentItem */
export interface StrategyContentItem {
  aliasName?: string;
  articleTime?: string;
  articleUserName?: string;
  avatarUrl?: string;
  bbsUrl?: string;
  contentId?: number;
  cornerMark?: string;
  ext?: string;
  icon?: string;
  summary?: string;
  title?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function strategyContentItemDeserializer(item: any): StrategyContentItem {
  return {
    additionalProperties: serializeRecord(item, [
      "alias_name",
      "article_time",
      "article_user_name",
      "avatar_url",
      "bbs_url",
      "content_id",
      "corner_mark",
      "ext",
      "icon",
      "summary",
      "title",
    ]),
    aliasName: item["alias_name"],
    articleTime: item["article_time"],
    articleUserName: item["article_user_name"],
    avatarUrl: item["avatar_url"],
    bbsUrl: item["bbs_url"],
    contentId: item["content_id"],
    cornerMark: item["corner_mark"],
    ext: item["ext"],
    icon: item["icon"],
    summary: item["summary"],
    title: item["title"],
  };
}

/** model interface StrategyHomeInfoData */
export interface StrategyHomeInfoData {
  announce?: StrategyAnnouncement;
  popWindow?: any;
  search?: StrategySearch;
  speaker?: any;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function strategyHomeInfoDataDeserializer(item: any): StrategyHomeInfoData {
  return {
    additionalProperties: serializeRecord(item, ["announce", "pop_window", "search", "speaker"]),
    announce: !item["announce"]
      ? item["announce"]
      : strategyAnnouncementDeserializer(item["announce"]),
    popWindow: item["pop_window"],
    search: !item["search"] ? item["search"] : strategySearchDeserializer(item["search"]),
    speaker: item["speaker"],
  };
}

/** model interface StrategyAnnouncement */
export interface StrategyAnnouncement {
  content?: string;
  version?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function strategyAnnouncementDeserializer(item: any): StrategyAnnouncement {
  return {
    additionalProperties: serializeRecord(item, ["content", "version"]),
    content: item["content"],
    version: item["version"],
  };
}

/** model interface StrategySearch */
export interface StrategySearch {
  hotWords?: string[];
  placeholder?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function strategySearchDeserializer(item: any): StrategySearch {
  return {
    additionalProperties: serializeRecord(item, ["hot_words", "placeholder"]),
    hotWords: !item["hot_words"]
      ? item["hot_words"]
      : item["hot_words"].map((p: any) => {
          return p;
        }),
    placeholder: item["placeholder"],
  };
}

/** model interface StrategyHomeNavbarData */
export interface StrategyHomeNavbarData {
  homeImg?: StrategyHomeImage;
  navbar?: any[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function strategyHomeNavbarDataDeserializer(item: any): StrategyHomeNavbarData {
  return {
    additionalProperties: serializeRecord(item, ["home_img", "navbar"]),
    homeImg: !item["home_img"] ? item["home_img"] : strategyHomeImageDeserializer(item["home_img"]),
    navbar: !item["navbar"]
      ? item["navbar"]
      : item["navbar"].map((p: any) => {
          return p;
        }),
  };
}

/** model interface StrategyHomeImage */
export interface StrategyHomeImage {
  headImg?: string;
  logo?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function strategyHomeImageDeserializer(item: any): StrategyHomeImage {
  return {
    additionalProperties: serializeRecord(item, ["headImg", "logo"]),
    headImg: item["headImg"],
    logo: item["logo"],
  };
}

/** model interface ZenlessFeedbackScheduleData */
export interface ZenlessFeedbackScheduleData {
  isNeedCollect?: boolean;
  scheduleId?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function zenlessFeedbackScheduleDataDeserializer(item: any): ZenlessFeedbackScheduleData {
  return {
    additionalProperties: serializeRecord(item, ["is_need_collect", "schedule_id"]),
    isNeedCollect: item["is_need_collect"],
    scheduleId: item["schedule_id"],
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
