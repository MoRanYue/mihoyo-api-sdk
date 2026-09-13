/** Genshin and Zenless game-record response payloads. */
namespace UIGF.Mihoyo.Game.Response;

model GenshinRecordRole extends Record<unknown> {
  AvatarUrl?: string;
  game_head_icon?: string;
  level?: int32;
  nickname?: string;
  region?: string;
}

model GenshinRecordIndexData extends Record<unknown> {
  avatars?: Record<unknown>[];
  city_explorations?: unknown[];
  homes?: Record<unknown>[];
  query_tool_image?: string;
  query_tool_link?: string;
  role?: GenshinRecordRole;
  stats?: Record<unknown>;
  world_exploration_display?: Record<unknown>[];
  world_explorations?: Record<unknown>[];
}

model GenshinDailyNoteData extends Record<unknown> {
  archon_quest_progress?: Record<unknown>;
  calendar_url?: string;
  current_expedition_num?: int32;
  current_home_coin?: int32;
  current_resin?: int32;
  daily_task?: Record<unknown>;
  expeditions?: Record<unknown>[];
  finished_task_num?: int32;
  home_coin_recovery_time?: string;
  is_extra_task_reward_received?: boolean;
  max_expedition_num?: int32;
  max_home_coin?: int32;
  max_resin?: int32;
  remain_resin_discount_num?: int32;
  resin_discount_num_limit?: int32;
  resin_recovery_time?: string;
  total_task_num?: int32;
  transformer?: Record<unknown>;
  week_active_progress?: Record<unknown>;
}

model GenshinSpiralAbyssData extends Record<unknown> {
  damage_rank?: unknown[];
  defeat_rank?: unknown[];
  end_time?: string;
  energy_skill_rank?: unknown[];
  floors?: unknown[];
  is_just_skipped_floor?: boolean;
  is_unlock?: boolean;
  max_floor?: string;
  normal_skill_rank?: unknown[];
  reveal_rank?: unknown[];
  schedule_id?: int64;
  skipped_floor?: string;
  start_time?: string;
  take_damage_rank?: unknown[];
  total_battle_times?: int32;
  total_star?: int32;
  total_win_times?: int32;
}

model GenshinTheaterData extends Record<unknown> {
  data?: Record<unknown>[];
  is_unlock?: boolean;
  links?: Record<unknown>;
  tarot_card_state?: Record<unknown>;
}

model GenshinCharacterMasterData extends Record<unknown> {
  is_unlock?: boolean;
  list?: Record<unknown>[];
}

model GenshinStygianData extends Record<unknown> {
  data?: Record<unknown>[];
  is_unlock?: boolean;
  links?: Record<unknown>;
}

model GenshinStygianPopularityData extends Record<unknown> {
  avatar_list?: Record<unknown>[];
}

model GenshinActivityCalendarData extends Record<unknown> {
  act_list?: Record<unknown>[];
  avatar_card_pool_list?: Record<unknown>[];
  fixed_act_list?: Record<unknown>[];
  mixed_card_pool_list?: unknown[];
  selected_act_list?: Record<unknown>[];
  selected_avatar_card_pool_list?: Record<unknown>[];
  selected_mixed_card_pool_list?: unknown[];
  weapon_card_pool_list?: Record<unknown>[];
}

model GenshinExternalContentData extends Record<unknown> {
  caculator_url?: string;
  lineup_url?: string;
  strategy_url?: string;
  wiki_url?: string;
}

model GenshinRoleBasicInfoData extends GenshinRecordRole {
  card_play_level?: int32;
}

model GenshinToolData extends Record<unknown> {
  tools?: Record<unknown>[];
}

model GcgBasicInfoData extends Record<unknown> {
  action_card_num_gained?: int32;
  action_card_num_total?: int32;
  avatar_card_num_gained?: int32;
  avatar_card_num_total?: int32;
  challenge_basic?: Record<unknown>;
  covers?: Record<unknown>[];
  hornor_character?: unknown;
  is_hide_covers?: boolean;
  is_hide_replays?: boolean;
  level?: int32;
  nickname?: string;
  replays?: Record<unknown>[];
}

model GcgCardBackListData extends Record<unknown> {
  card_back_list?: Record<unknown>[];
}

model GcgCardListData extends Record<unknown> {
  card_list?: Record<unknown>[];
  is_last?: boolean;
  next_offset?: int32;
  stats?: Record<unknown>;
}

model GcgChallengeRecordData extends Record<unknown> {
  basic?: Record<unknown>;
  deck_list?: unknown[];
  honor_character?: unknown[];
  recommend_url?: string;
}

model GcgChallengeScheduleData extends Record<unknown> {
  schedule_list?: Record<unknown>[];
}

model GcgDeckListData extends Record<unknown> {
  deck_list?: Record<unknown>[];
  level?: int32;
  nickname?: string;
  role_id?: string;
}

model GcgCoversData extends Record<unknown> {
  covers?: Record<unknown>[];
}

model GcgMatchListData extends Record<unknown> {
  favourite_matches?: unknown[];
  recent_matches?: Record<unknown>[];
}

