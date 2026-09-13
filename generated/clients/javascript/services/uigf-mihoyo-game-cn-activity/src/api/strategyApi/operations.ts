// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameCNActivityContext as Client } from "../index.js";
import {
  ApiResponseStrategyLatestContentData,
  apiResponseStrategyLatestContentDataDeserializer,
  ApiResponseStrategyHomeInfoData,
  apiResponseStrategyHomeInfoDataDeserializer,
  ApiResponseStrategyHomeNavbarData,
  apiResponseStrategyHomeNavbarDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import {
  StrategyApiGetHomeNavbarOptionalParams,
  StrategyApiGetHomeInfoOptionalParams,
  StrategyApiGetLatestContentOptionalParams,
} from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getHomeNavbarSend(
  context: Client,
  appSn: string,
  options: StrategyApiGetHomeNavbarOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/common/blackboard/ys_strategy/v1/home/index/navbar{?app_sn}",
    {
      app_sn: appSn,
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

export async function _getHomeNavbarDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseStrategyHomeNavbarData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseStrategyHomeNavbarDataDeserializer(result.body);
}

export async function getHomeNavbar(
  context: Client,
  appSn: string,
  options: StrategyApiGetHomeNavbarOptionalParams = { requestOptions: {} },
): Promise<ApiResponseStrategyHomeNavbarData> {
  const result = await _getHomeNavbarSend(context, appSn, options);
  return _getHomeNavbarDeserialize(result);
}

export function _getHomeInfoSend(
  context: Client,
  appSn: string,
  options: StrategyApiGetHomeInfoOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/common/blackboard/ys_strategy/v1/home/index/info{?app_sn}",
    {
      app_sn: appSn,
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

export async function _getHomeInfoDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseStrategyHomeInfoData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseStrategyHomeInfoDataDeserializer(result.body);
}

export async function getHomeInfo(
  context: Client,
  appSn: string,
  options: StrategyApiGetHomeInfoOptionalParams = { requestOptions: {} },
): Promise<ApiResponseStrategyHomeInfoData> {
  const result = await _getHomeInfoSend(context, appSn, options);
  return _getHomeInfoDeserialize(result);
}

export function _getLatestContentSend(
  context: Client,
  appSn: string,
  options: StrategyApiGetLatestContentOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/common/blackboard/ys_strategy/v1/content/latest{?app_sn}",
    {
      app_sn: appSn,
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

export async function _getLatestContentDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseStrategyLatestContentData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseStrategyLatestContentDataDeserializer(result.body);
}

export async function getLatestContent(
  context: Client,
  appSn: string,
  options: StrategyApiGetLatestContentOptionalParams = { requestOptions: {} },
): Promise<ApiResponseStrategyLatestContentData> {
  const result = await _getLatestContentSend(context, appSn, options);
  return _getLatestContentDeserialize(result);
}
