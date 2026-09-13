// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoGameGenshinAnnouncementContentClient } from "./mihoyoGameGenshinAnnouncementContentClient.js";
export type { ApiResponseAnnouncementContentData } from "./models/uigf/mihoyo/index.js";
export type {
  AnnouncementContentData,
  AnnouncementContentItem,
} from "./models/uigf/mihoyo/game/response/index.js";
export type { MihoyoGameGenshinAnnouncementContentClientOptionalParams } from "./api/index.js";
export type { ContentApiGetOptionalParams } from "./api/contentApi/index.js";
export type { ContentApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
