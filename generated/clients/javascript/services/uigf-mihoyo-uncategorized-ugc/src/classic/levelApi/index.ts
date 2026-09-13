// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoUncategorizedUGCContext } from "../../api/mihoyoUncategorizedUGCContext.js";
import { getCollectionTinyInfo, getIndexRedpoint } from "../../api/levelApi/operations.js";
import {
  LevelApiGetCollectionTinyInfoOptionalParams,
  LevelApiGetIndexRedpointOptionalParams,
} from "../../api/levelApi/options.js";
import {
  LevelApiGetCollectionTinyInfoResponse,
  LevelApiGetIndexRedpointResponse,
} from "../../models/models.js";

/** Interface representing a LevelApi operations. */
export interface LevelApiOperations {
  /** The gateway payload is opaque protobuf data. */
  getCollectionTinyInfo: (
    body: Uint8Array,
    options?: LevelApiGetCollectionTinyInfoOptionalParams,
  ) => Promise<LevelApiGetCollectionTinyInfoResponse>;
  /** Uses the vendor's protobuf media type. */
  getIndexRedpoint: (
    options?: LevelApiGetIndexRedpointOptionalParams,
  ) => Promise<LevelApiGetIndexRedpointResponse>;
}

function _getLevelApi(context: MihoyoUncategorizedUGCContext) {
  return {
    getCollectionTinyInfo: (
      body: Uint8Array,
      options?: LevelApiGetCollectionTinyInfoOptionalParams,
    ) => getCollectionTinyInfo(context, body, options),
    getIndexRedpoint: (options?: LevelApiGetIndexRedpointOptionalParams) =>
      getIndexRedpoint(context, options),
  };
}

export function _getLevelApiOperations(context: MihoyoUncategorizedUGCContext): LevelApiOperations {
  return {
    ..._getLevelApi(context),
  };
}
