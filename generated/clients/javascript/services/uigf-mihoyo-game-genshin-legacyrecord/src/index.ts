// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoGameGenshinLegacyRecordClient } from "./mihoyoGameGenshinLegacyRecordClient.js";
export type { ApiResponseGenshinGameRecordCardData } from "./models/uigf/mihoyo/index.js";
export type { GenshinGameRecordCardData } from "./models/uigf/mihoyo/game/response/index.js";
export type { MihoyoGameGenshinLegacyRecordClientOptionalParams } from "./api/index.js";
export type { LegacyCardApiGetGameRecordCardOptionalParams } from "./api/legacyCardApi/index.js";
export type { WebCardApiGetGameRecordCardOptionalParams } from "./api/webCardApi/index.js";
export type { LegacyCardApiOperations, WebCardApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
