// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheStaticContext as Client } from "../index.js";
import {
  ApiResponseStaticResourceData,
  apiResponseStaticResourceDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import { StaticApiHubGetStaticResourceOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getStaticResourceSend(
  context: Client,
  clientType: number,
  options: StaticApiHubGetStaticResourceOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/apihub/api/staticResource{?client_type}",
    {
      client_type: clientType,
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

export async function _getStaticResourceDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseStaticResourceData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseStaticResourceDataDeserializer(result.body);
}

export async function getStaticResource(
  context: Client,
  clientType: number,
  options: StaticApiHubGetStaticResourceOptionalParams = { requestOptions: {} },
): Promise<ApiResponseStaticResourceData> {
  const result = await _getStaticResourceSend(context, clientType, options);
  return _getStaticResourceDeserialize(result);
}
