// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameCNHonkaiImpactContext } from "../../api/mihoyoGameCNHonkaiImpactContext.js";
import { getDailyNote } from "../../api/dailyNoteApi/operations.js";
import { DailyNoteApiGetDailyNoteOptionalParams } from "../../api/dailyNoteApi/options.js";
import { ApiResponseJsonObject } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a DailyNoteApi operations. */
export interface DailyNoteApiOperations {
  getDailyNote: (
    cookie: string,
    server: string,
    roleId: string,
    options?: DailyNoteApiGetDailyNoteOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
}

function _getDailyNoteApi(context: MihoyoGameCNHonkaiImpactContext) {
  return {
    getDailyNote: (
      cookie: string,
      server: string,
      roleId: string,
      options?: DailyNoteApiGetDailyNoteOptionalParams,
    ) => getDailyNote(context, cookie, server, roleId, options),
  };
}

export function _getDailyNoteApiOperations(
  context: MihoyoGameCNHonkaiImpactContext,
): DailyNoteApiOperations {
  return {
    ..._getDailyNoteApi(context),
  };
}
