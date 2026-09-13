package uigf.mihoyo;

import io.clientcore.core.http.models.HttpHeaderName;
import io.clientcore.core.http.models.HttpRequest;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.http.pipeline.HttpPipelineNextPolicy;
import io.clientcore.core.http.pipeline.HttpPipelinePolicy;
import io.clientcore.core.http.pipeline.HttpPipelinePosition;
import io.clientcore.core.models.binarydata.BinaryData;
import io.clientcore.core.traits.HttpTrait;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

/** Configures generated clients to sign DS-protected requests automatically. */
public final class DsSigner {
    private static final String LOWER_ALPHANUMERIC = "0123456789abcdefghijklmnopqrstuvwxyz";
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final HttpHeaderName DS_HEADER = HttpHeaderName.fromString("DS");

    private DsSigner() {}

    /** Adds automatic DS signing to a generated client builder. */
    public static <T extends HttpTrait<T>> T configure(T builder, String salt) {
        return builder.addHttpPipelinePolicy(createPolicy(salt));
    }

    /** Creates a pipeline policy for callers who configure their own generated client builder. */
    public static HttpPipelinePolicy createPolicy(String salt) {
        if (salt == null || salt.isEmpty()) {
            throw new IllegalArgumentException("DS salt must be provided by the caller.");
        }
        return new DsSigningPolicy(salt);
    }

    private static String createHeader(String salt, int generation, String body, String query) {
        long timestamp = System.currentTimeMillis() / 1000L;
        String nonce = generation == 2 ? Integer.toString(RANDOM.nextInt(100_001) + 100_000) : createV1Nonce();
        String payload = "salt=" + salt + "&t=" + timestamp + "&r=" + nonce;
        if (generation == 2) {
            payload += "&b=" + body + "&q=" + canonicalizeQuery(query);
        }
        return timestamp + "," + nonce + "," + md5(payload);
    }

    private static String createV1Nonce() {
        StringBuilder nonce = new StringBuilder(6);
        for (int index = 0; index < 6; index++) {
            nonce.append(LOWER_ALPHANUMERIC.charAt(RANDOM.nextInt(LOWER_ALPHANUMERIC.length())));
        }
        return nonce.toString();
    }

    private static String canonicalizeQuery(String query) {
        if (query == null || query.isEmpty()) {
            return "";
        }
        String[] segments = query.startsWith("?") ? query.substring(1).split("&") : query.split("&");
        Arrays.sort(segments);
        return String.join("&", segments);
    }

    private static String md5(String payload) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(payload.getBytes(StandardCharsets.UTF_8));
            StringBuilder hex = new StringBuilder(digest.length * 2);
            for (byte value : digest) {
                hex.append(String.format("%02x", value & 0xff));
            }
            return hex.toString();
        } catch (NoSuchAlgorithmException error) {
            throw new IllegalStateException("MD5 is unavailable.", error);
        }
    }

    private static final class DsSigningPolicy implements HttpPipelinePolicy {
        private final String salt;

        DsSigningPolicy(String salt) {
            this.salt = salt;
        }

        @Override
        public Response<BinaryData> process(HttpRequest request, HttpPipelineNextPolicy next) {
            URI uri = request.getUri();
            int generation = uri == null ? 0 : DsOperationMap.getGeneration(uri.getPath());
            String existing = request.getHeaders().getValue(DS_HEADER);
            if (generation != 0 && (existing == null || existing.isEmpty())) {
                BinaryData content = request.getBody();
                String body = generation == 2 && content != null
                    ? new String(content.toBytes(), StandardCharsets.UTF_8) : "";
                request.getHeaders().set(DS_HEADER, createHeader(salt, generation, body, uri.getRawQuery()));
            }
            return next.process();
        }

        @Override
        public HttpPipelinePosition getPipelinePosition() {
            return HttpPipelinePosition.AFTER_RETRY;
        }
    }
}
