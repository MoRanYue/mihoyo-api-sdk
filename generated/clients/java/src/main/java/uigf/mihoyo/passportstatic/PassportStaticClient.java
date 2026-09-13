package uigf.mihoyo.passportstatic;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.instrumentation.Instrumentation;
import uigf.mihoyo.ApiResponsePassportSwitchStatusData;
import uigf.mihoyo.checkin.implementation.SwitchApisImpl;

/**
 * Initializes a new instance of the synchronous PassportStaticClient type.
 */
@ServiceClient(builder = PassportStaticClientBuilder.class)
public final class PassportStaticClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final SwitchApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of PassportStaticClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    PassportStaticClient(SwitchApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The getSwitchStatus operation.
     * 
     * @param ds The ds parameter.
     * @param appId The appId parameter.
     * @param platform The platform parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponsePassportSwitchStatusData> getSwitchStatusWithResponse(String ds, String appId,
        int platform, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.PassportStatic.SwitchApi.getSwitchStatus",
            requestContext,
            updatedContext -> this.serviceClient.getSwitchStatusWithResponse(ds, appId, platform, updatedContext));
    }

    /**
     * The getSwitchStatus operation.
     * 
     * @param ds The ds parameter.
     * @param appId The appId parameter.
     * @param platform The platform parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponsePassportSwitchStatusData getSwitchStatus(String ds, String appId, int platform) {
        return getSwitchStatusWithResponse(ds, appId, platform, RequestContext.none()).getValue();
    }
}
