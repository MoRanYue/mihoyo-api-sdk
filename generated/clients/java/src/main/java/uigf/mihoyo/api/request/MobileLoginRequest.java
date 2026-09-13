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
 * The MobileLoginRequest model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class MobileLoginRequest implements JsonSerializable<MobileLoginRequest> {
    /*
     * The source_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String sourceId;

    /*
     * The source_key property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String sourceKey;

    /*
     * The source_name property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String sourceName;

    /*
     * The source_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final int sourceType;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileLoginRequest class.
     * 
     * @param sourceId the sourceId value to set.
     * @param sourceKey the sourceKey value to set.
     * @param sourceName the sourceName value to set.
     * @param sourceType the sourceType value to set.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileLoginRequest(String sourceId, String sourceKey, String sourceName, int sourceType) {
        this.sourceId = sourceId;
        this.sourceKey = sourceKey;
        this.sourceName = sourceName;
        this.sourceType = sourceType;
    }

    /**
     * Get the sourceId property: The source_id property.
     * 
     * @return the sourceId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * Get the sourceKey property: The source_key property.
     * 
     * @return the sourceKey value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSourceKey() {
        return this.sourceKey;
    }

    /**
     * Get the sourceName property: The source_name property.
     * 
     * @return the sourceName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * Get the sourceType property: The source_type property.
     * 
     * @return the sourceType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public int getSourceType() {
        return this.sourceType;
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
     * @return the MobileLoginRequest object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileLoginRequest setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("source_id", this.sourceId);
        jsonWriter.writeStringField("source_key", this.sourceKey);
        jsonWriter.writeStringField("source_name", this.sourceName);
        jsonWriter.writeIntField("source_type", this.sourceType);
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
     * Reads an instance of MobileLoginRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileLoginRequest if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MobileLoginRequest.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileLoginRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String sourceId = null;
            String sourceKey = null;
            String sourceName = null;
            int sourceType = 0;
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("source_id".equals(fieldName)) {
                    sourceId = reader.getString();
                } else if ("source_key".equals(fieldName)) {
                    sourceKey = reader.getString();
                } else if ("source_name".equals(fieldName)) {
                    sourceName = reader.getString();
                } else if ("source_type".equals(fieldName)) {
                    sourceType = reader.getInt();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            MobileLoginRequest deserializedMobileLoginRequest
                = new MobileLoginRequest(sourceId, sourceKey, sourceName, sourceType);
            deserializedMobileLoginRequest.additionalProperties = additionalProperties;

            return deserializedMobileLoginRequest;
        });
    }
}
