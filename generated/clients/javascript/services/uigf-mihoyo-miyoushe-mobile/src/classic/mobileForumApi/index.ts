// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext } from "../../api/mihoyoMiYouSheMobileContext.js";
import { getDiscussionByGame } from "../../api/mobileForumApi/operations.js";
import { MobileForumApiGetDiscussionByGameOptionalParams } from "../../api/mobileForumApi/options.js";
import { ApiResponseMobileDiscussionData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a MobileForumApi operations. */
export interface MobileForumApiOperations {
  getDiscussionByGame: (
    gids: number,
    version: number,
    options?: MobileForumApiGetDiscussionByGameOptionalParams,
  ) => Promise<ApiResponseMobileDiscussionData>;
}

function _getMobileForumApi(context: MihoyoMiYouSheMobileContext) {
  return {
    getDiscussionByGame: (
      gids: number,
      version: number,
      options?: MobileForumApiGetDiscussionByGameOptionalParams,
    ) => getDiscussionByGame(context, gids, version, options),
  };
}

export function _getMobileForumApiOperations(
  context: MihoyoMiYouSheMobileContext,
): MobileForumApiOperations {
  return {
    ..._getMobileForumApi(context),
  };
}
