// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoUncategorizedTelemetryH5CollectorContext as Client } from "../index.js";
import {
  H5CollectorUploadRequest,
  h5CollectorUploadRequestSerializer,
} from "../../models/uigf/mihoyo/api/request/models.js";
import {
  UploadResponse,
  uploadResponseDeserializer,
} from "../../models/uigf/mihoyo/uncategorized/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import { UploadApiUploadOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _uploadSend(
  context: Client,
  timestamp: number,
  verification: string,
  body: H5CollectorUploadRequest,
  options: UploadApiUploadOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/h5/upload{?timestamp,verification}",
    {
      timestamp: timestamp,
      verification: verification,
    },
    {
      allowReserved: options?.requestOptions?.skipUrlEncoding,
    },
  );
  return context
    .path(path)
    .post({
      ...operationOptionsToRequestParameters(options),
      contentType: "application/json",
      headers: {
        ...(options?.cookie !== undefined ? { cookie: options?.cookie } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
      body: h5CollectorUploadRequestSerializer(body),
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
  timestamp: number,
  verification: string,
  body: H5CollectorUploadRequest,
  options: UploadApiUploadOptionalParams = { requestOptions: {} },
): Promise<UploadResponse> {
  const result = await _uploadSend(context, timestamp, verification, body, options);
  return _uploadDeserialize(result);
}
