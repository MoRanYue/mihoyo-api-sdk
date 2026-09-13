// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext as Client } from "../index.js";
import {
  ApiResponseMobileUserSettingsData,
  apiResponseMobileUserSettingsDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { MobileChatApiGetUserSettingsOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getUserSettingsSend(
  context: Client,
  ds: string,
  options: MobileChatApiGetUserSettingsOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/chat/api/getUserSettings")
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

export async function _getUserSettingsDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileUserSettingsData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileUserSettingsDataDeserializer(result.body);
}

export async function getUserSettings(
  context: Client,
  ds: string,
  options: MobileChatApiGetUserSettingsOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileUserSettingsData> {
  const result = await _getUserSettingsSend(context, ds, options);
  return _getUserSettingsDeserialize(result);
}
