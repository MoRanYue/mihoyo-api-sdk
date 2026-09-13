// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameGenshinSDKSecureContext } from "../../api/mihoyoGameGenshinSDKSecureContext.js";
import { getRedDots, compareProtocolVersion } from "../../api/secureApi/operations.js";
import {
  SecureApiGetRedDotsOptionalParams,
  SecureApiCompareProtocolVersionOptionalParams,
} from "../../api/secureApi/options.js";
import {
  ProtocolVersionRequest,
  RedDotRequest,
} from "../../models/uigf/mihoyo/game/genshin/sdk/models.js";
import {
  ApiResponseSdkProtocolVersionComparisonData,
  ApiResponseSdkRedDotData,
} from "../../models/uigf/mihoyo/models.js";

/** Interface representing a SecureApi operations. */
export interface SecureApiOperations {
  getRedDots: (
    body: RedDotRequest,
    options?: SecureApiGetRedDotsOptionalParams,
  ) => Promise<ApiResponseSdkRedDotData>;
  compareProtocolVersion: (
    body: ProtocolVersionRequest,
    options?: SecureApiCompareProtocolVersionOptionalParams,
  ) => Promise<ApiResponseSdkProtocolVersionComparisonData>;
}

function _getSecureApi(context: MihoyoGameGenshinSDKSecureContext) {
  return {
    getRedDots: (body: RedDotRequest, options?: SecureApiGetRedDotsOptionalParams) =>
      getRedDots(context, body, options),
    compareProtocolVersion: (
      body: ProtocolVersionRequest,
      options?: SecureApiCompareProtocolVersionOptionalParams,
    ) => compareProtocolVersion(context, body, options),
  };
}

export function _getSecureApiOperations(
  context: MihoyoGameGenshinSDKSecureContext,
): SecureApiOperations {
  return {
    ..._getSecureApi(context),
  };
}
