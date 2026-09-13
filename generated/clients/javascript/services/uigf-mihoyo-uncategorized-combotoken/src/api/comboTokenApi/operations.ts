// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoUncategorizedComboTokenContext as Client } from "../index.js";
import {
  ApiResponseComboTokenUploadCredentials,
  apiResponseComboTokenUploadCredentialsDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import {
  ComboTokenRequest,
  comboTokenRequestSerializer,
} from "../../models/uigf/mihoyo/uncategorized/models.js";
import { ComboTokenApiExchangeOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _exchangeSend(
  context: Client,
  body: ComboTokenRequest,
  options: ComboTokenApiExchangeOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/upload/outer/GetStByComboToken")
    .post({
      ...operationOptionsToRequestParameters(options),
      contentType: "application/json",
      headers: { accept: "application/json", ...options.requestOptions?.headers },
      body: comboTokenRequestSerializer(body),
    });
}

export async function _exchangeDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseComboTokenUploadCredentials> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseComboTokenUploadCredentialsDeserializer(result.body);
}

export async function exchange(
  context: Client,
  body: ComboTokenRequest,
  options: ComboTokenApiExchangeOptionalParams = { requestOptions: {} },
): Promise<ApiResponseComboTokenUploadCredentials> {
  const result = await _exchangeSend(context, body, options);
  return _exchangeDeserialize(result);
}
