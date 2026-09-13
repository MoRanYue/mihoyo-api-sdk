// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoCheckInClient } from "./mihoyoCheckInClient.js";
export type { ApiResponseJsonObject, JsonObject } from "./models/uigf/mihoyo/index.js";
export type { LunaCheckInRequest } from "./models/uigf/mihoyo/community/index.js";
export type { MihoyoCheckInClientOptionalParams } from "./api/index.js";
export type {
  CheckInApiResignOptionalParams,
  CheckInApiGetResignInfoOptionalParams,
  CheckInApiSignOptionalParams,
  CheckInApiGetInfoOptionalParams,
  CheckInApiGetHomeOptionalParams,
} from "./api/checkInApi/index.js";
export type { CheckInApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
