package uigf.mihoyo.passport;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.models.binarydata.BinaryData;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The LoginToken model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class LoginToken implements JsonSerializable<LoginToken> {
    /*
     * The token property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String token;

    /*
     * The token_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer tokenType;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of LoginToken class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginToken() {
    }

    /**
     * Get the token property: The token property.
     * 
     * @return the token value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getToken() {
        return this.token;
    }

    /**
     * Set the token property: The token property.
     * 
     * @param token the token value to set.
     * @return the LoginToken object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginToken setToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Get the tokenType property: The token_type property.
     * 
     * @return the tokenType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getTokenType() {
        return this.tokenType;
    }

    /**
     * Set the tokenType property: The token_type property.
     * 
     * @param tokenType the tokenType value to set.
     * @return the LoginToken object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginToken setTokenType(Integer tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * Get the additionalProperties property: Additional properties.
     * 
     * @return the additionalProperties value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Additional properties.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the LoginToken object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginToken setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("token", this.token);
        jsonWriter.writeNumberField("token_type", this.tokenType);
        if (additionalProperties != null) {
            for (Map.Entry<String, BinaryData> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeFieldName(additionalProperty.getKey());
                if (additionalProperty.getValue() == null) {
                    jsonWriter.writeNull();
                } else {
                    additionalProperty.getValue().writeTo(jsonWriter);
                }
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LoginToken from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoginToken if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the LoginToken.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static LoginToken fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LoginToken deserializedLoginToken = new LoginToken();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("token".equals(fieldName)) {
                    deserializedLoginToken.token = reader.getString();
                } else if ("token_type".equals(fieldName)) {
                    deserializedLoginToken.tokenType = reader.getNullable(JsonReader::getInt);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedLoginToken.additionalProperties = additionalProperties;

            return deserializedLoginToken;
        });
    }
}
