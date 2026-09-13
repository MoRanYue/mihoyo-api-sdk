// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface GenshinRecordIndexData */
export interface GenshinRecordIndexData {
  avatars?: Record<string, any>[];
  cityExplorations?: any[];
  homes?: Record<string, any>[];
  queryToolImage?: string;
  queryToolLink?: string;
  role?: GenshinRecordRole;
  stats?: Record<string, any>;
  worldExplorationDisplay?: Record<string, any>[];
  worldExplorations?: Record<string, any>[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function genshinRecordIndexDataDeserializer(item: any): GenshinRecordIndexData {
  return {
    additionalProperties: serializeRecord(item, [
      "avatars",
      "city_explorations",
      "homes",
      "query_tool_image",
      "query_tool_link",
      "role",
      "stats",
      "world_exploration_display",
      "world_explorations",
    ]),
    avatars: !item["avatars"]
      ? item["avatars"]
      : item["avatars"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    cityExplorations: !item["city_explorations"]
      ? item["city_explorations"]
      : item["city_explorations"].map((p: any) => {
          return p;
        }),
    homes: !item["homes"]
      ? item["homes"]
      : item["homes"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    queryToolImage: item["query_tool_image"],
    queryToolLink: item["query_tool_link"],
    role: !item["role"] ? item["role"] : genshinRecordRoleDeserializer(item["role"]),
    stats: !item["stats"]
      ? item["stats"]
      : Object.fromEntries(Object.entries(item["stats"]).map(([k, p]: [string, any]) => [k, p])),
    worldExplorationDisplay: !item["world_exploration_display"]
      ? item["world_exploration_display"]
      : item["world_exploration_display"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    worldExplorations: !item["world_explorations"]
      ? item["world_explorations"]
      : item["world_explorations"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
  };
}

/** model interface GenshinRecordRole */
export interface GenshinRecordRole {
  avatarUrl?: string;
  gameHeadIcon?: string;
  level?: number;
  nickname?: string;
  region?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function genshinRecordRoleDeserializer(item: any): GenshinRecordRole {
  return {
    additionalProperties: serializeRecord(item, [
      "AvatarUrl",
      "game_head_icon",
      "level",
      "nickname",
      "region",
    ]),
    avatarUrl: item["AvatarUrl"],
    gameHeadIcon: item["game_head_icon"],
    level: item["level"],
    nickname: item["nickname"],
    region: item["region"],
  };
}

/** model interface GenshinDailyNoteData */
export interface GenshinDailyNoteData {
  archonQuestProgress?: Record<string, any>;
  calendarUrl?: string;
  currentExpeditionNum?: number;
  currentHomeCoin?: number;
  currentResin?: number;
  dailyTask?: Record<string, any>;
  expeditions?: Record<string, any>[];
  finishedTaskNum?: number;
  homeCoinRecoveryTime?: string;
  isExtraTaskRewardReceived?: boolean;
  maxExpeditionNum?: number;
  maxHomeCoin?: number;
  maxResin?: number;
  remainResinDiscountNum?: number;
  resinDiscountNumLimit?: number;
  resinRecoveryTime?: string;
  totalTaskNum?: number;
  transformer?: Record<string, any>;
  weekActiveProgress?: Record<string, any>;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function genshinDailyNoteDataDeserializer(item: any): GenshinDailyNoteData {
  return {
    additionalProperties: serializeRecord(item, [
      "archon_quest_progress",
      "calendar_url",
      "current_expedition_num",
      "current_home_coin",
      "current_resin",
      "daily_task",
      "expeditions",
      "finished_task_num",
      "home_coin_recovery_time",
      "is_extra_task_reward_received",
      "max_expedition_num",
      "max_home_coin",
      "max_resin",
      "remain_resin_discount_num",
      "resin_discount_num_limit",
      "resin_recovery_time",
      "total_task_num",
      "transformer",
      "week_active_progress",
    ]),
    archonQuestProgress: !item["archon_quest_progress"]
      ? item["archon_quest_progress"]
      : Object.fromEntries(
          Object.entries(item["archon_quest_progress"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    calendarUrl: item["calendar_url"],
    currentExpeditionNum: item["current_expedition_num"],
    currentHomeCoin: item["current_home_coin"],
    currentResin: item["current_resin"],
    dailyTask: !item["daily_task"]
      ? item["daily_task"]
      : Object.fromEntries(
          Object.entries(item["daily_task"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    expeditions: !item["expeditions"]
      ? item["expeditions"]
      : item["expeditions"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    finishedTaskNum: item["finished_task_num"],
    homeCoinRecoveryTime: item["home_coin_recovery_time"],
    isExtraTaskRewardReceived: item["is_extra_task_reward_received"],
    maxExpeditionNum: item["max_expedition_num"],
    maxHomeCoin: item["max_home_coin"],
    maxResin: item["max_resin"],
    remainResinDiscountNum: item["remain_resin_discount_num"],
    resinDiscountNumLimit: item["resin_discount_num_limit"],
    resinRecoveryTime: item["resin_recovery_time"],
    totalTaskNum: item["total_task_num"],
    transformer: !item["transformer"]
      ? item["transformer"]
      : Object.fromEntries(
          Object.entries(item["transformer"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    weekActiveProgress: !item["week_active_progress"]
      ? item["week_active_progress"]
      : Object.fromEntries(
          Object.entries(item["week_active_progress"]).map(([k, p]: [string, any]) => [k, p]),
        ),
  };
}

/** model interface GenshinSpiralAbyssData */
export interface GenshinSpiralAbyssData {
  damageRank?: any[];
  defeatRank?: any[];
  endTime?: string;
  energySkillRank?: any[];
  floors?: any[];
  isJustSkippedFloor?: boolean;
  isUnlock?: boolean;
  maxFloor?: string;
  normalSkillRank?: any[];
  revealRank?: any[];
  scheduleId?: number;
  skippedFloor?: string;
  startTime?: string;
  takeDamageRank?: any[];
  totalBattleTimes?: number;
  totalStar?: number;
  totalWinTimes?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function genshinSpiralAbyssDataDeserializer(item: any): GenshinSpiralAbyssData {
  return {
    additionalProperties: serializeRecord(item, [
      "damage_rank",
      "defeat_rank",
      "end_time",
      "energy_skill_rank",
      "floors",
      "is_just_skipped_floor",
      "is_unlock",
      "max_floor",
      "normal_skill_rank",
      "reveal_rank",
      "schedule_id",
      "skipped_floor",
      "start_time",
      "take_damage_rank",
      "total_battle_times",
      "total_star",
      "total_win_times",
    ]),
    damageRank: !item["damage_rank"]
      ? item["damage_rank"]
      : item["damage_rank"].map((p: any) => {
          return p;
        }),
    defeatRank: !item["defeat_rank"]
      ? item["defeat_rank"]
      : item["defeat_rank"].map((p: any) => {
          return p;
        }),
    endTime: item["end_time"],
    energySkillRank: !item["energy_skill_rank"]
      ? item["energy_skill_rank"]
      : item["energy_skill_rank"].map((p: any) => {
          return p;
        }),
    floors: !item["floors"]
      ? item["floors"]
      : item["floors"].map((p: any) => {
          return p;
        }),
    isJustSkippedFloor: item["is_just_skipped_floor"],
    isUnlock: item["is_unlock"],
    maxFloor: item["max_floor"],
    normalSkillRank: !item["normal_skill_rank"]
      ? item["normal_skill_rank"]
      : item["normal_skill_rank"].map((p: any) => {
          return p;
        }),
    revealRank: !item["reveal_rank"]
      ? item["reveal_rank"]
      : item["reveal_rank"].map((p: any) => {
          return p;
        }),
    scheduleId: item["schedule_id"],
    skippedFloor: item["skipped_floor"],
    startTime: item["start_time"],
    takeDamageRank: !item["take_damage_rank"]
      ? item["take_damage_rank"]
      : item["take_damage_rank"].map((p: any) => {
          return p;
        }),
    totalBattleTimes: item["total_battle_times"],
    totalStar: item["total_star"],
    totalWinTimes: item["total_win_times"],
  };
}

/** model interface GenshinTheaterData */
export interface GenshinTheaterData {
  data?: Record<string, any>[];
  isUnlock?: boolean;
  links?: Record<string, any>;
  tarotCardState?: Record<string, any>;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function genshinTheaterDataDeserializer(item: any): GenshinTheaterData {
  return {
    additionalProperties: serializeRecord(item, ["data", "is_unlock", "links", "tarot_card_state"]),
    data: !item["data"]
      ? item["data"]
      : item["data"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    isUnlock: item["is_unlock"],
    links: !item["links"]
      ? item["links"]
      : Object.fromEntries(Object.entries(item["links"]).map(([k, p]: [string, any]) => [k, p])),
    tarotCardState: !item["tarot_card_state"]
      ? item["tarot_card_state"]
      : Object.fromEntries(
          Object.entries(item["tarot_card_state"]).map(([k, p]: [string, any]) => [k, p]),
        ),
  };
}

/** model interface GenshinCharacterMasterData */
export interface GenshinCharacterMasterData {
  isUnlock?: boolean;
  list?: Record<string, any>[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function genshinCharacterMasterDataDeserializer(item: any): GenshinCharacterMasterData {
  return {
    additionalProperties: serializeRecord(item, ["is_unlock", "list"]),
    isUnlock: item["is_unlock"],
    list: !item["list"]
      ? item["list"]
      : item["list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
  };
}

/** model interface GenshinStygianData */
export interface GenshinStygianData {
  data?: Record<string, any>[];
  isUnlock?: boolean;
  links?: Record<string, any>;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function genshinStygianDataDeserializer(item: any): GenshinStygianData {
  return {
    additionalProperties: serializeRecord(item, ["data", "is_unlock", "links"]),
    data: !item["data"]
      ? item["data"]
      : item["data"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    isUnlock: item["is_unlock"],
    links: !item["links"]
      ? item["links"]
      : Object.fromEntries(Object.entries(item["links"]).map(([k, p]: [string, any]) => [k, p])),
  };
}

/** model interface GenshinStygianPopularityData */
export interface GenshinStygianPopularityData {
  avatarList?: Record<string, any>[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function genshinStygianPopularityDataDeserializer(item: any): GenshinStygianPopularityData {
  return {
    additionalProperties: serializeRecord(item, ["avatar_list"]),
    avatarList: !item["avatar_list"]
      ? item["avatar_list"]
      : item["avatar_list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
  };
}

/** model interface GenshinActivityCalendarData */
export interface GenshinActivityCalendarData {
  actList?: Record<string, any>[];
  avatarCardPoolList?: Record<string, any>[];
  fixedActList?: Record<string, any>[];
  mixedCardPoolList?: any[];
  selectedActList?: Record<string, any>[];
  selectedAvatarCardPoolList?: Record<string, any>[];
  selectedMixedCardPoolList?: any[];
  weaponCardPoolList?: Record<string, any>[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function genshinActivityCalendarDataDeserializer(item: any): GenshinActivityCalendarData {
  return {
    additionalProperties: serializeRecord(item, [
      "act_list",
      "avatar_card_pool_list",
      "fixed_act_list",
      "mixed_card_pool_list",
      "selected_act_list",
      "selected_avatar_card_pool_list",
      "selected_mixed_card_pool_list",
      "weapon_card_pool_list",
    ]),
    actList: !item["act_list"]
      ? item["act_list"]
      : item["act_list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    avatarCardPoolList: !item["avatar_card_pool_list"]
      ? item["avatar_card_pool_list"]
      : item["avatar_card_pool_list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    fixedActList: !item["fixed_act_list"]
      ? item["fixed_act_list"]
      : item["fixed_act_list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    mixedCardPoolList: !item["mixed_card_pool_list"]
      ? item["mixed_card_pool_list"]
      : item["mixed_card_pool_list"].map((p: any) => {
          return p;
        }),
    selectedActList: !item["selected_act_list"]
      ? item["selected_act_list"]
      : item["selected_act_list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    selectedAvatarCardPoolList: !item["selected_avatar_card_pool_list"]
      ? item["selected_avatar_card_pool_list"]
      : item["selected_avatar_card_pool_list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    selectedMixedCardPoolList: !item["selected_mixed_card_pool_list"]
      ? item["selected_mixed_card_pool_list"]
      : item["selected_mixed_card_pool_list"].map((p: any) => {
          return p;
        }),
    weaponCardPoolList: !item["weapon_card_pool_list"]
      ? item["weapon_card_pool_list"]
      : item["weapon_card_pool_list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
  };
}

/** model interface GenshinExternalContentData */
export interface GenshinExternalContentData {
  caculatorUrl?: string;
  lineupUrl?: string;
  strategyUrl?: string;
  wikiUrl?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function genshinExternalContentDataDeserializer(item: any): GenshinExternalContentData {
  return {
    additionalProperties: serializeRecord(item, [
      "caculator_url",
      "lineup_url",
      "strategy_url",
      "wiki_url",
    ]),
    caculatorUrl: item["caculator_url"],
    lineupUrl: item["lineup_url"],
    strategyUrl: item["strategy_url"],
    wikiUrl: item["wiki_url"],
  };
}

/** model interface GenshinRoleBasicInfoData */
export interface GenshinRoleBasicInfoData extends GenshinRecordRole {
  cardPlayLevel?: number;
}

export function genshinRoleBasicInfoDataDeserializer(item: any): GenshinRoleBasicInfoData {
  return {
    additionalProperties: serializeRecord(item, [
      "AvatarUrl",
      "game_head_icon",
      "level",
      "nickname",
      "region",
      "card_play_level",
    ]),
    avatarUrl: item["AvatarUrl"],
    gameHeadIcon: item["game_head_icon"],
    level: item["level"],
    nickname: item["nickname"],
    region: item["region"],
    cardPlayLevel: item["card_play_level"],
  };
}

/** model interface GenshinToolData */
export interface GenshinToolData {
  tools?: Record<string, any>[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function genshinToolDataDeserializer(item: any): GenshinToolData {
  return {
    additionalProperties: serializeRecord(item, ["tools"]),
    tools: !item["tools"]
      ? item["tools"]
      : item["tools"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
  };
}

/** model interface GcgBasicInfoData */
export interface GcgBasicInfoData {
  actionCardNumGained?: number;
  actionCardNumTotal?: number;
  avatarCardNumGained?: number;
  avatarCardNumTotal?: number;
  challengeBasic?: Record<string, any>;
  covers?: Record<string, any>[];
  hornorCharacter?: any;
  isHideCovers?: boolean;
  isHideReplays?: boolean;
  level?: number;
  nickname?: string;
  replays?: Record<string, any>[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function gcgBasicInfoDataDeserializer(item: any): GcgBasicInfoData {
  return {
    additionalProperties: serializeRecord(item, [
      "action_card_num_gained",
      "action_card_num_total",
      "avatar_card_num_gained",
      "avatar_card_num_total",
      "challenge_basic",
      "covers",
      "hornor_character",
      "is_hide_covers",
      "is_hide_replays",
      "level",
      "nickname",
      "replays",
    ]),
    actionCardNumGained: item["action_card_num_gained"],
    actionCardNumTotal: item["action_card_num_total"],
    avatarCardNumGained: item["avatar_card_num_gained"],
    avatarCardNumTotal: item["avatar_card_num_total"],
    challengeBasic: !item["challenge_basic"]
      ? item["challenge_basic"]
      : Object.fromEntries(
          Object.entries(item["challenge_basic"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    covers: !item["covers"]
      ? item["covers"]
      : item["covers"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    hornorCharacter: item["hornor_character"],
    isHideCovers: item["is_hide_covers"],
    isHideReplays: item["is_hide_replays"],
    level: item["level"],
    nickname: item["nickname"],
    replays: !item["replays"]
      ? item["replays"]
      : item["replays"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
  };
}

/** model interface GcgCardBackListData */
export interface GcgCardBackListData {
  cardBackList?: Record<string, any>[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function gcgCardBackListDataDeserializer(item: any): GcgCardBackListData {
  return {
    additionalProperties: serializeRecord(item, ["card_back_list"]),
    cardBackList: !item["card_back_list"]
      ? item["card_back_list"]
      : item["card_back_list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
  };
}

/** model interface GcgCardListData */
export interface GcgCardListData {
  cardList?: Record<string, any>[];
  isLast?: boolean;
  nextOffset?: number;
  stats?: Record<string, any>;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function gcgCardListDataDeserializer(item: any): GcgCardListData {
  return {
    additionalProperties: serializeRecord(item, ["card_list", "is_last", "next_offset", "stats"]),
    cardList: !item["card_list"]
      ? item["card_list"]
      : item["card_list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    isLast: item["is_last"],
    nextOffset: item["next_offset"],
    stats: !item["stats"]
      ? item["stats"]
      : Object.fromEntries(Object.entries(item["stats"]).map(([k, p]: [string, any]) => [k, p])),
  };
}

/** model interface GcgChallengeRecordData */
export interface GcgChallengeRecordData {
  basic?: Record<string, any>;
  deckList?: any[];
  honorCharacter?: any[];
  recommendUrl?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function gcgChallengeRecordDataDeserializer(item: any): GcgChallengeRecordData {
  return {
    additionalProperties: serializeRecord(item, [
      "basic",
      "deck_list",
      "honor_character",
      "recommend_url",
    ]),
    basic: !item["basic"]
      ? item["basic"]
      : Object.fromEntries(Object.entries(item["basic"]).map(([k, p]: [string, any]) => [k, p])),
    deckList: !item["deck_list"]
      ? item["deck_list"]
      : item["deck_list"].map((p: any) => {
          return p;
        }),
    honorCharacter: !item["honor_character"]
      ? item["honor_character"]
      : item["honor_character"].map((p: any) => {
          return p;
        }),
    recommendUrl: item["recommend_url"],
  };
}

/** model interface GcgChallengeScheduleData */
export interface GcgChallengeScheduleData {
  scheduleList?: Record<string, any>[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function gcgChallengeScheduleDataDeserializer(item: any): GcgChallengeScheduleData {
  return {
    additionalProperties: serializeRecord(item, ["schedule_list"]),
    scheduleList: !item["schedule_list"]
      ? item["schedule_list"]
      : item["schedule_list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
  };
}

/** model interface GcgDeckListData */
export interface GcgDeckListData {
  deckList?: Record<string, any>[];
  level?: number;
  nickname?: string;
  roleId?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function gcgDeckListDataDeserializer(item: any): GcgDeckListData {
  return {
    additionalProperties: serializeRecord(item, ["deck_list", "level", "nickname", "role_id"]),
    deckList: !item["deck_list"]
      ? item["deck_list"]
      : item["deck_list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    level: item["level"],
    nickname: item["nickname"],
    roleId: item["role_id"],
  };
}

/** model interface GcgCoversData */
export interface GcgCoversData {
  covers?: Record<string, any>[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function gcgCoversDataDeserializer(item: any): GcgCoversData {
  return {
    additionalProperties: serializeRecord(item, ["covers"]),
    covers: !item["covers"]
      ? item["covers"]
      : item["covers"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
  };
}

/** model interface GcgMatchListData */
export interface GcgMatchListData {
  favouriteMatches?: any[];
  recentMatches?: Record<string, any>[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function gcgMatchListDataDeserializer(item: any): GcgMatchListData {
  return {
    additionalProperties: serializeRecord(item, ["favourite_matches", "recent_matches"]),
    favouriteMatches: !item["favourite_matches"]
      ? item["favourite_matches"]
      : item["favourite_matches"].map((p: any) => {
          return p;
        }),
    recentMatches: !item["recent_matches"]
      ? item["recent_matches"]
      : item["recent_matches"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
  };
}

/** model interface GenshinGameRecordCardData */
export interface GenshinGameRecordCardData {
  list?: Record<string, any>[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function genshinGameRecordCardDataDeserializer(item: any): GenshinGameRecordCardData {
  return {
    additionalProperties: serializeRecord(item, ["list"]),
    list: !item["list"]
      ? item["list"]
      : item["list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
  };
}
