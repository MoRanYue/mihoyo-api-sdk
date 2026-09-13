// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameCNMiYouSheAccountContext } from "../../api/mihoyoGameCNMiYouSheAccountContext.js";
import { generate } from "../../api/authKeyApi/operations.js";
import { AuthKeyApiGenerateOptionalParams } from "../../api/authKeyApi/options.js";
import { AuthKeyRequest } from "../../models/uigf/mihoyo/game/models.js";
import { ApiResponseAuthKeyData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a AuthKeyApi operations. */
export interface AuthKeyApiOperations {
  generate: (
    cookie: string,
    body: AuthKeyRequest,
    options?: AuthKeyApiGenerateOptionalParams,
  ) => Promise<ApiResponseAuthKeyData>;
}

function _getAuthKeyApi(context: MihoyoGameCNMiYouSheAccountContext) {
  return {
    generate: (cookie: string, body: AuthKeyRequest, options?: AuthKeyApiGenerateOptionalParams) =>
      generate(context, cookie, body, options),
  };
}

export function _getAuthKeyApiOperations(
  context: MihoyoGameCNMiYouSheAccountContext,
): AuthKeyApiOperations {
  return {
    ..._getAuthKeyApi(context),
  };
}
