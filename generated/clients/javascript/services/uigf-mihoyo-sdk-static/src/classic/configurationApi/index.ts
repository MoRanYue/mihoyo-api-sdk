// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoSDKStaticContext } from "../../api/mihoyoSDKStaticContext.js";
import { getFeCnConfig, getCnPorte } from "../../api/configurationApi/operations.js";
import {
  ConfigurationApiGetFeCnConfigOptionalParams,
  ConfigurationApiGetCnPorteOptionalParams,
} from "../../api/configurationApi/options.js";
import {
  ApiResponseSdkPorteData,
  ApiResponseSdkFeCnConfigData,
} from "../../models/uigf/mihoyo/models.js";

/** Interface representing a ConfigurationApi operations. */
export interface ConfigurationApiOperations {
  getFeCnConfig: (
    typeParam: string,
    options?: ConfigurationApiGetFeCnConfigOptionalParams,
  ) => Promise<ApiResponseSdkFeCnConfigData>;
  getCnPorte: (
    appId: string,
    clientType: number,
    options?: ConfigurationApiGetCnPorteOptionalParams,
  ) => Promise<ApiResponseSdkPorteData>;
}

function _getConfigurationApi(context: MihoyoSDKStaticContext) {
  return {
    getFeCnConfig: (typeParam: string, options?: ConfigurationApiGetFeCnConfigOptionalParams) =>
      getFeCnConfig(context, typeParam, options),
    getCnPorte: (
      appId: string,
      clientType: number,
      options?: ConfigurationApiGetCnPorteOptionalParams,
    ) => getCnPorte(context, appId, clientType, options),
  };
}

export function _getConfigurationApiOperations(
  context: MihoyoSDKStaticContext,
): ConfigurationApiOperations {
  return {
    ..._getConfigurationApi(context),
  };
}
