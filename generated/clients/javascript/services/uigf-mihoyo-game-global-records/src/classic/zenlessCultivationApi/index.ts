// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameGlobalRecordsContext } from "../../api/mihoyoGameGlobalRecordsContext.js";
import { getIconInfo, getItems } from "../../api/zenlessCultivationApi/operations.js";
import {
  ZenlessCultivationApiGetIconInfoOptionalParams,
  ZenlessCultivationApiGetItemsOptionalParams,
} from "../../api/zenlessCultivationApi/options.js";
import { ApiResponseJsonObject } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a ZenlessCultivationApi operations. */
export interface ZenlessCultivationApiOperations {
  getIconInfo: (
    cookie: string,
    uid: string,
    region: string,
    options?: ZenlessCultivationApiGetIconInfoOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  getItems: (
    cookie: string,
    uid: string,
    region: string,
    avatarId: number,
    options?: ZenlessCultivationApiGetItemsOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
}

function _getZenlessCultivationApi(context: MihoyoGameGlobalRecordsContext) {
  return {
    getIconInfo: (
      cookie: string,
      uid: string,
      region: string,
      options?: ZenlessCultivationApiGetIconInfoOptionalParams,
    ) => getIconInfo(context, cookie, uid, region, options),
    getItems: (
      cookie: string,
      uid: string,
      region: string,
      avatarId: number,
      options?: ZenlessCultivationApiGetItemsOptionalParams,
    ) => getItems(context, cookie, uid, region, avatarId, options),
  };
}

export function _getZenlessCultivationApiOperations(
  context: MihoyoGameGlobalRecordsContext,
): ZenlessCultivationApiOperations {
  return {
    ..._getZenlessCultivationApi(context),
  };
}
