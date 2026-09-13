package uigf.mihoyo.miyoushe.mobile;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.instrumentation.Instrumentation;
import uigf.mihoyo.ApiResponseMobileFeedPostsData;
import uigf.mihoyo.ApiResponseMobileUserInstantListData;
import uigf.mihoyo.ApiResponseMobileVillaSitePushData;
import uigf.mihoyo.checkin.implementation.MobilePainterApisImpl;

/**
 * Initializes a new instance of the synchronous MobileClient type.
 */
@ServiceClient(builder = MobileClientBuilder.class)
public final class MobilePainterApiClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final MobilePainterApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of MobilePainterApiClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    MobilePainterApiClient(MobilePainterApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The getFeedPosts operation.
     * 
     * @param ds The ds parameter.
     * @param algorithmType The algorithmType parameter.
     * @param cpu The cpu parameter.
     * @param device The device parameter.
     * @param filter The filter parameter.
     * @param freshAction The freshAction parameter.
     * @param gids The gids parameter.
     * @param isFirstInitialize The isFirstInitialize parameter.
     * @param isTriggeredByResource The isTriggeredByResource parameter.
     * @param lastId The lastId parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileFeedPostsData> getFeedPostsWithResponse(String ds, int algorithmType, String cpu,
        String device, String filter, int freshAction, int gids, boolean isFirstInitialize,
        boolean isTriggeredByResource, String lastId, String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobilePainterApi.getFeedPosts",
            requestContext,
            updatedContext -> this.serviceClient.getFeedPostsWithResponse(ds, algorithmType, cpu, device, filter,
                freshAction, gids, isFirstInitialize, isTriggeredByResource, lastId, cookie, updatedContext));
    }

    /**
     * The getFeedPosts operation.
     * 
     * @param ds The ds parameter.
     * @param algorithmType The algorithmType parameter.
     * @param cpu The cpu parameter.
     * @param device The device parameter.
     * @param filter The filter parameter.
     * @param freshAction The freshAction parameter.
     * @param gids The gids parameter.
     * @param isFirstInitialize The isFirstInitialize parameter.
     * @param isTriggeredByResource The isTriggeredByResource parameter.
     * @param lastId The lastId parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileFeedPostsData getFeedPosts(String ds, int algorithmType, String cpu, String device,
        String filter, int freshAction, int gids, boolean isFirstInitialize, boolean isTriggeredByResource,
        String lastId, String cookie) {
        return getFeedPostsWithResponse(ds, algorithmType, cpu, device, filter, freshAction, gids, isFirstInitialize,
            isTriggeredByResource, lastId, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getFeedPosts operation.
     * 
     * @param ds The ds parameter.
     * @param algorithmType The algorithmType parameter.
     * @param cpu The cpu parameter.
     * @param device The device parameter.
     * @param filter The filter parameter.
     * @param freshAction The freshAction parameter.
     * @param gids The gids parameter.
     * @param isFirstInitialize The isFirstInitialize parameter.
     * @param isTriggeredByResource The isTriggeredByResource parameter.
     * @param lastId The lastId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileFeedPostsData getFeedPosts(String ds, int algorithmType, String cpu, String device,
        String filter, int freshAction, int gids, boolean isFirstInitialize, boolean isTriggeredByResource,
        String lastId) {
        final String cookie = null;
        return getFeedPostsWithResponse(ds, algorithmType, cpu, device, filter, freshAction, gids, isFirstInitialize,
            isTriggeredByResource, lastId, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getUserInstantList operation.
     * 
     * @param ds The ds parameter.
     * @param gameRegion The gameRegion parameter.
     * @param gameUid The gameUid parameter.
     * @param offset The offset parameter.
     * @param size The size parameter.
     * @param uid The uid parameter.
     * @param viewType The viewType parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileUserInstantListData> getUserInstantListWithResponse(String ds, String gameRegion,
        long gameUid, int offset, int size, long uid, int viewType, String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobilePainterApi.getUserInstantList", requestContext,
            updatedContext -> this.serviceClient.getUserInstantListWithResponse(ds, gameRegion, gameUid, offset, size,
                uid, viewType, cookie, updatedContext));
    }

    /**
     * The getUserInstantList operation.
     * 
     * @param ds The ds parameter.
     * @param gameRegion The gameRegion parameter.
     * @param gameUid The gameUid parameter.
     * @param offset The offset parameter.
     * @param size The size parameter.
     * @param uid The uid parameter.
     * @param viewType The viewType parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileUserInstantListData getUserInstantList(String ds, String gameRegion, long gameUid,
        int offset, int size, long uid, int viewType, String cookie) {
        return getUserInstantListWithResponse(ds, gameRegion, gameUid, offset, size, uid, viewType, cookie,
            RequestContext.none()).getValue();
    }

    /**
     * The getUserInstantList operation.
     * 
     * @param ds The ds parameter.
     * @param gameRegion The gameRegion parameter.
     * @param gameUid The gameUid parameter.
     * @param offset The offset parameter.
     * @param size The size parameter.
     * @param uid The uid parameter.
     * @param viewType The viewType parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileUserInstantListData getUserInstantList(String ds, String gameRegion, long gameUid,
        int offset, int size, long uid, int viewType) {
        final String cookie = null;
        return getUserInstantListWithResponse(ds, gameRegion, gameUid, offset, size, uid, viewType, cookie,
            RequestContext.none()).getValue();
    }

    /**
     * The getVillaSitePush operation.
     * 
     * @param ds The ds parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileVillaSitePushData> getVillaSitePushWithResponse(String ds, String cookie,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobilePainterApi.getVillaSitePush", requestContext,
            updatedContext -> this.serviceClient.getVillaSitePushWithResponse(ds, cookie, updatedContext));
    }

    /**
     * The getVillaSitePush operation.
     * 
     * @param ds The ds parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileVillaSitePushData getVillaSitePush(String ds, String cookie) {
        return getVillaSitePushWithResponse(ds, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getVillaSitePush operation.
     * 
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileVillaSitePushData getVillaSitePush(String ds) {
        final String cookie = null;
        return getVillaSitePushWithResponse(ds, cookie, RequestContext.none()).getValue();
    }
}
