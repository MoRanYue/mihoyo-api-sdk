// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameAccountContext } from "../../api/mihoyoGameAccountContext.js";
import { getRoles, generateAuthKey } from "../../api/bindingApi/operations.js";
import {
  BindingApiGetRolesOptionalParams,
  BindingApiGenerateAuthKeyOptionalParams,
} from "../../api/bindingApi/options.js";
import { AuthKeyRequest } from "../../models/uigf/mihoyo/game/models.js";
import { ApiResponseJsonObject, ApiResponseGameRoleList } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a BindingApi operations. */
export interface BindingApiOperations {
  /** Lists game roles that are bound to the authenticated community account. */
  getRoles: (
    cookie: string,
    options?: BindingApiGetRolesOptionalParams,
  ) => Promise<ApiResponseGameRoleList>;
  /** Generates an authenticated gacha authkey for a selected game role. */
  generateAuthKey: (
    cookie: string,
    body: AuthKeyRequest,
    options?: BindingApiGenerateAuthKeyOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
}

function _getBindingApi(context: MihoyoGameAccountContext) {
  return {
    getRoles: (cookie: string, options?: BindingApiGetRolesOptionalParams) =>
      getRoles(context, cookie, options),
    generateAuthKey: (
      cookie: string,
      body: AuthKeyRequest,
      options?: BindingApiGenerateAuthKeyOptionalParams,
    ) => generateAuthKey(context, cookie, body, options),
  };
}

export function _getBindingApiOperations(context: MihoyoGameAccountContext): BindingApiOperations {
  return {
    ..._getBindingApi(context),
  };
}
