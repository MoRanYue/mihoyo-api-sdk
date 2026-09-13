// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext } from "../../api/mihoyoMiYouSheMobileContext.js";
import { getRecentEmoticons } from "../../api/mobileMiscApi/operations.js";
import { MobileMiscApiGetRecentEmoticonsOptionalParams } from "../../api/mobileMiscApi/options.js";
import { ApiResponseMobileEmoticonData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a MobileMiscApi operations. */
export interface MobileMiscApiOperations {
  getRecentEmoticons: (
    ds: string,
    options?: MobileMiscApiGetRecentEmoticonsOptionalParams,
  ) => Promise<ApiResponseMobileEmoticonData>;
}

function _getMobileMiscApi(context: MihoyoMiYouSheMobileContext) {
  return {
    getRecentEmoticons: (ds: string, options?: MobileMiscApiGetRecentEmoticonsOptionalParams) =>
      getRecentEmoticons(context, ds, options),
  };
}

export function _getMobileMiscApiOperations(
  context: MihoyoMiYouSheMobileContext,
): MobileMiscApiOperations {
  return {
    ..._getMobileMiscApi(context),
  };
}
