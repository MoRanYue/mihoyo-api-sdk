// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface GameCrashTelemetryEvent */
export interface GameCrashTelemetryEvent extends TelemetryEvent {
  msgID?: string;
  uploadContent?: GameCrashTelemetryUploadContent;
}

export function gameCrashTelemetryEventSerializer(item: GameCrashTelemetryEvent): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    applicationId: item["applicationId"],
    applicationName: item["applicationName"],
    eventId: item["eventId"],
    eventName: item["eventName"],
    eventTime: item["eventTime"],
    msgID: item["msgID"],
    uploadContent: !item["uploadContent"]
      ? item["uploadContent"]
      : gameCrashTelemetryUploadContentSerializer(item["uploadContent"]),
  };
}

/** model interface GameCrashTelemetryUploadContent */
export interface GameCrashTelemetryUploadContent {
  auid?: string;
  clientIp?: string;
  cpuInfo?: string;
  deviceModel?: string;
  deviceName?: string;
  errorCodeNumeric?: number;
  errorCategory?: string;
  errorCode?: string;
  errorLevel?: string;
  exceptionSerialNum?: number;
  frame?: string;
  gpuInfo?: string;
  graphicsLevel?: string;
  graphicsVersion?: string;
  guid?: string;
  isRelease?: boolean;
  logType?: string;
  memoryInfo?: string;
  message?: string;
  notifyUser?: string;
  operatingSystem?: string;
  projectNick?: string;
  serverName?: string;
  stackTrace?: string;
  subErrorCode?: string;
  time?: number;
  userId?: number;
  userName?: string;
  userNick?: string;
  version?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function gameCrashTelemetryUploadContentSerializer(
  item: GameCrashTelemetryUploadContent,
): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    auid: item["auid"],
    clientIp: item["clientIp"],
    cpuInfo: item["cpuInfo"],
    deviceModel: item["deviceModel"],
    deviceName: item["deviceName"],
    error_code: item["errorCodeNumeric"],
    errorCategory: item["errorCategory"],
    errorCode: item["errorCode"],
    errorLevel: item["errorLevel"],
    exceptionSerialNum: item["exceptionSerialNum"],
    frame: item["frame"],
    gpuInfo: item["gpuInfo"],
    graphicsLevel: item["graphicsLevel"],
    graphicsVersion: item["graphicsVersion"],
    guid: item["guid"],
    isRelease: item["isRelease"],
    logType: item["logType"],
    memoryInfo: item["memoryInfo"],
    message: item["message"],
    notifyUser: item["notifyUser"],
    operatingSystem: item["operatingSystem"],
    projectNick: item["projectNick"],
    serverName: item["serverName"],
    stackTrace: item["stackTrace"],
    subErrorCode: item["subErrorCode"],
    time: item["time"],
    user_id: item["userId"],
    userName: item["userName"],
    userNick: item["userNick"],
    version: item["version"],
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

/** model interface GameSdkTelemetryEvent */
export interface GameSdkTelemetryEvent extends TelemetryEvent {
  msgId?: string;
  uploadContent?: GameSdkTelemetryUploadContent;
}

export function gameSdkTelemetryEventSerializer(item: GameSdkTelemetryEvent): any {
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
      : gameSdkTelemetryUploadContentSerializer(item["uploadContent"]),
  };
}

/** model interface GameSdkTelemetryUploadContent */
export interface GameSdkTelemetryUploadContent {
  snakeDeviceInfo?: GameSdkSnakeDeviceInfo;
  camelDeviceInfo?: GameSdkCamelDeviceInfo;
  eventTimeMs?: string;
  launchTraceId?: string;
  logInfo?: GameSdkLogInfo;
  telemetryInfo?: SdkTelemetryInfo;
  userInfo?: GameSdkUserInfo;
  versionInfo?: GameSdkVersionInfo;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function gameSdkTelemetryUploadContentSerializer(item: GameSdkTelemetryUploadContent): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    device_info: !item["snakeDeviceInfo"]
      ? item["snakeDeviceInfo"]
      : gameSdkSnakeDeviceInfoSerializer(item["snakeDeviceInfo"]),
    deviceInfo: !item["camelDeviceInfo"]
      ? item["camelDeviceInfo"]
      : gameSdkCamelDeviceInfoSerializer(item["camelDeviceInfo"]),
    eventTimeMs: item["eventTimeMs"],
    launchTraceId: item["launchTraceId"],
    log_info: !item["logInfo"] ? item["logInfo"] : gameSdkLogInfoSerializer(item["logInfo"]),
    telemetryInfo: !item["telemetryInfo"]
      ? item["telemetryInfo"]
      : sdkTelemetryInfoSerializer(item["telemetryInfo"]),
    user_info: !item["userInfo"] ? item["userInfo"] : gameSdkUserInfoSerializer(item["userInfo"]),
    version_info: !item["versionInfo"]
      ? item["versionInfo"]
      : gameSdkVersionInfoSerializer(item["versionInfo"]),
  };
}

/** model interface GameSdkSnakeDeviceInfo */
export interface GameSdkSnakeDeviceInfo {
  bundleId?: string;
  channelId?: string;
  channelSubid?: string;
  channelSubidInt?: number;
  currentCps?: string;
  deviceFp?: string;
  deviceId?: string;
  deviceModel?: string;
  deviceName?: string;
  ip?: string;
  networkType?: string;
  os?: string;
  plat?: number;
  registerCps?: string;
  uapc?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function gameSdkSnakeDeviceInfoSerializer(item: GameSdkSnakeDeviceInfo): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    bundle_id: item["bundleId"],
    channel_id: item["channelId"],
    channel_subid: item["channelSubid"],
    channel_subid_int: item["channelSubidInt"],
    current_cps: item["currentCps"],
    device_fp: item["deviceFp"],
    device_id: item["deviceId"],
    device_model: item["deviceModel"],
    device_name: item["deviceName"],
    ip: item["ip"],
    network_type: item["networkType"],
    os: item["os"],
    plat: item["plat"],
    register_cps: item["registerCps"],
    uapc: item["uapc"],
  };
}

