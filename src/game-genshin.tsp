import "@typespec/http";
import "@uigf/typespec-ds";

using TypeSpec.Http;

/** CN Genshin game-record APIs used by TeyvatGuide, Snap Hutao, and Starward. */
@service(#{ title: "UIGF Genshin CN Game Record API" })
@server("https://api-takumi-record.mihoyo.com", "CN Genshin Game Record API")
namespace UIGF.Mihoyo.Game.Genshin.Record {
  @route("/game_record/app/genshin/api")
  @UIGF.Mihoyo.Security.requiresDs("v2")
  interface GameRecordApi {
    @get
    @route("/index")
    getIndex(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      @query avatar_list_type?: int32,
      ...UIGF.Mihoyo.Game.GameRecordQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GenshinRecordIndexData>;

    @post
    @route("/character/list")
    listCharacters(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      @body body: UIGF.Mihoyo.Game.CharacterListRequest,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.CharacterList>;

    /** Character IDs should be sent in batches of at most 40, as used by TeyvatGuide. */
    @post
    @route("/character/detail")
    getCharacterDetails(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      @body body: UIGF.Mihoyo.Game.CharacterDetailRequest,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.CharacterList>;

    @get
    @route("/dailyNote")
    getDailyNote(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      ...UIGF.Mihoyo.Game.GameRecordQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GenshinDailyNoteData>;

    @get
    @route("/spiralAbyss")
    getSpiralAbyss(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      ...UIGF.Mihoyo.Game.ScheduleRecordQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GenshinSpiralAbyssData>;

    @get
    @route("/role_combat")
    getImaginariumTheater(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      @query active?: int32,
      ...UIGF.Mihoyo.Game.ScheduleRecordQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GenshinTheaterData>;

    @get
    @route("/char_master")
    getCharacterMaster(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      ...UIGF.Mihoyo.Game.GameRecordQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GenshinCharacterMasterData>;

    @get
    @route("/hard_challenge")
    getStygianOnslaught(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      ...UIGF.Mihoyo.Game.ScheduleRecordQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GenshinStygianData>;

    @get
    @route("/hard_challenge/popularity")
    getStygianPopularity(
      @query server: string,
      @query role_id: int64,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GenshinStygianPopularityData>;

    @post
    @route("/act_calendar")
    getActivityCalendar(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      @header("x-rpc-challenge") challenge?: string,
      @body body: UIGF.Mihoyo.Game.CharacterListRequest,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GenshinActivityCalendarData>;

    @get
    @route("/tps")
    getCharacterTps(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      ...UIGF.Mihoyo.Game.GameRecordQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/external_content")
    getExternalContent(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      @query item_id: int64,
      @query item_type: int32,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GenshinExternalContentData>;

    @get
    @route("/roleBasicInfo")
    getRoleBasicInfo(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      ...UIGF.Mihoyo.RoleQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GenshinRoleBasicInfoData>;

    @get
    @route("/tool")
    getTool(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      @header("x-rpc-challenge") challenge?: string,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GenshinToolData>;
  }

  @route("/game_record/app/genshin/api/gcg")
  @UIGF.Mihoyo.Security.requiresDs("v2")
  interface GcgApi {
    @get
    @route("/basicInfo")
    getBasicInfo(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      ...UIGF.Mihoyo.RoleQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GcgBasicInfoData>;

    @get
    @route("/cardBackList")
    getCardBackList(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      ...UIGF.Mihoyo.RoleQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GcgCardBackListData>;

    @get
    @route("/cardList")
    getCardList(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      @query limit: int32,
      @query need_action: boolean,
      @query need_avatar: boolean,
      @query need_stats: boolean,
      @query offset: int32,
      ...UIGF.Mihoyo.RoleQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GcgCardListData>;

    @get
    @route("/challenge/record")
    getChallengeRecord(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      @query schedule_id: int64,
      ...UIGF.Mihoyo.RoleQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GcgChallengeRecordData>;

    @get
    @route("/challenge/schedule")
    getChallengeSchedule(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      ...UIGF.Mihoyo.RoleQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GcgChallengeScheduleData>;

    @get
    @route("/deckList")
    getDeckList(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      ...UIGF.Mihoyo.RoleQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GcgDeckListData>;

    @get
    @route("/getGCGCovers")
    getCovers(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      ...UIGF.Mihoyo.RoleQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GcgCoversData>;

    @get
    @route("/matchList")
    getMatchList(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      ...UIGF.Mihoyo.RoleQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GcgMatchListData>;
  }

  @route("/game_record/app/card/wapi")
  @UIGF.Mihoyo.Security.requiresDs("v2")
  interface CardApi {
    @get
    @route("/getGameRecordCard")
    getGameRecordCard(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      @query uid: string,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GenshinGameRecordCardData>;
  }
}

/** CN Genshin gacha-history endpoints. Respect the vendor's request rate limits. */
@service(#{ title: "UIGF Genshin CN Gacha API" })
@server("https://public-operation-hk4e.mihoyo.com", "CN Genshin Gacha API")
namespace UIGF.Mihoyo.Game.Genshin.Gacha {
  @route("/gacha_info/api")
  interface GachaLogApi {
    @get
    @route("/getGachaLog")
    getHistory(
      ...UIGF.Mihoyo.Game.GenshinGachaQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.GachaLogPage>;

    @get
    @route("/getBeyondGachaLog")
    getBeyondHistory(
      ...UIGF.Mihoyo.Game.GenshinGachaQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.GachaLogPage>;
  }
}

/** CN Genshin announcement endpoints. */
@service(#{ title: "UIGF Genshin CN Announcement API" })
@server("https://hk4e-ann-api.mihoyo.com", "CN Genshin Announcement API")
namespace UIGF.Mihoyo.Game.Genshin.Announcements {
  @route("/common/hk4e_cn/announcement/api")
  interface AnnouncementApi {
    @get
    @route("/getAnnList")
    list(
      ...UIGF.Mihoyo.AnnouncementQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.AnnouncementListData>;

    @get
    @route("/getAlertAnn")
    getAlert(
      ...UIGF.Mihoyo.AnnouncementQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.AnnouncementAlertData>;

    @get
    @route("/getAlertPic")
    getAlertPicture(
      ...UIGF.Mihoyo.AnnouncementQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.AnnouncementPictureData>;
  }

}

/** CN announcement detail content is served by the static announcement origin. */
@service(#{ title: "UIGF Genshin CN Announcement Content API" })
@server("https://hk4e-ann-static.mihoyo.com", "CN Genshin announcement content API")
namespace UIGF.Mihoyo.Game.Genshin.AnnouncementContent {
  model ContentQuery extends UIGF.Mihoyo.AnnouncementQuery {
    @query
    t?: string;
  }

  @route("/common/hk4e_cn/announcement/api")
  interface ContentApi {
    @get
    @route("/getAnnContent")
    get(
      ...ContentQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.AnnouncementContentData>;
  }
}

/** CN UGC announcement alerts use a distinct route on the announcement host. */
@service(#{ title: "UIGF Genshin CN UGC Announcement API" })
@server("https://hk4e-ann-api.mihoyo.com", "CN Genshin UGC announcement API")
namespace UIGF.Mihoyo.Game.Genshin.UgcAnnouncements {
  @route("/common/hk4eugc_cn/announcement/api")
  interface UgcApi {
    @get
    @route("/getAlertAnn")
    getAlert(
      ...UIGF.Mihoyo.AnnouncementQuery,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.AnnouncementAlertData>;
  }
}

/** CN Genshin SDK QR-login and granter-login endpoints. */
@service(#{ title: "UIGF Genshin CN SDK Login API" })
@server("https://hk4e-sdk.mihoyo.com", "CN Genshin SDK API")
namespace UIGF.Mihoyo.Game.Genshin.Login {
  @route("/hk4e_cn/combo/panda/qrcode")
  interface PandaQrApi {
    /** The upstream endpoint is deprecated; use only where officially supported. */
    @post
    @route("/fetch")
    create(
      @body body: UIGF.Mihoyo.Game.PandaQrRequest,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.PandaQrResponse>;

    /** The upstream endpoint is deprecated; use only where officially supported. */
    @post
    @route("/query")
    getStatus(
      @body body: UIGF.Mihoyo.Game.PandaQrRequest,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.PandaQrResponse>;
  }

  @route("/hk4e_cn/combo/granter/login/v2")
  interface GranterApi {
    /** Submits the caller-provided official granter login payload. */
    @post
    @route("/login")
    login(
      ...UIGF.Mihoyo.Game.Genshin.SDK.ClientHeaders,
      @body body: UIGF.Mihoyo.Game.Genshin.SDK.GranterLoginRequest,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GranterLoginData>;
  }

}

/** CN Genshin Traveller's Diary ledger APIs. */
@service(#{ title: "UIGF Genshin CN Ledger API" })
@server("https://hk4e-api.mihoyo.com", "CN Genshin Ledger API")
namespace UIGF.Mihoyo.Game.Genshin.Ledger {
  @route("/event/ys_ledger")
  @UIGF.Mihoyo.Security.requiresDs("v2")
  interface LedgerApi {
    @get
    @route("/monthInfo")
    getMonthInfo(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      @query month?: int32,
      @query bind_uid: string,
      @query bind_region: string,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;

    @get
    @route("/monthDetail")
    getMonthDetail(
      @header("Cookie") cookie: string,
      @header("DS") ds: string,
      @query month: int32,
      @query page: int32,
      @query type: int32,
      @query limit?: int32,
      @query bind_uid: string,
      @query bind_region: string,
    ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.JsonObject>;
  }
}
