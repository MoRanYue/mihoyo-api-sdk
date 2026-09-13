// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface CommunityAppConfigData */
export interface CommunityAppConfigData {
  config?: Record<string, string>;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function communityAppConfigDataDeserializer(item: any): CommunityAppConfigData {
  return {
    additionalProperties: serializeRecord(item, ["config"]),
    config: !item["config"]
      ? item["config"]
      : Object.fromEntries(Object.entries(item["config"]).map(([k, p]: [string, any]) => [k, p])),
  };
}

/** model interface CommunityHomeData */
export interface CommunityHomeData {
  albumCard?: any[];
  background?: Record<string, any>;
  breakFrameCard?: any;
  carousels?: any;
  discussion?: any;
  exposedResourceTickets?: any[];
  gameReceptions?: Record<string, any>[];
  hotTopics?: any;
  imagePostCard?: any[];
  isResourceUnchanged?: boolean;
  lightInteractiveCard?: any;
  linkCard?: any[];
  linkTopicCard?: any[];
  lives?: any[];
  navigator?: Record<string, any>[];
  official?: Record<string, any>;
  perspectiveCard?: any;
  posts?: any[];
  recommendVilla?: any;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function communityHomeDataDeserializer(item: any): CommunityHomeData {
  return {
    additionalProperties: serializeRecord(item, [
      "album_card",
      "background",
      "break_frame_card",
      "carousels",
      "discussion",
      "exposed_resource_tickets",
      "game_receptions",
      "hot_topics",
      "image_post_card",
      "is_resource_unchanged",
      "light_interactive_card",
      "link_card",
      "link_topic_card",
      "lives",
      "navigator",
      "official",
      "perspective_card",
      "posts",
      "recommend_villa",
    ]),
    albumCard: !item["album_card"]
      ? item["album_card"]
      : item["album_card"].map((p: any) => {
          return p;
        }),
    background: !item["background"]
      ? item["background"]
      : Object.fromEntries(
          Object.entries(item["background"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    breakFrameCard: item["break_frame_card"],
    carousels: item["carousels"],
    discussion: item["discussion"],
    exposedResourceTickets: !item["exposed_resource_tickets"]
      ? item["exposed_resource_tickets"]
      : item["exposed_resource_tickets"].map((p: any) => {
          return p;
        }),
    gameReceptions: !item["game_receptions"]
      ? item["game_receptions"]
      : item["game_receptions"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    hotTopics: item["hot_topics"],
    imagePostCard: !item["image_post_card"]
      ? item["image_post_card"]
      : item["image_post_card"].map((p: any) => {
          return p;
        }),
    isResourceUnchanged: item["is_resource_unchanged"],
    lightInteractiveCard: item["light_interactive_card"],
    linkCard: !item["link_card"]
      ? item["link_card"]
      : item["link_card"].map((p: any) => {
          return p;
        }),
    linkTopicCard: !item["link_topic_card"]
      ? item["link_topic_card"]
      : item["link_topic_card"].map((p: any) => {
          return p;
        }),
    lives: !item["lives"]
      ? item["lives"]
      : item["lives"].map((p: any) => {
          return p;
        }),
    navigator: !item["navigator"]
      ? item["navigator"]
      : item["navigator"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    official: !item["official"]
      ? item["official"]
      : Object.fromEntries(Object.entries(item["official"]).map(([k, p]: [string, any]) => [k, p])),
    perspectiveCard: item["perspective_card"],
    posts: !item["posts"]
      ? item["posts"]
      : item["posts"].map((p: any) => {
          return p;
        }),
    recommendVilla: item["recommend_villa"],
  };
}
