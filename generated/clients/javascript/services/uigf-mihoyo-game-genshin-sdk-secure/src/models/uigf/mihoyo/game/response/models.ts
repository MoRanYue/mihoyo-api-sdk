// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface SdkProtocolVersionComparisonData */
export interface SdkProtocolVersionComparisonData {
  modified?: boolean;
  protocol?: SdkProtocolVersion;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function sdkProtocolVersionComparisonDataDeserializer(
  item: any,
): SdkProtocolVersionComparisonData {
  return {
    additionalProperties: serializeRecord(item, ["modified", "protocol"]),
    modified: item["modified"],
    protocol: !item["protocol"]
      ? item["protocol"]
      : sdkProtocolVersionDeserializer(item["protocol"]),
  };
}

/** model interface SdkProtocolVersion */
export interface SdkProtocolVersion {
  appId?: number;
  createTime?: string;
  fullPrivProto?: string;
  id?: number;
  language?: string;
  major?: number;
  minimum?: number;
  privProto?: string;
  teenagerProto?: string;
  thirdProto?: string;
  userProto?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function sdkProtocolVersionDeserializer(item: any): SdkProtocolVersion {
  return {
    additionalProperties: serializeRecord(item, [
      "app_id",
      "create_time",
      "full_priv_proto",
      "id",
      "language",
      "major",
      "minimum",
      "priv_proto",
      "teenager_proto",
      "third_proto",
      "user_proto",
    ]),
    appId: item["app_id"],
    createTime: item["create_time"],
    fullPrivProto: item["full_priv_proto"],
    id: item["id"],
    language: item["language"],
    major: item["major"],
    minimum: item["minimum"],
    privProto: item["priv_proto"],
    teenagerProto: item["teenager_proto"],
    thirdProto: item["third_proto"],
    userProto: item["user_proto"],
  };
}

/** model interface SdkRedDotData */
export interface SdkRedDotData {
  infos?: SdkRedDotInfo[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function sdkRedDotDataDeserializer(item: any): SdkRedDotData {
  return {
    additionalProperties: serializeRecord(item, ["infos"]),
    infos: !item["infos"] ? item["infos"] : sdkRedDotInfoArrayDeserializer(item["infos"]),
  };
}

export function sdkRedDotInfoArrayDeserializer(result: Array<SdkRedDotInfo>): any[] {
  return result.map((item) => {
    return sdkRedDotInfoDeserializer(item);
  });
}

/** model interface SdkRedDotInfo */
export interface SdkRedDotInfo {
  contentId?: number;
  display?: boolean;
  redPointType?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function sdkRedDotInfoDeserializer(item: any): SdkRedDotInfo {
  return {
    additionalProperties: serializeRecord(item, ["content_id", "display", "red_point_type"]),
    contentId: item["content_id"],
    display: item["display"],
    redPointType: item["red_point_type"],
  };
}
