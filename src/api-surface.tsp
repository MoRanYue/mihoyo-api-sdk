import "@typespec/http";
import "@uigf/typespec-ds";

using TypeSpec.Http;

/** Genshin strategy content and Zenless feedback routes. */
@service(#{ title: "UIGF MiHoYo CN Activity Content API" })
@server("https://act-api-takumi.mihoyo.com", "CN activity content API")
namespace UIGF.Mihoyo.Game.CN.Activity {

@route("/common/blackboard/ys_strategy/v1")
interface StrategyApi {
  @get
  @route("/content/latest")
  getLatestContent(@query app_sn: string): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.StrategyLatestContentData>;

  @get
  @route("/home/index/info")
  getHomeInfo(@query app_sn: string): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.StrategyHomeInfoData>;

  @get
  @route("/home/index/navbar")
  getHomeNavbar(@query app_sn: string): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.StrategyHomeNavbarData>;
}

@route("/event/nap_feedback/user")
interface ZenlessFeedbackApi {
  @get
  @route("/get_cur_schedule")
  getCurrentSchedule(
    @header("Cookie") cookie?: string,
    @query region: string,
    @query source: int32,
    @query tool_type: int32,
    @query uid: int64,
  ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.ZenlessFeedbackScheduleData>;

  @post
  @route("/collect_feedback")
  collect(
    @header("Cookie") cookie?: string,
    @body body: UIGF.Mihoyo.Api.Request.ZenlessFeedbackCollectionRequest,
  ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.EmptyData>;
}
}

/** Additional CN game-account routes served by the Takumi host. */
@service(#{ title: "UIGF MiHoYo CN Game Account Extension API" })
@server("https://api-takumi.mihoyo.com", "CN Takumi API")
namespace UIGF.Mihoyo.Game.CN.AccountExtension {

@route("/common/csc_qna/public")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface RedDotApi {
  @get
  @route("/batchGetRedDot")
  getBatch(
    @header("Cookie") cookie?: string,
    @header("DS") ds: string,
    @query authkey: string,
    @query authkey_ver: int32,
    @query game_biz: string,
    @query sign_type: int32,
    @query users: string,
  ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.RedDotBatchData>;
}

@route("/ptolemaios_api/api")
interface PatchApi {
  @get
  @route("/getPatch")
  getPatch(
    @query app_id: int32,
    @query app_version: string,
    @query channel: string,
    @query game_version: string,
  ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.PatchData>;
}
}

/** Game-account and patch routes exposed through the MiYouShe Takumi alias. */
@service(#{ title: "UIGF MiYouShe Game Account API" })
@server("https://api-takumi.miyoushe.com", "MiYouShe Takumi API")
namespace UIGF.Mihoyo.Game.CN.MiYouSheAccount {

@route("/binding/api")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface BindingApi {
  @get
  @route("/getUserGameRolesByStoken")
  getRoles(
    @header("Cookie") cookie: string,
    @header("DS") ds: string,
  ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.GameRoleList>;
}

@route("/account/auth/api")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface AuthKeyApi {
  @post
  @route("/genAuthKey")
  generate(
    @header("Cookie") cookie: string,
    @header("DS") ds: string,
    @body body: UIGF.Mihoyo.Game.AuthKeyRequest,
  ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.AuthKeyData>;
}

@route("/ptolemaios_api/api")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface ReleaseApi {
  @get
  @route("/getLatestRelease")
  getLatestRelease(
    @header("DS") ds: string,
    @query device_cpu_bit_type: int32,
  ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.ReleaseData>;
}
}

/** Mobile-only MiYouShe community routes that use V1 DS. */
@service(#{ title: "UIGF MiYouShe Mobile Community API" })
@server("https://bbs-api.miyoushe.com", "MiYouShe mobile community API")
namespace UIGF.Mihoyo.MiYouShe.Mobile {

model MobileDsHeaders {
  @header("Cookie")
  cookie?: string;

  @header("DS")
  ds: string;
}

@route("/apihub")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface MobileApiHub {
  @get
  @route("/api/getAppSplash")
  getAppSplash(...MobileDsHeaders): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileAppSplashData>;

  @get
  @route("/api/getGameList")
  getGameList(...MobileDsHeaders): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileGameListData>;

  @get
  @route("/api/myselfPageConfig")
  getMyselfPageConfig(...MobileDsHeaders): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileMyselfPageConfigData>;

  @get
  @route("/api/unreadMessageCnt")
  getUnreadMessageCount(
    ...MobileDsHeaders,
    @query first_view_ts: int64,
    @query uid: int64,
  ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileUnreadMessageData>;

  @get
  @route("/sapi/getUserMissionsState")
  getUserMissionsState(...MobileDsHeaders): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileMissionsStateData>;

  @post
  @route("/api/deviceLogin")
  deviceLogin(...MobileDsHeaders, @body body: UIGF.Mihoyo.Api.Request.MobileDeviceSessionRequest): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.EmptyData>;

  @post
  @route("/api/deviceLogout")
  deviceLogout(...MobileDsHeaders, @body body: UIGF.Mihoyo.Api.Request.MobileDeviceSessionRequest): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.EmptyData>;

  @post
  @route("/api/getAppStartupData")
  getAppStartupData(...MobileDsHeaders, @body body: UIGF.Mihoyo.Api.Request.MobileStartupRequest): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileStartupData>;

  @post
  @route("/api/window/prepare")
  prepareWindow(...MobileDsHeaders, @body body: UIGF.Mihoyo.Api.Request.MobileWindowPrepareRequest): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileWindowPrepareData>;

  @post
  @route("/api/window/show")
  showWindow(...MobileDsHeaders, @body body: UIGF.Mihoyo.Api.Request.MobileWindowShowRequest): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileWindowShowData>;
}

@route("/chat/api")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface MobileChatApi {
  @get
  @route("/getUserSettings")
  getUserSettings(...MobileDsHeaders): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileUserSettingsData>;
}

@route("/forum/api")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface MobileForumApi {
  @get
  @route("/getDiscussionByGame")
  getDiscussionByGame(
    ...MobileDsHeaders,
    @query gids: int32,
    @query version: int32,
  ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileDiscussionData>;
}

@route("/misc/api")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface MobileMiscApi {
  @get
  @route("/recentEmoticonList")
  getRecentEmoticons(...MobileDsHeaders): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileEmoticonData>;
}

@route("/painter/api")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface MobilePainterApi {
  @get
  @route("/feeds/posts")
  getFeedPosts(
    ...MobileDsHeaders,
    @query algorithm_type: int32,
    @query cpu: string,
    @query device: string,
    @query filter: string,
    @query fresh_action: int32,
    @query gids: int32,
    @query is_first_initialize: boolean,
    @query is_triggered_by_resource: boolean,
    @query last_id: string,
  ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileFeedPostsData>;

  @get
  @route("/user_instant/list")
  getUserInstantList(
    ...MobileDsHeaders,
    @query game_region: string,
    @query game_uid: int64,
    @query offset: int32,
    @query size: int32,
    @query uid: int64,
    @query view_type: int32,
  ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileUserInstantListData>;

  @get
  @route("/villa/notification/site_push")
  getVillaSitePush(...MobileDsHeaders): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileVillaSitePushData>;
}

@route("/post/api")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface MobilePostApi {
  @get
  @route("/check/publishVideoPerm")
  getPublishVideoPermission(...MobileDsHeaders): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileVideoPermissionData>;
}

@route("/reception/api")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface MobileReceptionApi {
  @get
  @route("/gameCenter")
  getGameCenter(
    ...MobileDsHeaders,
    @query cpu: string,
    @query device: string,
  ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileGameCenterData>;
}

@route("/teenager/api")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface MobileTeenagerApi {
  @get
  @route("/info")
  getInfo(...MobileDsHeaders): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileTeenagerInfoData>;
}

@route("/timeline/api")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface MobileTimelineApi {
  @get
  @route("/getUnreadInfo")
  getUnreadInfo(...MobileDsHeaders): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileUnreadInfoData>;
}

@route("/user/api")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface MobileUserApi {
  @get
  @route("/getUserBusinesses")
  getUserBusinesses(...MobileDsHeaders, @query uid: int64): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileBusinessesData>;

  @get
  @route("/getUserFullInfo")
  getUserFullInfo(...MobileDsHeaders, @query uid: int64): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.CommunityUser>;

  @get
  @route("/notify/settings")
  getNotificationSettings(...MobileDsHeaders, @query uid: int64): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileNotificationSettingsData>;

  @get
  @route("/replyPermission")
  getReplyPermission(...MobileDsHeaders): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileReplyPermissionData>;

  @post
  @route("/login")
  login(...MobileDsHeaders, @body body: UIGF.Mihoyo.Api.Request.MobileLoginRequest): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.EmptyData>;
}

@route("/user_instant/api")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface MobileUserInstantApi {
  @get
  @route("/entity/review")
  getEntityReview(
    ...MobileDsHeaders,
    @query offset: int32,
    @query size: int32,
  ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobileEntityReviewData>;
}

@route("/preload_resource/api/rn")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface MobilePreloadApi {
  @post
  @route("/get_latest_config")
  getLatestConfig(...MobileDsHeaders, @body body: UIGF.Mihoyo.Api.Request.MobilePreloadConfigRequest): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.MobilePreloadConfigData>;
}
}

/** DS-protected community metadata is served from a separate static API host. */
@service(#{ title: "UIGF MiYouShe Static Community API" })
@server("https://bbs-api-static.miyoushe.com", "MiYouShe static community API")
namespace UIGF.Mihoyo.MiYouShe.Static {

model StaticDsHeaders {
  @header("Cookie")
  cookie?: string;

  @header("DS")
  ds: string;
}

@route("/apihub/api")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface StaticApiHub {
  @get
  @route("/staticResource")
  getStaticResource(...StaticDsHeaders, @query client_type: int32): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.StaticResourceData>;
}

@route("/misc/api")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface StaticMiscApi {
  @get
  @route("/getAllStaticResourceVersions")
  getAllResourceVersions(...StaticDsHeaders): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.StaticResourceVersionsData>;
}

@route("/preload_resource/api")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface StaticPreloadApi {
  @get
  @route("/latest_version")
  getLatestVersion(...StaticDsHeaders): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.StaticLatestVersionData>;
}

@route("/search/api/search")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface StaticSearchApi {
  @get
  @route("/pre_keyword")
  getPreKeyword(...StaticDsHeaders, @query game_id: int32): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.StaticPreKeywordData>;
}
}

/** Passport feature switches provided by the SDK's static endpoint. */
@service(#{ title: "UIGF MiHoYo Passport Static API" })
@server("https://passport-api-static.mihoyo.com", "CN passport static API")
namespace UIGF.Mihoyo.PassportStatic {

@route("/account/ma-cn-passport/passport")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface SwitchApi {
  @get
  @route("/getSwitchStatus")
  getSwitchStatus(
    @header("DS") ds: string,
    @query app_id: string,
    @query platform: int32,
  ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.PassportSwitchStatusData>;
}
}

/** SDK bootstrap configuration endpoints that do not require a DS header. */
@service(#{ title: "UIGF MiHoYo SDK Static Configuration API" })
@server("https://sdk-static.mihoyo.com", "MiHoYo SDK static configuration API")
namespace UIGF.Mihoyo.SDK.Static {

@route("/combo/box/api/config")
interface ConfigurationApi {
  @get
  @route("/porte-cn/porte")
  getCnPorte(
    @query app_id: string,
    @query client_type: int32,
  ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.SdkPorteData>;

  @get
  @route("/porte-fe-cn/config")
  getFeCnConfig(@query type: string): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Api.Response.SdkFeCnConfigData>;
}
}
