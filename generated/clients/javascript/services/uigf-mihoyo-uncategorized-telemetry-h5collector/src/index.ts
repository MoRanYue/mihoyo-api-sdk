// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoUncategorizedTelemetryH5CollectorClient } from "./mihoyoUncategorizedTelemetryH5CollectorClient.js";
export type { UploadResponse } from "./models/uigf/mihoyo/uncategorized/index.js";
export type {
  H5CollectorUploadRequest,
  H5CollectorEventInfo,
  H5CollectorEventExtraInfo,
  H5CollectorPageInfo,
  H5CollectorPageExtraInfo,
  H5CollectorUserInfo,
} from "./models/uigf/mihoyo/api/request/index.js";
export type { MihoyoUncategorizedTelemetryH5CollectorClientOptionalParams } from "./api/index.js";
export type { UploadApiUploadOptionalParams } from "./api/uploadApi/index.js";
export type { UploadApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
