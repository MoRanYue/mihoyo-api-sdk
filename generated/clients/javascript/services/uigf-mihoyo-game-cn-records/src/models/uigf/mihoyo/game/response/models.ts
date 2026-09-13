// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/*
 * This file contains only generated model types and their (de)serializers.
 * Disable the following rules for internal models with '_' prefix and deserializers which require 'any' for raw JSON input.
 */
/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
import { serializeRecord } from "../../../../../static-helpers/serialization/serialize-record.js";

/** model interface ZenlessIndexData */
export interface ZenlessIndexData {
  areaCollections?: Record<string, any>[];
  avatarList?: Record<string, any>[];
  awardState?: string;
  buddyList?: Record<string, any>[];
  catNotesList?: any[];
  challengeScheduleList?: Record<string, any>[];
  curHeadIconUrl?: string;
  gameDataShow?: Record<string, any>;
  stats?: Record<string, any>;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function zenlessIndexDataDeserializer(item: any): ZenlessIndexData {
  return {
    additionalProperties: serializeRecord(item, [
      "area_collections",
      "avatar_list",
      "award_state",
      "buddy_list",
      "cat_notes_list",
      "challenge_schedule_list",
      "cur_head_icon_url",
      "game_data_show",
      "stats",
    ]),
    areaCollections: !item["area_collections"]
      ? item["area_collections"]
      : item["area_collections"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    avatarList: !item["avatar_list"]
      ? item["avatar_list"]
      : item["avatar_list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    awardState: item["award_state"],
    buddyList: !item["buddy_list"]
      ? item["buddy_list"]
      : item["buddy_list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    catNotesList: !item["cat_notes_list"]
      ? item["cat_notes_list"]
      : item["cat_notes_list"].map((p: any) => {
          return p;
        }),
    challengeScheduleList: !item["challenge_schedule_list"]
      ? item["challenge_schedule_list"]
      : item["challenge_schedule_list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    curHeadIconUrl: item["cur_head_icon_url"],
    gameDataShow: !item["game_data_show"]
      ? item["game_data_show"]
      : Object.fromEntries(
          Object.entries(item["game_data_show"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    stats: !item["stats"]
      ? item["stats"]
      : Object.fromEntries(Object.entries(item["stats"]).map(([k, p]: [string, any]) => [k, p])),
  };
}

/** model interface ZenlessDailyNoteData */
export interface ZenlessDailyNoteData {
  abyssRefresh?: number;
  bountyCommission?: Record<string, any>;
  cafeState?: string;
  cardSign?: string;
  coffee?: any;
  energy?: Record<string, any>;
  isOtherSub?: boolean;
  isSub?: boolean;
  memberCard?: Record<string, any>;
  surveyPoints?: any;
  templeRunning?: Record<string, any>;
  vhsSale?: Record<string, any>;
  vitality?: Record<string, any>;
  weeklyTask?: any;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function zenlessDailyNoteDataDeserializer(item: any): ZenlessDailyNoteData {
  return {
    additionalProperties: serializeRecord(item, [
      "abyss_refresh",
      "bounty_commission",
      "cafe_state",
      "card_sign",
      "coffee",
      "energy",
      "is_other_sub",
      "is_sub",
      "member_card",
      "survey_points",
      "temple_running",
      "vhs_sale",
      "vitality",
      "weekly_task",
    ]),
    abyssRefresh: item["abyss_refresh"],
    bountyCommission: !item["bounty_commission"]
      ? item["bounty_commission"]
      : Object.fromEntries(
          Object.entries(item["bounty_commission"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    cafeState: item["cafe_state"],
    cardSign: item["card_sign"],
    coffee: item["coffee"],
    energy: !item["energy"]
      ? item["energy"]
      : Object.fromEntries(Object.entries(item["energy"]).map(([k, p]: [string, any]) => [k, p])),
    isOtherSub: item["is_other_sub"],
    isSub: item["is_sub"],
    memberCard: !item["member_card"]
      ? item["member_card"]
      : Object.fromEntries(
          Object.entries(item["member_card"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    surveyPoints: item["survey_points"],
    templeRunning: !item["temple_running"]
      ? item["temple_running"]
      : Object.fromEntries(
          Object.entries(item["temple_running"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    vhsSale: !item["vhs_sale"]
      ? item["vhs_sale"]
      : Object.fromEntries(Object.entries(item["vhs_sale"]).map(([k, p]: [string, any]) => [k, p])),
    vitality: !item["vitality"]
      ? item["vitality"]
      : Object.fromEntries(Object.entries(item["vitality"]).map(([k, p]: [string, any]) => [k, p])),
    weeklyTask: item["weekly_task"],
  };
}

/** model interface ZenlessShiyuDefenseData */
export interface ZenlessShiyuDefenseData {
  hadalInfoV2?: Record<string, any>;
  hadalVer?: string;
  icon?: string;
  nickName?: string;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function zenlessShiyuDefenseDataDeserializer(item: any): ZenlessShiyuDefenseData {
  return {
    additionalProperties: serializeRecord(item, [
      "hadal_info_v2",
      "hadal_ver",
      "icon",
      "nick_name",
    ]),
    hadalInfoV2: !item["hadal_info_v2"]
      ? item["hadal_info_v2"]
      : Object.fromEntries(
          Object.entries(item["hadal_info_v2"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    hadalVer: item["hadal_ver"],
    icon: item["icon"],
    nickName: item["nick_name"],
  };
}

/** model interface ZenlessAbyssSummaryData */
export interface ZenlessAbyssSummaryData {
  abyssCollect?: Record<string, any>[];
  abyssDuty?: any;
  abyssLevel?: Record<string, any>;
  abyssNest?: Record<string, any>;
  abyssPoint?: Record<string, any>;
  abyssTalent?: Record<string, any>;
  abyssThrone?: Record<string, any>;
  refreshTime?: number;
  unlock?: boolean;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function zenlessAbyssSummaryDataDeserializer(item: any): ZenlessAbyssSummaryData {
  return {
    additionalProperties: serializeRecord(item, [
      "abyss_collect",
      "abyss_duty",
      "abyss_level",
      "abyss_nest",
      "abyss_point",
      "abyss_talent",
      "abyss_throne",
      "refresh_time",
      "unlock",
    ]),
    abyssCollect: !item["abyss_collect"]
      ? item["abyss_collect"]
      : item["abyss_collect"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    abyssDuty: item["abyss_duty"],
    abyssLevel: !item["abyss_level"]
      ? item["abyss_level"]
      : Object.fromEntries(
          Object.entries(item["abyss_level"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    abyssNest: !item["abyss_nest"]
      ? item["abyss_nest"]
      : Object.fromEntries(
          Object.entries(item["abyss_nest"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    abyssPoint: !item["abyss_point"]
      ? item["abyss_point"]
      : Object.fromEntries(
          Object.entries(item["abyss_point"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    abyssTalent: !item["abyss_talent"]
      ? item["abyss_talent"]
      : Object.fromEntries(
          Object.entries(item["abyss_talent"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    abyssThrone: !item["abyss_throne"]
      ? item["abyss_throne"]
      : Object.fromEntries(
          Object.entries(item["abyss_throne"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    refreshTime: item["refresh_time"],
    unlock: item["unlock"],
  };
}

/** model interface ZenlessAbyssSeasonTwoSummaryData */
export interface ZenlessAbyssSeasonTwoSummaryData {
  abyssCollect?: Record<string, any>[];
  abyssDuty?: Record<string, any>;
  abyssLevel?: Record<string, any>;
  abyssMax?: Record<string, any>;
  abyssTask?: Record<string, any>;
  abyssTaskForceInvestigationMax?: Record<string, any>;
  hideAbyssDuty?: boolean;
  refreshTime?: number;
  specialMission?: Record<string, any>;
  unlock?: boolean;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function zenlessAbyssSeasonTwoSummaryDataDeserializer(
  item: any,
): ZenlessAbyssSeasonTwoSummaryData {
  return {
    additionalProperties: serializeRecord(item, [
      "abyss_collect",
      "abyss_duty",
      "abyss_level",
      "abyss_max",
      "abyss_task",
      "abyss_task_force_investigation_max",
      "hide_abyss_duty",
      "refresh_time",
      "special_mission",
      "unlock",
    ]),
    abyssCollect: !item["abyss_collect"]
      ? item["abyss_collect"]
      : item["abyss_collect"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    abyssDuty: !item["abyss_duty"]
      ? item["abyss_duty"]
      : Object.fromEntries(
          Object.entries(item["abyss_duty"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    abyssLevel: !item["abyss_level"]
      ? item["abyss_level"]
      : Object.fromEntries(
          Object.entries(item["abyss_level"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    abyssMax: !item["abyss_max"]
      ? item["abyss_max"]
      : Object.fromEntries(
          Object.entries(item["abyss_max"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    abyssTask: !item["abyss_task"]
      ? item["abyss_task"]
      : Object.fromEntries(
          Object.entries(item["abyss_task"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    abyssTaskForceInvestigationMax: !item["abyss_task_force_investigation_max"]
      ? item["abyss_task_force_investigation_max"]
      : Object.fromEntries(
          Object.entries(item["abyss_task_force_investigation_max"]).map(
            ([k, p]: [string, any]) => [k, p],
          ),
        ),
    hideAbyssDuty: item["hide_abyss_duty"],
    refreshTime: item["refresh_time"],
    specialMission: !item["special_mission"]
      ? item["special_mission"]
      : Object.fromEntries(
          Object.entries(item["special_mission"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    unlock: item["unlock"],
  };
}

/** model interface ZenlessActivityCalendarData */
export interface ZenlessActivityCalendarData {
  activityList?: Record<string, any>[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function zenlessActivityCalendarDataDeserializer(item: any): ZenlessActivityCalendarData {
  return {
    additionalProperties: serializeRecord(item, ["activity_list"]),
    activityList: !item["activity_list"]
      ? item["activity_list"]
      : item["activity_list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
  };
}

/** model interface ZenlessClimbingTowerDetailData */
export interface ZenlessClimbingTowerDetailData {
  climbingTowerS1?: any;
  climbingTowerS2?: any;
  climbingTowerS3?: any;
  climbingTowerS4?: any;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function zenlessClimbingTowerDetailDataDeserializer(
  item: any,
): ZenlessClimbingTowerDetailData {
  return {
    additionalProperties: serializeRecord(item, [
      "climbing_tower_s1",
      "climbing_tower_s2",
      "climbing_tower_s3",
      "climbing_tower_s4",
    ]),
    climbingTowerS1: item["climbing_tower_s1"],
    climbingTowerS2: item["climbing_tower_s2"],
    climbingTowerS3: item["climbing_tower_s3"],
    climbingTowerS4: item["climbing_tower_s4"],
  };
}

/** model interface ZenlessExplorationDetailData */
export interface ZenlessExplorationDetailData {
  areaCollections?: Record<string, any>[];
  catNotes?: Record<string, any>[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function zenlessExplorationDetailDataDeserializer(item: any): ZenlessExplorationDetailData {
  return {
    additionalProperties: serializeRecord(item, ["area_collections", "cat_notes"]),
    areaCollections: !item["area_collections"]
      ? item["area_collections"]
      : item["area_collections"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    catNotes: !item["cat_notes"]
      ? item["cat_notes"]
      : item["cat_notes"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
  };
}

/** model interface ZenlessGachaCalendarData */
export interface ZenlessGachaCalendarData {
  avatarGachaScheduleList?: Record<string, any>[];
  weaponGachaScheduleList?: Record<string, any>[];
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function zenlessGachaCalendarDataDeserializer(item: any): ZenlessGachaCalendarData {
  return {
    additionalProperties: serializeRecord(item, [
      "avatar_gacha_schedule_list",
      "weapon_gacha_schedule_list",
    ]),
    avatarGachaScheduleList: !item["avatar_gacha_schedule_list"]
      ? item["avatar_gacha_schedule_list"]
      : item["avatar_gacha_schedule_list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
    weaponGachaScheduleList: !item["weapon_gacha_schedule_list"]
      ? item["weapon_gacha_schedule_list"]
      : item["weapon_gacha_schedule_list"].map((p: any) => {
          return Object.fromEntries(Object.entries(p).map(([k1, p1]: [string, any]) => [k1, p1]));
        }),
  };
}

/** model interface ZenlessDeadlyAssaultSummaryData */
export interface ZenlessDeadlyAssaultSummaryData {
  avatarIcon?: string;
  endTime?: Record<string, any>;
  list?: any[];
  nickName?: string;
  roomMaxScore?: number;
  startTime?: Record<string, any>;
  totalMaxScore?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function zenlessDeadlyAssaultSummaryDataDeserializer(
  item: any,
): ZenlessDeadlyAssaultSummaryData {
  return {
    additionalProperties: serializeRecord(item, [
      "avatar_icon",
      "end_time",
      "list",
      "nick_name",
      "room_max_score",
      "start_time",
      "total_max_score",
    ]),
    avatarIcon: item["avatar_icon"],
    endTime: !item["end_time"]
      ? item["end_time"]
      : Object.fromEntries(Object.entries(item["end_time"]).map(([k, p]: [string, any]) => [k, p])),
    list: !item["list"]
      ? item["list"]
      : item["list"].map((p: any) => {
          return p;
        }),
    nickName: item["nick_name"],
    roomMaxScore: item["room_max_score"],
    startTime: !item["start_time"]
      ? item["start_time"]
      : Object.fromEntries(
          Object.entries(item["start_time"]).map(([k, p]: [string, any]) => [k, p]),
        ),
    totalMaxScore: item["total_max_score"],
  };
}

/** model interface ZenlessThresholdSimulationPeriodSummaryData */
export interface ZenlessThresholdSimulationPeriodSummaryData {
  hasDetailRecord?: boolean;
  voidFrontBattleAbstractInfoBrief?: Record<string, any>;
  voidFrontId?: number;
  /** Additional properties */
  additionalProperties?: Record<string, any>;
}

export function zenlessThresholdSimulationPeriodSummaryDataDeserializer(
  item: any,
): ZenlessThresholdSimulationPeriodSummaryData {
  return {
    additionalProperties: serializeRecord(item, [
      "has_detail_record",
      "void_front_battle_abstract_info_brief",
      "void_front_id",
    ]),
    hasDetailRecord: item["has_detail_record"],
    voidFrontBattleAbstractInfoBrief: !item["void_front_battle_abstract_info_brief"]
      ? item["void_front_battle_abstract_info_brief"]
      : Object.fromEntries(
          Object.entries(item["void_front_battle_abstract_info_brief"]).map(
            ([k, p]: [string, any]) => [k, p],
          ),
        ),
    voidFrontId: item["void_front_id"],
  };
}
