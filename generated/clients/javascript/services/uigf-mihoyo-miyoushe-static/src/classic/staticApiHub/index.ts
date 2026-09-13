// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheStaticContext } from "../../api/mihoyoMiYouSheStaticContext.js";
import { getStaticResource } from "../../api/staticApiHub/operations.js";
import { StaticApiHubGetStaticResourceOptionalParams } from "../../api/staticApiHub/options.js";
import { ApiResponseStaticResourceData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a StaticApiHub operations. */
export interface StaticApiHubOperations {
  getStaticResource: (
    clientType: number,
    options?: StaticApiHubGetStaticResourceOptionalParams,
  ) => Promise<ApiResponseStaticResourceData>;
}

function _getStaticApiHub(context: MihoyoMiYouSheStaticContext) {
  return {
    getStaticResource: (
      clientType: number,
      options?: StaticApiHubGetStaticResourceOptionalParams,
    ) => getStaticResource(context, clientType, options),
  };
}

export function _getStaticApiHubOperations(
  context: MihoyoMiYouSheStaticContext,
): StaticApiHubOperations {
  return {
    ..._getStaticApiHub(context),
  };
}
