package uigf.mihoyo.api.response;

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
 * The AuthKeyData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class AuthKeyData implements JsonSerializable<AuthKeyData> {
    /*
     * The authkey property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String authkey;

    /*
     * The authkey_ver property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer authkeyVer;

    /*
     * The sign_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer signType;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of AuthKeyData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private AuthKeyData() {
    }

    /**
     * Get the authkey property: The authkey property.
     * 
     * @return the authkey value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAuthkey() {
        return this.authkey;
    }

    /**
     * Get the authkeyVer property: The authkey_ver property.
     * 
     * @return the authkeyVer value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getAuthkeyVer() {
        return this.authkeyVer;
    }

    /**
     * Get the signType property: The sign_type property.
     * 
     * @return the signType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getSignType() {
        return this.signType;
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
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("authkey", this.authkey);
        jsonWriter.writeNumberField("authkey_ver", this.authkeyVer);
        jsonWriter.writeNumberField("sign_type", this.signType);
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
     * Reads an instance of AuthKeyData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AuthKeyData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AuthKeyData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static AuthKeyData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AuthKeyData deserializedAuthKeyData = new AuthKeyData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("authkey".equals(fieldName)) {
                    deserializedAuthKeyData.authkey = reader.getString();
                } else if ("authkey_ver".equals(fieldName)) {
                    deserializedAuthKeyData.authkeyVer = reader.getNullable(JsonReader::getInt);
                } else if ("sign_type".equals(fieldName)) {
                    deserializedAuthKeyData.signType = reader.getNullable(JsonReader::getInt);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedAuthKeyData.additionalProperties = additionalProperties;

            return deserializedAuthKeyData;
        });
    }
}
