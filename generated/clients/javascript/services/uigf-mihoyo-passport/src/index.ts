// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoPassportClient } from "./mihoyoPassportClient.js";
export type {
  ApiResponseTokenInfo,
  ApiResponseLoginCaptchaData,
  ApiResponseQrLoginTicket,
  ApiResponseQrLoginStatus,
  JsonObject,
  ApiResponseAuthTicketLoginData,
  ApiResponse,
} from "./models/uigf/mihoyo/index.js";
export type {
  AuthTicketRequest,
  DeviceContext,
  TokenInfo,
  LoginCaptchaRequest,
  QrLoginCreateRequest,
  QrLoginTicket,
  QrLoginStatusRequest,
  QrLoginStatus,
  MobileCaptchaLoginRequest,
  AuthTicketLoginRequest,
  AuthTicketLoginData,
  ReactivateInfo,
  RealnameInfo,
  LoginToken,
  LoginUserInfo,
  GameTokenRequest,
  TokenExchangeRequest,
} from "./models/uigf/mihoyo/passport/index.js";
export type { LoginCaptchaData } from "./models/uigf/mihoyo/api/response/index.js";
export type { MihoyoPassportClientOptionalParams } from "./api/index.js";
export type {
  AccountTokenApiGetLTokenBySTokenOptionalParams,
  AccountTokenApiGetCookieAccountInfoBySTokenOptionalParams,
} from "./api/accountTokenApi/index.js";
export type { AuthTicketApiCreateByGameBizOptionalParams } from "./api/authTicketApi/index.js";
export type { CaptchaApiCreateOptionalParams } from "./api/captchaApi/index.js";
export type {
  QrLoginApiLoginByAuthTicketOptionalParams,
  QrLoginApiLoginByMobileCaptchaOptionalParams,
  QrLoginApiGetStatusOptionalParams,
  QrLoginApiCreateOptionalParams,
} from "./api/qrLoginApi/index.js";
export type {
  SessionApiExchangeOptionalParams,
  SessionApiGetTokenByGameTokenOptionalParams,
} from "./api/sessionApi/index.js";
export type { WebSessionApiVerifyCookieTokenOptionalParams } from "./api/webSessionApi/index.js";
export type {
  AccountTokenApiOperations,
  AuthTicketApiOperations,
  CaptchaApiOperations,
  QrLoginApiOperations,
  SessionApiOperations,
  WebSessionApiOperations,
} from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
