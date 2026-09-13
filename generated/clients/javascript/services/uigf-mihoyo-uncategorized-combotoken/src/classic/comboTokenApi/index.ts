// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoUncategorizedComboTokenContext } from "../../api/mihoyoUncategorizedComboTokenContext.js";
import { exchange } from "../../api/comboTokenApi/operations.js";
import { ComboTokenApiExchangeOptionalParams } from "../../api/comboTokenApi/options.js";
import { ApiResponseComboTokenUploadCredentials } from "../../models/uigf/mihoyo/models.js";
import { ComboTokenRequest } from "../../models/uigf/mihoyo/uncategorized/models.js";

/** Interface representing a ComboTokenApi operations. */
export interface ComboTokenApiOperations {
  exchange: (
    body: ComboTokenRequest,
    options?: ComboTokenApiExchangeOptionalParams,
  ) => Promise<ApiResponseComboTokenUploadCredentials>;
}

function _getComboTokenApi(context: MihoyoUncategorizedComboTokenContext) {
  return {
    exchange: (body: ComboTokenRequest, options?: ComboTokenApiExchangeOptionalParams) =>
      exchange(context, body, options),
  };
}

export function _getComboTokenApiOperations(
  context: MihoyoUncategorizedComboTokenContext,
): ComboTokenApiOperations {
  return {
    ..._getComboTokenApi(context),
  };
}
