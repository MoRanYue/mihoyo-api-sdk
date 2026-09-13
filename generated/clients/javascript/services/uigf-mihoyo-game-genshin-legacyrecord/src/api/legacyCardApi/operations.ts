// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameGenshinLegacyRecordContext as Client } from "../index.js";
import {
  ApiResponseGenshinGameRecordCardData,
  apiResponseGenshinGameRecordCardDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import { LegacyCardApiGetGameRecordCardOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getGameRecordCardSend(
  context: Client,
  cookie: string,
  uid: string,
  options: LegacyCardApiGetGameRecordCardOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/game_record/card/api/getGameRecordCard{?uid}",
    {
      uid: uid,
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
        cookie: cookie,
        ...(options?.ds !== undefined ? { ds: options?.ds } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getGameRecordCardDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseGenshinGameRecordCardData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseGenshinGameRecordCardDataDeserializer(result.body);
}

export async function getGameRecordCard(
  context: Client,
  cookie: string,
  uid: string,
  options: LegacyCardApiGetGameRecordCardOptionalParams = { requestOptions: {} },
): Promise<ApiResponseGenshinGameRecordCardData> {
  const result = await _getGameRecordCardSend(context, cookie, uid, options);
  return _getGameRecordCardDeserialize(result);
}
