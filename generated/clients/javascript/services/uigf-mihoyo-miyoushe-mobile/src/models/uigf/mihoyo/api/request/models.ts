// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface MobileDeviceSessionRequest */
export interface MobileDeviceSessionRequest {
  appVersion: string;
  deviceId: string;
  deviceName: string;
  osVersion: string;
  platform: string;
  registrationId: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileDeviceSessionRequestSerializer(item: MobileDeviceSessionRequest): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    app_version: item["appVersion"],
    device_id: item["deviceId"],
    device_name: item["deviceName"],
    os_version: item["osVersion"],
    platform: item["platform"],
    registration_id: item["registrationId"],
  };
}

/** model interface MobileStartupRequest */
export interface MobileStartupRequest {
  reqList: MobileStartupRequestItem[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileStartupRequestSerializer(item: MobileStartupRequest): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    req_list: mobileStartupRequestItemArraySerializer(item["reqList"]),
  };
}

export function mobileStartupRequestItemArraySerializer(
  result: Array<MobileStartupRequestItem>,
): any[] {
  return result.map((item) => {
    return mobileStartupRequestItemSerializer(item);
  });
}

/** model interface MobileStartupRequestItem */
export interface MobileStartupRequestItem {
  apiUrl: string;
  req: MobileStartupRequestPayload;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileStartupRequestItemSerializer(item: MobileStartupRequestItem): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    api_url: item["apiUrl"],
    req: mobileStartupRequestPayloadSerializer(item["req"]),
  };
}

/** model interface MobileStartupRequestPayload */
export interface MobileStartupRequestPayload {
  fetchImageTemplateListReq?: MobileStartupImageTemplateRequest;
  getAllGameRoleKeywordReq?: Record<string, any>;
  getAllStaticResourceVersionsReq?: Record<string, any>;
  getAppConfigRequest?: Record<string, any>;
  getAppMediaDataReq?: Record<string, any>;
  getLinkCardWhitelistReq?: Record<string, any>;
  getTeenagerInfoReq?: Record<string, any>;
  recentEmoticonListReq?: Record<string, any>;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileStartupRequestPayloadSerializer(item: MobileStartupRequestPayload): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    fetch_image_template_list_req: !item["fetchImageTemplateListReq"]
      ? item["fetchImageTemplateListReq"]
      : mobileStartupImageTemplateRequestSerializer(item["fetchImageTemplateListReq"]),
    get_all_game_role_keyword_req: item["getAllGameRoleKeywordReq"],
    get_all_static_resource_versions_req: item["getAllStaticResourceVersionsReq"],
    get_app_config_request: item["getAppConfigRequest"],
    get_app_media_data_req: item["getAppMediaDataReq"],
    get_link_card_whitelist_req: item["getLinkCardWhitelistReq"],
    get_teenager_info_req: item["getTeenagerInfoReq"],
    recent_emoticon_list_req: item["recentEmoticonListReq"],
  };
}

/** model interface MobileStartupImageTemplateRequest */
export interface MobileStartupImageTemplateRequest {
  clientType?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileStartupImageTemplateRequestSerializer(
  item: MobileStartupImageTemplateRequest,
): any {
  return { ...serializeRecord(item.additionalProperties ?? {}), client_type: item["clientType"] };
}

/** model interface MobileWindowPrepareRequest */
export interface MobileWindowPrepareRequest {
  focusGame: string[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileWindowPrepareRequestSerializer(item: MobileWindowPrepareRequest): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    focus_game: item["focusGame"].map((p: any) => {
      return p;
    }),
  };
}

/** model interface MobileWindowShowRequest */
export interface MobileWindowShowRequest extends MobileWindowPrepareRequest {
  installStatus: Record<string, any>;
  ticket: string;
}

export function mobileWindowShowRequestSerializer(item: MobileWindowShowRequest): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    focus_game: item["focusGame"].map((p: any) => {
      return p;
    }),
    install_status: item["installStatus"],
    ticket: item["ticket"],
  };
}

/** model interface MobileLoginRequest */
export interface MobileLoginRequest {
  sourceId: string;
  sourceKey: string;
  sourceName: string;
  sourceType: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobileLoginRequestSerializer(item: MobileLoginRequest): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    source_id: item["sourceId"],
    source_key: item["sourceKey"],
    source_name: item["sourceName"],
    source_type: item["sourceType"],
  };
}

/** model interface MobilePreloadConfigRequest */
export interface MobilePreloadConfigRequest {
  clientVersion: string;
  platform: string;
  rnApp: string;
  rnInfos: MobilePreloadResourceInfo[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobilePreloadConfigRequestSerializer(item: MobilePreloadConfigRequest): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    client_version: item["clientVersion"],
    platform: item["platform"],
    rn_app: item["rnApp"],
    rn_infos: mobilePreloadResourceInfoArraySerializer(item["rnInfos"]),
  };
}

export function mobilePreloadResourceInfoArraySerializer(
  result: Array<MobilePreloadResourceInfo>,
): any[] {
  return result.map((item) => {
    return mobilePreloadResourceInfoSerializer(item);
  });
}

/** model interface MobilePreloadResourceInfo */
export interface MobilePreloadResourceInfo {
  moduleName: string;
  resourceUrl: string;
  rnVersion: string;
  sha1: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function mobilePreloadResourceInfoSerializer(item: MobilePreloadResourceInfo): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    module_name: item["moduleName"],
    resource_url: item["resourceUrl"],
    rn_version: item["rnVersion"],
    sha1: item["sha1"],
  };
}
