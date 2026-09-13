// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoGameCNActivityClient } from "./mihoyoGameCNActivityClient.js";
export type {
  ApiResponseStrategyLatestContentData,
  ApiResponseStrategyHomeInfoData,
  ApiResponseStrategyHomeNavbarData,
  ApiResponseZenlessFeedbackScheduleData,
  ApiResponseEmptyData,
} from "./models/uigf/mihoyo/index.js";
export type { ZenlessFeedbackCollectionRequest } from "./models/uigf/mihoyo/api/request/index.js";
export type {
  StrategyLatestContentData,
  StrategyContentItem,
  StrategyHomeInfoData,
  StrategyAnnouncement,
  StrategySearch,
  StrategyHomeNavbarData,
  StrategyHomeImage,
  ZenlessFeedbackScheduleData,
  EmptyData,
} from "./models/uigf/mihoyo/api/response/index.js";
export type { MihoyoGameCNActivityClientOptionalParams } from "./api/index.js";
export type {
  StrategyApiGetHomeNavbarOptionalParams,
  StrategyApiGetHomeInfoOptionalParams,
  StrategyApiGetLatestContentOptionalParams,
} from "./api/strategyApi/index.js";
export type {
  ZenlessFeedbackApiCollectOptionalParams,
  ZenlessFeedbackApiGetCurrentScheduleOptionalParams,
} from "./api/zenlessFeedbackApi/index.js";
export type { StrategyApiOperations, ZenlessFeedbackApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
