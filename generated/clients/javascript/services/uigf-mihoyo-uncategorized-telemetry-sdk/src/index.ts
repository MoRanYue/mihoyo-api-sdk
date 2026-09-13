// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoUncategorizedTelemetrySDKClient } from "./mihoyoUncategorizedTelemetrySDKClient.js";
export type { UploadResponse } from "./models/uigf/mihoyo/uncategorized/index.js";
export type {
  SdkTelemetryUploadEvent,
  SdkTelemetryUploadContent,
  SdkTelemetryDeviceInfo,
  SdkTelemetryLogInfo,
  SdkTelemetryInfo,
  SdkTelemetryUserInfo,
  SdkTelemetryVersionInfo,
  TelemetryEvent,
} from "./models/uigf/mihoyo/api/request/index.js";
export type { MihoyoUncategorizedTelemetrySDKClientOptionalParams } from "./api/index.js";
export type { UploadApiUploadOptionalParams } from "./api/uploadApi/index.js";
export type { UploadApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
