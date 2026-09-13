// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameGenshinSDKConfigContext } from "../../api/mihoyoGameGenshinSDKConfigContext.js";
import {
  getShieldConfig,
  getGranterConfig,
  getPrecache,
  getCombo,
} from "../../api/configApi/operations.js";
import {
  ConfigApiGetShieldConfigOptionalParams,
  ConfigApiGetGranterConfigOptionalParams,
  ConfigApiGetPrecacheOptionalParams,
  ConfigApiGetComboOptionalParams,
} from "../../api/configApi/options.js";
import {
  ApiResponseSdkComboConfigData,
  ApiResponseSdkPrecacheConfigData,
  ApiResponseSdkGranterConfigData,
  ApiResponseSdkShieldConfigData,
} from "../../models/uigf/mihoyo/models.js";

/** Interface representing a ConfigApi operations. */
export interface ConfigApiOperations {
  getShieldConfig: (
    clientParam: string,
    gameKey: string,
    options?: ConfigApiGetShieldConfigOptionalParams,
  ) => Promise<ApiResponseSdkShieldConfigData>;
  getGranterConfig: (
    appId: string,
    channelId: string,
    clientType: string,
    options?: ConfigApiGetGranterConfigOptionalParams,
  ) => Promise<ApiResponseSdkGranterConfigData>;
  getPrecache: (
    biz: string,
    clientParam: string,
    options?: ConfigApiGetPrecacheOptionalParams,
  ) => Promise<ApiResponseSdkPrecacheConfigData>;
  getCombo: (
    bizKey: string,
    clientType: string,
    options?: ConfigApiGetComboOptionalParams,
  ) => Promise<ApiResponseSdkComboConfigData>;
}

function _getConfigApi(context: MihoyoGameGenshinSDKConfigContext) {
  return {
    getShieldConfig: (
      clientParam: string,
      gameKey: string,
      options?: ConfigApiGetShieldConfigOptionalParams,
    ) => getShieldConfig(context, clientParam, gameKey, options),
    getGranterConfig: (
      appId: string,
      channelId: string,
      clientType: string,
      options?: ConfigApiGetGranterConfigOptionalParams,
    ) => getGranterConfig(context, appId, channelId, clientType, options),
    getPrecache: (biz: string, clientParam: string, options?: ConfigApiGetPrecacheOptionalParams) =>
      getPrecache(context, biz, clientParam, options),
    getCombo: (bizKey: string, clientType: string, options?: ConfigApiGetComboOptionalParams) =>
      getCombo(context, bizKey, clientType, options),
  };
}

export function _getConfigApiOperations(
  context: MihoyoGameGenshinSDKConfigContext,
): ConfigApiOperations {
  return {
    ..._getConfigApi(context),
  };
}
