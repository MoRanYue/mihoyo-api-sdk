// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameCNActivityContext as Client } from "../index.js";
import {
  ZenlessFeedbackCollectionRequest,
  zenlessFeedbackCollectionRequestSerializer,
} from "../../models/uigf/mihoyo/api/request/models.js";
import {
  ApiResponseZenlessFeedbackScheduleData,
  apiResponseZenlessFeedbackScheduleDataDeserializer,
  ApiResponseEmptyData,
  apiResponseEmptyDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import {
  ZenlessFeedbackApiCollectOptionalParams,
  ZenlessFeedbackApiGetCurrentScheduleOptionalParams,
} from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _collectSend(
  context: Client,
  body: ZenlessFeedbackCollectionRequest,
  options: ZenlessFeedbackApiCollectOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/event/nap_feedback/user/collect_feedback")
    .post({
      ...operationOptionsToRequestParameters(options),
      contentType: "application/json",
      headers: {
        ...(options?.cookie !== undefined ? { cookie: options?.cookie } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
      body: zenlessFeedbackCollectionRequestSerializer(body),
    });
}

export async function _collectDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseEmptyData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseEmptyDataDeserializer(result.body);
}

export async function collect(
  context: Client,
  body: ZenlessFeedbackCollectionRequest,
  options: ZenlessFeedbackApiCollectOptionalParams = { requestOptions: {} },
): Promise<ApiResponseEmptyData> {
  const result = await _collectSend(context, body, options);
  return _collectDeserialize(result);
}

export function _getCurrentScheduleSend(
  context: Client,
  region: string,
  source: number,
  toolType: number,
  uid: number,
  options: ZenlessFeedbackApiGetCurrentScheduleOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/event/nap_feedback/user/get_cur_schedule{?region,source,tool_type,uid}",
    {
      region: region,
      source: source,
      tool_type: toolType,
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
        ...(options?.cookie !== undefined ? { cookie: options?.cookie } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getCurrentScheduleDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseZenlessFeedbackScheduleData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseZenlessFeedbackScheduleDataDeserializer(result.body);
}

export async function getCurrentSchedule(
  context: Client,
  region: string,
  source: number,
  toolType: number,
  uid: number,
  options: ZenlessFeedbackApiGetCurrentScheduleOptionalParams = { requestOptions: {} },
): Promise<ApiResponseZenlessFeedbackScheduleData> {
  const result = await _getCurrentScheduleSend(context, region, source, toolType, uid, options);
  return _getCurrentScheduleDeserialize(result);
}
