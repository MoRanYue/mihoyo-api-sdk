// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameCNAccountExtensionContext as Client } from "../index.js";
import {
  ApiResponseRedDotBatchData,
  apiResponseRedDotBatchDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import { RedDotApiGetBatchOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getBatchSend(
  context: Client,
  ds: string,
  authkey: string,
  authkeyVer: number,
  gameBiz: string,
  signType: number,
  users: string,
  options: RedDotApiGetBatchOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/common/csc_qna/public/batchGetRedDot{?authkey,authkey_ver,game_biz,sign_type,users}",
    {
      authkey: authkey,
      authkey_ver: authkeyVer,
      game_biz: gameBiz,
      sign_type: signType,
      users: users,
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

export async function _getBatchDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseRedDotBatchData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseRedDotBatchDataDeserializer(result.body);
}

export async function getBatch(
  context: Client,
  ds: string,
  authkey: string,
  authkeyVer: number,
  gameBiz: string,
  signType: number,
  users: string,
  options: RedDotApiGetBatchOptionalParams = { requestOptions: {} },
): Promise<ApiResponseRedDotBatchData> {
  const result = await _getBatchSend(
    context,
    ds,
    authkey,
    authkeyVer,
    gameBiz,
    signType,
    users,
    options,
  );
  return _getBatchDeserialize(result);
}
