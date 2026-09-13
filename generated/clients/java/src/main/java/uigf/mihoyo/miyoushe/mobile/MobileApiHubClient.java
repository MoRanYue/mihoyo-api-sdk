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
import uigf.mihoyo.checkin.implementation.MobileApiHubsImpl;

/**
 * Initializes a new instance of the synchronous MobileClient type.
 */
@ServiceClient(builder = MobileClientBuilder.class)
public final class MobileApiHubClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final MobileApiHubsImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of MobileApiHubClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    MobileApiHubClient(MobileApiHubsImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
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
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileAppSplashData> getAppSplashWithResponse(String ds, String cookie,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.getAppSplash",
            requestContext, updatedContext -> this.serviceClient.getAppSplashWithResponse(ds, cookie, updatedContext));
    }

    /**
     * The getAppSplash operation.
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
    public ApiResponseMobileAppSplashData getAppSplash(String ds, String cookie) {
        return getAppSplashWithResponse(ds, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getAppSplash operation.
     * 
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileAppSplashData getAppSplash(String ds) {
        final String cookie = null;
        return getAppSplashWithResponse(ds, cookie, RequestContext.none()).getValue();
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
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileGameListData> getGameListWithResponse(String ds, String cookie,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.getGameList",
            requestContext, updatedContext -> this.serviceClient.getGameListWithResponse(ds, cookie, updatedContext));
    }

    /**
     * The getGameList operation.
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
    public ApiResponseMobileGameListData getGameList(String ds, String cookie) {
        return getGameListWithResponse(ds, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getGameList operation.
     * 
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileGameListData getGameList(String ds) {
        final String cookie = null;
        return getGameListWithResponse(ds, cookie, RequestContext.none()).getValue();
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
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileMyselfPageConfigData> getMyselfPageConfigWithResponse(String ds, String cookie,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.getMyselfPageConfig", requestContext,
            updatedContext -> this.serviceClient.getMyselfPageConfigWithResponse(ds, cookie, updatedContext));
    }

    /**
     * The getMyselfPageConfig operation.
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
    public ApiResponseMobileMyselfPageConfigData getMyselfPageConfig(String ds, String cookie) {
        return getMyselfPageConfigWithResponse(ds, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getMyselfPageConfig operation.
     * 
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileMyselfPageConfigData getMyselfPageConfig(String ds) {
        final String cookie = null;
        return getMyselfPageConfigWithResponse(ds, cookie, RequestContext.none()).getValue();
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
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileUnreadMessageData> getUnreadMessageCountWithResponse(String ds, long firstViewTs,
        long uid, String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.getUnreadMessageCount", requestContext,
            updatedContext -> this.serviceClient.getUnreadMessageCountWithResponse(ds, firstViewTs, uid, cookie,
                updatedContext));
    }

    /**
     * The getUnreadMessageCount operation.
     * 
     * @param ds The ds parameter.
     * @param firstViewTs The firstViewTs parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileUnreadMessageData getUnreadMessageCount(String ds, long firstViewTs, long uid,
        String cookie) {
        return getUnreadMessageCountWithResponse(ds, firstViewTs, uid, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getUnreadMessageCount operation.
     * 
     * @param ds The ds parameter.
     * @param firstViewTs The firstViewTs parameter.
     * @param uid The uid parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileUnreadMessageData getUnreadMessageCount(String ds, long firstViewTs, long uid) {
        final String cookie = null;
        return getUnreadMessageCountWithResponse(ds, firstViewTs, uid, cookie, RequestContext.none()).getValue();
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
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileMissionsStateData> getUserMissionsStateWithResponse(String ds, String cookie,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.getUserMissionsState", requestContext,
            updatedContext -> this.serviceClient.getUserMissionsStateWithResponse(ds, cookie, updatedContext));
    }

    /**
     * The getUserMissionsState operation.
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
    public ApiResponseMobileMissionsStateData getUserMissionsState(String ds, String cookie) {
        return getUserMissionsStateWithResponse(ds, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getUserMissionsState operation.
     * 
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileMissionsStateData getUserMissionsState(String ds) {
        final String cookie = null;
        return getUserMissionsStateWithResponse(ds, cookie, RequestContext.none()).getValue();
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
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseEmptyData> deviceLoginWithResponse(String ds, MobileDeviceSessionRequest body,
        String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.deviceLogin",
            requestContext,
            updatedContext -> this.serviceClient.deviceLoginWithResponse(ds, body, cookie, updatedContext));
    }

    /**
     * The deviceLogin operation.
     * 
     * @param ds The ds parameter.
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseEmptyData deviceLogin(String ds, MobileDeviceSessionRequest body, String cookie) {
        return deviceLoginWithResponse(ds, body, cookie, RequestContext.none()).getValue();
    }

    /**
     * The deviceLogin operation.
     * 
     * @param ds The ds parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseEmptyData deviceLogin(String ds, MobileDeviceSessionRequest body) {
        final String cookie = null;
        return deviceLoginWithResponse(ds, body, cookie, RequestContext.none()).getValue();
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
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseEmptyData> deviceLogoutWithResponse(String ds, MobileDeviceSessionRequest body,
        String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.deviceLogout",
            requestContext,
            updatedContext -> this.serviceClient.deviceLogoutWithResponse(ds, body, cookie, updatedContext));
    }

    /**
     * The deviceLogout operation.
     * 
     * @param ds The ds parameter.
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseEmptyData deviceLogout(String ds, MobileDeviceSessionRequest body, String cookie) {
        return deviceLogoutWithResponse(ds, body, cookie, RequestContext.none()).getValue();
    }

    /**
     * The deviceLogout operation.
     * 
     * @param ds The ds parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseEmptyData deviceLogout(String ds, MobileDeviceSessionRequest body) {
        final String cookie = null;
        return deviceLogoutWithResponse(ds, body, cookie, RequestContext.none()).getValue();
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
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileStartupData> getAppStartupDataWithResponse(String ds, MobileStartupRequest body,
        String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.getAppStartupData",
            requestContext,
            updatedContext -> this.serviceClient.getAppStartupDataWithResponse(ds, body, cookie, updatedContext));
    }

    /**
     * The getAppStartupData operation.
     * 
     * @param ds The ds parameter.
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileStartupData getAppStartupData(String ds, MobileStartupRequest body, String cookie) {
        return getAppStartupDataWithResponse(ds, body, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getAppStartupData operation.
     * 
     * @param ds The ds parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileStartupData getAppStartupData(String ds, MobileStartupRequest body) {
        final String cookie = null;
        return getAppStartupDataWithResponse(ds, body, cookie, RequestContext.none()).getValue();
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
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileWindowPrepareData> prepareWindowWithResponse(String ds,
        MobileWindowPrepareRequest body, String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.prepareWindow",
            requestContext,
            updatedContext -> this.serviceClient.prepareWindowWithResponse(ds, body, cookie, updatedContext));
    }

    /**
     * The prepareWindow operation.
     * 
     * @param ds The ds parameter.
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileWindowPrepareData prepareWindow(String ds, MobileWindowPrepareRequest body, String cookie) {
        return prepareWindowWithResponse(ds, body, cookie, RequestContext.none()).getValue();
    }

    /**
     * The prepareWindow operation.
     * 
     * @param ds The ds parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileWindowPrepareData prepareWindow(String ds, MobileWindowPrepareRequest body) {
        final String cookie = null;
        return prepareWindowWithResponse(ds, body, cookie, RequestContext.none()).getValue();
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
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileWindowShowData> showWindowWithResponse(String ds, MobileWindowShowRequest body,
        String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.showWindow",
            requestContext,
            updatedContext -> this.serviceClient.showWindowWithResponse(ds, body, cookie, updatedContext));
    }

    /**
     * The showWindow operation.
     * 
     * @param ds The ds parameter.
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileWindowShowData showWindow(String ds, MobileWindowShowRequest body, String cookie) {
        return showWindowWithResponse(ds, body, cookie, RequestContext.none()).getValue();
    }

    /**
     * The showWindow operation.
     * 
     * @param ds The ds parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileWindowShowData showWindow(String ds, MobileWindowShowRequest body) {
        final String cookie = null;
        return showWindowWithResponse(ds, body, cookie, RequestContext.none()).getValue();
    }
}
