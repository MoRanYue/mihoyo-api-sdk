// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext as Client } from "../index.js";
import {
  ApiResponseMobileGameCenterData,
  apiResponseMobileGameCenterDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import { MobileReceptionApiGetGameCenterOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getGameCenterSend(
  context: Client,
  ds: string,
  cpu: string,
  device: string,
  options: MobileReceptionApiGetGameCenterOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/reception/api/gameCenter{?cpu,device}",
    {
      cpu: cpu,
      device: device,
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
        ds: ds,
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getGameCenterDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileGameCenterData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileGameCenterDataDeserializer(result.body);
}

export async function getGameCenter(
  context: Client,
  ds: string,
  cpu: string,
  device: string,
  options: MobileReceptionApiGetGameCenterOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileGameCenterData> {
  const result = await _getGameCenterSend(context, ds, cpu, device, options);
  return _getGameCenterDeserialize(result);
}
