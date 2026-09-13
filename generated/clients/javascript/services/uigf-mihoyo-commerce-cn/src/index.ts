// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoCommerceCNClient } from "./mihoyoCommerceCNClient.js";
export type {
  ApiResponseShopGoods,
  JsonObject,
  ApiResponseCurrencyAndCountry,
  ApiResponseJsonObject,
  ApiResponseOrderStatus,
} from "./models/uigf/mihoyo/index.js";
export type {
  ShopGoodsRequest,
  ShopGoods,
  ShopGood,
  BonusDescription,
  CurrencyAndCountry,
  CreateOrderRequest,
  OrderStatus,
} from "./models/uigf/mihoyo/commerce/index.js";
export type { MihoyoCommerceCNClientOptionalParams } from "./api/index.js";
export type {
  ShopApiCheckOrderOptionalParams,
  ShopApiCreateOrderOptionalParams,
  ShopApiGetCurrencyAndCountryByIpOptionalParams,
  ShopApiFetchGoodsOptionalParams,
} from "./api/shopApi/index.js";
export type { ShopApiOperations } from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
