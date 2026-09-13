// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameCNAccountExtensionContext as Client } from "../index.js";
import {
  ApiResponsePatchData,
  apiResponsePatchDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import { PatchApiGetPatchOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getPatchSend(
  context: Client,
  appId: number,
  appVersion: string,
  channel: string,
  gameVersion: string,
  options: PatchApiGetPatchOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/ptolemaios_api/api/getPatch{?app_id,app_version,channel,game_version}",
    {
      app_id: appId,
      app_version: appVersion,
      channel: channel,
      game_version: gameVersion,
    },
    {
      allowReserved: options?.requestOptions?.skipUrlEncoding,
    },
  );
  return context
    .path(path)
    .get({
      ...operationOptionsToRequestParameters(options),
      headers: { accept: "application/json", ...options.requestOptions?.headers },
    });
}

export async function _getPatchDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponsePatchData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponsePatchDataDeserializer(result.body);
}

export async function getPatch(
  context: Client,
  appId: number,
  appVersion: string,
  channel: string,
  gameVersion: string,
  options: PatchApiGetPatchOptionalParams = { requestOptions: {} },
): Promise<ApiResponsePatchData> {
  const result = await _getPatchSend(context, appId, appVersion, channel, gameVersion, options);
  return _getPatchDeserialize(result);
}
