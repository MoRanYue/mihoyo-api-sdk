// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoUncategorizedTelemetryGameContext } from "../../api/mihoyoUncategorizedTelemetryGameContext.js";
import { uploadCustom, uploadSdk, uploadCrash } from "../../api/uploadApi/operations.js";
import {
  UploadApiUploadCustomOptionalParams,
  UploadApiUploadSdkOptionalParams,
  UploadApiUploadCrashOptionalParams,
} from "../../api/uploadApi/options.js";
import {
  GameCrashTelemetryEvent,
  GameSdkTelemetryEvent,
  GameCustomTelemetryEvent,
} from "../../models/uigf/mihoyo/api/request/models.js";
import { UploadResponse } from "../../models/uigf/mihoyo/uncategorized/models.js";

/** Interface representing a UploadApi operations. */
export interface UploadApiOperations {
  uploadCustom: (
    body: GameCustomTelemetryEvent[],
    options?: UploadApiUploadCustomOptionalParams,
  ) => Promise<UploadResponse>;
  uploadSdk: (
    body: GameSdkTelemetryEvent[],
    options?: UploadApiUploadSdkOptionalParams,
  ) => Promise<UploadResponse>;
  /** The official client signs the upload headers; signing is intentionally caller-owned. */
  uploadCrash: (
    body: GameCrashTelemetryEvent[],
    options?: UploadApiUploadCrashOptionalParams,
  ) => Promise<UploadResponse>;
}

function _getUploadApi(context: MihoyoUncategorizedTelemetryGameContext) {
  return {
    uploadCustom: (
      body: GameCustomTelemetryEvent[],
      options?: UploadApiUploadCustomOptionalParams,
    ) => uploadCustom(context, body, options),
    uploadSdk: (body: GameSdkTelemetryEvent[], options?: UploadApiUploadSdkOptionalParams) =>
      uploadSdk(context, body, options),
    uploadCrash: (body: GameCrashTelemetryEvent[], options?: UploadApiUploadCrashOptionalParams) =>
      uploadCrash(context, body, options),
  };
}

export function _getUploadApiOperations(
  context: MihoyoUncategorizedTelemetryGameContext,
): UploadApiOperations {
  return {
    ..._getUploadApi(context),
  };
}
