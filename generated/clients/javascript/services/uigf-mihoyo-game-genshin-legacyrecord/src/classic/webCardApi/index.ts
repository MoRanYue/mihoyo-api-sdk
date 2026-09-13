// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameGenshinLegacyRecordContext } from "../../api/mihoyoGameGenshinLegacyRecordContext.js";
import { getGameRecordCard } from "../../api/webCardApi/operations.js";
import { WebCardApiGetGameRecordCardOptionalParams } from "../../api/webCardApi/options.js";
import { ApiResponseGenshinGameRecordCardData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a WebCardApi operations. */
export interface WebCardApiOperations {
  getGameRecordCard: (
    uid: string,
    options?: WebCardApiGetGameRecordCardOptionalParams,
  ) => Promise<ApiResponseGenshinGameRecordCardData>;
}

function _getWebCardApi(context: MihoyoGameGenshinLegacyRecordContext) {
  return {
    getGameRecordCard: (uid: string, options?: WebCardApiGetGameRecordCardOptionalParams) =>
      getGameRecordCard(context, uid, options),
  };
}

export function _getWebCardApiOperations(
  context: MihoyoGameGenshinLegacyRecordContext,
): WebCardApiOperations {
  return {
    ..._getWebCardApi(context),
  };
}
