// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameAccountContext } from "../../api/mihoyoGameAccountContext.js";
import { exchangeGameToken } from "../../api/gameTokenApi/operations.js";
import { GameTokenApiExchangeGameTokenOptionalParams } from "../../api/gameTokenApi/options.js";
import { ApiResponseTokenInfo } from "../../models/uigf/mihoyo/models.js";
import { GameTokenRequest } from "../../models/uigf/mihoyo/passport/models.js";

/** Interface representing a GameTokenApi operations. */
export interface GameTokenApiOperations {
  /** Exchanges the official game-token QR-login result for a session token. */
  exchangeGameToken: (
    body: GameTokenRequest,
    options?: GameTokenApiExchangeGameTokenOptionalParams,
  ) => Promise<ApiResponseTokenInfo>;
}

function _getGameTokenApi(context: MihoyoGameAccountContext) {
  return {
    exchangeGameToken: (
      body: GameTokenRequest,
      options?: GameTokenApiExchangeGameTokenOptionalParams,
    ) => exchangeGameToken(context, body, options),
  };
}

export function _getGameTokenApiOperations(
  context: MihoyoGameAccountContext,
): GameTokenApiOperations {
  return {
    ..._getGameTokenApi(context),
  };
}
