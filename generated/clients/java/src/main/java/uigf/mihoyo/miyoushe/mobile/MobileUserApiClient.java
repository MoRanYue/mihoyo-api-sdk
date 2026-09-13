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
     * @param ds The ds parameter.
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
    public Response<ApiResponseMobileBusinessesData> getUserBusinessesWithResponse(String ds, long uid, String cookie,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobileUserApi.getUserBusinesses", requestContext,
            updatedContext -> this.serviceClient.getUserBusinessesWithResponse(ds, uid, cookie, updatedContext));
    }

    /**
     * The getUserBusinesses operation.
     * 
     * @param ds The ds parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileBusinessesData getUserBusinesses(String ds, long uid, String cookie) {
        return getUserBusinessesWithResponse(ds, uid, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getUserBusinesses operation.
     * 
     * @param ds The ds parameter.
     * @param uid The uid parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileBusinessesData getUserBusinesses(String ds, long uid) {
        final String cookie = null;
        return getUserBusinessesWithResponse(ds, uid, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getUserFullInfo operation.
     * 
     * @param ds The ds parameter.
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
    public Response<ApiResponseCommunityUser> getUserFullInfoWithResponse(String ds, long uid, String cookie,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileUserApi.getUserFullInfo",
            requestContext,
            updatedContext -> this.serviceClient.getUserFullInfoWithResponse(ds, uid, cookie, updatedContext));
    }

    /**
     * The getUserFullInfo operation.
     * 
     * @param ds The ds parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseCommunityUser getUserFullInfo(String ds, long uid, String cookie) {
        return getUserFullInfoWithResponse(ds, uid, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getUserFullInfo operation.
     * 
     * @param ds The ds parameter.
     * @param uid The uid parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseCommunityUser getUserFullInfo(String ds, long uid) {
        final String cookie = null;
        return getUserFullInfoWithResponse(ds, uid, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getNotificationSettings operation.
     * 
     * @param ds The ds parameter.
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
    public Response<ApiResponseMobileNotificationSettingsData> getNotificationSettingsWithResponse(String ds, long uid,
        String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobileUserApi.getNotificationSettings", requestContext,
            updatedContext -> this.serviceClient.getNotificationSettingsWithResponse(ds, uid, cookie, updatedContext));
    }

    /**
     * The getNotificationSettings operation.
     * 
     * @param ds The ds parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileNotificationSettingsData getNotificationSettings(String ds, long uid, String cookie) {
        return getNotificationSettingsWithResponse(ds, uid, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getNotificationSettings operation.
     * 
     * @param ds The ds parameter.
     * @param uid The uid parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileNotificationSettingsData getNotificationSettings(String ds, long uid) {
        final String cookie = null;
        return getNotificationSettingsWithResponse(ds, uid, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getReplyPermission operation.
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
    public Response<ApiResponseMobileReplyPermissionData> getReplyPermissionWithResponse(String ds, String cookie,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobileUserApi.getReplyPermission", requestContext,
            updatedContext -> this.serviceClient.getReplyPermissionWithResponse(ds, cookie, updatedContext));
    }

    /**
     * The getReplyPermission operation.
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
    public ApiResponseMobileReplyPermissionData getReplyPermission(String ds, String cookie) {
        return getReplyPermissionWithResponse(ds, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getReplyPermission operation.
     * 
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileReplyPermissionData getReplyPermission(String ds) {
        final String cookie = null;
        return getReplyPermissionWithResponse(ds, cookie, RequestContext.none()).getValue();
    }

    /**
     * The login operation.
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
    public Response<ApiResponseEmptyData> loginWithResponse(String ds, MobileLoginRequest body, String cookie,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileUserApi.login",
            requestContext, updatedContext -> this.serviceClient.loginWithResponse(ds, body, cookie, updatedContext));
    }

    /**
     * The login operation.
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
    public ApiResponseEmptyData login(String ds, MobileLoginRequest body, String cookie) {
        return loginWithResponse(ds, body, cookie, RequestContext.none()).getValue();
    }

    /**
     * The login operation.
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
    public ApiResponseEmptyData login(String ds, MobileLoginRequest body) {
        final String cookie = null;
        return loginWithResponse(ds, body, cookie, RequestContext.none()).getValue();
    }
}
