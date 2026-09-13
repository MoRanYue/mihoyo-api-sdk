/**
 * API response payloads. Properties are optional where a response may omit a
 * field. Dynamic maps and content-feed entries retain additional properties.
 */
namespace UIGF.Mihoyo.Api.Response;

model EmptyData extends Record<unknown> {}

model StrategyContentItem extends Record<unknown> {
  alias_name?: string;
  article_time?: string;
  article_user_name?: string;
  avatar_url?: string;
  bbs_url?: string;
  content_id?: int64;
  corner_mark?: string;
  ext?: string;
  icon?: string;
  summary?: string;
  title?: string;
}

model StrategyLatestContentData extends Record<unknown> {
  list?: StrategyContentItem[];
}

model StrategyAnnouncement extends Record<unknown> {
  content?: string;
  version?: int32;
}

model StrategySearch extends Record<unknown> {
  hot_words?: string[];
  placeholder?: string;
}

model StrategyHomeInfoData extends Record<unknown> {
  announce?: StrategyAnnouncement;
  pop_window?: unknown;
  search?: StrategySearch;
  speaker?: unknown;
}

model StrategyHomeImage extends Record<unknown> {
  headImg?: string;
  logo?: string;
}

model StrategyHomeNavbarData extends Record<unknown> {
  home_img?: StrategyHomeImage;
  navbar?: unknown[];
}

model ZenlessFeedbackScheduleData extends Record<unknown> {
  is_need_collect?: boolean;
  schedule_id?: string;
}

model RedDotGameStatus extends Record<unknown> {
  bbs_cn?: boolean;
  hk4e_cn?: boolean;
  nap_cn?: boolean;
}

model RedDotBatchData extends Record<unknown> {
  game_status?: RedDotGameStatus;
  status?: boolean;
}

model PatchData extends Record<unknown> {
  dialog_content?: string;
  dialog_content_en?: string;
  dialog_num?: int32;
  dialog_period?: int32;
  dialog_period_type?: int32;
  dialog_title?: string;
  file_name?: string;
  file_url?: string;
  im_page_ids?: unknown[];
  md5?: string;
  patch_action?: int32;
  patch_id?: int64;
  patch_strategy_id?: int64;
  patch_version?: string;
  update_recommended_intensity?: string;
  update_type?: int32;
  user_defined?: string;
}

model AuthKeyData extends Record<unknown> {
  authkey?: string;
  authkey_ver?: int32;
  sign_type?: int32;
}

model ReleaseData extends Record<unknown> {
  dialog?: string;
  dialog_content?: string;
  dialog_content_en?: string;
  dialog_num?: int32;
  dialog_period?: int32;
  dialog_period_type?: int32;
  dialog_title?: string;
  dialog_title_en?: string;
  has_update?: boolean;
  hyp_game_ids?: unknown[];
  loop_way?: string;
  package_md5?: string;
  package_name?: string;
  package_size?: string;
  package_url?: string;
  package_version?: string;
  silent?: string;
  strategy_id?: int64;
  update_recommended_intensity?: string;
  update_type?: int32;
  user_defined?: string;
}

model MobileAppSplashData extends Record<unknown> {
  has_splash?: boolean;
  splashes?: unknown[];
}

model MobileGame extends Record<unknown> {}

model MobileGameListData extends Record<unknown> {
  list?: MobileGame[];
}

model MobileMyselfPageConfigData extends Record<unknown> {
  app_personal_entry?: Record<unknown>;
  app_personal_unread?: Record<unknown>;
}

model MobileUnreadMessageData extends Record<unknown> {
  chat_unread?: Record<unknown>;
  notification_unread?: Record<unknown>;
  sem_notification?: Record<unknown>;
}

model MobileMissionsStateData extends Record<unknown> {
  already_received_points?: int32;
  can_get_points?: int32;
  is_unclaimed?: boolean;
  states?: Record<unknown>[];
  today_total_points?: int32;
  total_points?: int32;
}

model MobileStartupData extends Record<unknown> {
  resp_map?: Record<unknown>;
}

model MobileWindowPrepareData extends Record<unknown> {
  android_pkg?: unknown[];
  ios_app?: unknown[];
  ticket?: string;
}

model MobileWindowShowData extends Record<unknown> {
  bubble_list?: unknown[];
  list?: unknown[];
}

model MobileUserSettingsData extends Record<unknown> {
  is_merge_unfollow?: boolean;
  is_receive_from_unfollow?: boolean;
}

