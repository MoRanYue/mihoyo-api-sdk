// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext } from "../../api/mihoyoMiYouSheMobileContext.js";
import { getEntityReview } from "../../api/mobileUserInstantApi/operations.js";
import { MobileUserInstantApiGetEntityReviewOptionalParams } from "../../api/mobileUserInstantApi/options.js";
import { ApiResponseMobileEntityReviewData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a MobileUserInstantApi operations. */
export interface MobileUserInstantApiOperations {
  getEntityReview: (
    ds: string,
    offset: number,
    size: number,
    options?: MobileUserInstantApiGetEntityReviewOptionalParams,
  ) => Promise<ApiResponseMobileEntityReviewData>;
}

function _getMobileUserInstantApi(context: MihoyoMiYouSheMobileContext) {
  return {
    getEntityReview: (
      ds: string,
      offset: number,
      size: number,
      options?: MobileUserInstantApiGetEntityReviewOptionalParams,
    ) => getEntityReview(context, ds, offset, size, options),
  };
}

export function _getMobileUserInstantApiOperations(
  context: MihoyoMiYouSheMobileContext,
): MobileUserInstantApiOperations {
  return {
    ..._getMobileUserInstantApi(context),
  };
}
