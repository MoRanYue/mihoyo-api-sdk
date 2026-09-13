// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameGenshinAnnouncementContentContext } from "../../api/mihoyoGameGenshinAnnouncementContentContext.js";
import { get } from "../../api/contentApi/operations.js";
import { ContentApiGetOptionalParams } from "../../api/contentApi/options.js";
import { ApiResponseAnnouncementContentData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a ContentApi operations. */
export interface ContentApiOperations {
  get: (
    game: string,
    gameBiz: string,
    lang: string,
    bundleId: string,
    platform: "pc" | "android" | "ios",
    region: string,
    options?: ContentApiGetOptionalParams,
  ) => Promise<ApiResponseAnnouncementContentData>;
}

function _getContentApi(context: MihoyoGameGenshinAnnouncementContentContext) {
  return {
    get: (
      game: string,
      gameBiz: string,
      lang: string,
      bundleId: string,
      platform: "pc" | "android" | "ios",
      region: string,
      options?: ContentApiGetOptionalParams,
    ) => get(context, game, gameBiz, lang, bundleId, platform, region, options),
  };
}

export function _getContentApiOperations(
  context: MihoyoGameGenshinAnnouncementContentContext,
): ContentApiOperations {
  return {
    ..._getContentApi(context),
  };
}
