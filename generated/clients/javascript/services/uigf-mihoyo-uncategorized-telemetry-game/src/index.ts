// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoUncategorizedTelemetryGameClient } from "./mihoyoUncategorizedTelemetryGameClient.js";
export type { UploadResponse } from "./models/uigf/mihoyo/uncategorized/index.js";
export type {
  GameCrashTelemetryEvent,
  GameCrashTelemetryUploadContent,
  TelemetryEvent,
  GameSdkTelemetryEvent,
  GameSdkTelemetryUploadContent,
  GameSdkSnakeDeviceInfo,
  GameSdkCamelDeviceInfo,
  GameSdkLogInfo,
  SdkTelemetryInfo,
  GameSdkUserInfo,
  GameSdkVersionInfo,
  GameCustomTelemetryEvent,
  GameCustomTelemetryUploadContent,
} from "./models/uigf/mihoyo/api/request/index.js";
export type { MihoyoUncategorizedTelemetryGameClientOptionalParams } from "./api/index.js";
export type { PerformanceApiVerifyOptionalParams } from "./api/performanceApi/index.js";
export type {
  UploadApiUploadCustomOptionalParams,
  UploadApiUploadSdkOptionalParams,
  UploadApiUploadCrashOptionalParams,
} from "./api/uploadApi/index.js";
export type { PerformanceApiOperations, UploadApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