/** model interface GameSdkCamelDeviceInfo */
export interface GameSdkCamelDeviceInfo {
  deviceId?: string;
  deviceModel?: string;
  deviceName?: string;
  deviceSciX?: number;
  deviceSciY?: number;
  dpi?: number;
  networkType?: string;
  platform?: number;
  platformName?: string;
  processorCount?: number;
  processorType?: string;
  ramCapacity?: number;
  ramRemain?: number;
  systemInfo?: string;
  systemLang?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function gameSdkCamelDeviceInfoSerializer(item: GameSdkCamelDeviceInfo): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    deviceId: item["deviceId"],
    deviceModel: item["deviceModel"],
    deviceName: item["deviceName"],
    deviceSciX: item["deviceSciX"],
    deviceSciY: item["deviceSciY"],
    dpi: item["dpi"],
    networkType: item["networkType"],
    platform: item["platform"],
    platformName: item["platformName"],
    processorCount: item["processorCount"],
    processorType: item["processorType"],
    ramCapacity: item["ramCapacity"],
    ramRemain: item["ramRemain"],
    systemInfo: item["systemInfo"],
    systemLang: item["systemLang"],
  };
}

/** model interface GameSdkLogInfo */
export interface GameSdkLogInfo {
  actionId?: number;
  actionName?: string;
  cBody?: string;
  logTime?: string;
  platformType?: string;
  region?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function gameSdkLogInfoSerializer(item: GameSdkLogInfo): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    action_id: item["actionId"],
    action_name: item["actionName"],
    c_body: item["cBody"],
    log_time: item["logTime"],
    platform_type: item["platformType"],
    region: item["region"],
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

/** model interface GameSdkUserInfo */
export interface GameSdkUserInfo {
  accountType?: string;
  level?: string;
  openId?: string;
  tag?: string;
  uid?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function gameSdkUserInfoSerializer(item: GameSdkUserInfo): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    account_type: item["accountType"],
    level: item["level"],
    open_id: item["openId"],
    tag: item["tag"],
    uid: item["uid"],
  };
}

/** model interface GameSdkVersionInfo */
export interface GameSdkVersionInfo {
  clientVersion?: string;
  logVersion?: string;
  sdkEnv?: number;
  sdkVersion?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function gameSdkVersionInfoSerializer(item: GameSdkVersionInfo): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    client_version: item["clientVersion"],
    log_version: item["logVersion"],
    sdk_env: item["sdkEnv"],
    sdk_version: item["sdkVersion"],
  };
}

/** model interface GameCustomTelemetryEvent */
export interface GameCustomTelemetryEvent extends TelemetryEvent {
  msgID?: string;
  uploadContent?: GameCustomTelemetryUploadContent;
}

export function gameCustomTelemetryEventSerializer(item: GameCustomTelemetryEvent): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    applicationId: item["applicationId"],
    applicationName: item["applicationName"],
    eventId: item["eventId"],
    eventName: item["eventName"],
    eventTime: item["eventTime"],
    msgID: item["msgID"],
    uploadContent: !item["uploadContent"]
      ? item["uploadContent"]
      : gameCustomTelemetryUploadContentSerializer(item["uploadContent"]),
  };
}

/** model interface GameCustomTelemetryUploadContent */
export interface GameCustomTelemetryUploadContent {
  auid?: string;
  clientIp?: string;
  cpuInfo?: string;
  deviceId?: string;
  deviceModel?: string;
  deviceName?: string;
  gpuInfo?: string;
  isRelease?: boolean;
  memoryInfo?: string;
  msg?: string;
  msgKey?: string;
  operatingSystem?: string;
  platform?: number;
  serverName?: string;
  userId?: number;
  version?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function gameCustomTelemetryUploadContentSerializer(
  item: GameCustomTelemetryUploadContent,
): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    auid: item["auid"],
    clientIp: item["clientIp"],
    cpuInfo: item["cpuInfo"],
    deviceId: item["deviceId"],
    deviceModel: item["deviceModel"],
    deviceName: item["deviceName"],
    gpuInfo: item["gpuInfo"],
    isRelease: item["isRelease"],
    memoryInfo: item["memoryInfo"],
    msg: item["msg"],
    msgKey: item["msgKey"],
    operatingSystem: item["operatingSystem"],
    platform: item["platform"],
    serverName: item["serverName"],
    user_id: item["userId"],
    version: item["version"],
  };
}

export function gameCrashTelemetryEventArraySerializer(
  result: Array<GameCrashTelemetryEvent>,
): any[] {
  return result.map((item) => {
    return gameCrashTelemetryEventSerializer(item);
  });
}

export function gameSdkTelemetryEventArraySerializer(result: Array<GameSdkTelemetryEvent>): any[] {
  return result.map((item) => {
    return gameSdkTelemetryEventSerializer(item);
  });
}

export function gameCustomTelemetryEventArraySerializer(
  result: Array<GameCustomTelemetryEvent>,
): any[] {
  return result.map((item) => {
    return gameCustomTelemetryEventSerializer(item);
  });
}
