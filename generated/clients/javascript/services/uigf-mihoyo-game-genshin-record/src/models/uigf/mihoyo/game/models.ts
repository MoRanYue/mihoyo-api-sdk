// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../static-helpers/serialization/serialize-record.js";

/** model interface CharacterListRequest */
export interface CharacterListRequest {
  roleId: string;
  server: string;
  sortType?: number;
}

export function characterListRequestSerializer(item: CharacterListRequest): any {
  return { role_id: item["roleId"], server: item["server"], sort_type: item["sortType"] };
}

/** model interface CharacterList */
export interface CharacterList {
  list: Character[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function characterListDeserializer(item: any): CharacterList {
  return {
    additionalProperties: serializeRecord(item, ["list"]),
    list: characterArrayDeserializer(item["list"]),
  };
}

export function characterArrayDeserializer(result: Array<Character>): any[] {
  return result.map((item) => {
    return characterDeserializer(item);
  });
}

/** model interface Character */
export interface Character {
  id?: number;
  name?: string;
  level?: number;
  image?: string;
  icon?: string;
  rarity?: number;
  element?: string;
  fetter?: number;
  activedConstellationNum?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function characterDeserializer(item: any): Character {
  return {
    additionalProperties: serializeRecord(item, [
      "id",
      "name",
      "level",
      "image",
      "icon",
      "rarity",
      "element",
      "fetter",
      "actived_constellation_num",
    ]),
    id: item["id"],
    name: item["name"],
    level: item["level"],
    image: item["image"],
    icon: item["icon"],
    rarity: item["rarity"],
    element: item["element"],
    fetter: item["fetter"],
    activedConstellationNum: item["actived_constellation_num"],
  };
}

/** model interface CharacterDetailRequest */
export interface CharacterDetailRequest extends CharacterListRequest {
  characterIds: (string | number)[];
}

export function characterDetailRequestSerializer(item: CharacterDetailRequest): any {
  return {
    role_id: item["roleId"],
    server: item["server"],
    sort_type: item["sortType"],
    character_ids: _characterDetailRequestCharacterIdArraySerializer(item["characterIds"]),
  };
}

export function _characterDetailRequestCharacterIdArraySerializer(
  result: Array<_CharacterDetailRequestCharacterId>,
): any[] {
  return result.map((item) => {
    return _characterDetailRequestCharacterIdSerializer(item);
  });
}

/** Alias for _CharacterDetailRequestCharacterId */
export type _CharacterDetailRequestCharacterId = string | number;

export function _characterDetailRequestCharacterIdSerializer(
  item: _CharacterDetailRequestCharacterId,
): any {
  return item;
}
