import "@typespec/http";
import "@uigf/typespec-ds";

using TypeSpec.Http;

/** Legacy mobile and web game-record card routes. */
@service(#{ title: "UIGF Genshin CN Legacy Game Record Card API" })
@server("https://api-takumi-record.mihoyo.com", "CN Genshin game-record card API")
namespace UIGF.Mihoyo.Game.Genshin.LegacyRecord;

@route("/game_record/card/api")
@UIGF.Mihoyo.Security.requiresDs("v1")
interface LegacyCardApi {
  @get
  @route("/getGameRecordCard")
  getGameRecordCard(
    @header("Cookie") cookie: string,
    @header("DS") ds: string,
    @query uid: string,
  ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GenshinGameRecordCardData>;
}

@route("/game_record/card/wapi")
interface WebCardApi {
  @get
  @route("/getGameRecordCard")
  getGameRecordCard(
    @header("Cookie") cookie?: string,
    @query uid: string,
  ): UIGF.Mihoyo.ApiResponse<UIGF.Mihoyo.Game.Response.GenshinGameRecordCardData>;
}
