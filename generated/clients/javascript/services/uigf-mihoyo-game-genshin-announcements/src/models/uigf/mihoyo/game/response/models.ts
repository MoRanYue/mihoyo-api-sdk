// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface AnnouncementListData */
export interface AnnouncementListData {
  alert?: boolean;
  alertId?: number;
  banner?: string;
  calendarType?: AnnouncementCalendarType;
  list?: AnnouncementGroup[];
  picAlert?: boolean;
  picAlertId?: number;
  picList?: any[];
  picTotal?: number;
  picTypeList?: any[];
  staticSign?: string;
  t?: string;
  timezone?: number;
  total?: number;
  typeList?: AnnouncementType[];
  useWebp?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function announcementListDataDeserializer(item: any): AnnouncementListData {
  return {
    additionalProperties: serializeRecord(item, [
      "alert",
      "alert_id",
      "banner",
      "calendar_type",
      "list",
      "pic_alert",
      "pic_alert_id",
      "pic_list",
      "pic_total",
      "pic_type_list",
      "static_sign",
      "t",
      "timezone",
      "total",
      "type_list",
      "use_webp",
    ]),
    alert: item["alert"],
    alertId: item["alert_id"],
    banner: item["banner"],
    calendarType: !item["calendar_type"]
      ? item["calendar_type"]
      : announcementCalendarTypeDeserializer(item["calendar_type"]),
    list: !item["list"] ? item["list"] : announcementGroupArrayDeserializer(item["list"]),
    picAlert: item["pic_alert"],
    picAlertId: item["pic_alert_id"],
    picList: !item["pic_list"]
      ? item["pic_list"]
      : item["pic_list"].map((p: any) => {
          return p;
        }),
    picTotal: item["pic_total"],
    picTypeList: !item["pic_type_list"]
      ? item["pic_type_list"]
      : item["pic_type_list"].map((p: any) => {
          return p;
        }),
    staticSign: item["static_sign"],
    t: item["t"],
    timezone: item["timezone"],
    total: item["total"],
    typeList: !item["type_list"]
      ? item["type_list"]
      : announcementTypeArrayDeserializer(item["type_list"]),
    useWebp: item["use_webp"],
  };
}

/** model interface AnnouncementCalendarType */
export interface AnnouncementCalendarType {
  enabled?: boolean;
  mi18NName?: string;
  remind?: boolean;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function announcementCalendarTypeDeserializer(item: any): AnnouncementCalendarType {
  return {
    additionalProperties: serializeRecord(item, ["enabled", "mi18n_name", "remind"]),
    enabled: item["enabled"],
    mi18NName: item["mi18n_name"],
    remind: item["remind"],
  };
}

export function announcementGroupArrayDeserializer(result: Array<AnnouncementGroup>): any[] {
  return result.map((item) => {
    return announcementGroupDeserializer(item);
  });
}

/** model interface AnnouncementGroup */
export interface AnnouncementGroup {
  list?: AnnouncementItem[];
  typeId?: number;
  typeLabel?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function announcementGroupDeserializer(item: any): AnnouncementGroup {
  return {
    additionalProperties: serializeRecord(item, ["list", "type_id", "type_label"]),
    list: !item["list"] ? item["list"] : announcementItemArrayDeserializer(item["list"]),
    typeId: item["type_id"],
    typeLabel: item["type_label"],
  };
}

export function announcementItemArrayDeserializer(result: Array<AnnouncementItem>): any[] {
  return result.map((item) => {
    return announcementItemDeserializer(item);
  });
}

/** model interface AnnouncementItem */
export interface AnnouncementItem {
  alert?: number;
  annId?: number;
  banner?: string;
  content?: string;
  country?: string;
  endTime?: string;
  extraRemind?: number;
  hasContent?: boolean;
  lang?: string;
  loginAlert?: number;
  logoutRemind?: number;
  logoutRemindVer?: number;
  needRemindText?: number;
  remind?: number;
  remindConsumptionType?: number;
  remindText?: string;
  remindVer?: number;
  startTime?: string;
  subtitle?: string;
  tagEndTime?: string;
  tagIcon?: string;
  tagIconHover?: string;
  tagLabel?: string;
  tagStartTime?: string;
  title?: string;
  type?: number;
  typeLabel?: string;
  weakRemind?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function announcementItemDeserializer(item: any): AnnouncementItem {
  return {
    additionalProperties: serializeRecord(item, [
      "alert",
      "ann_id",
      "banner",
      "content",
      "country",
      "end_time",
      "extra_remind",
      "has_content",
      "lang",
      "login_alert",
      "logout_remind",
      "logout_remind_ver",
      "need_remind_text",
      "remind",
      "remind_consumption_type",
      "remind_text",
      "remind_ver",
      "start_time",
      "subtitle",
      "tag_end_time",
      "tag_icon",
      "tag_icon_hover",
      "tag_label",
      "tag_start_time",
      "title",
      "type",
      "type_label",
      "weak_remind",
    ]),
    alert: item["alert"],
    annId: item["ann_id"],
    banner: item["banner"],
    content: item["content"],
    country: item["country"],
    endTime: item["end_time"],
    extraRemind: item["extra_remind"],
    hasContent: item["has_content"],
    lang: item["lang"],
    loginAlert: item["login_alert"],
    logoutRemind: item["logout_remind"],
    logoutRemindVer: item["logout_remind_ver"],
    needRemindText: item["need_remind_text"],
    remind: item["remind"],
    remindConsumptionType: item["remind_consumption_type"],
    remindText: item["remind_text"],
    remindVer: item["remind_ver"],
    startTime: item["start_time"],
    subtitle: item["subtitle"],
    tagEndTime: item["tag_end_time"],
    tagIcon: item["tag_icon"],
    tagIconHover: item["tag_icon_hover"],
    tagLabel: item["tag_label"],
    tagStartTime: item["tag_start_time"],
    title: item["title"],
    type: item["type"],
    typeLabel: item["type_label"],
    weakRemind: item["weak_remind"],
  };
}

export function announcementTypeArrayDeserializer(result: Array<AnnouncementType>): any[] {
  return result.map((item) => {
    return announcementTypeDeserializer(item);
  });
}

/** model interface AnnouncementType */
export interface AnnouncementType {
  id?: number;
  mi18NName?: string;
  name?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function announcementTypeDeserializer(item: any): AnnouncementType {
  return {
    additionalProperties: serializeRecord(item, ["id", "mi18n_name", "name"]),
    id: item["id"],
    mi18NName: item["mi18n_name"],
    name: item["name"],
  };
}

/** Genshin announcement alert state shared by regular and UGC announcements. */
export interface AnnouncementAlertData {
  alert?: boolean;
  alertId?: number;
  extraRemind?: boolean;
  remind?: boolean;
  remindText?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function announcementAlertDataDeserializer(item: any): AnnouncementAlertData {
  return {
    additionalProperties: serializeRecord(item, [
      "alert",
      "alert_id",
      "extra_remind",
      "remind",
      "remind_text",
    ]),
    alert: item["alert"],
    alertId: item["alert_id"],
    extraRemind: item["extra_remind"],
    remind: item["remind"],
    remindText: item["remind_text"],
  };
}

/** model interface AnnouncementPictureData */
export interface AnnouncementPictureData {
  list?: any[];
  total?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function announcementPictureDataDeserializer(item: any): AnnouncementPictureData {
  return {
    additionalProperties: serializeRecord(item, ["list", "total"]),
    list: !item["list"]
      ? item["list"]
      : item["list"].map((p: any) => {
          return p;
        }),
    total: item["total"],
  };
}
