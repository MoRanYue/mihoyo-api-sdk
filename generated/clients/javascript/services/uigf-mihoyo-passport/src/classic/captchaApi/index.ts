// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

import { MihoyoPassportContext } from "../../api/mihoyoPassportContext.js";
import { create } from "../../api/captchaApi/operations.js";
import { CaptchaApiCreateOptionalParams } from "../../api/captchaApi/options.js";
import { ApiResponseLoginCaptchaData } from "../../models/uigf/mihoyo/models.js";
import { LoginCaptchaRequest } from "../../models/uigf/mihoyo/passport/models.js";

/** Interface representing a CaptchaApi operations. */
export interface CaptchaApiOperations {
  /** Starts the vendor login-captcha challenge. Solve it through the official flow. */
  create: (
    body: LoginCaptchaRequest,
    options?: CaptchaApiCreateOptionalParams,
  ) => Promise<ApiResponseLoginCaptchaData>;
}

function _getCaptchaApi(context: MihoyoPassportContext) {
  return {
    create: (body: LoginCaptchaRequest, options?: CaptchaApiCreateOptionalParams) =>
      create(context, body, options),
  };
}

export function _getCaptchaApiOperations(context: MihoyoPassportContext): CaptchaApiOperations {
  return {
    ..._getCaptchaApi(context),
  };
}
