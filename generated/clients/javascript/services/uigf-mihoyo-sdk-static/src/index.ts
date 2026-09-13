// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoSDKStaticClient } from "./mihoyoSDKStaticClient.js";
export type {
  ApiResponseSdkPorteData,
  ApiResponseSdkFeCnConfigData,
} from "./models/uigf/mihoyo/index.js";
export type { SdkPorteData, SdkFeCnConfigData } from "./models/uigf/mihoyo/api/response/index.js";
export type { MihoyoSDKStaticClientOptionalParams } from "./api/index.js";
export type {
  ConfigurationApiGetFeCnConfigOptionalParams,
  ConfigurationApiGetCnPorteOptionalParams,
} from "./api/configurationApi/index.js";
export type { ConfigurationApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
