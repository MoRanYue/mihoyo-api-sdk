// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface SdkTelemetryUploadEvent */
export interface SdkTelemetryUploadEvent extends TelemetryEvent {
  msgId?: string;
  uploadContent?: SdkTelemetryUploadContent;
}

export function sdkTelemetryUploadEventSerializer(item: SdkTelemetryUploadEvent): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    applicationId: item["applicationId"],
    applicationName: item["applicationName"],
    eventId: item["eventId"],
    eventName: item["eventName"],
    eventTime: item["eventTime"],
    msgId: item["msgId"],
    uploadContent: !item["uploadContent"]
      ? item["uploadContent"]
      : sdkTelemetryUploadContentSerializer(item["uploadContent"]),
  };
}

/** model interface SdkTelemetryUploadContent */
export interface SdkTelemetryUploadContent {
  deviceInfo?: SdkTelemetryDeviceInfo;
  eventTimeMs?: string;
  launchTraceId?: string;
  logInfo?: SdkTelemetryLogInfo;
  telemetryInfo?: SdkTelemetryInfo;
  userInfo?: SdkTelemetryUserInfo;
  versionInfo?: SdkTelemetryVersionInfo;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function sdkTelemetryUploadContentSerializer(item: SdkTelemetryUploadContent): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    deviceInfo: !item["deviceInfo"]
      ? item["deviceInfo"]
      : sdkTelemetryDeviceInfoSerializer(item["deviceInfo"]),
    eventTimeMs: item["eventTimeMs"],
    launchTraceId: item["launchTraceId"],
    logInfo: !item["logInfo"] ? item["logInfo"] : sdkTelemetryLogInfoSerializer(item["logInfo"]),
    telemetryInfo: !item["telemetryInfo"]
      ? item["telemetryInfo"]
      : sdkTelemetryInfoSerializer(item["telemetryInfo"]),
    userInfo: !item["userInfo"]
      ? item["userInfo"]
      : sdkTelemetryUserInfoSerializer(item["userInfo"]),
    versionInfo: !item["versionInfo"]
      ? item["versionInfo"]
      : sdkTelemetryVersionInfoSerializer(item["versionInfo"]),
  };
}

/** model interface SdkTelemetryDeviceInfo */
export interface SdkTelemetryDeviceInfo {
  addressMac?: string;
  bundleId?: string;
  cps?: string;
  deviceFp?: string;
  snakeDeviceSciX?: number;
  snakeDeviceSciY?: number;
  deviceId?: string;
  deviceModel?: string;
  deviceName?: string;
  deviceSciX?: number;
  deviceSciY?: number;
  dpi?: number;
  gpuMemSize?: number;
  gpuName?: string;
  ip?: string;
  isp?: string;
  snakeNetworkType?: string;
  networkType?: string;
  platform?: string | number;
  platformName?: string;
  processorCount?: number;
  processorFrequency?: number;
  processorType?: string;
  ramCapacity?: number;
  ramRemain?: number;
  registerCPS?: string;
  romCapacity?: number;
  romRemain?: number;
  softSciX?: number;
  softSciY?: number;
  systemInfo?: string;
  systemLang?: string;
  uapc?: string;
  wmac?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function sdkTelemetryDeviceInfoSerializer(item: SdkTelemetryDeviceInfo): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    addressMac: item["addressMac"],
    bundleId: item["bundleId"],
    cps: item["cps"],
    device_fp: item["deviceFp"],
    device_sciX: item["snakeDeviceSciX"],
    device_sciY: item["snakeDeviceSciY"],
    deviceId: item["deviceId"],
    deviceModel: item["deviceModel"],
    deviceName: item["deviceName"],
    deviceSciX: item["deviceSciX"],
    deviceSciY: item["deviceSciY"],
    dpi: item["dpi"],
    gpuMemSize: item["gpuMemSize"],
    gpuName: item["gpuName"],
    ip: item["ip"],
    isp: item["isp"],
    network_type: item["snakeNetworkType"],
    networkType: item["networkType"],
    platform: !item["platform"]
      ? item["platform"]
      : _sdkTelemetryDeviceInfoPlatformSerializer(item["platform"]),
    platformName: item["platformName"],
    processorCount: item["processorCount"],
    processorFrequency: item["processorFrequency"],
    processorType: item["processorType"],
    ramCapacity: !item["ramCapacity"]
      ? item["ramCapacity"]
      : _sdkTelemetryDeviceInfoRamCapacitySerializer(item["ramCapacity"]),
    ramRemain: !item["ramRemain"]
      ? item["ramRemain"]
      : _sdkTelemetryDeviceInfoRamRemainSerializer(item["ramRemain"]),
    registerCPS: item["registerCPS"],
    romCapacity: !item["romCapacity"]
      ? item["romCapacity"]
      : _sdkTelemetryDeviceInfoRomCapacitySerializer(item["romCapacity"]),
    romRemain: item["romRemain"],
    soft_sciX: item["softSciX"],
    soft_sciY: item["softSciY"],
    systemInfo: item["systemInfo"],
    systemLang: item["systemLang"],
    uapc: item["uapc"],
    wmac: item["wmac"],
  };
}

