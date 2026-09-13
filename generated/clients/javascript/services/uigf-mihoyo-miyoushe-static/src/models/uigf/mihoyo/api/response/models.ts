// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface StaticResourceData */
export interface StaticResourceData {
  divider?: Record<string, any>[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function staticResourceDataDeserializer(item: any): StaticResourceData {
  return {
    additionalProperties: serializeRecord(item, ["divider"]),
    divider: !item["divider"]
      ? item["divider"]
      : item["divider"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
  };
}

/** model interface StaticResourceVersionsData */
export interface StaticResourceVersionsData {
  divider?: string;
  emoticonSet?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function staticResourceVersionsDataDeserializer(item: any): StaticResourceVersionsData {
  return {
    additionalProperties: serializeRecord(item, ["divider", "emoticon_set"]),
    divider: item["divider"],
    emoticonSet: item["emoticon_set"],
  };
}

/** model interface StaticLatestVersionData */
export interface StaticLatestVersionData {
  version?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function staticLatestVersionDataDeserializer(item: any): StaticLatestVersionData {
  return {
    additionalProperties: serializeRecord(item, ["version"]),
    version: item["version"],
  };
}

/** model interface StaticPreKeywordData */
export interface StaticPreKeywordData {
  list?: string[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function staticPreKeywordDataDeserializer(item: any): StaticPreKeywordData {
  return {
    additionalProperties: serializeRecord(item, ["list"]),
    list: !item["list"]
      ? item["list"]
      : item["list"].map((p: any) => {
          return p;
        }),
  };
}
