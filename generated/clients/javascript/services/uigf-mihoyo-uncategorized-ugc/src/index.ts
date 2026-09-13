// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoUncategorizedUGCClient } from "./mihoyoUncategorizedUGCClient.js";
export type {
  LevelApiGetCollectionTinyInfoResponse,
  LevelApiGetIndexRedpointResponse,
} from "./models/index.js";
export type { ApiResponseUgcTokenInfo } from "./models/uigf/mihoyo/index.js";
export type { UgcTokenInfo } from "./models/uigf/mihoyo/uncategorized/index.js";
export type { MihoyoUncategorizedUGCClientOptionalParams } from "./api/index.js";
export type {
  LevelApiGetCollectionTinyInfoOptionalParams,
  LevelApiGetIndexRedpointOptionalParams,
} from "./api/levelApi/index.js";
export type { TokenApiGetOptionalParams } from "./api/tokenApi/index.js";
export type { LevelApiOperations, TokenApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
