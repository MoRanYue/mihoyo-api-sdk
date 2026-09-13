// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoUncategorizedUGCContext } from "../../api/mihoyoUncategorizedUGCContext.js";
import { get } from "../../api/tokenApi/operations.js";
import { TokenApiGetOptionalParams } from "../../api/tokenApi/options.js";
import { ApiResponseUgcTokenInfo } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a TokenApi operations. */
export interface TokenApiOperations {
  get: (
    authkey: string,
    authAppid: string,
    lang: string,
    options?: TokenApiGetOptionalParams,
  ) => Promise<ApiResponseUgcTokenInfo>;
}

function _getTokenApi(context: MihoyoUncategorizedUGCContext) {
  return {
    get: (authkey: string, authAppid: string, lang: string, options?: TokenApiGetOptionalParams) =>
      get(context, authkey, authAppid, lang, options),
  };
}

export function _getTokenApiOperations(context: MihoyoUncategorizedUGCContext): TokenApiOperations {
  return {
    ..._getTokenApi(context),
  };
}