model MobileDiscussion extends Record<unknown> {
  created_at?: int64;
  default_feed_forum_id?: int64;
  default_feed_tab?: int32;
  desc?: string;
  desc_type?: int32;
  discussion_id?: int64;
  forums?: unknown[];
  game_id?: int32;
  hot_posts?: unknown[];
  icon?: string;
  subject?: string;
  talking_forum_id?: string;
  talking_prompt?: string;
  updated_at?: int64;
}

model MobileDiscussionData extends Record<unknown> {
  discussion?: MobileDiscussion;
}

model MobileEmoticonData extends Record<unknown> {
  list?: unknown[];
}

model MobileFeedPostsData extends Record<unknown> {
  databox?: Record<string>;
  is_original?: boolean;
  is_resource_unchanged?: boolean;
  last_id?: string;
  list?: Record<unknown>[];
}

model MobileUserInstantListData extends Record<unknown> {
  is_last?: boolean;
  list?: Record<unknown>[];
  next_offset?: int32;
  top_post?: unknown;
}

model MobileVillaSitePushData extends Record<unknown> {
  list?: unknown[];
}

model MobileVideoPermissionData extends Record<unknown> {
  can_publish?: boolean;
  toast?: string;
}

model MobileGameCenterData extends Record<unknown> {
  auto_download_enable_map?: Record<unknown>;
  download_mode?: string;
  game_download_experiment?: Record<unknown>;
  list?: Record<unknown>[];
}

model MobileTeenagerInfoData extends Record<unknown> {
  available_duration?: int32;
  disable_end_time?: int64;
  disable_start_time?: int64;
  is_enabled?: boolean;
  is_force?: boolean;
  is_real_name?: boolean;
  is_teenager?: boolean;
  loop_period?: int32;
}

model MobileUnreadInfoUser extends Record<unknown> {
  avatar_url?: string;
  uid?: string;
}

model MobileUnreadInfoData extends Record<unknown> {
  latest_update_user_info?: MobileUnreadInfoUser;
  unread_num?: int32;
}

model MobileBusinessesData extends Record<unknown> {
  businesses?: string[];
}

model MobileNotificationSettingsData extends Record<unknown> {
  settings?: Record<unknown>;
}

model MobileReplyPermissionData extends Record<unknown> {
  instant?: unknown[];
  max_image_number?: int32;
  post?: unknown[];
}

model MobileEntityReviewData extends Record<unknown> {
  is_last?: boolean;
  list?: unknown[];
  next_offset?: int32;
}

model MobilePreloadConfigData extends Record<unknown> {
  need_preload?: boolean;
  need_update?: boolean;
  rn_preload?: Record<unknown>[];
  rn_update_infos?: unknown[];
}

model StaticResourceData extends Record<unknown> {
  divider?: Record<unknown>[];
}

model StaticResourceVersionsData extends Record<unknown> {
  divider?: string;
  emoticon_set?: string;
}

model StaticLatestVersionData extends Record<unknown> {
  version?: string;
}

model StaticPreKeywordData extends Record<unknown> {
  list?: string[];
}

model PassportSwitchStatusData extends Record<unknown> {
  enabled?: Record<unknown>;
  switch_status_map?: Record<unknown>;
}

model SdkPorteData extends Record<unknown> {
  vals?: Record<string>;
}

model SdkFeCnConfigData extends Record<unknown> {
  vals?: Record<string>;
}

model CommunityAppConfigData extends Record<unknown> {
  config?: Record<string>;
}

model CommunityHomeData extends Record<unknown> {
  album_card?: unknown[];
  background?: Record<unknown>;
  break_frame_card?: unknown;
  carousels?: unknown;
  discussion?: unknown;
  exposed_resource_tickets?: unknown[];
  game_receptions?: Record<unknown>[];
  hot_topics?: unknown;
  image_post_card?: unknown[];
  is_resource_unchanged?: boolean;
  light_interactive_card?: unknown;
  link_card?: unknown[];
  link_topic_card?: unknown[];
  lives?: unknown[];
  navigator?: Record<unknown>[];
  official?: Record<unknown>;
  perspective_card?: unknown;
  posts?: unknown[];
  recommend_villa?: unknown;
}

model LoginCaptchaData extends Record<unknown> {
  action_type?: string;
  countdown?: int32;
  sent_new?: boolean;
}
