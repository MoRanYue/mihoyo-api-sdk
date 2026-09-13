package uigf.mihoyo.game.cn.miyousheaccount;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.instrumentation.Instrumentation;
import uigf.mihoyo.ApiResponseGameRoleList;
import uigf.mihoyo.checkin.implementation.MiYouSheBindingApisImpl;

/**
 * Initializes a new instance of the synchronous MiYouSheAccountClient type.
 */
@ServiceClient(builder = MiYouSheAccountClientBuilder.class)
public final class MiYouSheBindingApiClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final MiYouSheBindingApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of MiYouSheBindingApiClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    MiYouSheBindingApiClient(MiYouSheBindingApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The getRoles operation.
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
    public Response<ApiResponseGameRoleList> getRolesWithResponse(String cookie, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.CN.MiYouSheAccount.BindingApi.getRoles",
            requestContext, updatedContext -> this.serviceClient.getRolesWithResponse(cookie, ds, updatedContext));
    }

    /**
     * The getRoles operation.
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
    public ApiResponseGameRoleList getRoles(String cookie, String ds) {
        return getRolesWithResponse(cookie, ds, RequestContext.none()).getValue();
    }
}
