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
import uigf.mihoyo.ApiResponseSdkFeCnConfigData;
import uigf.mihoyo.ApiResponseSdkPorteData;

/**
 * An instance of this class provides access to all the operations defined in ConfigurationApis.
 */
public final class ConfigurationApisImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ConfigurationApisService service;

    /**
     * The service client containing this operation class.
     */
    private final SdkStaticClientImpl client;

    /**
     * The instance of instrumentation to report telemetry.
     */
    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of ConfigurationApisImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ConfigurationApisImpl(SdkStaticClientImpl client) {
        this.service = ConfigurationApisService.getNewInstance(client.getHttpPipeline());
        this.client = client;
        this.instrumentation = client.getInstrumentation();
    }

    /**
     * The interface defining all the services for SdkStaticClientConfigurationApis to be used by the proxy service to
     * perform REST calls.
     */
    @ServiceInterface(name = "SdkStaticClientConfigurationApis", host = "{endpoint}")
    public interface ConfigurationApisService {
        static ConfigurationApisService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class.forName("uigf.mihoyo.checkin.implementation.ConfigurationApisServiceImpl");
                return (ConfigurationApisService) clazz.getMethod("getNewInstance", HttpPipeline.class)
                    .invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/combo/box/api/config/porte-cn/porte",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseSdkPorteData> getCnPorte(@HostParam("endpoint") String endpoint,
            @QueryParam("app_id") String appId, @QueryParam("client_type") int clientType,
            @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/combo/box/api/config/porte-fe-cn/config",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseSdkFeCnConfigData> getFeCnConfig(@HostParam("endpoint") String endpoint,
            @QueryParam("type") String type, @HeaderParam("Accept") String accept, RequestContext requestContext);
    }

    /**
     * The getCnPorte operation.
     * 
     * @param appId The appId parameter.
     * @param clientType The clientType parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseSdkPorteData> getCnPorteWithResponse(String appId, int clientType,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.SDK.Static.ConfigurationApi.getCnPorte",
            requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getCnPorte(this.client.getEndpoint(), appId, clientType, accept, updatedContext);
            });
    }

    /**
     * The getFeCnConfig operation.
     * 
     * @param type The type parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseSdkFeCnConfigData> getFeCnConfigWithResponse(String type,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.SDK.Static.ConfigurationApi.getFeCnConfig",
            requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getFeCnConfig(this.client.getEndpoint(), type, accept, updatedContext);
            });
    }
}
