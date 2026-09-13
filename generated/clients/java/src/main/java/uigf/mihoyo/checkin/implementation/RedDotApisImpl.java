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
import uigf.mihoyo.ApiResponseRedDotBatchData;

/**
 * An instance of this class provides access to all the operations defined in RedDotApis.
 */
public final class RedDotApisImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final RedDotApisService service;

    /**
     * The service client containing this operation class.
     */
    private final AccountExtensionClientImpl client;

    /**
     * The instance of instrumentation to report telemetry.
     */
    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of RedDotApisImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    RedDotApisImpl(AccountExtensionClientImpl client) {
        this.service = RedDotApisService.getNewInstance(client.getHttpPipeline());
        this.client = client;
        this.instrumentation = client.getInstrumentation();
    }

    /**
     * The interface defining all the services for AccountExtensionClientRedDotApis to be used by the proxy service to
     * perform REST calls.
     */
    @ServiceInterface(name = "AccountExtensionClientRedDotApis", host = "{endpoint}")
    public interface RedDotApisService {
        static RedDotApisService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class.forName("uigf.mihoyo.checkin.implementation.RedDotApisServiceImpl");
                return (RedDotApisService) clazz.getMethod("getNewInstance", HttpPipeline.class).invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/common/csc_qna/public/batchGetRedDot",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseRedDotBatchData> getBatch(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds, @QueryParam("authkey") String authkey,
            @QueryParam("authkey_ver") int authkeyVer, @QueryParam("game_biz") String gameBiz,
            @QueryParam("sign_type") int signType, @QueryParam("users") String users,
            @HeaderParam("Accept") String accept, RequestContext requestContext);
    }

    /**
     * The getBatch operation.
     * 
     * @param ds The ds parameter.
     * @param authkey The authkey parameter.
     * @param authkeyVer The authkeyVer parameter.
     * @param gameBiz The gameBiz parameter.
     * @param signType The signType parameter.
     * @param users The users parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseRedDotBatchData> getBatchWithResponse(String ds, String authkey, int authkeyVer,
        String gameBiz, int signType, String users, String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.CN.AccountExtension.RedDotApi.getBatch",
            requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getBatch(this.client.getEndpoint(), cookie, ds, authkey, authkeyVer, gameBiz, signType,
                    users, accept, updatedContext);
            });
    }
}
