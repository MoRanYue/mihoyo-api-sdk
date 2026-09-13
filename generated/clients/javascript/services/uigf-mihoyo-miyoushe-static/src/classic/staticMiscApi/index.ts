// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoMiYouSheStaticContext } from "../../api/mihoyoMiYouSheStaticContext.js";
import { getAllResourceVersions } from "../../api/staticMiscApi/operations.js";
import { StaticMiscApiGetAllResourceVersionsOptionalParams } from "../../api/staticMiscApi/options.js";
import { ApiResponseStaticResourceVersionsData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a StaticMiscApi operations. */
export interface StaticMiscApiOperations {
  getAllResourceVersions: (
    ds: string,
    options?: StaticMiscApiGetAllResourceVersionsOptionalParams,
  ) => Promise<ApiResponseStaticResourceVersionsData>;
}

function _getStaticMiscApi(context: MihoyoMiYouSheStaticContext) {
  return {
    getAllResourceVersions: (
      ds: string,
      options?: StaticMiscApiGetAllResourceVersionsOptionalParams,
    ) => getAllResourceVersions(context, ds, options),
  };
}

export function _getStaticMiscApiOperations(
  context: MihoyoMiYouSheStaticContext,
): StaticMiscApiOperations {
  return {
    ..._getStaticMiscApi(context),
  };
}
