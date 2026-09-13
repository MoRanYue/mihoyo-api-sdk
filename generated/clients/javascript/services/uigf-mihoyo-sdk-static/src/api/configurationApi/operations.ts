// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoSDKStaticContext as Client } from "../index.js";
import {
  ApiResponseSdkPorteData,
  apiResponseSdkPorteDataDeserializer,
  ApiResponseSdkFeCnConfigData,
  apiResponseSdkFeCnConfigDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import {
  ConfigurationApiGetFeCnConfigOptionalParams,
  ConfigurationApiGetCnPorteOptionalParams,
} from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getFeCnConfigSend(
  context: Client,
  typeParam: string,
  options: ConfigurationApiGetFeCnConfigOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/combo/box/api/config/porte-fe-cn/config{?type}",
    {
      type: typeParam,
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

export async function _getFeCnConfigDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseSdkFeCnConfigData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseSdkFeCnConfigDataDeserializer(result.body);
}

export async function getFeCnConfig(
  context: Client,
  typeParam: string,
  options: ConfigurationApiGetFeCnConfigOptionalParams = { requestOptions: {} },
): Promise<ApiResponseSdkFeCnConfigData> {
  const result = await _getFeCnConfigSend(context, typeParam, options);
  return _getFeCnConfigDeserialize(result);
}

export function _getCnPorteSend(
  context: Client,
  appId: string,
  clientType: number,
  options: ConfigurationApiGetCnPorteOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/combo/box/api/config/porte-cn/porte{?app_id,client_type}",
    {
      app_id: appId,
      client_type: clientType,
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

export async function _getCnPorteDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseSdkPorteData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseSdkPorteDataDeserializer(result.body);
}

export async function getCnPorte(
  context: Client,
  appId: string,
  clientType: number,
  options: ConfigurationApiGetCnPorteOptionalParams = { requestOptions: {} },
): Promise<ApiResponseSdkPorteData> {
  const result = await _getCnPorteSend(context, appId, clientType, options);
  return _getCnPorteDeserialize(result);
}
