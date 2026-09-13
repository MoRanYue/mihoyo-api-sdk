package uigf.mihoyo.checkin.implementation;

import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceInterface;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.annotations.HeaderParam;
import io.clientcore.core.http.annotations.HostParam;
import io.clientcore.core.http.annotations.HttpRequestInformation;
import io.clientcore.core.http.annotations.QueryParam;
import io.clientcore.core.http.annotations.UnexpectedResponseExceptionDetail;
import io.clientcore.core.http.models.HttpMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.http.pipeline.HttpPipeline;
import io.clientcore.core.instrumentation.Instrumentation;
import java.lang.reflect.InvocationTargetException;
import uigf.mihoyo.ApiResponseMobileFeedPostsData;
import uigf.mihoyo.ApiResponseMobileUserInstantListData;
import uigf.mihoyo.ApiResponseMobileVillaSitePushData;

/**
 * An instance of this class provides access to all the operations defined in MobilePainterApis.
 */
public final class MobilePainterApisImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final MobilePainterApisService service;

    /**
     * The service client containing this operation class.
     */
    private final MobileClientImpl client;

    /**
     * The instance of instrumentation to report telemetry.
     */
    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of MobilePainterApisImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    MobilePainterApisImpl(MobileClientImpl client) {
        this.service = MobilePainterApisService.getNewInstance(client.getHttpPipeline());
        this.client = client;
        this.instrumentation = client.getInstrumentation();
    }

    /**
     * The interface defining all the services for MobileClientMobilePainterApis to be used by the proxy service to
     * perform REST calls.
     */
    @ServiceInterface(name = "MobileClientMobilePainterApis", host = "{endpoint}")
    public interface MobilePainterApisService {
        static MobilePainterApisService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class.forName("uigf.mihoyo.checkin.implementation.MobilePainterApisServiceImpl");
                return (MobilePainterApisService) clazz.getMethod("getNewInstance", HttpPipeline.class)
                    .invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/painter/api/feeds/posts",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseMobileFeedPostsData> getFeedPosts(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds,
            @QueryParam("algorithm_type") int algorithmType, @QueryParam("cpu") String cpu,
            @QueryParam("device") String device, @QueryParam("filter") String filter,
            @QueryParam("fresh_action") int freshAction, @QueryParam("gids") int gids,
            @QueryParam("is_first_initialize") boolean isFirstInitialize,
            @QueryParam("is_triggered_by_resource") boolean isTriggeredByResource, @QueryParam("last_id") String lastId,
            @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/painter/api/user_instant/list",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseMobileUserInstantListData> getUserInstantList(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds,
            @QueryParam("game_region") String gameRegion, @QueryParam("game_uid") long gameUid,
            @QueryParam("offset") int offset, @QueryParam("size") int size, @QueryParam("uid") long uid,
            @QueryParam("view_type") int viewType, @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/painter/api/villa/notification/site_push",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseMobileVillaSitePushData> getVillaSitePush(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds, @HeaderParam("Accept") String accept,
            RequestContext requestContext);
    }

    /**
     * The getFeedPosts operation.
     * 
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
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileFeedPostsData> getFeedPostsWithResponse(int algorithmType, String cpu,
        String device, String filter, int freshAction, int gids, boolean isFirstInitialize,
        boolean isTriggeredByResource, String lastId, String cookie, String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobilePainterApi.getFeedPosts",
            requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getFeedPosts(this.client.getEndpoint(), cookie, ds, algorithmType, cpu, device, filter,
                    freshAction, gids, isFirstInitialize, isTriggeredByResource, lastId, accept, updatedContext);
            });
    }

    /**
     * The getUserInstantList operation.
     * 
     * @param gameRegion The gameRegion parameter.
     * @param gameUid The gameUid parameter.
     * @param offset The offset parameter.
     * @param size The size parameter.
     * @param uid The uid parameter.
     * @param viewType The viewType parameter.
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileUserInstantListData> getUserInstantListWithResponse(String gameRegion,
        long gameUid, int offset, int size, long uid, int viewType, String cookie, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobilePainterApi.getUserInstantList", requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getUserInstantList(this.client.getEndpoint(), cookie, ds, gameRegion, gameUid, offset,
                    size, uid, viewType, accept, updatedContext);
            });
    }

    /**
     * The getVillaSitePush operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileVillaSitePushData> getVillaSitePushWithResponse(String cookie, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobilePainterApi.getVillaSitePush", requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getVillaSitePush(this.client.getEndpoint(), cookie, ds, accept, updatedContext);
            });
    }
}
