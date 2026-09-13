// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameCNMiYouSheAccountContext as Client } from "../index.js";
import { AuthKeyRequest, authKeyRequestSerializer } from "../../models/uigf/mihoyo/game/models.js";
import {
  ApiResponseAuthKeyData,
  apiResponseAuthKeyDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { AuthKeyApiGenerateOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _generateSend(
  context: Client,
  cookie: string,
  body: AuthKeyRequest,
  options: AuthKeyApiGenerateOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/account/auth/api/genAuthKey")
    .post({
      ...operationOptionsToRequestParameters(options),
      contentType: "application/json",
      headers: {
        cookie: cookie,
        ...(options?.ds !== undefined ? { ds: options?.ds } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
      body: authKeyRequestSerializer(body),
    });
}

export async function _generateDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseAuthKeyData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseAuthKeyDataDeserializer(result.body);
}

export async function generate(
  context: Client,
  cookie: string,
  body: AuthKeyRequest,
  options: AuthKeyApiGenerateOptionalParams = { requestOptions: {} },
): Promise<ApiResponseAuthKeyData> {
  const result = await _generateSend(context, cookie, body, options);
  return _generateDeserialize(result);
}
