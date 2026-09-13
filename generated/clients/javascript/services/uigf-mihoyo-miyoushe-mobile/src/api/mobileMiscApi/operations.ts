// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext as Client } from "../index.js";
import {
  ApiResponseMobileEmoticonData,
  apiResponseMobileEmoticonDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { MobileMiscApiGetRecentEmoticonsOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getRecentEmoticonsSend(
  context: Client,
  options: MobileMiscApiGetRecentEmoticonsOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/misc/api/recentEmoticonList")
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

export async function _getRecentEmoticonsDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileEmoticonData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileEmoticonDataDeserializer(result.body);
}

export async function getRecentEmoticons(
  context: Client,
  options: MobileMiscApiGetRecentEmoticonsOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileEmoticonData> {
  const result = await _getRecentEmoticonsSend(context, options);
  return _getRecentEmoticonsDeserialize(result);
}
