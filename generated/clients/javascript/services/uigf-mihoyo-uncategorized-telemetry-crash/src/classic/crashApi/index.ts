// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoUncategorizedTelemetryCrashContext } from "../../api/mihoyoUncategorizedTelemetryCrashContext.js";
import { upload } from "../../api/crashApi/operations.js";
import { CrashApiUploadOptionalParams } from "../../api/crashApi/options.js";
import { LegacyCrashReport } from "../../models/uigf/mihoyo/api/request/models.js";

/** Interface representing a CrashApi operations. */
export interface CrashApiOperations {
  upload: (body: LegacyCrashReport, options?: CrashApiUploadOptionalParams) => Promise<void>;
}

function _getCrashApi(context: MihoyoUncategorizedTelemetryCrashContext) {
  return {
    upload: (body: LegacyCrashReport, options?: CrashApiUploadOptionalParams) =>
      upload(context, body, options),
  };
}

export function _getCrashApiOperations(
  context: MihoyoUncategorizedTelemetryCrashContext,
): CrashApiOperations {
  return {
    ..._getCrashApi(context),
  };
}
