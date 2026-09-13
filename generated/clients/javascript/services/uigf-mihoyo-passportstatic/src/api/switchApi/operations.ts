// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoPassportStaticContext as Client } from "../index.js";
import {
  ApiResponsePassportSwitchStatusData,
  apiResponsePassportSwitchStatusDataDeserializer,
} from "../../models/uigf/mihoyo/models.js";
import { expandUrlTemplate } from "../../static-helpers/urlTemplate.js";
import { SwitchApiGetSwitchStatusOptionalParams } from "./options.js";
import {
  StreamableMethod,
  PathUncheckedResponse,
  createRestError,
  operationOptionsToRequestParameters,
} from "@azure-rest/core-client";

export function _getSwitchStatusSend(
  context: Client,
  ds: string,
  appId: string,
  platform: number,
  options: SwitchApiGetSwitchStatusOptionalParams = { requestOptions: {} },
): StreamableMethod {
  const path = expandUrlTemplate(
    "/account/ma-cn-passport/passport/getSwitchStatus{?app_id,platform}",
    {
      app_id: appId,
      platform: platform,
    },
    {
      allowReserved: options?.requestOptions?.skipUrlEncoding,
    },
  );
  return context
    .path(path)
    .get({
      ...operationOptionsToRequestParameters(options),
      headers: { ds: ds, accept: "application/json", ...options.requestOptions?.headers },
    });
}

export async function _getSwitchStatusDeserialize(
  result: PathUncheckedResponse,
): Promise<ApiResponsePassportSwitchStatusData> {
  const expectedStatuses = ["200"];
  if (!expectedStatuses.includes(result.status)) {
    throw createRestError(result);
  }

  return apiResponsePassportSwitchStatusDataDeserializer(result.body);
}

export async function getSwitchStatus(
  context: Client,
  ds: string,
  appId: string,
  platform: number,
  options: SwitchApiGetSwitchStatusOptionalParams = { requestOptions: {} },
): Promise<ApiResponsePassportSwitchStatusData> {
  const result = await _getSwitchStatusSend(context, ds, appId, platform, options);
  return _getSwitchStatusDeserialize(result);
}
