// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoUncategorizedExperimentationClient } from "./mihoyoUncategorizedExperimentationClient.js";
export type { ApiResponseArray } from "./models/uigf/mihoyo/index.js";
export type {
  ExperimentListRequest,
  ExperimentParameter,
  ExperimentListResponse,
  ExperimentAssignment,
} from "./models/uigf/mihoyo/uncategorized/index.js";
export type { MihoyoUncategorizedExperimentationClientOptionalParams } from "./api/index.js";
export type { ExperimentApiListOptionalParams } from "./api/experimentApi/index.js";
export type { ExperimentApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
