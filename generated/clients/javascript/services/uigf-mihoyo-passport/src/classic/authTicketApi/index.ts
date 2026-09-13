// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoPassportContext } from "../../api/mihoyoPassportContext.js";
import { createByGameBiz } from "../../api/authTicketApi/operations.js";
import { AuthTicketApiCreateByGameBizOptionalParams } from "../../api/authTicketApi/options.js";
import { ApiResponseTokenInfo } from "../../models/uigf/mihoyo/models.js";
import { AuthTicketRequest } from "../../models/uigf/mihoyo/passport/models.js";

/** Interface representing a AuthTicketApi operations. */
export interface AuthTicketApiOperations {
  /** Creates an action ticket for a game-biz authentication flow. */
  createByGameBiz: (
    body: AuthTicketRequest,
    options?: AuthTicketApiCreateByGameBizOptionalParams,
  ) => Promise<ApiResponseTokenInfo>;
}

function _getAuthTicketApi(context: MihoyoPassportContext) {
  return {
    createByGameBiz: (
      body: AuthTicketRequest,
      options?: AuthTicketApiCreateByGameBizOptionalParams,
    ) => createByGameBiz(context, body, options),
  };
}

export function _getAuthTicketApiOperations(
  context: MihoyoPassportContext,
): AuthTicketApiOperations {
  return {
    ..._getAuthTicketApi(context),
  };
}
