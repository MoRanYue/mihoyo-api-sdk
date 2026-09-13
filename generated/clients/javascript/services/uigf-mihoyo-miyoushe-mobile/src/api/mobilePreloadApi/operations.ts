// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext as Client } from "../index.js";
import {
  MobilePreloadConfigRequest,
  mobilePreloadConfigRequestSerializer,
} from "../../models/uigf/mihoyo/api/request/models.js";
import {
  ApiResponseMobilePreloadConfigData,
  apiResponseMobilePreloadConfigDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { MobilePreloadApiGetLatestConfigOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getLatestConfigSend(
  context: Client,
  body: MobilePreloadConfigRequest,
  options: MobilePreloadApiGetLatestConfigOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/preload_resource/api/rn/get_latest_config")
    .post({
      ...operationOptionsToRequestParameters(options),
      contentType: "application/json",
      headers: {
        ...(options?.cookie !== undefined ? { cookie: options?.cookie } : {}),
        ...(options?.ds !== undefined ? { ds: options?.ds } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
      body: mobilePreloadConfigRequestSerializer(body),
    });
}

export async function _getLatestConfigDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobilePreloadConfigData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobilePreloadConfigDataDeserializer(result.body);
}

export async function getLatestConfig(
  context: Client,
  body: MobilePreloadConfigRequest,
  options: MobilePreloadApiGetLatestConfigOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobilePreloadConfigData> {
  const result = await _getLatestConfigSend(context, body, options);
  return _getLatestConfigDeserialize(result);
}
