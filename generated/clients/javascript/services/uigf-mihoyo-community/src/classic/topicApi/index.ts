// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoCommunityContext } from "../../api/mihoyoCommunityContext.js";
import { getFullInfo } from "../../api/topicApi/operations.js";
import { TopicApiGetFullInfoOptionalParams } from "../../api/topicApi/options.js";
import { ApiResponseJsonObject } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a TopicApi operations. */
export interface TopicApiOperations {
  getFullInfo: (
    gids: string,
    id: string,
    options?: TopicApiGetFullInfoOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
}

function _getTopicApi(context: MihoyoCommunityContext) {
  return {
    getFullInfo: (gids: string, id: string, options?: TopicApiGetFullInfoOptionalParams) =>
      getFullInfo(context, gids, id, options),
  };
}

export function _getTopicApiOperations(context: MihoyoCommunityContext): TopicApiOperations {
  return {
    ..._getTopicApi(context),
  };
}
