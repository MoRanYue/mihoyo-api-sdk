// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameCNActivityContext } from "../../api/mihoyoGameCNActivityContext.js";
import { collect, getCurrentSchedule } from "../../api/zenlessFeedbackApi/operations.js";
import {
  ZenlessFeedbackApiCollectOptionalParams,
  ZenlessFeedbackApiGetCurrentScheduleOptionalParams,
} from "../../api/zenlessFeedbackApi/options.js";
import { ZenlessFeedbackCollectionRequest } from "../../models/uigf/mihoyo/api/request/models.js";
import {
  ApiResponseZenlessFeedbackScheduleData,
  ApiResponseEmptyData,
} from "../../models/uigf/mihoyo/models.js";

/** Interface representing a ZenlessFeedbackApi operations. */
export interface ZenlessFeedbackApiOperations {
  collect: (
    body: ZenlessFeedbackCollectionRequest,
    options?: ZenlessFeedbackApiCollectOptionalParams,
  ) => Promise<ApiResponseEmptyData>;
  getCurrentSchedule: (
    region: string,
    source: number,
    toolType: number,
    uid: number,
    options?: ZenlessFeedbackApiGetCurrentScheduleOptionalParams,
  ) => Promise<ApiResponseZenlessFeedbackScheduleData>;
}

function _getZenlessFeedbackApi(context: MihoyoGameCNActivityContext) {
  return {
    collect: (
      body: ZenlessFeedbackCollectionRequest,
      options?: ZenlessFeedbackApiCollectOptionalParams,
    ) => collect(context, body, options),
    getCurrentSchedule: (
      region: string,
      source: number,
      toolType: number,
      uid: number,
      options?: ZenlessFeedbackApiGetCurrentScheduleOptionalParams,
    ) => getCurrentSchedule(context, region, source, toolType, uid, options),
  };
}

export function _getZenlessFeedbackApiOperations(
  context: MihoyoGameCNActivityContext,
): ZenlessFeedbackApiOperations {
  return {
    ..._getZenlessFeedbackApi(context),
  };
}
