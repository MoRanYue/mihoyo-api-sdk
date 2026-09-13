// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext as Client } from "../index.js";
import {
  ApiResponseMobileVideoPermissionData,
  apiResponseMobileVideoPermissionDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { MobilePostApiGetPublishVideoPermissionOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getPublishVideoPermissionSend(
  context: Client,
  options: MobilePostApiGetPublishVideoPermissionOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/post/api/check/publishVideoPerm")
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

export async function _getPublishVideoPermissionDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileVideoPermissionData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileVideoPermissionDataDeserializer(result.body);
}

export async function getPublishVideoPermission(
  context: Client,
  options: MobilePostApiGetPublishVideoPermissionOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileVideoPermissionData> {
  const result = await _getPublishVideoPermissionSend(context, options);
  return _getPublishVideoPermissionDeserialize(result);
}
