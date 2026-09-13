package uigf.mihoyo.game.account;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.instrumentation.Instrumentation;
import uigf.mihoyo.ApiResponseJsonObject;
import uigf.mihoyo.checkin.implementation.CultivationApisImpl;
import uigf.mihoyo.game.CalculateRequest;

/**
 * Initializes a new instance of the synchronous GameAccountClient type.
 */
@ServiceClient(builder = GameAccountClientBuilder.class)
public final class CultivationApiClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final CultivationApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of CultivationApiClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    CultivationApiClient(CultivationApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * Calculates material consumption for a batch of characters and weapons.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseJsonObject> batchComputeWithResponse(String cookie, CalculateRequest body, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.Account.CultivationApi.batchCompute",
            requestContext,
            updatedContext -> this.serviceClient.batchComputeWithResponse(cookie, body, ds, updatedContext));
    }

    /**
     * Calculates material consumption for a batch of characters and weapons.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject batchCompute(String cookie, CalculateRequest body, String ds) {
        return batchComputeWithResponse(cookie, body, ds, RequestContext.none()).getValue();
    }

    /**
     * Calculates material consumption for a batch of characters and weapons.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject batchCompute(String cookie, CalculateRequest body) {
        final String ds = null;
        return batchComputeWithResponse(cookie, body, ds, RequestContext.none()).getValue();
    }

    /**
     * The listAvatars operation.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseJsonObject> listAvatarsWithResponse(String cookie, CalculateRequest body, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.Account.CultivationApi.listAvatars",
            requestContext,
            updatedContext -> this.serviceClient.listAvatarsWithResponse(cookie, body, ds, updatedContext));
    }

    /**
     * The listAvatars operation.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject listAvatars(String cookie, CalculateRequest body, String ds) {
        return listAvatarsWithResponse(cookie, body, ds, RequestContext.none()).getValue();
    }

    /**
     * The listAvatars operation.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject listAvatars(String cookie, CalculateRequest body) {
        final String ds = null;
        return listAvatarsWithResponse(cookie, body, ds, RequestContext.none()).getValue();
    }

    /**
     * The listWeapons operation.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseJsonObject> listWeaponsWithResponse(String cookie, CalculateRequest body, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.Account.CultivationApi.listWeapons",
            requestContext,
            updatedContext -> this.serviceClient.listWeaponsWithResponse(cookie, body, ds, updatedContext));
    }

    /**
     * The listWeapons operation.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject listWeapons(String cookie, CalculateRequest body, String ds) {
        return listWeaponsWithResponse(cookie, body, ds, RequestContext.none()).getValue();
    }

    /**
     * The listWeapons operation.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject listWeapons(String cookie, CalculateRequest body) {
        final String ds = null;
        return listWeaponsWithResponse(cookie, body, ds, RequestContext.none()).getValue();
    }

    /**
     * The syncAvatarList operation.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseJsonObject> syncAvatarListWithResponse(String cookie, CalculateRequest body, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.Account.CultivationApi.syncAvatarList",
            requestContext,
            updatedContext -> this.serviceClient.syncAvatarListWithResponse(cookie, body, ds, updatedContext));
    }

    /**
     * The syncAvatarList operation.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject syncAvatarList(String cookie, CalculateRequest body, String ds) {
        return syncAvatarListWithResponse(cookie, body, ds, RequestContext.none()).getValue();
    }

    /**
     * The syncAvatarList operation.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject syncAvatarList(String cookie, CalculateRequest body) {
        final String ds = null;
        return syncAvatarListWithResponse(cookie, body, ds, RequestContext.none()).getValue();
    }
}
