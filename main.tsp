import "@typespec/http";
import "@typespec/openapi3";
import "@uigf/typespec-ds";

import "./src/common.tsp";
import "./src/security.tsp";
import "./src/passport.tsp";
import "./src/passport-v4.tsp";
import "./src/community.tsp";
import "./src/luna.tsp";
import "./src/game.tsp";
import "./src/game-account.tsp";
import "./src/game-genshin.tsp";
import "./src/game-genshin-record-legacy.tsp";
import "./src/game-genshin-dispatch.tsp";
import "./src/game-genshin-sdk.tsp";
import "./src/game-global.tsp";
import "./src/game-records-cn.tsp";
import "./src/launcher.tsp";
import "./src/utility.tsp";
import "./src/commerce.tsp";
import "./src/uncategorized.tsp";
import "./src/api-surface.tsp";
import "./src/api-response-models.tsp";
import "./src/api-request-models.tsp";
import "./src/game-response-models.tsp";

using TypeSpec.Http;

/**
 * Unified contracts for the MiHoYo/miHoYo, MiYouShe, HoYoLAB and HoYoverse APIs.
 * This is an unofficial community SDK contract.
 */
namespace UIGF.Mihoyo;
