// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoGameCNAccountExtensionContext } from "../../api/mihoyoGameCNAccountExtensionContext.js";
import { getPatch } from "../../api/patchApi/operations.js";
import { PatchApiGetPatchOptionalParams } from "../../api/patchApi/options.js";
import { ApiResponsePatchData } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a PatchApi operations. */
export interface PatchApiOperations {
  getPatch: (
    appId: number,
    appVersion: string,
    channel: string,
    gameVersion: string,
    options?: PatchApiGetPatchOptionalParams,
  ) => Promise<ApiResponsePatchData>;
}

function _getPatchApi(context: MihoyoGameCNAccountExtensionContext) {
  return {
    getPatch: (
      appId: number,
      appVersion: string,
      channel: string,
      gameVersion: string,
      options?: PatchApiGetPatchOptionalParams,
    ) => getPatch(context, appId, appVersion, channel, gameVersion, options),
  };
}

export function _getPatchApiOperations(
  context: MihoyoGameCNAccountExtensionContext,
): PatchApiOperations {
  return {
    ..._getPatchApi(context),
  };
}
