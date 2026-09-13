// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameGenshinLoginContext } from "../../api/mihoyoGameGenshinLoginContext.js";
import { login } from "../../api/granterApi/operations.js";
import { GranterApiLoginOptionalParams } from "../../api/granterApi/options.js";
import { GranterLoginRequest } from "../../models/uigf/mihoyo/game/genshin/sdk/models.js";
import { ApiResponseGranterLoginData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a GranterApi operations. */
export interface GranterApiOperations {
  /** Submits the caller-provided official granter login payload. */
  login: (
    body: GranterLoginRequest,
    options?: GranterApiLoginOptionalParams,
  ) => Promise<ApiResponseGranterLoginData>;
}

function _getGranterApi(context: MihoyoGameGenshinLoginContext) {
  return {
    login: (body: GranterLoginRequest, options?: GranterApiLoginOptionalParams) =>
      login(context, body, options),
  };
}

export function _getGranterApiOperations(
  context: MihoyoGameGenshinLoginContext,
): GranterApiOperations {
  return {
    ..._getGranterApi(context),
  };
}
