import "@typespec/http";
import "@uigf/typespec-ds";

using TypeSpec.Http;

/** CN game-record APIs for Honkai Impact 3rd, Star Rail, and Zenless Zone Zero. */
@service(#{ title: "UIGF MiHoYo CN Cross-Game Record API" })
@server("https://api-takumi-record.mihoyo.com", "CN Game Record API")
namespace UIGF.Mihoyo.Game.CN.Records {
  /** Zenless ledger APIs use uid/region, while older routes use role_id/server. */
  model ZenlessLedgerQuery {
    @query
    uid?: string;

    @query
    region?: string;

    @query("role_id")
    roleId?: string;

    @query
    server?: string;

    @query
    month?: string;

    @query
    lang?: string;
  }

  @route("/game_record/app/honkai3rd/api")
  @UIGF.Mihoyo.Security.requiresDs("v2")
  interface HonkaiImpactApi {
    @get
    @route("/index")
    getIndex(
      @header("Cookie") cookie: string,
      @header("DS") ds?: string,
      ...UIGF.Mihoyo.Game.GameRecordQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;
  }

  @route("/game_record/app/hkrpg/api")
  @UIGF.Mihoyo.Security.requiresDs("v2")
  interface StarRailApi {
    @get
    @route("/index")
    getIndex(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      ...UIGF.Mihoyo.Game.GameRecordQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/note")
    getDailyNote(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      ...UIGF.Mihoyo.Game.GameRecordQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/challenge")
    getForgottenHall(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      ...UIGF.Mihoyo.Game.ScheduleRecordQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/challenge_story")
    getPureFiction(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      ...UIGF.Mihoyo.Game.ScheduleRecordQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/challenge_boss")
    getApocalypticShadow(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      ...UIGF.Mihoyo.Game.ScheduleRecordQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/rogue")
    getSimulatedUniverse(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      ...UIGF.Mihoyo.Game.ScheduleRecordQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/challenge_peak")
    getChallengePeak(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      ...UIGF.Mihoyo.Game.ScheduleRecordQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;
  }

  @route("/event/game_record_zzz/api/zzz")
  @UIGF.Mihoyo.Security.requiresDs("v2")
  interface ZenlessApi {
    @get
    @route("/index")
    getIndex(
      @header("Cookie") cookie: string,
      @header("DS") ds?: string,
      ...UIGF.Mihoyo.Game.GameRecordQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.ZenlessIndexData>;

    @get
    @route("/note")
    getDailyNote(
      @header("Cookie") cookie: string,
      ...UIGF.Mihoyo.Game.GameRecordQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.ZenlessDailyNoteData>;

    @get
    @route("/gacha_record")
    getGachaRecord(
      @header("Cookie") cookie: string,
      @query uid: string,
      @query region: string,
      @query gacha_type: int32,
      @query end_id?: int64,
      @query lang?: string,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.GachaLogPage>;

    @get
    @route("/hadal_info_v2")
    getShiyuDefense(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      @query without_v2_detail?: boolean,
      ...UIGF.Mihoyo.Game.ScheduleRecordQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.ZenlessShiyuDefenseData>;

    @get
    @route("/hadal_mem_detail_v2")
    getDeadlyAssault(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      @query schedule_type: int32,
      @query region: string,
      @query uid: string,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/void_front_battle_abstract_info")
    getThresholdSimulationSummary(
      @header("Cookie") cookie: string,
      @query region: string,
      @query uid: string,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/void_front_battle_detail")
    getThresholdSimulationDetail(
      @header("Cookie") cookie: string,
      @query region: string,
      @query uid: string,
      @query void_front_id: int32,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;
  }

  /** Mobile game-record views that do not require a DS header. */
  @route("/event/game_record_zzz/api/zzz")
  interface ZenlessMobileApi {
    @get
    @route("/abyss_abstract")
    getAbyssSummary(
      @header("Cookie") cookie?: string,
      ...UIGF.Mihoyo.RoleQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.ZenlessAbyssSummaryData>;

    @get
    @route("/abysss2_abstract")
    getAbyssSeasonTwoSummary(
      @header("Cookie") cookie?: string,
      @query region: string,
      @query uid: int64,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.ZenlessAbyssSeasonTwoSummaryData>;

    @get
    @route("/activity_calendar")
    getActivityCalendar(
      @header("Cookie") cookie?: string,
      @query region: string,
      @query uid: int64,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.ZenlessActivityCalendarData>;

    @get
    @route("/climbing_tower_detail")
    getClimbingTowerDetail(
      @header("Cookie") cookie?: string,
      @query region: string,
      @query uid: int64,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.ZenlessClimbingTowerDetailData>;

    @get
    @route("/exploration_detail")
    getExplorationDetail(
      @header("Cookie") cookie?: string,
      @query region: string,
      @query uid: int64,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.ZenlessExplorationDetailData>;

    @get
    @route("/gacha_calendar")
    getGachaCalendar(
      @header("Cookie") cookie?: string,
      @query region: string,
      @query uid: int64,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.ZenlessGachaCalendarData>;

    @get
    @route("/hadal_mem_abstract_info")
    getDeadlyAssaultSummary(
      @header("Cookie") cookie?: string,
      @query region: string,
      @query schedule_type: int32,
      @query uid: int64,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.ZenlessDeadlyAssaultSummaryData>;

    @get
    @route("/void_front_battle_period_abstract_info")
    getThresholdSimulationPeriodSummary(
      @header("Cookie") cookie?: string,
      @query region: string,
      @query schedule_type: int32,
      @query uid: int64,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.ZenlessThresholdSimulationPeriodSummaryData>;
  }
}

/** CN ledger and Zenless cultivation-tool APIs. */
@service(#{ title: "UIGF MiHoYo CN Game Event API" })
@server("https://api-takumi.mihoyo.com", "CN Takumi Event API")
namespace UIGF.Mihoyo.Game.CN.Events {
  @route("/event/srledger")
  interface StarRailLedgerApi {
    @get
    @route("/month_info")
    getMonthInfo(
      @header("Cookie") cookie: string,
      ...UIGF.Mihoyo.LedgerQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/month_detail")
    getMonthDetail(
      @header("Cookie") cookie: string,
      @query type: int32,
      @query current_page: int32,
      @query page_size?: int32,
      ...UIGF.Mihoyo.LedgerQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;
  }

  @route("/event/nap_ledger")
  interface ZenlessLedgerApi {
    @get
    @route("/month_info")
    getMonthInfo(
      @header("Cookie") cookie: string,
      ...UIGF.Mihoyo.Game.CN.Records.ZenlessLedgerQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.ZenlessLedgerMonthInfoData>;

    @get
    @route("/month_detail")
    getMonthDetail(
      @header("Cookie") cookie: string,
      @query type: string,
      @query current_page: int32,
      @query page_size?: int32,
      ...UIGF.Mihoyo.Game.CN.Records.ZenlessLedgerQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;
  }

  @route("/event/nap_cultivate_tool/user")
  interface ZenlessCultivationApi {
    @get
    @route("/item_list")
    getItems(
      @header("Cookie") cookie: string,
      @query uid: string,
      @query region: string,
      @query avatar_id: int32,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/icon_info")
    getIconInfo(
      @header("Cookie") cookie: string,
      @query uid: string,
      @query region: string,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;
  }
}

/** CN Honkai Impact 3rd real-time note uses a dedicated activity host. */
@service(#{ title: "UIGF Honkai Impact 3rd CN API" })
@server("https://act-api-takumi.mihoyo.com", "CN Activity API")
namespace UIGF.Mihoyo.Game.CN.HonkaiImpact {
  @route("/game_record/appv2/honkai3rd/api")
  @UIGF.Mihoyo.Security.requiresDs("v2")
  interface DailyNoteApi {
    @get
    @route("/note")
    getDailyNote(
      @header("Cookie") cookie: string,
      @header("DS") ds?: string,
      ...UIGF.Mihoyo.Game.GameRecordQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;
  }
}
