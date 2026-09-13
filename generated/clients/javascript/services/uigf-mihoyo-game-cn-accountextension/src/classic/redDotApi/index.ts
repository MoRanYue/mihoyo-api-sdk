// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameCNAccountExtensionContext } from "../../api/mihoyoGameCNAccountExtensionContext.js";
import { getBatch } from "../../api/redDotApi/operations.js";
import { RedDotApiGetBatchOptionalParams } from "../../api/redDotApi/options.js";
import { ApiResponseRedDotBatchData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a RedDotApi operations. */
export interface RedDotApiOperations {
  getBatch: (
    authkey: string,
    authkeyVer: number,
    gameBiz: string,
    signType: number,
    users: string,
    options?: RedDotApiGetBatchOptionalParams,
  ) => Promise<ApiResponseRedDotBatchData>;
}

function _getRedDotApi(context: MihoyoGameCNAccountExtensionContext) {
  return {
    getBatch: (
      authkey: string,
      authkeyVer: number,
      gameBiz: string,
      signType: number,
      users: string,
      options?: RedDotApiGetBatchOptionalParams,
    ) => getBatch(context, authkey, authkeyVer, gameBiz, signType, users, options),
  };
}

export function _getRedDotApiOperations(
  context: MihoyoGameCNAccountExtensionContext,
): RedDotApiOperations {
  return {
    ..._getRedDotApi(context),
  };
}
