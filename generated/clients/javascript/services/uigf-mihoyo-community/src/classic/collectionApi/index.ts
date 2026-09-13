// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoCommunityContext } from "../../api/mihoyoCommunityContext.js";
import { getDetail } from "../../api/collectionApi/operations.js";
import { CollectionApiGetDetailOptionalParams } from "../../api/collectionApi/options.js";
import { ApiResponseJsonObject } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a CollectionApi operations. */
export interface CollectionApiOperations {
  getDetail: (
    gids: number,
    id: string,
    options?: CollectionApiGetDetailOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
}

function _getCollectionApi(context: MihoyoCommunityContext) {
  return {
    getDetail: (gids: number, id: string, options?: CollectionApiGetDetailOptionalParams) =>
      getDetail(context, gids, id, options),
  };
}

export function _getCollectionApiOperations(
  context: MihoyoCommunityContext,
): CollectionApiOperations {
  return {
    ..._getCollectionApi(context),
  };
}
