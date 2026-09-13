// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoGameCNMiYouSheAccountClient } from "./mihoyoGameCNMiYouSheAccountClient.js";
export type {
  ApiResponseGameRoleList,
  GameRoleList,
  GameRole,
  ApiResponseAuthKeyData,
  ApiResponseReleaseData,
} from "./models/uigf/mihoyo/index.js";
export type { AuthKeyRequest } from "./models/uigf/mihoyo/game/index.js";
export type { AuthKeyData, ReleaseData } from "./models/uigf/mihoyo/api/response/index.js";
export type { MihoyoGameCNMiYouSheAccountClientOptionalParams } from "./api/index.js";
export type { AuthKeyApiGenerateOptionalParams } from "./api/authKeyApi/index.js";
export type { BindingApiGetRolesOptionalParams } from "./api/bindingApi/index.js";
export type { ReleaseApiGetLatestReleaseOptionalParams } from "./api/releaseApi/index.js";
export type {
  AuthKeyApiOperations,
  BindingApiOperations,
  ReleaseApiOperations,
} from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
