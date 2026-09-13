// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoGameAccountClient } from "./mihoyoGameAccountClient.js";
export type {
  ApiResponseTokenInfo,
  ApiResponseJsonObject,
  JsonObject,
  ApiResponseGameRoleList,
  GameRoleList,
  GameRole,
} from "./models/uigf/mihoyo/index.js";
export type { AuthKeyRequest, CalculateRequest } from "./models/uigf/mihoyo/game/index.js";
export type { GameTokenRequest, TokenInfo } from "./models/uigf/mihoyo/passport/index.js";
export type { MihoyoGameAccountClientOptionalParams } from "./api/index.js";
export type { ActionTicketApiGetBySTokenOptionalParams } from "./api/actionTicketApi/index.js";
export type {
  BindingApiGetRolesOptionalParams,
  BindingApiGenerateAuthKeyOptionalParams,
} from "./api/bindingApi/index.js";
export type {
  CultivationApiSyncAvatarListOptionalParams,
  CultivationApiListWeaponsOptionalParams,
  CultivationApiListAvatarsOptionalParams,
  CultivationApiBatchComputeOptionalParams,
} from "./api/cultivationApi/index.js";
export type { GameTokenApiExchangeGameTokenOptionalParams } from "./api/gameTokenApi/index.js";
export type {
  GenshinObcApiGetHomePositionsOptionalParams,
  GenshinObcApiGetGachaPoolOptionalParams,
} from "./api/genshinObcApi/index.js";
export type {
  ActionTicketApiOperations,
  BindingApiOperations,
  CultivationApiOperations,
  GameTokenApiOperations,
  GenshinObcApiOperations,
} from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
