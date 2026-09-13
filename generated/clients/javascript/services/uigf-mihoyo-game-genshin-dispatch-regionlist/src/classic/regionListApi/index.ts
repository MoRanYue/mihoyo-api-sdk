// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameGenshinDispatchRegionListContext } from "../../api/mihoyoGameGenshinDispatchRegionListContext.js";
import { query } from "../../api/regionListApi/operations.js";
import { RegionListApiQueryOptionalParams } from "../../api/regionListApi/options.js";
import { RegionListApiQueryResponse } from "../../models/models.js";

/** Interface representing a RegionListApi operations. */
export interface RegionListApiOperations {
  query: (options?: RegionListApiQueryOptionalParams) => Promise<RegionListApiQueryResponse>;
}

function _getRegionListApi(context: MihoyoGameGenshinDispatchRegionListContext) {
  return {
    query: (options?: RegionListApiQueryOptionalParams) => query(context, options),
  };
}

export function _getRegionListApiOperations(
  context: MihoyoGameGenshinDispatchRegionListContext,
): RegionListApiOperations {
  return {
    ..._getRegionListApi(context),
  };
}
