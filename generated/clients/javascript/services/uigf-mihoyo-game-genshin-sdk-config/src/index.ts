// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoGameGenshinSDKConfigClient } from "./mihoyoGameGenshinSDKConfigClient.js";
export type {
  ApiResponseSdkComboConfigData,
  ApiResponseSdkPrecacheConfigData,
  ApiResponseSdkGranterConfigData,
  ApiResponseSdkShieldConfigData,
} from "./models/uigf/mihoyo/index.js";
export type {
  SdkComboConfigData,
  SdkPrecacheConfigData,
  SdkGranterConfigData,
  SdkGranterQrAppIcons,
  SdkGranterQrEnabledApps,
  SdkShieldConfigData,
} from "./models/uigf/mihoyo/game/response/index.js";
export type { MihoyoGameGenshinSDKConfigClientOptionalParams } from "./api/index.js";
export type {
  ConfigApiGetShieldConfigOptionalParams,
  ConfigApiGetGranterConfigOptionalParams,
  ConfigApiGetPrecacheOptionalParams,
  ConfigApiGetComboOptionalParams,
} from "./api/configApi/index.js";
export type { ConfigApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
