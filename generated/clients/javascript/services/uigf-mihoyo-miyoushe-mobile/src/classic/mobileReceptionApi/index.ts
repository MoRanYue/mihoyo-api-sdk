// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext } from "../../api/mihoyoMiYouSheMobileContext.js";
import { getGameCenter } from "../../api/mobileReceptionApi/operations.js";
import { MobileReceptionApiGetGameCenterOptionalParams } from "../../api/mobileReceptionApi/options.js";
import { ApiResponseMobileGameCenterData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a MobileReceptionApi operations. */
export interface MobileReceptionApiOperations {
  getGameCenter: (
    cpu: string,
    device: string,
    options?: MobileReceptionApiGetGameCenterOptionalParams,
  ) => Promise<ApiResponseMobileGameCenterData>;
}

function _getMobileReceptionApi(context: MihoyoMiYouSheMobileContext) {
  return {
    getGameCenter: (
      cpu: string,
      device: string,
      options?: MobileReceptionApiGetGameCenterOptionalParams,
    ) => getGameCenter(context, cpu, device, options),
  };
}

export function _getMobileReceptionApiOperations(
  context: MihoyoMiYouSheMobileContext,
): MobileReceptionApiOperations {
  return {
    ..._getMobileReceptionApi(context),
  };
}