model GenshinGameRecordCardData extends Record<unknown> {
  list?: Record<unknown>[];
}

model ZenlessIndexData extends Record<unknown> {
  area_collections?: Record<unknown>[];
  avatar_list?: Record<unknown>[];
  award_state?: string;
  buddy_list?: Record<unknown>[];
  cat_notes_list?: unknown[];
  challenge_schedule_list?: Record<unknown>[];
  cur_head_icon_url?: string;
  game_data_show?: Record<unknown>;
  stats?: Record<unknown>;
}

model ZenlessDailyNoteData extends Record<unknown> {
  abyss_refresh?: int64;
  bounty_commission?: Record<unknown>;
  cafe_state?: string;
  card_sign?: string;
  coffee?: unknown;
  energy?: Record<unknown>;
  is_other_sub?: boolean;
  is_sub?: boolean;
  member_card?: Record<unknown>;
  survey_points?: unknown;
  temple_running?: Record<unknown>;
  vhs_sale?: Record<unknown>;
  vitality?: Record<unknown>;
  weekly_task?: unknown;
}

model ZenlessShiyuDefenseData extends Record<unknown> {
  hadal_info_v2?: Record<unknown>;
  hadal_ver?: string;
  icon?: string;
  nick_name?: string;
}

model ZenlessAbyssSummaryData extends Record<unknown> {
  abyss_collect?: Record<unknown>[];
  abyss_duty?: unknown;
  abyss_level?: Record<unknown>;
  abyss_nest?: Record<unknown>;
  abyss_point?: Record<unknown>;
  abyss_talent?: Record<unknown>;
  abyss_throne?: Record<unknown>;
  refresh_time?: int64;
  unlock?: boolean;
}

model ZenlessAbyssSeasonTwoSummaryData extends Record<unknown> {
  abyss_collect?: Record<unknown>[];
  abyss_duty?: Record<unknown>;
  abyss_level?: Record<unknown>;
  abyss_max?: Record<unknown>;
  abyss_task?: Record<unknown>;
  abyss_task_force_investigation_max?: Record<unknown>;
  hide_abyss_duty?: boolean;
  refresh_time?: int64;
  special_mission?: Record<unknown>;
  unlock?: boolean;
}

model ZenlessActivityCalendarData extends Record<unknown> {
  activity_list?: Record<unknown>[];
}

model ZenlessClimbingTowerDetailData extends Record<unknown> {
  climbing_tower_s1?: unknown;
  climbing_tower_s2?: unknown;
  climbing_tower_s3?: unknown;
  climbing_tower_s4?: unknown;
}

model ZenlessExplorationDetailData extends Record<unknown> {
  area_collections?: Record<unknown>[];
  cat_notes?: Record<unknown>[];
}

model ZenlessGachaCalendarData extends Record<unknown> {
  avatar_gacha_schedule_list?: Record<unknown>[];
  weapon_gacha_schedule_list?: Record<unknown>[];
}

model ZenlessDeadlyAssaultSummaryData extends Record<unknown> {
  avatar_icon?: string;
  end_time?: Record<unknown>;
  list?: unknown[];
  nick_name?: string;
  room_max_score?: int32;
  start_time?: Record<unknown>;
  total_max_score?: int32;
}

model ZenlessThresholdSimulationPeriodSummaryData extends Record<unknown> {
  has_detail_record?: boolean;
  void_front_battle_abstract_info_brief?: Record<unknown>;
  void_front_id?: int64;
}

model ZenlessLedgerMonthInfoData extends Record<unknown> {
  current_month?: string;
  data_month?: string;
  month_data?: Record<unknown>;
  optional_month?: string[];
  region?: string;
  role_info?: Record<unknown>;
  uid?: string;
}

/** Gateway IP and port candidates returned by the CN dispatch service. */
model GateAddress extends Record<unknown> {
  ip?: string;
  port?: int32;
}

model GateAddressData extends Record<unknown> {
  address_list?: GateAddress[];
}

/** Genshin announcement alert state shared by regular and UGC announcements. */
model AnnouncementAlertData extends Record<unknown> {
  alert?: boolean;
  alert_id?: int32;
  extra_remind?: boolean;
  remind?: boolean;
  remind_text?: string;
}

model AnnouncementCalendarType extends Record<unknown> {
  enabled?: boolean;
  mi18n_name?: string;
  remind?: boolean;
}

model AnnouncementItem extends Record<unknown> {
  alert?: int32;
  ann_id?: int32;
  banner?: string;
  content?: string;
  country?: string;
  end_time?: string;
  extra_remind?: int32;
  has_content?: boolean;
  lang?: string;
  login_alert?: int32;
  logout_remind?: int32;
  logout_remind_ver?: int32;
  need_remind_text?: int32;
  remind?: int32;
  remind_consumption_type?: int32;
  remind_text?: string;
  remind_ver?: int32;
  start_time?: string;
  subtitle?: string;
  tag_end_time?: string;
  tag_icon?: string;
  tag_icon_hover?: string;
  tag_label?: string;
  tag_start_time?: string;
  title?: string;
  type?: int32;
  type_label?: string;
  weak_remind?: int32;
}

