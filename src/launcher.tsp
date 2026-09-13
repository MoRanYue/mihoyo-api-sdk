import "@typespec/http";

using TypeSpec.Http;

namespace UIGF.Mihoyo.Launcher {
  model LauncherQuery {
    @query("launcher_id")
    launcherId: string;

    @query
    language: string;

    @query("game_ids[]")
    gameIds?: string[];
  }

  model ChannelQuery extends LauncherQuery {
    @query
    channel?: int32;

    @query("sub_channel")
    subChannel?: int32;
  }

  model SophonBuildQuery {
    @query
    branch: string;

    @query("package_id")
    packageId: string;

    @query
    password: string;

    @query
    tag?: string;
  }

  model GpuInfo extends Record<unknown> {
    name?: string;
    vendor_id?: int32;
    device_id?: int32;
  }

  model DxConfigRequest {
    launcher_id: string;
    language: string;
    game_ids: string[];
    gpu_info: GpuInfo[];
  }

  model GamePackage extends Record<unknown> {
    game_id?: string;
    game_name?: string;
    main?: JsonObject;
    pre_download?: JsonObject;
  }

  model GameBasicInfo extends Record<unknown> {
    game_info_list?: JsonObject[];
  }
}

/** HoYoPlay launcher metadata for CN official and Bilibili launcher IDs. */
@service(#{ title: "UIGF HoYoPlay CN API" })
@server("https://hyp-api.mihoyo.com", "CN HoYoPlay API")
namespace UIGF.Mihoyo.Launcher.CN {
  @route("/hyp/hyp-connect/api")
  interface MetadataApi {
    @get
    @route("/getAllGameBasicInfo")
    getAllGameBasicInfo(
      ...UIGF.Mihoyo.Launcher.LauncherQuery,
    ): UIGF.Mihoyo.LauncherResponse<UIGF.Mihoyo.Launcher.GameBasicInfo>;

    @get
    @route("/getGamePackages")
    getGamePackages(
      ...UIGF.Mihoyo.Launcher.LauncherQuery,
    ): UIGF.Mihoyo.LauncherResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/getGameChannelSDKs")
    getGameChannelSdks(
      ...UIGF.Mihoyo.Launcher.ChannelQuery,
    ): UIGF.Mihoyo.LauncherResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/getGameDeprecatedFileConfigs")
    getDeprecatedFileConfigs(
      ...UIGF.Mihoyo.Launcher.ChannelQuery,
    ): UIGF.Mihoyo.LauncherResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/getGameConfigs")
    getGameConfigs(
      ...UIGF.Mihoyo.Launcher.LauncherQuery,
    ): UIGF.Mihoyo.LauncherResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/getGameScanInfo")
    getGameScanInfo(
      ...UIGF.Mihoyo.Launcher.LauncherQuery,
    ): UIGF.Mihoyo.LauncherResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/getGameBranches")
    getGameBranches(
      ...UIGF.Mihoyo.Launcher.LauncherQuery,
    ): UIGF.Mihoyo.LauncherResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/getWPFPackages")
    getWpfPackages(
      ...UIGF.Mihoyo.Launcher.LauncherQuery,
    ): UIGF.Mihoyo.LauncherResponse<UIGF.Mihoyo.JsonObject>;

    @post
    @route("/getDXConfigs")
    getDxConfigs(
      ...UIGF.Mihoyo.Launcher.LauncherQuery,
      @body body: UIGF.Mihoyo.Launcher.DxConfigRequest,
    ): UIGF.Mihoyo.LauncherResponse<UIGF.Mihoyo.JsonObject>;
  }
}

/** HoYoPlay launcher metadata for the global launcher. */
@service(#{ title: "UIGF HoYoPlay Global API" })
@server("https://sg-hyp-api.hoyoverse.com", "Global HoYoPlay API")
namespace UIGF.Mihoyo.Launcher.Global {
  @route("/hyp/hyp-connect/api")
  interface MetadataApi {
    @get
    @route("/getAllGameBasicInfo")
    getAllGameBasicInfo(
      ...UIGF.Mihoyo.Launcher.LauncherQuery,
    ): UIGF.Mihoyo.LauncherResponse<UIGF.Mihoyo.Launcher.GameBasicInfo>;

    @get
    @route("/getGamePackages")
    getGamePackages(
      ...UIGF.Mihoyo.Launcher.LauncherQuery,
    ): UIGF.Mihoyo.LauncherResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/getGameChannelSDKs")
    getGameChannelSdks(
      ...UIGF.Mihoyo.Launcher.ChannelQuery,
    ): UIGF.Mihoyo.LauncherResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/getGameDeprecatedFileConfigs")
    getDeprecatedFileConfigs(
      ...UIGF.Mihoyo.Launcher.ChannelQuery,
    ): UIGF.Mihoyo.LauncherResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/getGameConfigs")
    getGameConfigs(
      ...UIGF.Mihoyo.Launcher.LauncherQuery,
    ): UIGF.Mihoyo.LauncherResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/getGameScanInfo")
    getGameScanInfo(
      ...UIGF.Mihoyo.Launcher.LauncherQuery,
    ): UIGF.Mihoyo.LauncherResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/getGameBranches")
    getGameBranches(
      ...UIGF.Mihoyo.Launcher.LauncherQuery,
    ): UIGF.Mihoyo.LauncherResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/getWPFPackages")
    getWpfPackages(
      ...UIGF.Mihoyo.Launcher.LauncherQuery,
    ): UIGF.Mihoyo.LauncherResponse<UIGF.Mihoyo.JsonObject>;

    @post
    @route("/getDXConfigs")
    getDxConfigs(
      ...UIGF.Mihoyo.Launcher.LauncherQuery,
      @body body: UIGF.Mihoyo.Launcher.DxConfigRequest,
    ): UIGF.Mihoyo.LauncherResponse<UIGF.Mihoyo.JsonObject>;
  }
}

/** CN Sophon chunk and incremental-patch manifests. */
@service(#{ title: "UIGF Sophon CN API" })
@server("https://downloader-api.mihoyo.com", "CN Sophon Downloader API")
namespace UIGF.Mihoyo.Launcher.Sophon.CN {
  @route("/downloader/sophon_chunk/api")
  interface BuildApi {
    @get
    @route("/getBuild")
    getBuild(
      ...UIGF.Mihoyo.Launcher.SophonBuildQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;

    @post
    @route("/getPatchBuild")
    getPatchBuild(
      ...UIGF.Mihoyo.Launcher.SophonBuildQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;
  }
}

/** Global Sophon chunk and incremental-patch manifests. */
@service(#{ title: "UIGF Sophon Global API" })
@server(
  "https://sg-downloader-api.hoyoverse.com",
  "Global Sophon Downloader API"
)
namespace UIGF.Mihoyo.Launcher.Sophon.Global {
  @route("/downloader/sophon_chunk/api")
  interface BuildApi {
    @get
    @route("/getBuild")
    getBuild(
      ...UIGF.Mihoyo.Launcher.SophonBuildQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;

    @post
    @route("/getPatchBuild")
    getPatchBuild(
      ...UIGF.Mihoyo.Launcher.SophonBuildQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;
  }
}
