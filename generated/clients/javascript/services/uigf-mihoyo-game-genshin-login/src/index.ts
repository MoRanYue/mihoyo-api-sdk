// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoGameGenshinLoginClient } from "./mihoyoGameGenshinLoginClient.js";
export type {
  ApiResponsePandaQrResponse,
  ApiResponseGranterLoginData,
} from "./models/uigf/mihoyo/index.js";
export type { PandaQrRequest, PandaQrResponse } from "./models/uigf/mihoyo/game/index.js";
export type {
  GranterLoginData,
  GranterFatigueRemind,
} from "./models/uigf/mihoyo/game/response/index.js";
export type { GranterLoginRequest } from "./models/uigf/mihoyo/game/genshin/sdk/index.js";
export type { MihoyoGameGenshinLoginClientOptionalParams } from "./api/index.js";
export type { GranterApiLoginOptionalParams } from "./api/granterApi/index.js";
export type {
  PandaQrApiGetStatusOptionalParams,
  PandaQrApiCreateOptionalParams,
} from "./api/pandaQrApi/index.js";
export type { GranterApiOperations, PandaQrApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
