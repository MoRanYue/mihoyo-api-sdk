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
 * The MobileStartupImageTemplateRequest model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class MobileStartupImageTemplateRequest implements JsonSerializable<MobileStartupImageTemplateRequest> {
    /*
     * The client_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer clientType;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileStartupImageTemplateRequest class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileStartupImageTemplateRequest() {
    }

    /**
     * Get the clientType property: The client_type property.
     * 
     * @return the clientType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getClientType() {
        return this.clientType;
    }

    /**
     * Set the clientType property: The client_type property.
     * 
     * @param clientType the clientType value to set.
     * @return the MobileStartupImageTemplateRequest object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileStartupImageTemplateRequest setClientType(Integer clientType) {
        this.clientType = clientType;
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
     * @return the MobileStartupImageTemplateRequest object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileStartupImageTemplateRequest setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeNumberField("client_type", this.clientType);
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
     * Reads an instance of MobileStartupImageTemplateRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileStartupImageTemplateRequest if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobileStartupImageTemplateRequest.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileStartupImageTemplateRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileStartupImageTemplateRequest deserializedMobileStartupImageTemplateRequest
                = new MobileStartupImageTemplateRequest();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("client_type".equals(fieldName)) {
                    deserializedMobileStartupImageTemplateRequest.clientType = reader.getNullable(JsonReader::getInt);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobileStartupImageTemplateRequest.additionalProperties = additionalProperties;

            return deserializedMobileStartupImageTemplateRequest;
        });
    }
}
