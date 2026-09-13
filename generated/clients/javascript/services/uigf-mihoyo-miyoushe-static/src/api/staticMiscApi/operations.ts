// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheStaticContext as Client } from "../index.js";
import {
  ApiResponseStaticResourceVersionsData,
  apiResponseStaticResourceVersionsDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { StaticMiscApiGetAllResourceVersionsOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getAllResourceVersionsSend(
  context: Client,
  options: StaticMiscApiGetAllResourceVersionsOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/misc/api/getAllStaticResourceVersions")
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

export async function _getAllResourceVersionsDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseStaticResourceVersionsData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseStaticResourceVersionsDataDeserializer(result.body);
}

export async function getAllResourceVersions(
  context: Client,
  options: StaticMiscApiGetAllResourceVersionsOptionalParams = { requestOptions: {} },
): Promise<ApiResponseStaticResourceVersionsData> {
  const result = await _getAllResourceVersionsSend(context, options);
  return _getAllResourceVersionsDeserialize(result);
}
