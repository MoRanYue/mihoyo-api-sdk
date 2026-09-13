// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameGenshinLegacyRecordContext } from "../../api/mihoyoGameGenshinLegacyRecordContext.js";
import { getGameRecordCard } from "../../api/legacyCardApi/operations.js";
import { LegacyCardApiGetGameRecordCardOptionalParams } from "../../api/legacyCardApi/options.js";
import { ApiResponseGenshinGameRecordCardData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a LegacyCardApi operations. */
export interface LegacyCardApiOperations {
  getGameRecordCard: (
    cookie: string,
    uid: string,
    options?: LegacyCardApiGetGameRecordCardOptionalParams,
  ) => Promise<ApiResponseGenshinGameRecordCardData>;
}

function _getLegacyCardApi(context: MihoyoGameGenshinLegacyRecordContext) {
  return {
    getGameRecordCard: (
      cookie: string,
      uid: string,
      options?: LegacyCardApiGetGameRecordCardOptionalParams,
    ) => getGameRecordCard(context, cookie, uid, options),
  };
}

export function _getLegacyCardApiOperations(
  context: MihoyoGameGenshinLegacyRecordContext,
): LegacyCardApiOperations {
  return {
    ..._getLegacyCardApi(context),
  };
}
