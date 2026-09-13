// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext as Client } from "../index.js";
import {
  ApiResponseMobileDiscussionData,
  apiResponseMobileDiscussionDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import { MobileForumApiGetDiscussionByGameOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getDiscussionByGameSend(
  context: Client,
  gids: number,
  version: number,
  options: MobileForumApiGetDiscussionByGameOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/forum/api/getDiscussionByGame{?gids,version}",
    {
      gids: gids,
      version: version,
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

export async function _getDiscussionByGameDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileDiscussionData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileDiscussionDataDeserializer(result.body);
}

export async function getDiscussionByGame(
  context: Client,
  gids: number,
  version: number,
  options: MobileForumApiGetDiscussionByGameOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileDiscussionData> {
  const result = await _getDiscussionByGameSend(context, gids, version, options);
  return _getDiscussionByGameDeserialize(result);
}
