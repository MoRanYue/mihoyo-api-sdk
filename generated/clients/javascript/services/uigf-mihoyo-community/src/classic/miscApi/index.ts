// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoCommunityContext } from "../../api/mihoyoCommunityContext.js";
import {
  getGeetestChallenge,
  verifyVerification,
  createVerification,
  getEmoticonSet,
} from "../../api/miscApi/operations.js";
import {
  MiscApiGetGeetestChallengeOptionalParams,
  MiscApiVerifyVerificationOptionalParams,
  MiscApiCreateVerificationOptionalParams,
  MiscApiGetEmoticonSetOptionalParams,
} from "../../api/miscApi/options.js";
import {
  VerificationCreateRequest,
  VerificationSubmitRequest,
} from "../../models/uigf/mihoyo/community/models.js";
import { ApiResponseJsonObject } from "../../models/uigf/mihoyo/models.js";

/** Interface representing a MiscApi operations. */
export interface MiscApiOperations {
  getGeetestChallenge: (
    cookie: string,
    options?: MiscApiGetGeetestChallengeOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  /** Submits verification output obtained from the official challenge provider. */
  verifyVerification: (
    cookie: string,
    body: VerificationSubmitRequest,
    options?: MiscApiVerifyVerificationOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  /** Creates the official verification challenge required by selected operations. */
  createVerification: (
    cookie: string,
    body: VerificationCreateRequest,
    options?: MiscApiCreateVerificationOptionalParams,
  ) => Promise<ApiResponseJsonObject>;
  getEmoticonSet: (options?: MiscApiGetEmoticonSetOptionalParams) => Promise<ApiResponseJsonObject>;
}

function _getMiscApi(context: MihoyoCommunityContext) {
  return {
    getGeetestChallenge: (cookie: string, options?: MiscApiGetGeetestChallengeOptionalParams) =>
      getGeetestChallenge(context, cookie, options),
    verifyVerification: (
      cookie: string,
      body: VerificationSubmitRequest,
      options?: MiscApiVerifyVerificationOptionalParams,
    ) => verifyVerification(context, cookie, body, options),
    createVerification: (
      cookie: string,
      body: VerificationCreateRequest,
      options?: MiscApiCreateVerificationOptionalParams,
    ) => createVerification(context, cookie, body, options),
    getEmoticonSet: (options?: MiscApiGetEmoticonSetOptionalParams) =>
      getEmoticonSet(context, options),
  };
}

export function _getMiscApiOperations(context: MihoyoCommunityContext): MiscApiOperations {
  return {
    ..._getMiscApi(context),
  };
}
