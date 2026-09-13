// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface ZenlessLedgerMonthInfoData */
export interface ZenlessLedgerMonthInfoData {
  currentMonth?: string;
  dataMonth?: string;
  monthData?: Record<string, any>;
  optionalMonth?: string[];
  region?: string;
  roleInfo?: Record<string, any>;
  uid?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function zenlessLedgerMonthInfoDataDeserializer(item: any): ZenlessLedgerMonthInfoData {
  return {
    additionalProperties: serializeRecord(item, [
      "current_month",
      "data_month",
      "month_data",
      "optional_month",
      "region",
      "role_info",
      "uid",
    ]),
    currentMonth: item["current_month"],
    dataMonth: item["data_month"],
    monthData: !item["month_data"]
      ? item["month_data"]
      : Object.fromEntries(
          Object.entries(item["month_data"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    optionalMonth: !item["optional_month"]
      ? item["optional_month"]
      : item["optional_month"].map((p: any) => {
          return p;
        }),
    region: item["region"],
    roleInfo: !item["role_info"]
      ? item["role_info"]
      : Object.fromEntries(
          Object.entries(item["role_info"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    uid: item["uid"],
  };
}
