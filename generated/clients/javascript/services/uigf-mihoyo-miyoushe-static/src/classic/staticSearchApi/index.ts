// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheStaticContext } from "../../api/mihoyoMiYouSheStaticContext.js";
import { getPreKeyword } from "../../api/staticSearchApi/operations.js";
import { StaticSearchApiGetPreKeywordOptionalParams } from "../../api/staticSearchApi/options.js";
import { ApiResponseStaticPreKeywordData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a StaticSearchApi operations. */
export interface StaticSearchApiOperations {
  getPreKeyword: (
    gameId: number,
    options?: StaticSearchApiGetPreKeywordOptionalParams,
  ) => Promise<ApiResponseStaticPreKeywordData>;
}

function _getStaticSearchApi(context: MihoyoMiYouSheStaticContext) {
  return {
    getPreKeyword: (gameId: number, options?: StaticSearchApiGetPreKeywordOptionalParams) =>
      getPreKeyword(context, gameId, options),
  };
}

export function _getStaticSearchApiOperations(
  context: MihoyoMiYouSheStaticContext,
): StaticSearchApiOperations {
  return {
    ..._getStaticSearchApi(context),
  };
}
