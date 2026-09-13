// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoUncategorizedTelemetryCommunityContext } from "../../api/mihoyoUncategorizedTelemetryCommunityContext.js";
import { upload } from "../../api/uploadApi/operations.js";
import { UploadApiUploadOptionalParams } from "../../api/uploadApi/options.js";
import { CommunityTelemetryUploadRequest } from "../../models/uigf/mihoyo/api/request/models.js";
import { UploadResponse } from "../../models/uigf/mihoyo/uncategorized/models.js";

/** Interface representing a UploadApi operations. */
export interface UploadApiOperations {
  upload: (
    body: CommunityTelemetryUploadRequest,
    options?: UploadApiUploadOptionalParams,
  ) => Promise<UploadResponse>;
}

function _getUploadApi(context: MihoyoUncategorizedTelemetryCommunityContext) {
  return {
    upload: (body: CommunityTelemetryUploadRequest, options?: UploadApiUploadOptionalParams) =>
      upload(context, body, options),
  };
}

export function _getUploadApiOperations(
  context: MihoyoUncategorizedTelemetryCommunityContext,
): UploadApiOperations {
  return {
    ..._getUploadApi(context),
  };
}
