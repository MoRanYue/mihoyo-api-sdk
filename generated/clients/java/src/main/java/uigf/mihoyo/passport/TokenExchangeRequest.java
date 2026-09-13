package uigf.mihoyo.passport;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;

/**
 * The TokenExchangeRequest model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class TokenExchangeRequest implements JsonSerializable<TokenExchangeRequest> {
    /*
     * The dst_token_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final int dstTokenType;

    /*
     * The mid property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String mid;

    /*
     * The src_token property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final LoginToken srcToken;

    /**
     * Creates an instance of TokenExchangeRequest class.
     * 
     * @param dstTokenType the dstTokenType value to set.
     * @param mid the mid value to set.
     * @param srcToken the srcToken value to set.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public TokenExchangeRequest(int dstTokenType, String mid, LoginToken srcToken) {
        this.dstTokenType = dstTokenType;
        this.mid = mid;
        this.srcToken = srcToken;
    }

    /**
     * Get the dstTokenType property: The dst_token_type property.
     * 
     * @return the dstTokenType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public int getDstTokenType() {
        return this.dstTokenType;
    }

    /**
     * Get the mid property: The mid property.
     * 
     * @return the mid value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getMid() {
        return this.mid;
    }

    /**
     * Get the srcToken property: The src_token property.
     * 
     * @return the srcToken value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginToken getSrcToken() {
        return this.srcToken;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("dst_token_type", this.dstTokenType);
        jsonWriter.writeStringField("mid", this.mid);
        jsonWriter.writeJsonField("src_token", this.srcToken);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TokenExchangeRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TokenExchangeRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TokenExchangeRequest.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static TokenExchangeRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int dstTokenType = 0;
            String mid = null;
            LoginToken srcToken = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dst_token_type".equals(fieldName)) {
                    dstTokenType = reader.getInt();
                } else if ("mid".equals(fieldName)) {
                    mid = reader.getString();
                } else if ("src_token".equals(fieldName)) {
                    srcToken = LoginToken.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new TokenExchangeRequest(dstTokenType, mid, srcToken);
        });
    }
}
