// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameCNEventsContext as Client } from "../index.js";
import {
  ApiResponseJsonObject,
  apiResponseJsonObjectDeserializer,
  ApiResponseZenlessLedgerMonthInfoData,
  apiResponseZenlessLedgerMonthInfoDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import {
  ZenlessLedgerApiGetMonthDetailOptionalParams,
  ZenlessLedgerApiGetMonthInfoOptionalParams,
} from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getMonthDetailSend(
  context: Client,
  cookie: string,
  typeParam: string,
  currentPage: number,
  options: ZenlessLedgerApiGetMonthDetailOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/event/nap_ledger/month_detail{?type,current_page,page_size,uid,region,role_id,server,month,lang}",
    {
      type: typeParam,
      current_page: currentPage,
      page_size: options?.pageSize,
      uid: options?.uid,
      region: options?.region,
      role_id: options?.roleId,
      server: options?.server,
      month: options?.month,
      lang: options?.lang,
    },
    {
      allowReserved: options?.requestOptions?.skipUrlEncoding,
    },
  );
  return context
    .path(path)
    .get({
      ...operationOptionsToRequestParameters(options),
      headers: { cookie: cookie, accept: "application/json", ...options.requestOptions?.headers },
    });
}

export async function _getMonthDetailDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseJsonObject> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseJsonObjectDeserializer(result.body);
}

export async function getMonthDetail(
  context: Client,
  cookie: string,
  typeParam: string,
  currentPage: number,
  options: ZenlessLedgerApiGetMonthDetailOptionalParams = { requestOptions: {} },
): Promise<ApiResponseJsonObject> {
  const result = await _getMonthDetailSend(context, cookie, typeParam, currentPage, options);
  return _getMonthDetailDeserialize(result);
}

export function _getMonthInfoSend(
  context: Client,
  cookie: string,
  options: ZenlessLedgerApiGetMonthInfoOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/event/nap_ledger/month_info{?uid,region,role_id,server,month,lang}",
    {
      uid: options?.uid,
      region: options?.region,
      role_id: options?.roleId,
      server: options?.server,
      month: options?.month,
      lang: options?.lang,
    },
    {
      allowReserved: options?.requestOptions?.skipUrlEncoding,
    },
  );
  return context
    .path(path)
    .get({
      ...operationOptionsToRequestParameters(options),
      headers: { cookie: cookie, accept: "application/json", ...options.requestOptions?.headers },
    });
}

export async function _getMonthInfoDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponseZenlessLedgerMonthInfoData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponseZenlessLedgerMonthInfoDataDeserializer(result.body);
}

export async function getMonthInfo(
  context: Client,
  cookie: string,
  options: ZenlessLedgerApiGetMonthInfoOptionalParams = { requestOptions: {} },
): Promise<ApiResponseZenlessLedgerMonthInfoData> {
  const result = await _getMonthInfoSend(context, cookie, options);
  return _getMonthInfoDeserialize(result);
}
