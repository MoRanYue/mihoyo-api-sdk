// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoCommunityContext } from "../../api/mihoyoCommunityContext.js";
import { getFullInfo } from "../../api/userApi/operations.js";
import { UserApiGetFullInfoOptionalParams } from "../../api/userApi/options.js";
import { ApiResponseCommunityUser } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a UserApi operations. */
export interface UserApiOperations {
  /** Gets the authenticated or public MiYouShe user profile. */
  getFullInfo: (
    gids: string,
    options?: UserApiGetFullInfoOptionalParams,
  ) => Promise<ApiResponseCommunityUser>;
}

function _getUserApi(context: MihoyoCommunityContext) {
  return {
    getFullInfo: (gids: string, options?: UserApiGetFullInfoOptionalParams) =>
      getFullInfo(context, gids, options),
  };
}

export function _getUserApiOperations(context: MihoyoCommunityContext): UserApiOperations {
  return {
    ..._getUserApi(context),
  };
}
