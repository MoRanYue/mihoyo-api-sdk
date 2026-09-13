// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext as Client } from "../index.js";
import {
  ApiResponseMobileUnreadInfoData,
  apiResponseMobileUnreadInfoDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { MobileTimelineApiGetUnreadInfoOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getUnreadInfoSend(
  context: Client,
  options: MobileTimelineApiGetUnreadInfoOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/timeline/api/getUnreadInfo")
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

export async function _getUnreadInfoDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileUnreadInfoData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileUnreadInfoDataDeserializer(result.body);
}

export async function getUnreadInfo(
  context: Client,
  options: MobileTimelineApiGetUnreadInfoOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileUnreadInfoData> {
  const result = await _getUnreadInfoSend(context, options);
  return _getUnreadInfoDeserialize(result);
}
