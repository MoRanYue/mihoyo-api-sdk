import "@typespec/http";

using TypeSpec.Http;

namespace UIGF.Mihoyo.Game.Genshin.SDK {
  /** Optional x-rpc context fields for Genshin SDK configuration requests. */
  model ClientHeaders {
    @header("x-rpc-app_id") rpcAppId?: string;
    @header("x-rpc-app_version") rpcAppVersion?: string;
    @header("x-rpc-channel_id") rpcChannelId?: string;
    @header("x-rpc-channel_version") rpcChannelVersion?: string;
    @header("x-rpc-client_type") rpcClientType?: string;
    @header("x-rpc-combo_version") rpcComboVersion?: string;
    @header("x-rpc-device_fp") rpcDeviceFingerprint?: string;
    @header("x-rpc-device_id") rpcDeviceId?: string;
    @header("x-rpc-device_model") rpcDeviceModel?: string;
    @header("x-rpc-device_name") rpcDeviceName?: string;
    @header("x-rpc-game_biz") rpcGameBiz?: string;
    @header("x-rpc-goods_third_party") rpcGoodsThirdParty?: string;
    @header("x-rpc-language") rpcLanguage?: string;
    @header("x-rpc-mdk_version") rpcMdkVersion?: string;
    @header("x-rpc-payment_version") rpcPaymentVersion?: string;
    @header("x-rpc-sdk_version") rpcSdkVersion?: string;
    @header("x-rpc-sub_channel_id") rpcSubChannelId?: string;
    @header("x-rpc-sys_version") rpcSystemVersion?: string;
  }

  model ProtocolVersionRequest {
    app_id: string;
    channel_id: string;
    language: string;
    major: string;
    minimum: string;
  }

  model RedDotRequest {
    game_biz: string;
    player_level: int32;
    region: string;
    uid: string;
  }

  model GranterLoginRequest {
    app_id: int32;
    channel_id: int32;
    data: string;
    device: string;
    sign: string;
  }
}

/** Genshin SDK bootstrap and shield configuration APIs. */
@service(#{ title: "UIGF Genshin CN SDK Configuration API" })
@server("https://sdk-static.mihoyo.com", "CN Genshin SDK static configuration API")
namespace UIGF.Mihoyo.Game.Genshin.SDK.Config {
  interface ConfigApi {
    @get
    @route("/combo/box/api/config/sdk/combo")
    getCombo(
      @query biz_key: string,
      @query client_type: string,
      ...UIGF.Mihoyo.Game.Genshin.SDK.ClientHeaders,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.SdkComboConfigData>;

    @get
    @route("/combo/box/api/config/sw/precache")
    getPrecache(
      @query biz: string,
      @query client: string,
      ...UIGF.Mihoyo.Game.Genshin.SDK.ClientHeaders,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.SdkPrecacheConfigData>;

    @get
    @route("/hk4e_cn/combo/granter/api/getConfig")
    getGranterConfig(
      @query app_id: string,
      @query channel_id: string,
      @query client_type: string,
      ...UIGF.Mihoyo.Game.Genshin.SDK.ClientHeaders,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.SdkGranterConfigData>;

    @get
    @route("/hk4e_cn/mdk/shield/api/loadConfig")
    getShieldConfig(
      @query client: string,
      @query game_key: string,
      ...UIGF.Mihoyo.Game.Genshin.SDK.ClientHeaders,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.SdkShieldConfigData>;
  }
}

/** Genshin SDK secure protocol-version and red-dot APIs. */
@service(#{ title: "UIGF Genshin CN Secure SDK API" })
@server("https://hk4e-sdk-s.mihoyo.com", "CN Genshin secure SDK API")
namespace UIGF.Mihoyo.Game.Genshin.SDK.Secure {
  interface SecureApi {
    @post
    @route("/hk4e_cn/combo/granter/api/compareProtocolVersion")
    compareProtocolVersion(
      ...UIGF.Mihoyo.Game.Genshin.SDK.ClientHeaders,
      @body body: UIGF.Mihoyo.Game.Genshin.SDK.ProtocolVersionRequest,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.SdkProtocolVersionComparisonData>;

    @post
    @route("/hk4e_cn/combo/red_dot/list")
    getRedDots(
      ...UIGF.Mihoyo.Game.Genshin.SDK.ClientHeaders,
      @body body: UIGF.Mihoyo.Game.Genshin.SDK.RedDotRequest,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.SdkRedDotData>;
  }
}
