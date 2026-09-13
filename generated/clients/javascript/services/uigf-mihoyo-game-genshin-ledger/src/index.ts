// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoGameGenshinLedgerClient } from "./mihoyoGameGenshinLedgerClient.js";
export type { ApiResponseJsonObject, JsonObject } from "./models/uigf/mihoyo/index.js";
export type { MihoyoGameGenshinLedgerClientOptionalParams } from "./api/index.js";
export type {
  LedgerApiGetMonthDetailOptionalParams,
  LedgerApiGetMonthInfoOptionalParams,
} from "./api/ledgerApi/index.js";
export type { LedgerApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
