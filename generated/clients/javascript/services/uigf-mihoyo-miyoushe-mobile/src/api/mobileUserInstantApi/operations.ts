// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheMobileContext as Client } from "../index.js";
import {
  ApiResponseMobileEntityReviewData,
  apiResponseMobileEntityReviewDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import { MobileUserInstantApiGetEntityReviewOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getEntityReviewSend(
  context: Client,
  ds: string,
  offset: number,
  size: number,
  options: MobileUserInstantApiGetEntityReviewOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/user_instant/api/entity/review{?offset,size}",
    {
      offset: offset,
      size: size,
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

export async function _getEntityReviewDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseMobileEntityReviewData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseMobileEntityReviewDataDeserializer(result.body);
}

export async function getEntityReview(
  context: Client,
  ds: string,
  offset: number,
  size: number,
  options: MobileUserInstantApiGetEntityReviewOptionalParams = { requestOptions: {} },
): Promise<ApiResponseMobileEntityReviewData> {
  const result = await _getEntityReviewSend(context, ds, offset, size, options);
  return _getEntityReviewDeserialize(result);
}