model AnnouncementGroup extends Record<unknown> {
  list?: AnnouncementItem[];
  type_id?: int32;
  type_label?: string;
}

model AnnouncementType extends Record<unknown> {
  id?: int32;
  mi18n_name?: string;
  name?: string;
}

model AnnouncementListData extends Record<unknown> {
  alert?: boolean;
  alert_id?: int32;
  banner?: string;
  calendar_type?: AnnouncementCalendarType;
  list?: AnnouncementGroup[];
  pic_alert?: boolean;
  pic_alert_id?: int32;
  pic_list?: unknown[];
  pic_total?: int32;
  pic_type_list?: unknown[];
  static_sign?: string;
  t?: string;
  timezone?: int32;
  total?: int32;
  type_list?: AnnouncementType[];
  use_webp?: string;
}

model AnnouncementPictureData extends Record<unknown> {
  list?: unknown[];
  total?: int32;
}

model AnnouncementContentItem extends Record<unknown> {
  ann_id?: int32;
  banner?: string;
  content?: string;
  lang?: string;
  remind_text?: string;
  subtitle?: string;
  title?: string;
}

model AnnouncementContentData extends Record<unknown> {
  list?: AnnouncementContentItem[];
  pic_list?: unknown[];
  pic_total?: int32;
  total?: int32;
}

/** Genshin SDK bootstrap configuration payloads. Dynamic settings remain maps. */
model SdkComboConfigData extends Record<unknown> {
  vals?: Record<string>;
}

model SdkPrecacheConfigData extends Record<unknown> {
  vals?: Record<string>;
}

model SdkGranterQrAppIcons extends Record<unknown> {
  app?: string;
  bbs?: string;
  cloud?: string;
}

model SdkGranterQrEnabledApps extends Record<unknown> {
  bbs?: boolean;
  cloud?: boolean;
}

model SdkGranterConfigData extends Record<unknown> {
  announce_url?: string;
  app_name?: string;
  disable_ysdk_guard?: boolean;
  enable_announce_pic_popup?: boolean;
  enable_user_center?: boolean;
  functional_switch_configs?: Record<unknown>;
  log_level?: string;
  protocol?: boolean;
  push_alias_type?: int32;
  qr_app_icons?: SdkGranterQrAppIcons;
  qr_cloud_display_name?: string;
  qr_enabled?: boolean;
  qr_enabled_apps?: SdkGranterQrEnabledApps;
  ugc_protocol?: boolean;
  widget_config?: unknown;
}

model SdkShieldConfigData extends Record<unknown> {
  bbs_auth_login?: boolean;
  bbs_auth_login_ignore?: unknown[];
  client?: string;
  disable_mmt?: boolean;
  disable_regist?: boolean;
  enable_age_gate?: boolean;
  enable_age_gate_ignore?: unknown[];
  enable_br_age_gate?: boolean;
  enable_br_age_gate_ignore?: unknown[];
  enable_cx_bind_account?: boolean;
  enable_douyin_flash_login?: boolean;
  enable_email_captcha?: boolean;
  enable_eu_age_gate?: boolean;
  enable_eu_age_gate_ignore?: unknown[];
  enable_flash_login?: boolean;
  enable_logo_18?: boolean;
  enable_ps_bind_account?: boolean;
  fetch_instance_id?: boolean;
  firebase_blacklist_devices_switch?: boolean;
  firebase_blacklist_devices_version?: int32;
  game_key?: string;
  guest?: boolean;
  hoyolab_auth_login?: boolean;
  hoyolab_auth_login_ignore?: unknown[];
  hoyoplay_auth_login?: boolean;
  id?: int32;
  identity?: string;
  ignore_versions?: string;
  initialize_firebase?: boolean;
  logo_height?: string;
  logo_width?: string;
  name?: string;
  scene?: string;
  server_guest?: boolean;
  thirdparty?: string[];
  thirdparty_ignore?: Record<unknown>;
  thirdparty_login_configs?: Record<unknown>;
  vn_webview_realname_enabled?: boolean;
}

model SdkProtocolVersion extends Record<unknown> {
  app_id?: int32;
  create_time?: string;
  full_priv_proto?: string;
  id?: int32;
  language?: string;
  major?: int32;
  minimum?: int32;
  priv_proto?: string;
  teenager_proto?: string;
  third_proto?: string;
  user_proto?: string;
}

model SdkProtocolVersionComparisonData extends Record<unknown> {
  modified?: boolean;
  protocol?: SdkProtocolVersion;
}

model SdkRedDotInfo extends Record<unknown> {
  content_id?: int32;
  display?: boolean;
  red_point_type?: int32;
}

model SdkRedDotData extends Record<unknown> {
  infos?: SdkRedDotInfo[];
}

model GranterFatigueRemind extends Record<unknown> {
  durations?: int32[];
  nickname?: string;
  reset_point?: int32;
}

model GranterLoginData extends Record<unknown> {
  account_type?: int32;
  combo_id?: string;
  combo_token?: string;
  data?: string;
  fatigue_remind?: GranterFatigueRemind;
  heartbeat?: boolean;
  open_id?: string;
}
