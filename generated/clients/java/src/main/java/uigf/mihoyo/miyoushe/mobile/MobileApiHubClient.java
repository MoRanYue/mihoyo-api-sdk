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
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileAppSplashData> getAppSplashWithResponse(String cookie, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.getAppSplash",
            requestContext, updatedContext -> this.serviceClient.getAppSplashWithResponse(cookie, ds, updatedContext));
    }

    /**
     * The getAppSplash operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileAppSplashData getAppSplash(String cookie, String ds) {
        return getAppSplashWithResponse(cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The getAppSplash operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileAppSplashData getAppSplash() {
        final String cookie = null;
        final String ds = null;
        return getAppSplashWithResponse(cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The getGameList operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileGameListData> getGameListWithResponse(String cookie, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.getGameList",
            requestContext, updatedContext -> this.serviceClient.getGameListWithResponse(cookie, ds, updatedContext));
    }

    /**
     * The getGameList operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileGameListData getGameList(String cookie, String ds) {
        return getGameListWithResponse(cookie, ds, RequestContext.none()).getValue();
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
    public ApiResponseMobileGameListData getGameList() {
        final String cookie = null;
        final String ds = null;
        return getGameListWithResponse(cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The getMyselfPageConfig operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileMyselfPageConfigData> getMyselfPageConfigWithResponse(String cookie, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.getMyselfPageConfig", requestContext,
            updatedContext -> this.serviceClient.getMyselfPageConfigWithResponse(cookie, ds, updatedContext));
    }

    /**
     * The getMyselfPageConfig operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileMyselfPageConfigData getMyselfPageConfig(String cookie, String ds) {
        return getMyselfPageConfigWithResponse(cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The getMyselfPageConfig operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileMyselfPageConfigData getMyselfPageConfig() {
        final String cookie = null;
        final String ds = null;
        return getMyselfPageConfigWithResponse(cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The getUnreadMessageCount operation.
     * 
     * @param firstViewTs The firstViewTs parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileUnreadMessageData> getUnreadMessageCountWithResponse(long firstViewTs, long uid,
        String cookie, String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.getUnreadMessageCount", requestContext,
            updatedContext -> this.serviceClient.getUnreadMessageCountWithResponse(firstViewTs, uid, cookie, ds,
                updatedContext));
    }

    /**
     * The getUnreadMessageCount operation.
     * 
     * @param firstViewTs The firstViewTs parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileUnreadMessageData getUnreadMessageCount(long firstViewTs, long uid, String cookie,
        String ds) {
        return getUnreadMessageCountWithResponse(firstViewTs, uid, cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The getUnreadMessageCount operation.
     * 
     * @param firstViewTs The firstViewTs parameter.
     * @param uid The uid parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileUnreadMessageData getUnreadMessageCount(long firstViewTs, long uid) {
        final String cookie = null;
        final String ds = null;
        return getUnreadMessageCountWithResponse(firstViewTs, uid, cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The getUserMissionsState operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileMissionsStateData> getUserMissionsStateWithResponse(String cookie, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.getUserMissionsState", requestContext,
            updatedContext -> this.serviceClient.getUserMissionsStateWithResponse(cookie, ds, updatedContext));
    }

    /**
     * The getUserMissionsState operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileMissionsStateData getUserMissionsState(String cookie, String ds) {
        return getUserMissionsStateWithResponse(cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The getUserMissionsState operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileMissionsStateData getUserMissionsState() {
        final String cookie = null;
        final String ds = null;
        return getUserMissionsStateWithResponse(cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The deviceLogin operation.
     * 
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseEmptyData> deviceLoginWithResponse(MobileDeviceSessionRequest body, String cookie,
        String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.deviceLogin",
            requestContext,
            updatedContext -> this.serviceClient.deviceLoginWithResponse(body, cookie, ds, updatedContext));
    }

    /**
     * The deviceLogin operation.
     * 
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseEmptyData deviceLogin(MobileDeviceSessionRequest body, String cookie, String ds) {
        return deviceLoginWithResponse(body, cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The deviceLogin operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseEmptyData deviceLogin(MobileDeviceSessionRequest body) {
        final String cookie = null;
        final String ds = null;
        return deviceLoginWithResponse(body, cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The deviceLogout operation.
     * 
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseEmptyData> deviceLogoutWithResponse(MobileDeviceSessionRequest body, String cookie,
        String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.deviceLogout",
            requestContext,
            updatedContext -> this.serviceClient.deviceLogoutWithResponse(body, cookie, ds, updatedContext));
    }

    /**
     * The deviceLogout operation.
     * 
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseEmptyData deviceLogout(MobileDeviceSessionRequest body, String cookie, String ds) {
        return deviceLogoutWithResponse(body, cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The deviceLogout operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseEmptyData deviceLogout(MobileDeviceSessionRequest body) {
        final String cookie = null;
        final String ds = null;
        return deviceLogoutWithResponse(body, cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The getAppStartupData operation.
     * 
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileStartupData> getAppStartupDataWithResponse(MobileStartupRequest body,
        String cookie, String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.getAppStartupData",
            requestContext,
            updatedContext -> this.serviceClient.getAppStartupDataWithResponse(body, cookie, ds, updatedContext));
    }

    /**
     * The getAppStartupData operation.
     * 
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileStartupData getAppStartupData(MobileStartupRequest body, String cookie, String ds) {
        return getAppStartupDataWithResponse(body, cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The getAppStartupData operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileStartupData getAppStartupData(MobileStartupRequest body) {
        final String cookie = null;
        final String ds = null;
        return getAppStartupDataWithResponse(body, cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The prepareWindow operation.
     * 
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileWindowPrepareData> prepareWindowWithResponse(MobileWindowPrepareRequest body,
        String cookie, String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.prepareWindow",
            requestContext,
            updatedContext -> this.serviceClient.prepareWindowWithResponse(body, cookie, ds, updatedContext));
    }

    /**
     * The prepareWindow operation.
     * 
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileWindowPrepareData prepareWindow(MobileWindowPrepareRequest body, String cookie, String ds) {
        return prepareWindowWithResponse(body, cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The prepareWindow operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileWindowPrepareData prepareWindow(MobileWindowPrepareRequest body) {
        final String cookie = null;
        final String ds = null;
        return prepareWindowWithResponse(body, cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The showWindow operation.
     * 
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileWindowShowData> showWindowWithResponse(MobileWindowShowRequest body, String cookie,
        String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileApiHub.showWindow",
            requestContext,
            updatedContext -> this.serviceClient.showWindowWithResponse(body, cookie, ds, updatedContext));
    }

    /**
     * The showWindow operation.
     * 
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileWindowShowData showWindow(MobileWindowShowRequest body, String cookie, String ds) {
        return showWindowWithResponse(body, cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The showWindow operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileWindowShowData showWindow(MobileWindowShowRequest body) {
        final String cookie = null;
        final String ds = null;
        return showWindowWithResponse(body, cookie, ds, RequestContext.none()).getValue();
    }
}
