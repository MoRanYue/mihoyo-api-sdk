import "@typespec/http";

using TypeSpec.Http;

/**
 * Endpoints that do not yet have a stable product namespace. They remain isolated
 * here rather than being assigned to a product without a narrower contract.
 */
namespace UIGF.Mihoyo.Uncategorized {
  model ComboTokenRequest {
    biz: string;
  }

  model ComboTokenUploadCredentials extends Record<unknown> {
    access_key_id?: string;
    access_key_secret?: string;
    bucket?: string;
    dir?: string;
    endpoint?: string;
    expire?: string;
    expire_str?: string;
    oss_callback_url?: string;
    region?: string;
    security_token?: string;
  }

  model UgcTokenInfo extends Record<unknown> {
    expire?: string;
    level?: string;
    nickname?: string;
    region?: string;
    ugc_token?: string;
    uid?: string;
  }

  model ExperimentParameter {
    k: string;
    v: string;
  }

  model ExperimentListRequest {
  app_id: string | int32;
  app_sign: string;
  experiment_id?: string;
  params: ExperimentParameter[];
  scene_id?: string;
  uid: string;
}

  model ExperimentAssignment extends Record<unknown> {
    code?: int32;
    config_id?: string;
    configs?: Record<unknown>;
    experimentWhiteList?: boolean;
    period_id?: string;
    sceneWhiteList?: boolean;
    type?: int32;
    version?: string;
  }

  model ExperimentListResponse extends UIGF.Mihoyo.ApiResponse<ExperimentAssignment[]> {
    success?: boolean;
  }

  model UploadResponse {
    code: int32;
    message: string;
  }

  model TelemetryUploadHeaders {
    @header("Authorization") authorization?: string;
    @header("CONTENT-MD5") contentMd5?: string;
    @header("DATE") date?: string;
    @header("cms-signature") cmsSignature?: string;
  }

  model H5LogRequest {
    data: string;
  }
}

