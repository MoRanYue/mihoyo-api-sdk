// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoPassportContext } from "../../api/mihoyoPassportContext.js";
import { verifyCookieToken } from "../../api/webSessionApi/operations.js";
import { WebSessionApiVerifyCookieTokenOptionalParams } from "../../api/webSessionApi/options.js";
import { ApiResponse } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a WebSessionApi operations. */
export interface WebSessionApiOperations {
  /** Verifies a caller-provided browser session cookie. */
  verifyCookieToken: (
    cookie: string,
    options?: WebSessionApiVerifyCookieTokenOptionalParams,
  ) => Promise<ApiResponse>;
}

function _getWebSessionApi(context: MihoyoPassportContext) {
  return {
    verifyCookieToken: (cookie: string, options?: WebSessionApiVerifyCookieTokenOptionalParams) =>
      verifyCookieToken(context, cookie, options),
  };
}

export function _getWebSessionApiOperations(
  context: MihoyoPassportContext,
): WebSessionApiOperations {
  return {
    ..._getWebSessionApi(context),
  };
}
