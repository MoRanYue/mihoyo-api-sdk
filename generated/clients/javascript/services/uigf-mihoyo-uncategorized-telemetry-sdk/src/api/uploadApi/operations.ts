// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoUncategorizedTelemetrySDKContext as Client } from "../index.js";
import {
  SdkTelemetryUploadEvent,
  sdkTelemetryUploadEventArraySerializer,
} from "../../models/uigf/mihoyo/api/request/models.js";
import {
  UploadResponse,
  uploadResponseDeserializer,
} from "../../models/uigf/mihoyo/uncategorized/models.js";
import { UploadApiUploadOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _uploadSend(
  context: Client,
  body: SdkTelemetryUploadEvent[],
  options: UploadApiUploadOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/sdk/dataUpload")
    .post({
      ...operationOptionsToRequestParameters(options),
      contentType: "application/json",
      headers: {
        ...(options?.authorization !== undefined ? { authorization: options?.authorization } : {}),
        ...(options?.contentMd5 !== undefined ? { "content-md5": options?.contentMd5 } : {}),
        ...(options?.dateParam !== undefined ? { date: options?.dateParam } : {}),
        ...(options?.cmsSignature !== undefined ? { "cms-signature": options?.cmsSignature } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
      body: sdkTelemetryUploadEventArraySerializer(body),
    });
}

export async function _uploadDeserialize(result: PathUncheckedResponse): Promise<UploadResponse> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return uploadResponseDeserializer(result.body);
}

export async function upload(
  context: Client,
  body: SdkTelemetryUploadEvent[],
  options: UploadApiUploadOptionalParams = { requestOptions: {} },
): Promise<UploadResponse> {
  const result = await _uploadSend(context, body, options);
  return _uploadDeserialize(result);
}
