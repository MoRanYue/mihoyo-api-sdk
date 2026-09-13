// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { GateAddressData, gateAddressDataDeserializer } from "./game/response/models.js";

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponseGateAddressData {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: GateAddressData;
}

export function apiResponseGateAddressDataDeserializer(item: any): ApiResponseGateAddressData {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: gateAddressDataDeserializer(item["data"]),
  };
}
