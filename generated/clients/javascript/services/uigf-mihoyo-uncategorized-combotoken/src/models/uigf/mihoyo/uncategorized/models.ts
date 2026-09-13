// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../static-helpers/serialization/serialize-record.js";

/** model interface ComboTokenRequest */
export interface ComboTokenRequest {
  biz: string;
}

export function comboTokenRequestSerializer(item: ComboTokenRequest): any {
  return { biz: item["biz"] };
}

/** model interface ComboTokenUploadCredentials */
export interface ComboTokenUploadCredentials {
  accessKeyId?: string;
  accessKeySecret?: string;
  bucket?: string;
  dir?: string;
  endpoint?: string;
  expire?: string;
  expireStr?: string;
  ossCallbackUrl?: string;
  region?: string;
  securityToken?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function comboTokenUploadCredentialsDeserializer(item: any): ComboTokenUploadCredentials {
  return {
    additionalProperties: serializeRecord(item, [
      "access_key_id",
      "access_key_secret",
      "bucket",
      "dir",
      "endpoint",
      "expire",
      "expire_str",
      "oss_callback_url",
      "region",
      "security_token",
    ]),
    accessKeyId: item["access_key_id"],
    accessKeySecret: item["access_key_secret"],
    bucket: item["bucket"],
    dir: item["dir"],
    endpoint: item["endpoint"],
    expire: item["expire"],
    expireStr: item["expire_str"],
    ossCallbackUrl: item["oss_callback_url"],
    region: item["region"],
    securityToken: item["security_token"],
  };
}
