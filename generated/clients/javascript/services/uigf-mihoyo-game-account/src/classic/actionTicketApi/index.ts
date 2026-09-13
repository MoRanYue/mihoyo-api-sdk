// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameAccountContext } from "../../api/mihoyoGameAccountContext.js";
import { getBySToken } from "../../api/actionTicketApi/operations.js";
import { ActionTicketApiGetBySTokenOptionalParams } from "../../api/actionTicketApi/options.js";
import { ApiResponseJsonObject } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a ActionTicketApi operations. */
export interface ActionTicketApiOperations {
  getBySToken: (
    cookie: string,
    ds: string,
    actionType: string,
    stoken: string,
    uid: string,
    options?: ActionTicketApiGetBySTokenOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
}

function _getActionTicketApi(context: MihoyoGameAccountContext) {
  return {
    getBySToken: (
      cookie: string,
      ds: string,
      actionType: string,
      stoken: string,
      uid: string,
      options?: ActionTicketApiGetBySTokenOptionalParams,
    ) => getBySToken(context, cookie, ds, actionType, stoken, uid, options),
  };
}

export function _getActionTicketApiOperations(
  context: MihoyoGameAccountContext,
): ActionTicketApiOperations {
  return {
    ..._getActionTicketApi(context),
  };
}
