// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoUncategorizedTelemetryLoginContext as Client } from "../index.js";
import {
  LoginTelemetryEvent,
  loginTelemetryEventArraySerializer,
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
  authorization: string,
  body: LoginTelemetryEvent[],
  options: UploadApiUploadOptionalParams = { requestOptions: {} },
): StreamableMethod {
  return context
    .path("/loginsdk/dataUpload")
    .post({
      ...operationOptionsToRequestParameters(options),
      contentType: "application/json",
      headers: {
        authorization: authorization,
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
      body: loginTelemetryEventArraySerializer(body),
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
  authorization: string,
  body: LoginTelemetryEvent[],
  options: UploadApiUploadOptionalParams = { requestOptions: {} },
): Promise<UploadResponse> {
  const result = await _uploadSend(context, authorization, body, options);
  return _uploadDeserialize(result);
}
