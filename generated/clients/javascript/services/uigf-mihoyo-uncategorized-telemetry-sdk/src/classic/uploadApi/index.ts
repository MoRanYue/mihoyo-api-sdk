// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoUncategorizedTelemetrySDKContext } from "../../api/mihoyoUncategorizedTelemetrySDKContext.js";
import { upload } from "../../api/uploadApi/operations.js";
import { UploadApiUploadOptionalParams } from "../../api/uploadApi/options.js";
import { SdkTelemetryUploadEvent } from "../../models/uigf/mihoyo/api/request/models.js";
import { UploadResponse } from "../../models/uigf/mihoyo/uncategorized/models.js";

/** Interface representing a UploadApi operations. */
export interface UploadApiOperations {
  upload: (
    body: SdkTelemetryUploadEvent[],
    options?: UploadApiUploadOptionalParams,
  ) => Promise<UploadResponse>;
}

function _getUploadApi(context: MihoyoUncategorizedTelemetrySDKContext) {
  return {
    upload: (body: SdkTelemetryUploadEvent[], options?: UploadApiUploadOptionalParams) =>
      upload(context, body, options),
  };
}

export function _getUploadApiOperations(
  context: MihoyoUncategorizedTelemetrySDKContext,
): UploadApiOperations {
  return {
    ..._getUploadApi(context),
  };
}
