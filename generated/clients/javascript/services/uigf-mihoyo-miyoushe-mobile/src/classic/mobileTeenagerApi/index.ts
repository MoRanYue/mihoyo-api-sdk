// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext } from "../../api/mihoyoMiYouSheMobileContext.js";
import { getInfo } from "../../api/mobileTeenagerApi/operations.js";
import { MobileTeenagerApiGetInfoOptionalParams } from "../../api/mobileTeenagerApi/options.js";
import { ApiResponseMobileTeenagerInfoData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a MobileTeenagerApi operations. */
export interface MobileTeenagerApiOperations {
  getInfo: (
    options?: MobileTeenagerApiGetInfoOptionalParams,
  ) => Promise<ApiResponseMobileTeenagerInfoData>;
}

function _getMobileTeenagerApi(context: MihoyoMiYouSheMobileContext) {
  return {
    getInfo: (options?: MobileTeenagerApiGetInfoOptionalParams) => getInfo(context, options),
  };
}

export function _getMobileTeenagerApiOperations(
  context: MihoyoMiYouSheMobileContext,
): MobileTeenagerApiOperations {
  return {
    ..._getMobileTeenagerApi(context),
  };
}
