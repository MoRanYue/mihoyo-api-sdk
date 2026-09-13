// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoGameCNAccountExtensionClient } from "./mihoyoGameCNAccountExtensionClient.js";
export type {
  ApiResponseRedDotBatchData,
  ApiResponsePatchData,
} from "./models/uigf/mihoyo/index.js";
export type {
  RedDotBatchData,
  RedDotGameStatus,
  PatchData,
} from "./models/uigf/mihoyo/api/response/index.js";
export type { MihoyoGameCNAccountExtensionClientOptionalParams } from "./api/index.js";
export type { PatchApiGetPatchOptionalParams } from "./api/patchApi/index.js";
export type { RedDotApiGetBatchOptionalParams } from "./api/redDotApi/index.js";
export type { PatchApiOperations, RedDotApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
