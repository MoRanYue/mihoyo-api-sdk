// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoGameCNEventsClient } from "./mihoyoGameCNEventsClient.js";
export type {
  ApiResponseJsonObject,
  JsonObject,
  ApiResponseZenlessLedgerMonthInfoData,
} from "./models/uigf/mihoyo/index.js";
export type { ZenlessLedgerMonthInfoData } from "./models/uigf/mihoyo/game/response/index.js";
export type { MihoyoGameCNEventsClientOptionalParams } from "./api/index.js";
export type {
  StarRailLedgerApiGetMonthDetailOptionalParams,
  StarRailLedgerApiGetMonthInfoOptionalParams,
} from "./api/starRailLedgerApi/index.js";
export type {
  ZenlessCultivationApiGetIconInfoOptionalParams,
  ZenlessCultivationApiGetItemsOptionalParams,
} from "./api/zenlessCultivationApi/index.js";
export type {
  ZenlessLedgerApiGetMonthDetailOptionalParams,
  ZenlessLedgerApiGetMonthInfoOptionalParams,
} from "./api/zenlessLedgerApi/index.js";
export type {
  StarRailLedgerApiOperations,
  ZenlessCultivationApiOperations,
  ZenlessLedgerApiOperations,
} from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
