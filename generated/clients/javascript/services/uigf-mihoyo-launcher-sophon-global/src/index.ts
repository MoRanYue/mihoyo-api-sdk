// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoLauncherSophonGlobalClient } from "./mihoyoLauncherSophonGlobalClient.js";
export type { ApiResponseJsonObject, JsonObject } from "./models/uigf/mihoyo/index.js";
export type { MihoyoLauncherSophonGlobalClientOptionalParams } from "./api/index.js";
export type {
  BuildApiGetPatchBuildOptionalParams,
  BuildApiGetBuildOptionalParams,
} from "./api/buildApi/index.js";
export type { BuildApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
