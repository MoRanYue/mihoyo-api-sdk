// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface LoginTelemetryEvent */
export interface LoginTelemetryEvent extends TelemetryEvent {
  msgId?: string;
  uploadContent?: LoginTelemetryUploadContent;
}

export function loginTelemetryEventSerializer(item: LoginTelemetryEvent): any {
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
      : loginTelemetryUploadContentSerializer(item["uploadContent"]),
  };
}

/** model interface LoginTelemetryUploadContent */
export interface LoginTelemetryUploadContent {
  deviceinfo?: LoginTelemetryDeviceInfo;
  loginfo?: LoginTelemetryLogInfo;
  userinfo?: LoginTelemetryUserInfo;
  versioninfo?: LoginTelemetryVersionInfo;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function loginTelemetryUploadContentSerializer(item: LoginTelemetryUploadContent): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    deviceinfo: !item["deviceinfo"]
      ? item["deviceinfo"]
      : loginTelemetryDeviceInfoSerializer(item["deviceinfo"]),
    loginfo: !item["loginfo"] ? item["loginfo"] : loginTelemetryLogInfoSerializer(item["loginfo"]),
    userinfo: !item["userinfo"]
      ? item["userinfo"]
      : loginTelemetryUserInfoSerializer(item["userinfo"]),
    versioninfo: !item["versioninfo"]
      ? item["versioninfo"]
      : loginTelemetryVersionInfoSerializer(item["versioninfo"]),
  };
}

/** model interface LoginTelemetryDeviceInfo */
export interface LoginTelemetryDeviceInfo {
  bundleId?: string;
  clientType?: string;
  cps?: string;
  deviceFp?: string;
  deviceId?: string;
  deviceModel?: string;
  deviceName?: string;
  ip?: string;
  isp?: string;
  platform?: string;
  registerCPS?: string;
  sciX?: number;
  sciY?: number;
  sourceDeviceId?: string;
  systemInfo?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function loginTelemetryDeviceInfoSerializer(item: LoginTelemetryDeviceInfo): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    bundleId: item["bundleId"],
    clientType: item["clientType"],
    cps: item["cps"],
    deviceFp: item["deviceFp"],
    deviceId: item["deviceId"],
    deviceModel: item["deviceModel"],
    deviceName: item["deviceName"],
    ip: item["ip"],
    isp: item["isp"],
    platform: item["platform"],
    registerCPS: item["registerCPS"],
    sciX: item["sciX"],
    sciY: item["sciY"],
    sourceDeviceId: item["sourceDeviceId"],
    systemInfo: item["systemInfo"],
  };
}

/** model interface LoginTelemetryLogInfo */
export interface LoginTelemetryLogInfo {
  actionId?: number;
  actionName?: string;
  cBody?: string;
  logTime?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function loginTelemetryLogInfoSerializer(item: LoginTelemetryLogInfo): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    actionId: item["actionId"],
    actionName: item["actionName"],
    cBody: item["cBody"],
    logTime: item["logTime"],
  };
}

/** model interface LoginTelemetryUserInfo */
export interface LoginTelemetryUserInfo {
  accountId?: string;
  accountType?: number;
  channelId?: number;
  mid?: string;
  userId?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function loginTelemetryUserInfoSerializer(item: LoginTelemetryUserInfo): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    accountId: item["accountId"],
    accountType: item["accountType"],
    channelId: item["channelId"],
    mid: item["mid"],
    userId: item["userId"],
  };
}

/** model interface LoginTelemetryVersionInfo */
export interface LoginTelemetryVersionInfo {
  clientVersion?: string;
  logVersion?: string;
  sdkVersion?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function loginTelemetryVersionInfoSerializer(item: LoginTelemetryVersionInfo): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    clientVersion: item["clientVersion"],
    logVersion: item["logVersion"],
    sdkVersion: item["sdkVersion"],
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

export function loginTelemetryEventArraySerializer(result: Array<LoginTelemetryEvent>): any[] {
  return result.map((item) => {
    return loginTelemetryEventSerializer(item);
  });
}
