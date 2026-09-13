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
import uigf.mihoyo.ApiResponseCommunityUser;
import uigf.mihoyo.ApiResponseEmptyData;
import uigf.mihoyo.ApiResponseMobileBusinessesData;
import uigf.mihoyo.ApiResponseMobileNotificationSettingsData;
import uigf.mihoyo.ApiResponseMobileReplyPermissionData;
import uigf.mihoyo.api.request.MobileLoginRequest;
import uigf.mihoyo.checkin.implementation.MobileUserApisImpl;

/**
 * Initializes a new instance of the synchronous MobileClient type.
 */
@ServiceClient(builder = MobileClientBuilder.class)
public final class MobileUserApiClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final MobileUserApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of MobileUserApiClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    MobileUserApiClient(MobileUserApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The getUserBusinesses operation.
     * 
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
    public Response<ApiResponseMobileBusinessesData> getUserBusinessesWithResponse(long uid, String cookie, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobileUserApi.getUserBusinesses", requestContext,
            updatedContext -> this.serviceClient.getUserBusinessesWithResponse(uid, cookie, ds, updatedContext));
    }

    /**
     * The getUserBusinesses operation.
     * 
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
    public ApiResponseMobileBusinessesData getUserBusinesses(long uid, String cookie, String ds) {
        return getUserBusinessesWithResponse(uid, cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The getUserBusinesses operation.
     * 
     * @param uid The uid parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileBusinessesData getUserBusinesses(long uid) {
        final String cookie = null;
        final String ds = null;
        return getUserBusinessesWithResponse(uid, cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The getUserFullInfo operation.
     * 
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
    public Response<ApiResponseCommunityUser> getUserFullInfoWithResponse(long uid, String cookie, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileUserApi.getUserFullInfo",
            requestContext,
            updatedContext -> this.serviceClient.getUserFullInfoWithResponse(uid, cookie, ds, updatedContext));
    }

    /**
     * The getUserFullInfo operation.
     * 
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
    public ApiResponseCommunityUser getUserFullInfo(long uid, String cookie, String ds) {
        return getUserFullInfoWithResponse(uid, cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The getUserFullInfo operation.
     * 
     * @param uid The uid parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseCommunityUser getUserFullInfo(long uid) {
        final String cookie = null;
        final String ds = null;
        return getUserFullInfoWithResponse(uid, cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The getNotificationSettings operation.
     * 
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
    public Response<ApiResponseMobileNotificationSettingsData> getNotificationSettingsWithResponse(long uid,
        String cookie, String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobileUserApi.getNotificationSettings", requestContext,
            updatedContext -> this.serviceClient.getNotificationSettingsWithResponse(uid, cookie, ds, updatedContext));
    }

    /**
     * The getNotificationSettings operation.
     * 
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
    public ApiResponseMobileNotificationSettingsData getNotificationSettings(long uid, String cookie, String ds) {
        return getNotificationSettingsWithResponse(uid, cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The getNotificationSettings operation.
     * 
     * @param uid The uid parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileNotificationSettingsData getNotificationSettings(long uid) {
        final String cookie = null;
        final String ds = null;
        return getNotificationSettingsWithResponse(uid, cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The getReplyPermission operation.
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
    public Response<ApiResponseMobileReplyPermissionData> getReplyPermissionWithResponse(String cookie, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobileUserApi.getReplyPermission", requestContext,
            updatedContext -> this.serviceClient.getReplyPermissionWithResponse(cookie, ds, updatedContext));
    }

    /**
     * The getReplyPermission operation.
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
    public ApiResponseMobileReplyPermissionData getReplyPermission(String cookie, String ds) {
        return getReplyPermissionWithResponse(cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The getReplyPermission operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileReplyPermissionData getReplyPermission() {
        final String cookie = null;
        final String ds = null;
        return getReplyPermissionWithResponse(cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The login operation.
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
    public Response<ApiResponseEmptyData> loginWithResponse(MobileLoginRequest body, String cookie, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileUserApi.login",
            requestContext, updatedContext -> this.serviceClient.loginWithResponse(body, cookie, ds, updatedContext));
    }

    /**
     * The login operation.
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
    public ApiResponseEmptyData login(MobileLoginRequest body, String cookie, String ds) {
        return loginWithResponse(body, cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The login operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseEmptyData login(MobileLoginRequest body) {
        final String cookie = null;
        final String ds = null;
        return loginWithResponse(body, cookie, ds, RequestContext.none()).getValue();
    }
}
