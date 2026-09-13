// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoPassportContext as Client } from "../index.js";
import { ApiResponse, apiResponseDeserializer } from "../../models/uigf/mihoyo/models.js";
import { WebSessionApiVerifyCookieTokenOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _verifyCookieTokenSend(
  context: Client,
  cookie: string,
  options: WebSessionApiVerifyCookieTokenOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/account/ma-cn-session/web/verifyCookieToken")
    .post({
      ...operationOptionsToRequestParameters(options),
      headers: { cookie: cookie, accept: "application/json", ...options.requestOptions?.headers },
    });
}

export async function _verifyCookieTokenDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponse> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseDeserializer(result.body);
}

/** Verifies a caller-provided browser session cookie. */
export async function verifyCookieToken(
  context: Client,
  cookie: string,
  options: WebSessionApiVerifyCookieTokenOptionalParams = { requestOptions: {} },
): Promise<ApiResponse> {
  const result = await _verifyCookieTokenSend(context, cookie, options);
  return _verifyCookieTokenDeserialize(result);
}
