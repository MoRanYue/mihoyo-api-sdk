// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext } from "../../api/mihoyoMiYouSheMobileContext.js";
import { getUnreadInfo } from "../../api/mobileTimelineApi/operations.js";
import { MobileTimelineApiGetUnreadInfoOptionalParams } from "../../api/mobileTimelineApi/options.js";
import { ApiResponseMobileUnreadInfoData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a MobileTimelineApi operations. */
export interface MobileTimelineApiOperations {
  getUnreadInfo: (
    ds: string,
    options?: MobileTimelineApiGetUnreadInfoOptionalParams,
  ) => Promise<ApiResponseMobileUnreadInfoData>;
}

function _getMobileTimelineApi(context: MihoyoMiYouSheMobileContext) {
  return {
    getUnreadInfo: (ds: string, options?: MobileTimelineApiGetUnreadInfoOptionalParams) =>
      getUnreadInfo(context, ds, options),
  };
}

export function _getMobileTimelineApiOperations(
  context: MihoyoMiYouSheMobileContext,
): MobileTimelineApiOperations {
  return {
    ..._getMobileTimelineApi(context),
  };
}
