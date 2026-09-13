// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameCNMiYouSheAccountContext } from "../../api/mihoyoGameCNMiYouSheAccountContext.js";
import { getRoles } from "../../api/bindingApi/operations.js";
import { BindingApiGetRolesOptionalParams } from "../../api/bindingApi/options.js";
import { ApiResponseGameRoleList } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a BindingApi operations. */
export interface BindingApiOperations {
  getRoles: (
    cookie: string,
    options?: BindingApiGetRolesOptionalParams,
  ) => Promise<ApiResponseGameRoleList>;
}

function _getBindingApi(context: MihoyoGameCNMiYouSheAccountContext) {
  return {
    getRoles: (cookie: string, options?: BindingApiGetRolesOptionalParams) =>
      getRoles(context, cookie, options),
  };
}

export function _getBindingApiOperations(
  context: MihoyoGameCNMiYouSheAccountContext,
): BindingApiOperations {
  return {
    ..._getBindingApi(context),
  };
}