/** Alias for _SdkTelemetryDeviceInfoPlatform */
export type _SdkTelemetryDeviceInfoPlatform = string | number;

export function _sdkTelemetryDeviceInfoPlatformSerializer(
  item: _SdkTelemetryDeviceInfoPlatform,
): any {
  return item;
}

/** Alias for _SdkTelemetryDeviceInfoRamCapacity */
export type _SdkTelemetryDeviceInfoRamCapacity = number | number;

export function _sdkTelemetryDeviceInfoRamCapacitySerializer(
  item: _SdkTelemetryDeviceInfoRamCapacity,
): any {
  return item;
}

/** Alias for _SdkTelemetryDeviceInfoRamRemain */
export type _SdkTelemetryDeviceInfoRamRemain = number | number;

export function _sdkTelemetryDeviceInfoRamRemainSerializer(
  item: _SdkTelemetryDeviceInfoRamRemain,
): any {
  return item;
}

/** Alias for _SdkTelemetryDeviceInfoRomCapacity */
export type _SdkTelemetryDeviceInfoRomCapacity = number | number;

export function _sdkTelemetryDeviceInfoRomCapacitySerializer(
  item: _SdkTelemetryDeviceInfoRomCapacity,
): any {
  return item;
}

/** model interface SdkTelemetryLogInfo */
export interface SdkTelemetryLogInfo {
  actionId?: number;
  actionName?: string;
  cBody?: string;
  logTime?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function sdkTelemetryLogInfoSerializer(item: SdkTelemetryLogInfo): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    actionId: item["actionId"],
    actionName: item["actionName"],
    cBody: item["cBody"],
    logTime: item["logTime"],
  };
}

/** model interface SdkTelemetryInfo */
export interface SdkTelemetryInfo {
  area?: string;
  lifecycleId?: string;
  telemetryVersion?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function sdkTelemetryInfoSerializer(item: SdkTelemetryInfo): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    area: item["area"],
    lifecycleId: item["lifecycleId"],
    telemetryVersion: item["telemetryVersion"],
  };
}

/** model interface SdkTelemetryUserInfo */
export interface SdkTelemetryUserInfo {
  accountId?: string;
  accountType?: string;
  channelId?: string;
  userId?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function sdkTelemetryUserInfoSerializer(item: SdkTelemetryUserInfo): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    accountId: item["accountId"],
    accountType: item["accountType"],
    channelId: item["channelId"],
    userId: item["userId"],
  };
}

/** model interface SdkTelemetryVersionInfo */
export interface SdkTelemetryVersionInfo {
  clientVersion?: string;
  logVersion?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function sdkTelemetryVersionInfoSerializer(item: SdkTelemetryVersionInfo): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    clientVersion: item["clientVersion"],
    logVersion: item["logVersion"],
  };
}

/** model interface TelemetryEvent */
export interface TelemetryEvent {
  applicationId?: number;
  applicationName?: string;
  eventId?: number;
  eventName?: string;
  eventTime?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function telemetryEventSerializer(item: TelemetryEvent): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    applicationId: item["applicationId"],
    applicationName: item["applicationName"],
    eventId: item["eventId"],
    eventName: item["eventName"],
    eventTime: item["eventTime"],
  };
}

export function sdkTelemetryUploadEventArraySerializer(
  result: Array<SdkTelemetryUploadEvent>,
): any[] {
  return result.map((item) => {
    return sdkTelemetryUploadEventSerializer(item);
  });
}
