package uigf.mihoyo.checkin.implementation;

import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceInterface;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.annotations.BodyParam;
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
import uigf.mihoyo.ApiResponseEmptyData;
import uigf.mihoyo.ApiResponseMobileAppSplashData;
import uigf.mihoyo.ApiResponseMobileGameListData;
import uigf.mihoyo.ApiResponseMobileMissionsStateData;
import uigf.mihoyo.ApiResponseMobileMyselfPageConfigData;
import uigf.mihoyo.ApiResponseMobileStartupData;
import uigf.mihoyo.ApiResponseMobileUnreadMessageData;
import uigf.mihoyo.ApiResponseMobileWindowPrepareData;
import uigf.mihoyo.ApiResponseMobileWindowShowData;
import uigf.mihoyo.api.request.MobileDeviceSessionRequest;
import uigf.mihoyo.api.request.MobileStartupRequest;
import uigf.mihoyo.api.request.MobileWindowPrepareRequest;
import uigf.mihoyo.api.request.MobileWindowShowRequest;

/**
 * An instance of this class provides access to all the operations defined in MobileApiHubs.
 */
public final class MobileApiHubsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final MobileApiHubsService service;

    /**
     * The service client containing this operation class.
     */
    private final MobileClientImpl client;

    /**
     * The instance of instrumentation to report telemetry.
     */
    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of MobileApiHubsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    MobileApiHubsImpl(MobileClientImpl client) {
        this.service = MobileApiHubsService.getNewInstance(client.getHttpPipeline());
        this.client = client;
        this.instrumentation = client.getInstrumentation();
    }

    /**
     * The interface defining all the services for MobileClientMobileApiHubs to be used by the proxy service to perform
     * REST calls.
     */
    @ServiceInterface(name = "MobileClientMobileApiHubs", host = "{endpoint}")
    public interface MobileApiHubsService {
        static MobileApiHubsService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class.forName("uigf.mihoyo.checkin.implementation.MobileApiHubsServiceImpl");
                return (MobileApiHubsService) clazz.getMethod("getNewInstance", HttpPipeline.class)
                    .invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/apihub/api/getAppSplash",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseMobileAppSplashData> getAppSplash(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds, @HeaderParam("Accept") String accept,
            RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/apihub/api/getGameList",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseMobileGameListData> getGameList(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds, @HeaderParam("Accept") String accept,
            RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/apihub/api/myselfPageConfig",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseMobileMyselfPageConfigData> getMyselfPageConfig(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds, @HeaderParam("Accept") String accept,
            RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/apihub/api/unreadMessageCnt",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseMobileUnreadMessageData> getUnreadMessageCount(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds,
            @QueryParam("first_view_ts") long firstViewTs, @QueryParam("uid") long uid,
            @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/apihub/sapi/getUserMissionsState",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseMobileMissionsStateData> getUserMissionsState(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds, @HeaderParam("Accept") String accept,
            RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.POST,
            path = "/apihub/api/deviceLogin",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseEmptyData> deviceLogin(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds,
            @HeaderParam("Content-Type") String contentType, @HeaderParam("Accept") String accept,
            @BodyParam("application/json") MobileDeviceSessionRequest body, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.POST,
            path = "/apihub/api/deviceLogout",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseEmptyData> deviceLogout(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds,
            @HeaderParam("Content-Type") String contentType, @HeaderParam("Accept") String accept,
            @BodyParam("application/json") MobileDeviceSessionRequest body, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.POST,
            path = "/apihub/api/getAppStartupData",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseMobileStartupData> getAppStartupData(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds,
            @HeaderParam("Content-Type") String contentType, @HeaderParam("Accept") String accept,
            @BodyParam("application/json") MobileStartupRequest body, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.POST,
            path = "/apihub/api/window/prepare",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseMobileWindowPrepareData> prepareWindow(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds,
            @HeaderParam("Content-Type") String contentType, @HeaderParam("Accept") String accept,
            @BodyParam("application/json") MobileWindowPrepareRequest body, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.POST,
            path = "/apihub/api/window/show",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseMobileWindowShowData> showWindow(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds,
            @HeaderParam("Content-Type") String contentType, @HeaderParam("Accept") String accept,
            @BodyParam("application/json") MobileWindowShowRequest body, RequestContext requestContext);
    }

    /**
     * The getAppSplash operation.
     * 
     * @param ds The ds parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileAppSplashData> getAppSplashWithResponse(String ds, String cookie,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.getAppSplash",
            requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getAppSplash(this.client.getEndpoint(), cookie, ds, accept, updatedContext);
            });
    }

    /**
     * The getGameList operation.
     * 
     * @param ds The ds parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileGameListData> getGameListWithResponse(String ds, String cookie,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.getGameList",
            requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getGameList(this.client.getEndpoint(), cookie, ds, accept, updatedContext);
            });
    }

    /**
     * The getMyselfPageConfig operation.
     * 
     * @param ds The ds parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileMyselfPageConfigData> getMyselfPageConfigWithResponse(String ds, String cookie,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.getMyselfPageConfig", requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getMyselfPageConfig(this.client.getEndpoint(), cookie, ds, accept, updatedContext);
            });
    }

    /**
     * The getUnreadMessageCount operation.
     * 
     * @param ds The ds parameter.
     * @param firstViewTs The firstViewTs parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileUnreadMessageData> getUnreadMessageCountWithResponse(String ds, long firstViewTs,
        long uid, String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.getUnreadMessageCount", requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getUnreadMessageCount(this.client.getEndpoint(), cookie, ds, firstViewTs, uid, accept,
                    updatedContext);
            });
    }

    /**
     * The getUserMissionsState operation.
     * 
     * @param ds The ds parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileMissionsStateData> getUserMissionsStateWithResponse(String ds, String cookie,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.getUserMissionsState", requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getUserMissionsState(this.client.getEndpoint(), cookie, ds, accept, updatedContext);
            });
    }

    /**
     * The deviceLogin operation.
     * 
     * @param ds The ds parameter.
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseEmptyData> deviceLoginWithResponse(String ds, MobileDeviceSessionRequest body,
        String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.deviceLogin",
            requestContext, updatedContext -> {
                final String contentType = "application/json";
                final String accept = "application/json";
                return service.deviceLogin(this.client.getEndpoint(), cookie, ds, contentType, accept, body,
                    updatedContext);
            });
    }

    /**
     * The deviceLogout operation.
     * 
     * @param ds The ds parameter.
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseEmptyData> deviceLogoutWithResponse(String ds, MobileDeviceSessionRequest body,
        String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.deviceLogout",
            requestContext, updatedContext -> {
                final String contentType = "application/json";
                final String accept = "application/json";
                return service.deviceLogout(this.client.getEndpoint(), cookie, ds, contentType, accept, body,
                    updatedContext);
            });
    }

    /**
     * The getAppStartupData operation.
     * 
     * @param ds The ds parameter.
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileStartupData> getAppStartupDataWithResponse(String ds, MobileStartupRequest body,
        String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.getAppStartupData",
            requestContext, updatedContext -> {
                final String contentType = "application/json";
                final String accept = "application/json";
                return service.getAppStartupData(this.client.getEndpoint(), cookie, ds, contentType, accept, body,
                    updatedContext);
            });
    }

    /**
     * The prepareWindow operation.
     * 
     * @param ds The ds parameter.
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileWindowPrepareData> prepareWindowWithResponse(String ds,
        MobileWindowPrepareRequest body, String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.prepareWindow",
            requestContext, updatedContext -> {
                final String contentType = "application/json";
                final String accept = "application/json";
                return service.prepareWindow(this.client.getEndpoint(), cookie, ds, contentType, accept, body,
                    updatedContext);
            });
    }

    /**
     * The showWindow operation.
     * 
     * @param ds The ds parameter.
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileWindowShowData> showWindowWithResponse(String ds, MobileWindowShowRequest body,
        String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.showWindow",
            requestContext, updatedContext -> {
                final String contentType = "application/json";
                final String accept = "application/json";
                return service.showWindow(this.client.getEndpoint(), cookie, ds, contentType, accept, body,
                    updatedContext);
            });
    }
}
