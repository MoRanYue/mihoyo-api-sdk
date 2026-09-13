// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoUncategorizedExperimentationContext } from "../../api/mihoyoUncategorizedExperimentationContext.js";
import { list } from "../../api/experimentApi/operations.js";
import { ExperimentApiListOptionalParams } from "../../api/experimentApi/options.js";
import {
  ExperimentListRequest,
  ExperimentListResponse,
} from "../../models/uigf/mihoyo/uncategorized/models.js";

/** Interface representing a ExperimentApi operations. */
export interface ExperimentApiOperations {
  list: (
    body: ExperimentListRequest,
    options?: ExperimentApiListOptionalParams,
  ) => Promise<ExperimentListResponse>;
}

function _getExperimentApi(context: MihoyoUncategorizedExperimentationContext) {
  return {
    list: (body: ExperimentListRequest, options?: ExperimentApiListOptionalParams) =>
      list(context, body, options),
  };
}

export function _getExperimentApiOperations(
  context: MihoyoUncategorizedExperimentationContext,
): ExperimentApiOperations {
  return {
    ..._getExperimentApi(context),
  };
}