/** Token exchange endpoint without a stable product namespace. */
@service(#{ title: "UIGF Uncategorized Combo Token API" })
@server("https://api-takumi.mihoyo.com", "MiHoYo Takumi API")
namespace UIGF.Mihoyo.Uncategorized.ComboToken {
  @route("/upload/outer")
  interface ComboTokenApi {
    @post
    @route("/GetStByComboToken")
    exchange(
      @body body: UIGF.Mihoyo.Uncategorized.ComboTokenRequest,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Uncategorized.ComboTokenUploadCredentials>;
  }
}

/** UGC token and binary level-gateway endpoints. */
@service(#{ title: "UIGF Uncategorized UGC API" })
@server("https://ugc-api.mihoyo.com", "MiHoYo UGC API")
namespace UIGF.Mihoyo.Uncategorized.UGC {
  @route("/ugc_login/v1/client")
  interface TokenApi {
    @get
    @route("/ugc_token")
    get(
      ...UIGF.Mihoyo.Game.AuthKeyQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Uncategorized.UgcTokenInfo>;
  }

  @route("/ugc_gateway/v1")
  interface LevelApi {
    /** Uses the vendor's protobuf media type. */
    @post
    @route("/level_rec/index_redpoint")
    getIndexRedpoint(): bytes;

    /** The gateway payload is opaque protobuf data. */
    @post
    @route("/levels/collection/tiny_info")
    getCollectionTinyInfo(
      @body body: bytes,
    ): bytes;
  }
}

/**
 * Feature-experiment assignments returned to the official game client.
 * The older `data-abtest-api.mihoyo.com` host is an alias of this API; callers
 * needing it can override the generated client's endpoint.
 */
@service(#{ title: "UIGF Uncategorized Experiment API" })
@server("https://abtest-api-data.mihoyo.com", "MiHoYo experiment API")
namespace UIGF.Mihoyo.Uncategorized.Experimentation {
  @route("/data_abtest_api/config/experiment")
  interface ExperimentApi {
    @post
    @route("/list")
    list(
      @body body: UIGF.Mihoyo.Uncategorized.ExperimentListRequest,
    ): UIGF.Mihoyo.Uncategorized.ExperimentListResponse;
  }
}

/** Game SDK diagnostics, crash reports, and performance configuration. */
@service(#{ title: "UIGF Uncategorized Game Telemetry API" })
@server("https://ys-log-upload.mihoyo.com", "MiHoYo game telemetry API")
namespace UIGF.Mihoyo.Uncategorized.Telemetry.Game {
  @route("/perf/config")
  interface PerformanceApi {
    @get
    @route("/verify")
    verify(
      @query device_id: string,
      @query name: string,
      @query platform: string,
    ): UIGF.Mihoyo.Uncategorized.UploadResponse;
  }

  interface UploadApi {
    /** The official client signs the upload headers; signing is intentionally caller-owned. */
    @post
    @route("/crash/dataUpload")
    uploadCrash(
      ...UIGF.Mihoyo.Uncategorized.TelemetryUploadHeaders,
      @body body: UIGF.Mihoyo.Api.Request.GameCrashTelemetryEvent[],
    ): UIGF.Mihoyo.Uncategorized.UploadResponse;

    @post
    @route("/sdk/dataUpload")
    uploadSdk(
      ...UIGF.Mihoyo.Uncategorized.TelemetryUploadHeaders,
      @body body: UIGF.Mihoyo.Api.Request.GameSdkTelemetryEvent[],
    ): UIGF.Mihoyo.Uncategorized.UploadResponse;

    @post
    @route("/ys_custom/dataUpload")
    uploadCustom(
      ...UIGF.Mihoyo.Uncategorized.TelemetryUploadHeaders,
      @body body: UIGF.Mihoyo.Api.Request.GameCustomTelemetryEvent[],
    ): UIGF.Mihoyo.Uncategorized.UploadResponse;
  }
}

/** SDK telemetry upload endpoint with an event-array payload. */
@service(#{ title: "UIGF Uncategorized SDK Telemetry API" })
@server("https://sdk-log-upload.mihoyo.com", "MiHoYo SDK telemetry API")
namespace UIGF.Mihoyo.Uncategorized.Telemetry.SDK {
  interface UploadApi {
    @post
    @route("/sdk/dataUpload")
    upload(
      ...UIGF.Mihoyo.Uncategorized.TelemetryUploadHeaders,
      @body body: UIGF.Mihoyo.Api.Request.SdkTelemetryUploadEvent[],
    ): UIGF.Mihoyo.Uncategorized.UploadResponse;
  }
}

/** Web-view telemetry batch endpoint. */
@service(#{ title: "UIGF Uncategorized H5 Telemetry API" })
@server("https://h5log-api-dualstack.mihoyo.com", "MiHoYo H5 telemetry API")
namespace UIGF.Mihoyo.Uncategorized.Telemetry.H5 {
  @route("/common/h5log/log")
  interface BatchApi {
    @post
    @route("/batch")
    upload(
      @query topic: string,
      @header("DATE") date?: string,
      @body body: UIGF.Mihoyo.Uncategorized.H5LogRequest,
    ): UIGF.Mihoyo.ApiResponse<unknown>;
  }
}

/** Browser analytics collector with an open vendor-defined event payload. */
@service(#{ title: "UIGF Uncategorized H5 Collector API" })
@server("https://h5collector.mihoyo.com", "MiHoYo H5 collector API")
namespace UIGF.Mihoyo.Uncategorized.Telemetry.H5Collector {
  @route("/h5")
  interface UploadApi {
    @post
    @route("/upload")
    upload(
      @header("Cookie") cookie?: string,
      @query timestamp: int64,
      @query verification: string,
      @body body: UIGF.Mihoyo.Api.Request.H5CollectorUploadRequest,
    ): UIGF.Mihoyo.Uncategorized.UploadResponse;
  }
}

/** Login SDK telemetry upload with an event array and Authorization header. */
@service(#{ title: "UIGF Uncategorized Login Telemetry API" })
@server("https://log-upload-v6.mihoyo.com", "MiHoYo login telemetry API")
namespace UIGF.Mihoyo.Uncategorized.Telemetry.Login {
  @route("/loginsdk")
  interface UploadApi {
    @post
    @route("/dataUpload")
    upload(
      @header("Authorization") authorization: string,
      @body body: UIGF.Mihoyo.Api.Request.LoginTelemetryEvent[],
    ): UIGF.Mihoyo.Uncategorized.UploadResponse;
  }
}

/** Community-client telemetry route with an opaque, vendor-signed JSON payload. */
@service(#{ title: "UIGF Uncategorized Community Telemetry API" })
@server("https://log-upload.mihoyo.com", "MiHoYo community telemetry API")
namespace UIGF.Mihoyo.Uncategorized.Telemetry.Community {
  @route("/log/bbs_app/upload")
  interface UploadApi {
    @post
    @route("/v2")
    upload(
      @body body: UIGF.Mihoyo.Api.Request.CommunityTelemetryUploadRequest,
    ): UIGF.Mihoyo.Uncategorized.UploadResponse;
  }
}

/** H5 telemetry alias on the minor-account service host. */
@service(#{ title: "UIGF Uncategorized Minor H5 Telemetry API" })
@server("https://minor-api.mihoyo.com", "MiHoYo minor H5 telemetry API")
namespace UIGF.Mihoyo.Uncategorized.Telemetry.H5Minor {
  @route("/common/h5log/log")
  interface BatchApi {
    @post
    @route("/batch")
    upload(
      @query topic: string,
      @body body: UIGF.Mihoyo.Uncategorized.H5LogRequest,
    ): UIGF.Mihoyo.ApiResponse<unknown>;
  }
}

/** Raw game crash-report endpoint on the Yuanshen service host. */
@service(#{ title: "UIGF Uncategorized Yuanshen Crash API" })
@server("https://cnuspider.yuanshen.com", "Yuanshen crash report API")
namespace UIGF.Mihoyo.Uncategorized.Telemetry.Crash {
  interface CrashApi {
    @post
    @route("/log")
    upload(
      @body body: UIGF.Mihoyo.Api.Request.LegacyCrashReport,
    ): void;
  }
}
