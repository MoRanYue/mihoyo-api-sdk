// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext } from "../../api/mihoyoMiYouSheMobileContext.js";
import { getUserSettings } from "../../api/mobileChatApi/operations.js";
import { MobileChatApiGetUserSettingsOptionalParams } from "../../api/mobileChatApi/options.js";
import { ApiResponseMobileUserSettingsData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a MobileChatApi operations. */
export interface MobileChatApiOperations {
  getUserSettings: (
    options?: MobileChatApiGetUserSettingsOptionalParams,
  ) => Promise<ApiResponseMobileUserSettingsData>;
}

function _getMobileChatApi(context: MihoyoMiYouSheMobileContext) {
  return {
    getUserSettings: (options?: MobileChatApiGetUserSettingsOptionalParams) =>
      getUserSettings(context, options),
  };
}

export function _getMobileChatApiOperations(
  context: MihoyoMiYouSheMobileContext,
): MobileChatApiOperations {
  return {
    ..._getMobileChatApi(context),
  };
}
