// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoGameGenshinSDKSecureClient } from "./mihoyoGameGenshinSDKSecureClient.js";
export type {
  ApiResponseSdkProtocolVersionComparisonData,
  ApiResponseSdkRedDotData,
} from "./models/uigf/mihoyo/index.js";
export type {
  SdkProtocolVersionComparisonData,
  SdkProtocolVersion,
  SdkRedDotData,
  SdkRedDotInfo,
} from "./models/uigf/mihoyo/game/response/index.js";
export type {
  ProtocolVersionRequest,
  RedDotRequest,
} from "./models/uigf/mihoyo/game/genshin/sdk/index.js";
export type { MihoyoGameGenshinSDKSecureClientOptionalParams } from "./api/index.js";
export type {
  SecureApiGetRedDotsOptionalParams,
  SecureApiCompareProtocolVersionOptionalParams,
} from "./api/secureApi/index.js";
export type { SecureApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
