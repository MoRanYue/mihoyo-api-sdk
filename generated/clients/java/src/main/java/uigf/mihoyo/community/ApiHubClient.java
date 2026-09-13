package uigf.mihoyo.community;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.instrumentation.Instrumentation;
import uigf.mihoyo.ApiResponseCommunityAppConfigData;
import uigf.mihoyo.ApiResponseCommunityHomeData;
import uigf.mihoyo.ApiResponseForumList;
import uigf.mihoyo.ApiResponseJsonObject;
import uigf.mihoyo.checkin.implementation.ApiHubsImpl;

/**
 * Initializes a new instance of the synchronous CommunityClient type.
 */
@ServiceClient(builder = CommunityClientBuilder.class)
public final class ApiHubClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final ApiHubsImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of ApiHubClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    ApiHubClient(ApiHubsImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The getAllGamesForums operation.
     * 
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseForumList> getAllGamesForumsWithResponse(RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Community.ApiHub.getAllGamesForums",
            requestContext, updatedContext -> this.serviceClient.getAllGamesForumsWithResponse(updatedContext));
    }

    /**
     * The getAllGamesForums operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseForumList getAllGamesForums() {
        return getAllGamesForumsWithResponse(RequestContext.none()).getValue();
    }

    /**
     * The getAppConfig operation.
     * 
     * @param gid The gid parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseCommunityAppConfigData> getAppConfigWithResponse(String gid,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Community.ApiHub.getAppConfig", requestContext,
            updatedContext -> this.serviceClient.getAppConfigWithResponse(gid, updatedContext));
    }

    /**
     * The getAppConfig operation.
     * 
     * @param gid The gid parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseCommunityAppConfigData getAppConfig(String gid) {
        return getAppConfigWithResponse(gid, RequestContext.none()).getValue();
    }

    /**
     * The getAppConfig operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseCommunityAppConfigData getAppConfig() {
        final String gid = null;
        return getAppConfigWithResponse(gid, RequestContext.none()).getValue();
    }

    /**
     * The getGameList operation.
     * 
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseForumList> getGameListWithResponse(RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Community.ApiHub.getGameList", requestContext,
            updatedContext -> this.serviceClient.getGameListWithResponse(updatedContext));
    }

    /**
     * The getGameList operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseForumList getGameList() {
        return getGameListWithResponse(RequestContext.none()).getValue();
    }

    /**
     * The getMissions operation.
     * 
     * @param cookie The cookie parameter.
     * @param pointSn The pointSn parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseJsonObject> getMissionsWithResponse(String cookie, String pointSn, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Community.ApiHub.getMissions", requestContext,
            updatedContext -> this.serviceClient.getMissionsWithResponse(cookie, pointSn, ds, updatedContext));
    }

    /**
     * The getMissions operation.
     * 
     * @param cookie The cookie parameter.
     * @param pointSn The pointSn parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject getMissions(String cookie, String pointSn, String ds) {
        return getMissionsWithResponse(cookie, pointSn, ds, RequestContext.none()).getValue();
    }

    /**
     * The getMissions operation.
     * 
     * @param cookie The cookie parameter.
     * @param pointSn The pointSn parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject getMissions(String cookie, String pointSn) {
        final String ds = null;
        return getMissionsWithResponse(cookie, pointSn, ds, RequestContext.none()).getValue();
    }

    /**
     * The getShareConfig operation.
     * 
     * @param cookie The cookie parameter.
     * @param entityId The entityId parameter.
     * @param entityType The entityType parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseJsonObject> getShareConfigWithResponse(String cookie, String entityId, int entityType,
        String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Community.ApiHub.getShareConfig",
            requestContext, updatedContext -> this.serviceClient.getShareConfigWithResponse(cookie, entityId,
                entityType, ds, updatedContext));
    }

    /**
     * The getShareConfig operation.
     * 
     * @param cookie The cookie parameter.
     * @param entityId The entityId parameter.
     * @param entityType The entityType parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject getShareConfig(String cookie, String entityId, int entityType, String ds) {
        return getShareConfigWithResponse(cookie, entityId, entityType, ds, RequestContext.none()).getValue();
    }

    /**
     * The getShareConfig operation.
     * 
     * @param cookie The cookie parameter.
     * @param entityId The entityId parameter.
     * @param entityType The entityType parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject getShareConfig(String cookie, String entityId, int entityType) {
        final String ds = null;
        return getShareConfigWithResponse(cookie, entityId, entityType, ds, RequestContext.none()).getValue();
    }

    /**
     * The getMissionState operation.
     * 
     * @param cookie The cookie parameter.
     * @param pointSn The pointSn parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseJsonObject> getMissionStateWithResponse(String cookie, String pointSn, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Community.ApiHub.getMissionState",
            requestContext,
            updatedContext -> this.serviceClient.getMissionStateWithResponse(cookie, pointSn, ds, updatedContext));
    }

    /**
     * The getMissionState operation.
     * 
     * @param cookie The cookie parameter.
     * @param pointSn The pointSn parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject getMissionState(String cookie, String pointSn, String ds) {
        return getMissionStateWithResponse(cookie, pointSn, ds, RequestContext.none()).getValue();
    }

    /**
     * The getMissionState operation.
     * 
     * @param cookie The cookie parameter.
     * @param pointSn The pointSn parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject getMissionState(String cookie, String pointSn) {
        final String ds = null;
        return getMissionStateWithResponse(cookie, pointSn, ds, RequestContext.none()).getValue();
    }

    /**
     * The getVotes operation.
     * 
     * @param ownerUid The ownerUid parameter.
     * @param voteIds The voteIds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseJsonObject> getVotesWithResponse(String ownerUid, String voteIds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Community.ApiHub.getVotes", requestContext,
            updatedContext -> this.serviceClient.getVotesWithResponse(ownerUid, voteIds, updatedContext));
    }

    /**
     * The getVotes operation.
     * 
     * @param ownerUid The ownerUid parameter.
     * @param voteIds The voteIds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject getVotes(String ownerUid, String voteIds) {
        return getVotesWithResponse(ownerUid, voteIds, RequestContext.none()).getValue();
    }

    /**
     * The getVoteResults operation.
     * 
     * @param ownerUid The ownerUid parameter.
     * @param voteIds The voteIds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseJsonObject> getVoteResultsWithResponse(String ownerUid, String voteIds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Community.ApiHub.getVoteResults",
            requestContext,
            updatedContext -> this.serviceClient.getVoteResultsWithResponse(ownerUid, voteIds, updatedContext));
    }

    /**
     * The getVoteResults operation.
     * 
     * @param ownerUid The ownerUid parameter.
     * @param voteIds The voteIds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject getVoteResults(String ownerUid, String voteIds) {
        return getVoteResultsWithResponse(ownerUid, voteIds, RequestContext.none()).getValue();
    }

    /**
     * The getHome operation.
     * 
     * @param gids The gids parameter.
     * @param cpu The cpu parameter.
     * @param device The device parameter.
     * @param exposedResourceTickets The exposedResourceTickets parameter.
     * @param isTriggeredByResource The isTriggeredByResource parameter.
     * @param parts The parts parameter.
     * @param version The version parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseCommunityHomeData> getHomeWithResponse(int gids, String cpu, String device,
        String exposedResourceTickets, Boolean isTriggeredByResource, String parts, String version,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Community.ApiHub.getHome", requestContext,
            updatedContext -> this.serviceClient.getHomeWithResponse(gids, cpu, device, exposedResourceTickets,
                isTriggeredByResource, parts, version, updatedContext));
    }

    /**
     * The getHome operation.
     * 
     * @param gids The gids parameter.
     * @param cpu The cpu parameter.
     * @param device The device parameter.
     * @param exposedResourceTickets The exposedResourceTickets parameter.
     * @param isTriggeredByResource The isTriggeredByResource parameter.
     * @param parts The parts parameter.
     * @param version The version parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseCommunityHomeData getHome(int gids, String cpu, String device, String exposedResourceTickets,
        Boolean isTriggeredByResource, String parts, String version) {
        return getHomeWithResponse(gids, cpu, device, exposedResourceTickets, isTriggeredByResource, parts, version,
            RequestContext.none()).getValue();
    }

    /**
     * The getHome operation.
     * 
     * @param gids The gids parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseCommunityHomeData getHome(int gids) {
        final String cpu = null;
        final String device = null;
        final String exposedResourceTickets = null;
        final Boolean isTriggeredByResource = null;
        final String parts = null;
        final String version = null;
        return getHomeWithResponse(gids, cpu, device, exposedResourceTickets, isTriggeredByResource, parts, version,
            RequestContext.none()).getValue();
    }

    /**
     * The signIn operation.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @param ds The ds parameter.
     * @param challenge The challenge parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseJsonObject> signInWithResponse(String cookie, SignInRequest body, String ds,
        String challenge, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Community.ApiHub.signIn", requestContext,
            updatedContext -> this.serviceClient.signInWithResponse(cookie, body, ds, challenge, updatedContext));
    }

    /**
     * The signIn operation.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @param ds The ds parameter.
     * @param challenge The challenge parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject signIn(String cookie, SignInRequest body, String ds, String challenge) {
        return signInWithResponse(cookie, body, ds, challenge, RequestContext.none()).getValue();
    }

    /**
     * The signIn operation.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject signIn(String cookie, SignInRequest body) {
        final String ds = null;
        final String challenge = null;
        return signInWithResponse(cookie, body, ds, challenge, RequestContext.none()).getValue();
    }

    /**
     * The setPostVote operation.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseJsonObject> setPostVoteWithResponse(String cookie, LikePostRequest body, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Community.ApiHub.setPostVote", requestContext,
            updatedContext -> this.serviceClient.setPostVoteWithResponse(cookie, body, ds, updatedContext));
    }

    /**
     * The setPostVote operation.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject setPostVote(String cookie, LikePostRequest body, String ds) {
        return setPostVoteWithResponse(cookie, body, ds, RequestContext.none()).getValue();
    }

    /**
     * The setPostVote operation.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject setPostVote(String cookie, LikePostRequest body) {
        final String ds = null;
        return setPostVoteWithResponse(cookie, body, ds, RequestContext.none()).getValue();
    }
}
