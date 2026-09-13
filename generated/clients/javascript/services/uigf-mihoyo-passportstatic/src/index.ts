// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoPassportStaticClient } from "./mihoyoPassportStaticClient.js";
export type { ApiResponsePassportSwitchStatusData } from "./models/uigf/mihoyo/index.js";
export type { PassportSwitchStatusData } from "./models/uigf/mihoyo/api/response/index.js";
export type { MihoyoPassportStaticClientOptionalParams } from "./api/index.js";
export type { SwitchApiGetSwitchStatusOptionalParams } from "./api/switchApi/index.js";
export type { SwitchApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
