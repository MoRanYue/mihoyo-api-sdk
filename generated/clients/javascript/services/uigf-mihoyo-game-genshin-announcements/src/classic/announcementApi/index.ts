// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameGenshinAnnouncementsContext } from "../../api/mihoyoGameGenshinAnnouncementsContext.js";
import { getAlertPicture, getAlert, list } from "../../api/announcementApi/operations.js";
import {
  AnnouncementApiGetAlertPictureOptionalParams,
  AnnouncementApiGetAlertOptionalParams,
  AnnouncementApiListOptionalParams,
} from "../../api/announcementApi/options.js";
import {
  ApiResponseAnnouncementListData,
  ApiResponseAnnouncementAlertData,
  ApiResponseAnnouncementPictureData,
} from "../../models/uigf/mihoyo/models.js";

/** Interface representing a AnnouncementApi operations. */
export interface AnnouncementApiOperations {
  getAlertPicture: (
    game: string,
    gameBiz: string,
    lang: string,
    bundleId: string,
    platform: "pc" | "android" | "ios",
    region: string,
    options?: AnnouncementApiGetAlertPictureOptionalParams,
  ) => Promise<ApiResponseAnnouncementPictureData>;
  getAlert: (
    game: string,
    gameBiz: string,
    lang: string,
    bundleId: string,
    platform: "pc" | "android" | "ios",
    region: string,
    options?: AnnouncementApiGetAlertOptionalParams,
  ) => Promise<ApiResponseAnnouncementAlertData>;
  list: (
    game: string,
    gameBiz: string,
    lang: string,
    bundleId: string,
    platform: "pc" | "android" | "ios",
    region: string,
    options?: AnnouncementApiListOptionalParams,
  ) => Promise<ApiResponseAnnouncementListData>;
}

function _getAnnouncementApi(context: MihoyoGameGenshinAnnouncementsContext) {
  return {
    getAlertPicture: (
      game: string,
      gameBiz: string,
      lang: string,
      bundleId: string,
      platform: "pc" | "android" | "ios",
      region: string,
      options?: AnnouncementApiGetAlertPictureOptionalParams,
    ) => getAlertPicture(context, game, gameBiz, lang, bundleId, platform, region, options),
    getAlert: (
      game: string,
      gameBiz: string,
      lang: string,
      bundleId: string,
      platform: "pc" | "android" | "ios",
      region: string,
      options?: AnnouncementApiGetAlertOptionalParams,
    ) => getAlert(context, game, gameBiz, lang, bundleId, platform, region, options),
    list: (
      game: string,
      gameBiz: string,
      lang: string,
      bundleId: string,
      platform: "pc" | "android" | "ios",
      region: string,
      options?: AnnouncementApiListOptionalParams,
    ) => list(context, game, gameBiz, lang, bundleId, platform, region, options),
  };
}

export function _getAnnouncementApiOperations(
  context: MihoyoGameGenshinAnnouncementsContext,
): AnnouncementApiOperations {
  return {
    ..._getAnnouncementApi(context),
  };
}
