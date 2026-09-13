// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheStaticContext as Client } from "../index.js";
import {
  ApiResponseStaticPreKeywordData,
  apiResponseStaticPreKeywordDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import { StaticSearchApiGetPreKeywordOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getPreKeywordSend(
  context: Client,
  gameId: number,
  options: StaticSearchApiGetPreKeywordOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/search/api/search/pre_keyword{?game_id}",
    {
      game_id: gameId,
    },
    {
      allowReserved: options?.requestOptions?.skipUrlEncoding,
    },
  );
  return context
    .path(path)
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

export async function _getPreKeywordDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseStaticPreKeywordData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseStaticPreKeywordDataDeserializer(result.body);
}

export async function getPreKeyword(
  context: Client,
  gameId: number,
  options: StaticSearchApiGetPreKeywordOptionalParams = { requestOptions: {} },
): Promise<ApiResponseStaticPreKeywordData> {
  const result = await _getPreKeywordSend(context, gameId, options);
  return _getPreKeywordDeserialize(result);
}
