// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoUtilityLiveStreamContext } from "../../api/mihoyoUtilityLiveStreamContext.js";
import { refresh } from "../../api/redemptionCodeApi/operations.js";
import { RedemptionCodeApiRefreshOptionalParams } from "../../api/redemptionCodeApi/options.js";
import { ApiResponseJsonObject } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a RedemptionCodeApi operations. */
export interface RedemptionCodeApiOperations {
  refresh: (
    activityId: string,
    options?: RedemptionCodeApiRefreshOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
}

function _getRedemptionCodeApi(context: MihoyoUtilityLiveStreamContext) {
  return {
    refresh: (activityId: string, options?: RedemptionCodeApiRefreshOptionalParams) =>
      refresh(context, activityId, options),
  };
}

export function _getRedemptionCodeApiOperations(
  context: MihoyoUtilityLiveStreamContext,
): RedemptionCodeApiOperations {
  return {
    ..._getRedemptionCodeApi(context),
  };
}
