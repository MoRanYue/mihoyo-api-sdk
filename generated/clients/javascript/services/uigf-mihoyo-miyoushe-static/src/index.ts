// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoMiYouSheStaticClient } from "./mihoyoMiYouSheStaticClient.js";
export type {
  ApiResponseStaticResourceData,
  ApiResponseStaticResourceVersionsData,
  ApiResponseStaticLatestVersionData,
  ApiResponseStaticPreKeywordData,
} from "./models/uigf/mihoyo/index.js";
export type {
  StaticResourceData,
  StaticResourceVersionsData,
  StaticLatestVersionData,
  StaticPreKeywordData,
} from "./models/uigf/mihoyo/api/response/index.js";
export type { MihoyoMiYouSheStaticClientOptionalParams } from "./api/index.js";
export type { StaticApiHubGetStaticResourceOptionalParams } from "./api/staticApiHub/index.js";
export type { StaticMiscApiGetAllResourceVersionsOptionalParams } from "./api/staticMiscApi/index.js";
export type { StaticPreloadApiGetLatestVersionOptionalParams } from "./api/staticPreloadApi/index.js";
export type { StaticSearchApiGetPreKeywordOptionalParams } from "./api/staticSearchApi/index.js";
export type {
  StaticApiHubOperations,
  StaticMiscApiOperations,
  StaticPreloadApiOperations,
  StaticSearchApiOperations,
} from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
