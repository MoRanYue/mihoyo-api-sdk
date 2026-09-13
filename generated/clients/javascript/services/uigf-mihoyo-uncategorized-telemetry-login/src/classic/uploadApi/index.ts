// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoUncategorizedTelemetryLoginContext } from "../../api/mihoyoUncategorizedTelemetryLoginContext.js";
import { upload } from "../../api/uploadApi/operations.js";
import { UploadApiUploadOptionalParams } from "../../api/uploadApi/options.js";
import { LoginTelemetryEvent } from "../../models/uigf/mihoyo/api/request/models.js";
import { UploadResponse } from "../../models/uigf/mihoyo/uncategorized/models.js";

/** Interface representing a UploadApi operations. */
export interface UploadApiOperations {
  upload: (
    authorization: string,
    body: LoginTelemetryEvent[],
    options?: UploadApiUploadOptionalParams,
  ) => Promise<UploadResponse>;
}

function _getUploadApi(context: MihoyoUncategorizedTelemetryLoginContext) {
  return {
    upload: (
      authorization: string,
      body: LoginTelemetryEvent[],
      options?: UploadApiUploadOptionalParams,
    ) => upload(context, authorization, body, options),
  };
}

export function _getUploadApiOperations(
  context: MihoyoUncategorizedTelemetryLoginContext,
): UploadApiOperations {
  return {
    ..._getUploadApi(context),
  };
}
