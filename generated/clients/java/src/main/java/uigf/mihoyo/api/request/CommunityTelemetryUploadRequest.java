package uigf.mihoyo.api.request;

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
 * The CommunityTelemetryUploadRequest model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class CommunityTelemetryUploadRequest implements JsonSerializable<CommunityTelemetryUploadRequest> {
    /*
     * The content property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String content;

    /*
     * The sign property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String sign;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of CommunityTelemetryUploadRequest class.
     * 
     * @param content the content value to set.
     * @param sign the sign value to set.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public CommunityTelemetryUploadRequest(String content, String sign) {
        this.content = content;
        this.sign = sign;
    }

    /**
     * Get the content property: The content property.
     * 
     * @return the content value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getContent() {
        return this.content;
    }

    /**
     * Get the sign property: The sign property.
     * 
     * @return the sign value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSign() {
        return this.sign;
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
     * @return the CommunityTelemetryUploadRequest object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public CommunityTelemetryUploadRequest setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("content", this.content);
        jsonWriter.writeStringField("sign", this.sign);
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
     * Reads an instance of CommunityTelemetryUploadRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CommunityTelemetryUploadRequest if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CommunityTelemetryUploadRequest.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static CommunityTelemetryUploadRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String content = null;
            String sign = null;
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("content".equals(fieldName)) {
                    content = reader.getString();
                } else if ("sign".equals(fieldName)) {
                    sign = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            CommunityTelemetryUploadRequest deserializedCommunityTelemetryUploadRequest
                = new CommunityTelemetryUploadRequest(content, sign);
            deserializedCommunityTelemetryUploadRequest.additionalProperties = additionalProperties;

            return deserializedCommunityTelemetryUploadRequest;
        });
    }
}
