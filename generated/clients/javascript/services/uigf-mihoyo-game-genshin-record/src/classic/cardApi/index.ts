// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameGenshinRecordContext } from "../../api/mihoyoGameGenshinRecordContext.js";
import { getGameRecordCard } from "../../api/cardApi/operations.js";
import { CardApiGetGameRecordCardOptionalParams } from "../../api/cardApi/options.js";
import { ApiResponseGenshinGameRecordCardData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a CardApi operations. */
export interface CardApiOperations {
  getGameRecordCard: (
    cookie: string,
    uid: string,
    options?: CardApiGetGameRecordCardOptionalParams,
  ) => Promise<ApiResponseGenshinGameRecordCardData>;
}

function _getCardApi(context: MihoyoGameGenshinRecordContext) {
  return {
    getGameRecordCard: (
      cookie: string,
      uid: string,
      options?: CardApiGetGameRecordCardOptionalParams,
    ) => getGameRecordCard(context, cookie, uid, options),
  };
}

export function _getCardApiOperations(context: MihoyoGameGenshinRecordContext): CardApiOperations {
  return {
    ..._getCardApi(context),
  };
}
