package uigf.mihoyo.sdk.staticnamespace;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.instrumentation.Instrumentation;
import uigf.mihoyo.ApiResponseSdkFeCnConfigData;
import uigf.mihoyo.ApiResponseSdkPorteData;
import uigf.mihoyo.checkin.implementation.ConfigurationApisImpl;

/**
 * Initializes a new instance of the synchronous SdkStaticClient type.
 */
@ServiceClient(builder = SdkStaticClientBuilder.class)
public final class SdkStaticClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final ConfigurationApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of SdkStaticClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    SdkStaticClient(ConfigurationApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
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
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseSdkPorteData> getCnPorteWithResponse(String appId, int clientType,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.SDK.Static.ConfigurationApi.getCnPorte",
            requestContext,
            updatedContext -> this.serviceClient.getCnPorteWithResponse(appId, clientType, updatedContext));
    }

    /**
     * The getCnPorte operation.
     * 
     * @param appId The appId parameter.
     * @param clientType The clientType parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseSdkPorteData getCnPorte(String appId, int clientType) {
        return getCnPorteWithResponse(appId, clientType, RequestContext.none()).getValue();
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
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseSdkFeCnConfigData> getFeCnConfigWithResponse(String type,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.SDK.Static.ConfigurationApi.getFeCnConfig",
            requestContext, updatedContext -> this.serviceClient.getFeCnConfigWithResponse(type, updatedContext));
    }

    /**
     * The getFeCnConfig operation.
     * 
     * @param type The type parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseSdkFeCnConfigData getFeCnConfig(String type) {
        return getFeCnConfigWithResponse(type, RequestContext.none()).getValue();
    }
}
