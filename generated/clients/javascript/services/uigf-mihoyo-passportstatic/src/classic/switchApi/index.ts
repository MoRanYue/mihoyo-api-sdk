// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoPassportStaticContext } from "../../api/mihoyoPassportStaticContext.js";
import { getSwitchStatus } from "../../api/switchApi/operations.js";
import { SwitchApiGetSwitchStatusOptionalParams } from "../../api/switchApi/options.js";
import { ApiResponsePassportSwitchStatusData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a SwitchApi operations. */
export interface SwitchApiOperations {
  getSwitchStatus: (
    appId: string,
    platform: number,
    options?: SwitchApiGetSwitchStatusOptionalParams,
  ) => Promise<ApiResponsePassportSwitchStatusData>;
}

function _getSwitchApi(context: MihoyoPassportStaticContext) {
  return {
    getSwitchStatus: (
      appId: string,
      platform: number,
      options?: SwitchApiGetSwitchStatusOptionalParams,
    ) => getSwitchStatus(context, appId, platform, options),
  };
}

export function _getSwitchApiOperations(context: MihoyoPassportStaticContext): SwitchApiOperations {
  return {
    ..._getSwitchApi(context),
  };
}
