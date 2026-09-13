// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameGlobalCommunityRecordsContext } from "../../api/mihoyoGameGlobalCommunityRecordsContext.js";
import { getDailyNote, getIndex } from "../../api/honkaiImpactApi/operations.js";
import {
  HonkaiImpactApiGetDailyNoteOptionalParams,
  HonkaiImpactApiGetIndexOptionalParams,
} from "../../api/honkaiImpactApi/options.js";
import { ApiResponseJsonObject } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a HonkaiImpactApi operations. */
export interface HonkaiImpactApiOperations {
  getDailyNote: (
    cookie: string,
    server: string,
    roleId: string,
    options?: HonkaiImpactApiGetDailyNoteOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  getIndex: (
    cookie: string,
    server: string,
    roleId: string,
    options?: HonkaiImpactApiGetIndexOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
}

function _getHonkaiImpactApi(context: MihoyoGameGlobalCommunityRecordsContext) {
  return {
    getDailyNote: (
      cookie: string,
      server: string,
      roleId: string,
      options?: HonkaiImpactApiGetDailyNoteOptionalParams,
    ) => getDailyNote(context, cookie, server, roleId, options),
    getIndex: (
      cookie: string,
      server: string,
      roleId: string,
      options?: HonkaiImpactApiGetIndexOptionalParams,
    ) => getIndex(context, cookie, server, roleId, options),
  };
}

export function _getHonkaiImpactApiOperations(
  context: MihoyoGameGlobalCommunityRecordsContext,
): HonkaiImpactApiOperations {
  return {
    ..._getHonkaiImpactApi(context),
  };
}
