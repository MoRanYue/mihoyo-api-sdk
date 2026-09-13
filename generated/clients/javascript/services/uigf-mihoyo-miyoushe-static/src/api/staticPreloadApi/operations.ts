// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheStaticContext as Client } from "../index.js";
import {
  ApiResponseStaticLatestVersionData,
  apiResponseStaticLatestVersionDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { StaticPreloadApiGetLatestVersionOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getLatestVersionSend(
  context: Client,
  ds: string,
  options: StaticPreloadApiGetLatestVersionOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/preload_resource/api/latest_version")
    .get({
      ...operationOptionsToRequestParameters(options),
      headers: {
        ...(options?.cookie !== undefined ? { cookie: options?.cookie } : {}),
        ds: ds,
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getLatestVersionDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseStaticLatestVersionData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseStaticLatestVersionDataDeserializer(result.body);
}

export async function getLatestVersion(
  context: Client,
  ds: string,
  options: StaticPreloadApiGetLatestVersionOptionalParams = { requestOptions: {} },
): Promise<ApiResponseStaticLatestVersionData> {
  const result = await _getLatestVersionSend(context, ds, options);
  return _getLatestVersionDeserialize(result);
}
