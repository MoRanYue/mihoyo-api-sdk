// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

export { MihoyoCommunityClient } from "./mihoyoCommunityClient.js";
export type {
  ApiResponseCommunityUser,
  CommunityUser,
  JsonObject,
  ApiResponseJsonObject,
  ApiResponsePost,
  ApiResponsePostList,
  ApiResponseForumList,
  ApiResponseCommunityAppConfigData,
  ApiResponseCommunityHomeData,
} from "./models/uigf/mihoyo/index.js";
export type {
  VerificationCreateRequest,
  VerificationSubmitRequest,
  Post,
  PostList,
  FavoritePostRequest,
  ForumList,
  Forum,
  SignInRequest,
  LikePostRequest,
} from "./models/uigf/mihoyo/community/index.js";
export type {
  CommunityAppConfigData,
  CommunityHomeData,
} from "./models/uigf/mihoyo/api/response/index.js";
export type { MihoyoCommunityClientOptionalParams } from "./api/index.js";
export type {
  ApiHubSetPostVoteOptionalParams,
  ApiHubSignInOptionalParams,
  ApiHubGetHomeOptionalParams,
  ApiHubGetVoteResultsOptionalParams,
  ApiHubGetVotesOptionalParams,
  ApiHubGetMissionStateOptionalParams,
  ApiHubGetShareConfigOptionalParams,
  ApiHubGetMissionsOptionalParams,
  ApiHubGetGameListOptionalParams,
  ApiHubGetAppConfigOptionalParams,
  ApiHubGetAllGamesForumsOptionalParams,
} from "./api/apiHub/index.js";
export type { CoinRecordApiListOptionalParams } from "./api/coinRecordApi/index.js";
export type { CollectionApiGetDetailOptionalParams } from "./api/collectionApi/index.js";
export type {
  FeedApiGetLotteryUserShowOptionalParams,
  FeedApiGetTimelineOptionalParams,
  FeedApiGetRecentForumPostsOptionalParams,
  FeedApiGetHotForumPostsOptionalParams,
  FeedApiGetNewsOptionalParams,
} from "./api/feedApi/index.js";
export type {
  MiscApiGetGeetestChallengeOptionalParams,
  MiscApiVerifyVerificationOptionalParams,
  MiscApiCreateVerificationOptionalParams,
  MiscApiGetEmoticonSetOptionalParams,
} from "./api/miscApi/index.js";
export type {
  PostApiSetFavoriteOptionalParams,
  PostApiSearchOptionalParams,
  PostApiGetUserPostsOptionalParams,
  PostApiGetTopicPostsOptionalParams,
  PostApiGetSubRepliesOptionalParams,
  PostApiGetRepliesOptionalParams,
  PostApiGetFullInCollectionOptionalParams,
  PostApiGetFullOptionalParams,
} from "./api/postApi/index.js";
export type { TopicApiGetFullInfoOptionalParams } from "./api/topicApi/index.js";
export type { UserApiGetFullInfoOptionalParams } from "./api/userApi/index.js";
export type {
  ApiHubOperations,
  CoinRecordApiOperations,
  CollectionApiOperations,
  FeedApiOperations,
  MiscApiOperations,
  PostApiOperations,
  TopicApiOperations,
  UserApiOperations,
} from "./classic/index.js";
export { RestError, isRestError } from "@azure/core-rest-pipeline";
