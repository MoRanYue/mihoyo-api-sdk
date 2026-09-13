// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext } from "../../api/mihoyoMiYouSheMobileContext.js";
import { getPublishVideoPermission } from "../../api/mobilePostApi/operations.js";
import { MobilePostApiGetPublishVideoPermissionOptionalParams } from "../../api/mobilePostApi/options.js";
import { ApiResponseMobileVideoPermissionData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a MobilePostApi operations. */
export interface MobilePostApiOperations {
  getPublishVideoPermission: (
    options?: MobilePostApiGetPublishVideoPermissionOptionalParams,
  ) => Promise<ApiResponseMobileVideoPermissionData>;
}

function _getMobilePostApi(context: MihoyoMiYouSheMobileContext) {
  return {
    getPublishVideoPermission: (options?: MobilePostApiGetPublishVideoPermissionOptionalParams) =>
      getPublishVideoPermission(context, options),
  };
}

export function _getMobilePostApiOperations(
  context: MihoyoMiYouSheMobileContext,
): MobilePostApiOperations {
  return {
    ..._getMobilePostApi(context),
  };
}
