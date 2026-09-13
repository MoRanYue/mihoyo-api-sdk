// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameCNMiYouSheAccountContext as Client } from "../index.js";
import {
  ApiResponseReleaseData,
  apiResponseReleaseDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import { ReleaseApiGetLatestReleaseOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getLatestReleaseSend(
  context: Client,
  deviceCpuBitType: number,
  options: ReleaseApiGetLatestReleaseOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/ptolemaios_api/api/getLatestRelease{?device_cpu_bit_type}",
    {
      device_cpu_bit_type: deviceCpuBitType,
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
        ...(options?.ds !== undefined ? { ds: options?.ds } : {}),
        accept: "application/json",
        ...options.requestOptions?.headers,
      },
    });
}

export async function _getLatestReleaseDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseReleaseData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseReleaseDataDeserializer(result.body);
}

export async function getLatestRelease(
  context: Client,
  deviceCpuBitType: number,
  options: ReleaseApiGetLatestReleaseOptionalParams = { requestOptions: {} },
): Promise<ApiResponseReleaseData> {
  const result = await _getLatestReleaseSend(context, deviceCpuBitType, options);
  return _getLatestReleaseDeserialize(result);
}
