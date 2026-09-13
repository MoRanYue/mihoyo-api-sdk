// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameGenshinDispatchGateContext } from "../../api/mihoyoGameGenshinDispatchGateContext.js";
import { getAddress } from "../../api/gateApi/operations.js";
import { GateApiGetAddressOptionalParams } from "../../api/gateApi/options.js";
import { ApiResponseGateAddressData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a GateApi operations. */
export interface GateApiOperations {
  getAddress: (
    game: string,
    region: string,
    options?: GateApiGetAddressOptionalParams,
  ) => Promise<ApiResponseGateAddressData>;
}

function _getGateApi(context: MihoyoGameGenshinDispatchGateContext) {
  return {
    getAddress: (game: string, region: string, options?: GateApiGetAddressOptionalParams) =>
      getAddress(context, game, region, options),
  };
}

export function _getGateApiOperations(
  context: MihoyoGameGenshinDispatchGateContext,
): GateApiOperations {
  return {
    ..._getGateApi(context),
  };
}
