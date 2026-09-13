// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameCNMiYouSheAccountContext } from "../../api/mihoyoGameCNMiYouSheAccountContext.js";
import { getLatestRelease } from "../../api/releaseApi/operations.js";
import { ReleaseApiGetLatestReleaseOptionalParams } from "../../api/releaseApi/options.js";
import { ApiResponseReleaseData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a ReleaseApi operations. */
export interface ReleaseApiOperations {
  getLatestRelease: (
    ds: string,
    deviceCpuBitType: number,
    options?: ReleaseApiGetLatestReleaseOptionalParams,
  ) => Promise<ApiResponseReleaseData>;
}

function _getReleaseApi(context: MihoyoGameCNMiYouSheAccountContext) {
  return {
    getLatestRelease: (
      ds: string,
      deviceCpuBitType: number,
      options?: ReleaseApiGetLatestReleaseOptionalParams,
    ) => getLatestRelease(context, ds, deviceCpuBitType, options),
  };
}

export function _getReleaseApiOperations(
  context: MihoyoGameCNMiYouSheAccountContext,
): ReleaseApiOperations {
  return {
    ..._getReleaseApi(context),
  };
}
