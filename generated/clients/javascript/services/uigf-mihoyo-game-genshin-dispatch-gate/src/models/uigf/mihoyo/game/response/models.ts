// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface GateAddressData */
export interface GateAddressData {
  addressList?: GateAddress[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function gateAddressDataDeserializer(item: any): GateAddressData {
  return {
    additionalProperties: serializeRecord(item, ["address_list"]),
    addressList: !item["address_list"]
      ? item["address_list"]
      : gateAddressArrayDeserializer(item["address_list"]),
  };
}

export function gateAddressArrayDeserializer(result: Array<GateAddress>): any[] {
  return result.map((item) => {
    return gateAddressDeserializer(item);
  });
}

/** Gateway IP and port candidates returned by the CN dispatch service. */
export interface GateAddress {
  ip?: string;
  port?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function gateAddressDeserializer(item: any): GateAddress {
  return {
    additionalProperties: serializeRecord(item, ["ip", "port"]),
    ip: item["ip"],
    port: item["port"],
  };
}
