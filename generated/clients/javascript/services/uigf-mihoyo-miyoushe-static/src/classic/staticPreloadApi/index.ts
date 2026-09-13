// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheStaticContext } from "../../api/mihoyoMiYouSheStaticContext.js";
import { getLatestVersion } from "../../api/staticPreloadApi/operations.js";
import { StaticPreloadApiGetLatestVersionOptionalParams } from "../../api/staticPreloadApi/options.js";
import { ApiResponseStaticLatestVersionData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a StaticPreloadApi operations. */
export interface StaticPreloadApiOperations {
  getLatestVersion: (
    ds: string,
    options?: StaticPreloadApiGetLatestVersionOptionalParams,
  ) => Promise<ApiResponseStaticLatestVersionData>;
}

function _getStaticPreloadApi(context: MihoyoMiYouSheStaticContext) {
  return {
    getLatestVersion: (ds: string, options?: StaticPreloadApiGetLatestVersionOptionalParams) =>
      getLatestVersion(context, ds, options),
  };
}

export function _getStaticPreloadApiOperations(
  context: MihoyoMiYouSheStaticContext,
): StaticPreloadApiOperations {
  return {
    ..._getStaticPreloadApi(context),
  };
}
