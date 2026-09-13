// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoGameGenshinAnnouncementsClient } from "./mihoyoGameGenshinAnnouncementsClient.js";
export type {
  ApiResponseAnnouncementListData,
  ApiResponseAnnouncementAlertData,
  ApiResponseAnnouncementPictureData,
} from "./models/uigf/mihoyo/index.js";
export type {
  AnnouncementListData,
  AnnouncementCalendarType,
  AnnouncementGroup,
  AnnouncementItem,
  AnnouncementType,
  AnnouncementAlertData,
  AnnouncementPictureData,
} from "./models/uigf/mihoyo/game/response/index.js";
export type { MihoyoGameGenshinAnnouncementsClientOptionalParams } from "./api/index.js";
export type {
  AnnouncementApiGetAlertPictureOptionalParams,
  AnnouncementApiGetAlertOptionalParams,
  AnnouncementApiListOptionalParams,
} from "./api/announcementApi/index.js";
export type { AnnouncementApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
