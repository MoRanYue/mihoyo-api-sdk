// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext } from "../../api/mihoyoMiYouSheMobileContext.js";
import { getLatestConfig } from "../../api/mobilePreloadApi/operations.js";
import { MobilePreloadApiGetLatestConfigOptionalParams } from "../../api/mobilePreloadApi/options.js";
import { MobilePreloadConfigRequest } from "../../models/uigf/mihoyo/api/request/models.js";
import { ApiResponseMobilePreloadConfigData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a MobilePreloadApi operations. */
export interface MobilePreloadApiOperations {
  getLatestConfig: (
    body: MobilePreloadConfigRequest,
    options?: MobilePreloadApiGetLatestConfigOptionalParams,
  ) => Promise<ApiResponseMobilePreloadConfigData>;
}

function _getMobilePreloadApi(context: MihoyoMiYouSheMobileContext) {
  return {
    getLatestConfig: (
      body: MobilePreloadConfigRequest,
      options?: MobilePreloadApiGetLatestConfigOptionalParams,
    ) => getLatestConfig(context, body, options),
  };
}

export function _getMobilePreloadApiOperations(
  context: MihoyoMiYouSheMobileContext,
): MobilePreloadApiOperations {
  return {
    ..._getMobilePreloadApi(context),
  };
}
