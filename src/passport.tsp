import "@typespec/http";

using TypeSpec.Http;

/** Passport, login-ticket, QR login, and account-token APIs for CN services. */
@service(#{ title: "UIGF MiHoYo Passport API" })
@server("https://passport-api.mihoyo.com", "CN Passport API")
namespace UIGF.Mihoyo.Passport;

model DeviceContext extends Record<unknown> {
  device: string;
  device_fp?: string;
  device_name?: string;
  device_model?: string;
  device_id?: string;
  app_id?: string;
}

model QrLoginCreateRequest extends DeviceContext {
  app_id: string;
}

model QrLoginStatusRequest extends DeviceContext {
  ticket: string;
  app_id: string;
}

model MobileCaptchaLoginRequest extends Record<unknown> {
  action_type: string;
  area_code: string;
  captcha: string;
  mobile: string;
}

model LoginCaptchaRequest extends Record<unknown> {
  area_code: string;
  mobile: string;
}

model AuthTicketRequest extends DeviceContext {
  game_biz: string;
}

model GameTokenRequest {
  account_id: int64;
  game_token: string;
}

model AuthTicketLoginRequest {
  ticket: string;
}

model TokenExchangeRequest {
  dst_token_type: int32;
  mid: string;
  src_token: LoginToken;
}

model LoginToken extends Record<unknown> {
  token?: string;
  token_type?: int32;
}

model ReactivateInfo extends Record<unknown> {
  delete_after_days?: string;
  deleting_biz_account?: boolean;
  reactivate_biz?: string;
  required?: boolean;
  ticket?: string;
}

model RealnameInfo extends Record<unknown> {
  action_ticket?: string;
  action_type?: string;
  required?: boolean;
}

model LoginUserInfo extends Record<unknown> {
  account_name?: string;
  aid?: string;
  area_code?: string;
  country?: string;
  email?: string;
  identity_code?: string;
  is_adult?: int32;
  is_email_verify?: int32;
  links?: unknown[];
  mid?: string;
  mobile?: string;
  password_time?: string;
  realname?: string;
  rebind_area_code?: string;
  rebind_mobile?: string;
  rebind_mobile_time?: string;
  safe_area_code?: string;
  safe_mobile?: string;
  unmasked_email?: string;
  unmasked_email_type?: int32;
}

model AuthTicketLoginData extends Record<unknown> {
  login_ticket?: string;
  need_realperson?: boolean;
  oauth_hw_open_id?: string;
  reactivate_info?: ReactivateInfo;
  realname_info?: RealnameInfo;
  token?: LoginToken;
  user_info?: LoginUserInfo;
}

model STokenTokenRequest {
  account_id?: int64;

  @header("Cookie")
  cookie: string;
}

model TokenInfo extends Record<unknown> {
  account_id?: int64;
  uid?: string;
  token?: string;
  game_token?: string;
  stoken?: string;
  ltoken?: string;
  cookie_token?: string;
  mid?: string;
}

model QrLoginTicket extends Record<unknown> {
  ticket: string;
  url?: string;
  expires_in?: int32;
}

model QrLoginStatus extends Record<unknown> {
  stat?: string;
  status?: string;
  payload?: JsonObject;
}

@route("/account/ma-cn-verifier/app/createAuthTicketByGameBiz")
interface AuthTicketApi {
  /** Creates an action ticket for a game-biz authentication flow. */
  @post
  createByGameBiz(@body body: AuthTicketRequest): ApiResponse<TokenInfo>;
}

@route("/account/ma-cn-verifier/verifier/createLoginCaptcha")
interface CaptchaApi {
  /** Starts the vendor login-captcha challenge. Solve it through the official flow. */
  @post
  create(@body body: LoginCaptchaRequest): ApiResponse<UIGF.Mihoyo.Api.Response.LoginCaptchaData>;
}

@route("/account/ma-cn-passport/app")
interface QrLoginApi {
  /** Creates an official QR login ticket. */
  @post
  @route("/createQRLogin")
  create(@body body: QrLoginCreateRequest): ApiResponse<QrLoginTicket>;

  /** Queries an official QR login ticket. */
  @post
  @route("/queryQRLoginStatus")
  getStatus(@body body: QrLoginStatusRequest): ApiResponse<QrLoginStatus>;

  /** Logs in with a mobile-number captcha obtained through the official flow. */
  @post
  @route("/loginByMobileCaptcha")
  loginByMobileCaptcha(
    @body body: MobileCaptchaLoginRequest,
  ): ApiResponse<TokenInfo>;

  /** Exchanges an official auth ticket for the associated login-session payload. */
  @post
  @route("/loginByAuthTicket")
  loginByAuthTicket(@body body: AuthTicketLoginRequest): ApiResponse<AuthTicketLoginData>;
}

@route("/account/ma-cn-session/app")
interface SessionApi {
  /** Exchanges a game token for an SToken/session payload. */
  @post
  @route("/getTokenByGameToken")
  getTokenByGameToken(@body body: GameTokenRequest): ApiResponse<TokenInfo>;

  /** Exchanges a source token for the requested destination token type. */
  @post
  @route("/exchange")
  exchange(@body body: TokenExchangeRequest): ApiResponse<TokenInfo>;
}

@route("/account/ma-cn-session/web")
interface WebSessionApi {
  /** Verifies a caller-provided browser session cookie. */
  @post
  @route("/verifyCookieToken")
  verifyCookieToken(
    @header("Cookie") cookie: string,
  ): ApiResponse<unknown>;
}

@route("/account/auth/api")
interface AccountTokenApi {
  /** Returns account information for an authenticated SToken cookie. */
  @get
  @route("/getCookieAccountInfoBySToken")
  getCookieAccountInfoBySToken(
    @header("Cookie") cookie: string,
  ): ApiResponse<TokenInfo>;

  /** Exchanges an SToken cookie for an LToken payload. */
  @get
  @route("/getLTokenBySToken")
  getLTokenBySToken(@header("Cookie") cookie: string): ApiResponse<TokenInfo>;
}
