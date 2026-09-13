// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoGameGlobalAccountClient } from "./mihoyoGameGlobalAccountClient.js";
export type {
  ApiResponseGameRoleList,
  GameRoleList,
  GameRole,
} from "./models/uigf/mihoyo/index.js";
export type { MihoyoGameGlobalAccountClientOptionalParams } from "./api/index.js";
export type { BindingApiGetRolesOptionalParams } from "./api/bindingApi/index.js";
export type { BindingApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
