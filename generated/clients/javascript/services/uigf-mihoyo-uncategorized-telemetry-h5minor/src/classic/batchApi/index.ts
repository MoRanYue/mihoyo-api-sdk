// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoUncategorizedTelemetryH5MinorContext } from "../../api/mihoyoUncategorizedTelemetryH5MinorContext.js";
import { upload } from "../../api/batchApi/operations.js";
import { BatchApiUploadOptionalParams } from "../../api/batchApi/options.js";
import { ApiResponse } from "../../models/uigf/mihoyo/models.js";
import { H5LogRequest } from "../../models/uigf/mihoyo/uncategorized/models.js";

/** Interface representing a BatchApi operations. */
export interface BatchApiOperations {
  upload: (
    topic: string,
    body: H5LogRequest,
    options?: BatchApiUploadOptionalParams,
  ) => Promise<ApiResponse>;
}

function _getBatchApi(context: MihoyoUncategorizedTelemetryH5MinorContext) {
  return {
    upload: (topic: string, body: H5LogRequest, options?: BatchApiUploadOptionalParams) =>
      upload(context, topic, body, options),
  };
}

export function _getBatchApiOperations(
  context: MihoyoUncategorizedTelemetryH5MinorContext,
): BatchApiOperations {
  return {
    ..._getBatchApi(context),
  };
}
