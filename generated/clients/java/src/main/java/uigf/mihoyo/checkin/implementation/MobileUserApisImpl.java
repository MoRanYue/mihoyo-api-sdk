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
import uigf.mihoyo.ApiResponseCommunityUser;
import uigf.mihoyo.ApiResponseEmptyData;
import uigf.mihoyo.ApiResponseMobileBusinessesData;
import uigf.mihoyo.ApiResponseMobileNotificationSettingsData;
import uigf.mihoyo.ApiResponseMobileReplyPermissionData;
import uigf.mihoyo.api.request.MobileLoginRequest;

/**
 * An instance of this class provides access to all the operations defined in MobileUserApis.
 */
public final class MobileUserApisImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final MobileUserApisService service;

    /**
     * The service client containing this operation class.
     */
    private final MobileClientImpl client;

    /**
     * The instance of instrumentation to report telemetry.
     */
    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of MobileUserApisImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    MobileUserApisImpl(MobileClientImpl client) {
        this.service = MobileUserApisService.getNewInstance(client.getHttpPipeline());
        this.client = client;
        this.instrumentation = client.getInstrumentation();
    }

    /**
     * The interface defining all the services for MobileClientMobileUserApis to be used by the proxy service to perform
     * REST calls.
     */
    @ServiceInterface(name = "MobileClientMobileUserApis", host = "{endpoint}")
    public interface MobileUserApisService {
        static MobileUserApisService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class.forName("uigf.mihoyo.checkin.implementation.MobileUserApisServiceImpl");
                return (MobileUserApisService) clazz.getMethod("getNewInstance", HttpPipeline.class)
                    .invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/user/api/getUserBusinesses",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseMobileBusinessesData> getUserBusinesses(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds, @QueryParam("uid") long uid,
            @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/user/api/getUserFullInfo",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseCommunityUser> getUserFullInfo(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds, @QueryParam("uid") long uid,
            @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/user/api/notify/settings",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseMobileNotificationSettingsData> getNotificationSettings(
            @HostParam("endpoint") String endpoint, @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds,
            @QueryParam("uid") long uid, @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/user/api/replyPermission",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseMobileReplyPermissionData> getReplyPermission(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds, @HeaderParam("Accept") String accept,
            RequestContext requestContext);

        @HttpRequestInformation(method = HttpMethod.POST, path = "/user/api/login", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseEmptyData> login(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds,
            @HeaderParam("Content-Type") String contentType, @HeaderParam("Accept") String accept,
            @BodyParam("application/json") MobileLoginRequest body, RequestContext requestContext);
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileBusinessesData> getUserBusinessesWithResponse(long uid, String cookie, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobileUserApi.getUserBusinesses", requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getUserBusinesses(this.client.getEndpoint(), cookie, ds, uid, accept, updatedContext);
            });
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseCommunityUser> getUserFullInfoWithResponse(long uid, String cookie, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileUserApi.getUserFullInfo",
            requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getUserFullInfo(this.client.getEndpoint(), cookie, ds, uid, accept, updatedContext);
            });
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileNotificationSettingsData> getNotificationSettingsWithResponse(long uid,
        String cookie, String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobileUserApi.getNotificationSettings", requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getNotificationSettings(this.client.getEndpoint(), cookie, ds, uid, accept,
                    updatedContext);
            });
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileReplyPermissionData> getReplyPermissionWithResponse(String cookie, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobileUserApi.getReplyPermission", requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getReplyPermission(this.client.getEndpoint(), cookie, ds, accept, updatedContext);
            });
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseEmptyData> loginWithResponse(MobileLoginRequest body, String cookie, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileUserApi.login",
            requestContext, updatedContext -> {
                final String contentType = "application/json";
                final String accept = "application/json";
                return service.login(this.client.getEndpoint(), cookie, ds, contentType, accept, body, updatedContext);
            });
    }
}
