// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoUncategorizedTelemetryH5CollectorContext } from "../../api/mihoyoUncategorizedTelemetryH5CollectorContext.js";
import { upload } from "../../api/uploadApi/operations.js";
import { UploadApiUploadOptionalParams } from "../../api/uploadApi/options.js";
import { H5CollectorUploadRequest } from "../../models/uigf/mihoyo/api/request/models.js";
import { UploadResponse } from "../../models/uigf/mihoyo/uncategorized/models.js";

/** Interface representing a UploadApi operations. */
export interface UploadApiOperations {
  upload: (
    timestamp: number,
    verification: string,
    body: H5CollectorUploadRequest,
    options?: UploadApiUploadOptionalParams,
  ) => Promise<UploadResponse>;
}

function _getUploadApi(context: MihoyoUncategorizedTelemetryH5CollectorContext) {
  return {
    upload: (
      timestamp: number,
      verification: string,
      body: H5CollectorUploadRequest,
      options?: UploadApiUploadOptionalParams,
    ) => upload(context, timestamp, verification, body, options),
  };
}

export function _getUploadApiOperations(
  context: MihoyoUncategorizedTelemetryH5CollectorContext,
): UploadApiOperations {
  return {
    ..._getUploadApi(context),
  };
}
