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
 * The MobileStartupRequestItem model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class MobileStartupRequestItem implements JsonSerializable<MobileStartupRequestItem> {
    /*
     * The api_url property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String apiUrl;

    /*
     * The req property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final MobileStartupRequestPayload req;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileStartupRequestItem class.
     * 
     * @param apiUrl the apiUrl value to set.
     * @param req the req value to set.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileStartupRequestItem(String apiUrl, MobileStartupRequestPayload req) {
        this.apiUrl = apiUrl;
        this.req = req;
    }

    /**
     * Get the apiUrl property: The api_url property.
     * 
     * @return the apiUrl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getApiUrl() {
        return this.apiUrl;
    }

    /**
     * Get the req property: The req property.
     * 
     * @return the req value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileStartupRequestPayload getReq() {
        return this.req;
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
     * @return the MobileStartupRequestItem object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileStartupRequestItem setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("api_url", this.apiUrl);
        jsonWriter.writeJsonField("req", this.req);
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
     * Reads an instance of MobileStartupRequestItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileStartupRequestItem if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MobileStartupRequestItem.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileStartupRequestItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String apiUrl = null;
            MobileStartupRequestPayload req = null;
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("api_url".equals(fieldName)) {
                    apiUrl = reader.getString();
                } else if ("req".equals(fieldName)) {
                    req = MobileStartupRequestPayload.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            MobileStartupRequestItem deserializedMobileStartupRequestItem = new MobileStartupRequestItem(apiUrl, req);
            deserializedMobileStartupRequestItem.additionalProperties = additionalProperties;

            return deserializedMobileStartupRequestItem;
        });
    }
}
