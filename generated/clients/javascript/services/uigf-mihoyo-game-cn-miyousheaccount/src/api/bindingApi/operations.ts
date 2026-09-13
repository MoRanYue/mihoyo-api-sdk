// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameCNMiYouSheAccountContext as Client } from "../index.js";
import {
  ApiResponseGameRoleList,
  apiResponseGameRoleListDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { BindingApiGetRolesOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getRolesSend(
  context: Client,
  cookie: string,
  options: BindingApiGetRolesOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/binding/api/getUserGameRolesByStoken")
    .get({
      ...operationOptionsToRequestParameters(options),
      headers: {
        cookie: cookie,
        ...(options?.ds !== undefined ? { ds: options?.ds } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getRolesDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseGameRoleList> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseGameRoleListDeserializer(result.body);
}

export async function getRoles(
  context: Client,
  cookie: string,
  options: BindingApiGetRolesOptionalParams = { requestOptions: {} },
): Promise<ApiResponseGameRoleList> {
  const result = await _getRolesSend(context, cookie, options);
  return _getRolesDeserialize(result);
}
