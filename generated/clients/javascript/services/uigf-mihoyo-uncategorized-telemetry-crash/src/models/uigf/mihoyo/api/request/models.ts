// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface LegacyCrashReport */
export interface LegacyCrashReport {
  auid?: string;
  backBuffer?: string;
  buildUrl?: string;
  clientIp?: string;
  cpuInfo?: string;
  deviceModel?: string;
  deviceName?: string;
  errorCategory?: string;
  errorCode?: string;
  errorCodeToPlatform?: number;
  errorLevel?: string;
  exceptionSerialNum?: string;
  frame?: string;
  gBuffer?: string;
  gpuInfo?: string;
  graphicsLevel?: string;
  graphicsVersion?: string;
  guid?: string;
  is2G?: boolean;
  loginTime?: number;
  logStr?: string;
  logType?: string;
  memoryInfo?: string;
  needShowErrDlg?: boolean;
  notifyUserName?: string;
  operatingSystem?: string;
  platformType?: number;
  pos?: string;
  serverName?: string;
  stackTrace?: string;
  subErrorCode?: number;
  time?: string;
  title?: string;
  uid?: number;
  userName?: string;
  version?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function legacyCrashReportSerializer(item: LegacyCrashReport): any {
  return {
    ...serializeRecord(item.additionalProperties ?? {}),
    auid: item["auid"],
    backBuffer: item["backBuffer"],
    buildUrl: item["buildUrl"],
    clientIp: item["clientIp"],
    cpuInfo: item["cpuInfo"],
    deviceModel: item["deviceModel"],
    deviceName: item["deviceName"],
    errorCategory: item["errorCategory"],
    errorCode: item["errorCode"],
    errorCodeToPlatform: item["errorCodeToPlatform"],
    errorLevel: item["errorLevel"],
    exceptionSerialNum: item["exceptionSerialNum"],
    frame: item["frame"],
    gBuffer: item["gBuffer"],
    gpuInfo: item["gpuInfo"],
    graphicsLevel: item["graphicsLevel"],
    graphicsVersion: item["graphicsVersion"],
    guid: item["guid"],
    is2g: item["is2G"],
    loginTime: item["loginTime"],
    logStr: item["logStr"],
    logType: item["logType"],
    memoryInfo: item["memoryInfo"],
    needShowErrDlg: item["needShowErrDlg"],
    notifyUserName: item["notifyUserName"],
    operatingSystem: item["operatingSystem"],
    platformType: item["platformType"],
    pos: item["pos"],
    serverName: item["serverName"],
    stackTrace: item["stackTrace"],
    subErrorCode: item["subErrorCode"],
    time: item["time"],
    title: item["title"],
    uid: item["uid"],
    userName: item["userName"],
    version: item["version"],
  };
}
