// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface AnnouncementContentData */
export interface AnnouncementContentData {
  list?: AnnouncementContentItem[];
  picList?: any[];
  picTotal?: number;
  total?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function announcementContentDataDeserializer(item: any): AnnouncementContentData {
  return {
    additionalProperties: serializeRecord(item, ["list", "pic_list", "pic_total", "total"]),
    list: !item["list"] ? item["list"] : announcementContentItemArrayDeserializer(item["list"]),
    picList: !item["pic_list"]
      ? item["pic_list"]
      : item["pic_list"].map((p: any) => {
          return p;
        }),
    picTotal: item["pic_total"],
    total: item["total"],
  };
}

export function announcementContentItemArrayDeserializer(
  result: Array<AnnouncementContentItem>,
): any[] {
  return result.map((item) => {
    return announcementContentItemDeserializer(item);
  });
}

/** model interface AnnouncementContentItem */
export interface AnnouncementContentItem {
  annId?: number;
  banner?: string;
  content?: string;
  lang?: string;
  remindText?: string;
  subtitle?: string;
  title?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function announcementContentItemDeserializer(item: any): AnnouncementContentItem {
  return {
    additionalProperties: serializeRecord(item, [
      "ann_id",
      "banner",
      "content",
      "lang",
      "remind_text",
      "subtitle",
      "title",
    ]),
    annId: item["ann_id"],
    banner: item["banner"],
    content: item["content"],
    lang: item["lang"],
    remindText: item["remind_text"],
    subtitle: item["subtitle"],
    title: item["title"],
  };
}
