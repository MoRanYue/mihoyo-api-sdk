// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoUncategorizedTelemetryLoginClient } from "./mihoyoUncategorizedTelemetryLoginClient.js";
export type { UploadResponse } from "./models/uigf/mihoyo/uncategorized/index.js";
export type {
  LoginTelemetryEvent,
  LoginTelemetryUploadContent,
  LoginTelemetryDeviceInfo,
  LoginTelemetryLogInfo,
  LoginTelemetryUserInfo,
  LoginTelemetryVersionInfo,
  TelemetryEvent,
} from "./models/uigf/mihoyo/api/request/index.js";
export type { MihoyoUncategorizedTelemetryLoginClientOptionalParams } from "./api/index.js";
export type { UploadApiUploadOptionalParams } from "./api/uploadApi/index.js";
export type { UploadApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
