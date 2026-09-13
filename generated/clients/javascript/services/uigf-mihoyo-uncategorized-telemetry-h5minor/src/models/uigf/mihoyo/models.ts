// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */

/** Common response wrapper returned by MiHoYo and HoYoLAB services. */
export interface ApiResponse {
  /** Vendor result code. `0` normally represents success. */
  retcode: number;
  /** Vendor diagnostic message. */
  message: string;
  /** Endpoint-specific payload. */
  data: any;
}

export function apiResponseDeserializer(item: any): ApiResponse {
  return {
    retcode: item["retcode"],
    message: item["message"],
    data: item["data"],
  };
}
