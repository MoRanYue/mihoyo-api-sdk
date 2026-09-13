// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoUncategorizedTelemetryGameContext } from "../../api/mihoyoUncategorizedTelemetryGameContext.js";
import { verify } from "../../api/performanceApi/operations.js";
import { PerformanceApiVerifyOptionalParams } from "../../api/performanceApi/options.js";
import { UploadResponse } from "../../models/uigf/mihoyo/uncategorized/models.js";

/** Interface representing a PerformanceApi operations. */
export interface PerformanceApiOperations {
  verify: (
    deviceId: string,
    name: string,
    platform: string,
    options?: PerformanceApiVerifyOptionalParams,
  ) => Promise<UploadResponse>;
}

function _getPerformanceApi(context: MihoyoUncategorizedTelemetryGameContext) {
  return {
    verify: (
      deviceId: string,
      name: string,
      platform: string,
      options?: PerformanceApiVerifyOptionalParams,
    ) => verify(context, deviceId, name, platform, options),
  };
}

export function _getPerformanceApiOperations(
  context: MihoyoUncategorizedTelemetryGameContext,
): PerformanceApiOperations {
  return {
    ..._getPerformanceApi(context),
  };
}
