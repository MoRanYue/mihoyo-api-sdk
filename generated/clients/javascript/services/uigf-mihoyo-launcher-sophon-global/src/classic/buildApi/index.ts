// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoLauncherSophonGlobalContext } from "../../api/mihoyoLauncherSophonGlobalContext.js";
import { getPatchBuild, getBuild } from "../../api/buildApi/operations.js";
import {
  BuildApiGetPatchBuildOptionalParams,
  BuildApiGetBuildOptionalParams,
} from "../../api/buildApi/options.js";
import { ApiResponseJsonObject } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a BuildApi operations. */
export interface BuildApiOperations {
  getPatchBuild: (
    branch: string,
    packageId: string,
    password: string,
    options?: BuildApiGetPatchBuildOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  getBuild: (
    branch: string,
    packageId: string,
    password: string,
    options?: BuildApiGetBuildOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
}

function _getBuildApi(context: MihoyoLauncherSophonGlobalContext) {
  return {
    getPatchBuild: (
      branch: string,
      packageId: string,
      password: string,
      options?: BuildApiGetPatchBuildOptionalParams,
    ) => getPatchBuild(context, branch, packageId, password, options),
    getBuild: (
      branch: string,
      packageId: string,
      password: string,
      options?: BuildApiGetBuildOptionalParams,
    ) => getBuild(context, branch, packageId, password, options),
  };
}

export function _getBuildApiOperations(
  context: MihoyoLauncherSophonGlobalContext,
): BuildApiOperations {
  return {
    ..._getBuildApi(context),
  };
}
