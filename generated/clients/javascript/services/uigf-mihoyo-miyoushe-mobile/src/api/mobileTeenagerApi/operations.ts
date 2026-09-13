// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext as Client } from "../index.js";
import {
  ApiResponseMobileTeenagerInfoData,
  apiResponseMobileTeenagerInfoDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { MobileTeenagerApiGetInfoOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getInfoSend(
  context: Client,
  options: MobileTeenagerApiGetInfoOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/teenager/api/info")
    .get({
      ...operationOptionsToRequestParameters(options),
      headers: {
        ...(options?.cookie !== undefined ? { cookie: options?.cookie } : {}),
        ...(options?.ds !== undefined ? { ds: options?.ds } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getInfoDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileTeenagerInfoData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileTeenagerInfoDataDeserializer(result.body);
}

export async function getInfo(
  context: Client,
  options: MobileTeenagerApiGetInfoOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileTeenagerInfoData> {
  const result = await _getInfoSend(context, options);
  return _getInfoDeserialize(result);
}
