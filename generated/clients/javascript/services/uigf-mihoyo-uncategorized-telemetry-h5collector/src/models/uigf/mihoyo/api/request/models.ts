// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface H5CollectorUploadRequest */
export interface H5CollectorUploadRequest {
  analysisVersion: string;
  dataBelong: string;
  eventInfo: H5CollectorEventInfo;
  miaSessionId: string;
  miaSessionStep: string;
  pageInfo: H5CollectorPageInfo;
  type: string;
  userInfo: H5CollectorUserInfo;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function h5CollectorUploadRequestSerializer(item: H5CollectorUploadRequest): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    analysis_version: item["analysisVersion"],
    data_belong: item["dataBelong"],
    event_info: h5CollectorEventInfoSerializer(item["eventInfo"]),
    mia_session_id: item["miaSessionId"],
    mia_session_step: item["miaSessionStep"],
    page_info: h5CollectorPageInfoSerializer(item["pageInfo"]),
    type: item["type"],
    user_info: h5CollectorUserInfoSerializer(item["userInfo"]),
  };
}

/** model interface H5CollectorEventInfo */
export interface H5CollectorEventInfo {
  eventAction?: string;
  eventCategory?: string;
  eventLabel?: string;
  eventValue?: string | number;
  extraInfo?: H5CollectorEventExtraInfo;
  timestamp?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function h5CollectorEventInfoSerializer(item: H5CollectorEventInfo): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    eventAction: item["eventAction"],
    eventCategory: item["eventCategory"],
    eventLabel: item["eventLabel"],
    eventValue: !item["eventValue"]
      ? item["eventValue"]
      : _h5CollectorEventInfoEventValueSerializer(item["eventValue"]),
    extra_info: !item["extraInfo"]
      ? item["extraInfo"]
      : h5CollectorEventExtraInfoSerializer(item["extraInfo"]),
    timestamp: item["timestamp"],
  };
}

/** Alias for _H5CollectorEventInfoEventValue */
export type _H5CollectorEventInfoEventValue = string | number;

export function _h5CollectorEventInfoEventValueSerializer(
  item: _H5CollectorEventInfoEventValue,
): any {
  return item;
}

/** model interface H5CollectorEventExtraInfo */
export interface H5CollectorEventExtraInfo {
  season?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function h5CollectorEventExtraInfoSerializer(item: H5CollectorEventExtraInfo): any {
  return { ...serializeRecord(item.additionalProperties ?? {}), season: item["season"] };
}

/** model interface H5CollectorPageInfo */
export interface H5CollectorPageInfo {
  appId?: string;
  documentReferrer?: string;
  extraInfo?: H5CollectorPageExtraInfo;
  pageFullurl?: string;
  pageName?: string;
  pageUrl?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function h5CollectorPageInfoSerializer(item: H5CollectorPageInfo): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    app_id: item["appId"],
    document_referrer: item["documentReferrer"],
    extra_info: !item["extraInfo"]
      ? item["extraInfo"]
      : h5CollectorPageExtraInfoSerializer(item["extraInfo"]),
    page_fullurl: item["pageFullurl"],
    page_name: item["pageName"],
    page_url: item["pageUrl"],
  };
}

/** model interface H5CollectorPageExtraInfo */
export interface H5CollectorPageExtraInfo {
  appId?: string;
  appVersion?: string;
  businessUrl?: string;
  deviceFp?: string;
  deviceId?: string;
  environment?: string;
  gameBiz?: string;
  isV2Platform?: string;
  isApp?: string;
  language?: string;
  lifecycleId?: string;
  sdkVersion?: string;
  syncLoginStatus?: boolean;
  theme?: string;
  tokenType?: number;
  viewType?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function h5CollectorPageExtraInfoSerializer(item: H5CollectorPageExtraInfo): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    app_id: item["appId"],
    app_version: item["appVersion"],
    business_url: item["businessUrl"],
    device_fp: item["deviceFp"],
    device_id: item["deviceId"],
    environment: item["environment"],
    gameBiz: item["gameBiz"],
    is_v2_platform: item["isV2Platform"],
    isApp: item["isApp"],
    language: item["language"],
    lifecycle_id: item["lifecycleId"],
    sdk_version: item["sdkVersion"],
    syncLoginStatus: item["syncLoginStatus"],
    theme: item["theme"],
    tokenType: item["tokenType"],
    view_type: item["viewType"],
  };
}

/** model interface H5CollectorUserInfo */
export interface H5CollectorUserInfo {
  accountId?: string;
  authKey?: string;
  device?: string;
  deviceId?: string;
  gameBiz?: string;
  gameRegion?: string;
  gameUid?: string;
  lang?: string;
  platform?: string;
  uuid?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function h5CollectorUserInfoSerializer(item: H5CollectorUserInfo): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    account_id: item["accountId"],
    auth_key: item["authKey"],
    device: item["device"],
    device_id: item["deviceId"],
    game_biz: item["gameBiz"],
    game_region: item["gameRegion"],
    game_uid: item["gameUid"],
    lang: item["lang"],
    platform: item["platform"],
    uuid: item["uuid"],
  };
}
