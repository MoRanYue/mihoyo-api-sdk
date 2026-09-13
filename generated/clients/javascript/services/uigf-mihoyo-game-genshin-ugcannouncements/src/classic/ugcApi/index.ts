// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameGenshinUgcAnnouncementsContext } from "../../api/mihoyoGameGenshinUgcAnnouncementsContext.js";
import { getAlert } from "../../api/ugcApi/operations.js";
import { UgcApiGetAlertOptionalParams } from "../../api/ugcApi/options.js";
import { ApiResponseAnnouncementAlertData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a UgcApi operations. */
export interface UgcApiOperations {
  getAlert: (
    game: string,
    gameBiz: string,
    lang: string,
    bundleId: string,
    platform: "pc" | "android" | "ios",
    region: string,
    options?: UgcApiGetAlertOptionalParams,
  ) => Promise<ApiResponseAnnouncementAlertData>;
}

function _getUgcApi(context: MihoyoGameGenshinUgcAnnouncementsContext) {
  return {
    getAlert: (
      game: string,
      gameBiz: string,
      lang: string,
      bundleId: string,
      platform: "pc" | "android" | "ios",
      region: string,
      options?: UgcApiGetAlertOptionalParams,
    ) => getAlert(context, game, gameBiz, lang, bundleId, platform, region, options),
  };
}

export function _getUgcApiOperations(
  context: MihoyoGameGenshinUgcAnnouncementsContext,
): UgcApiOperations {
  return {
    ..._getUgcApi(context),
  };
}
