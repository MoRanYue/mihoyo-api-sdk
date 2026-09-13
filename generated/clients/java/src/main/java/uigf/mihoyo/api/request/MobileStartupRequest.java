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
import java.util.List;
import java.util.Map;

/**
 * The MobileStartupRequest model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class MobileStartupRequest implements JsonSerializable<MobileStartupRequest> {
    /*
     * The req_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final List<MobileStartupRequestItem> reqList;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileStartupRequest class.
     * 
     * @param reqList the reqList value to set.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileStartupRequest(List<MobileStartupRequestItem> reqList) {
        this.reqList = reqList;
    }

    /**
     * Get the reqList property: The req_list property.
     * 
     * @return the reqList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<MobileStartupRequestItem> getReqList() {
        return this.reqList;
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
     * @return the MobileStartupRequest object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileStartupRequest setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeArrayField("req_list", this.reqList, (writer, element) -> writer.writeJson(element));
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
     * Reads an instance of MobileStartupRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileStartupRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MobileStartupRequest.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileStartupRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<MobileStartupRequestItem> reqList = null;
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("req_list".equals(fieldName)) {
                    reqList = reader.readArray(reader1 -> MobileStartupRequestItem.fromJson(reader1));
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            MobileStartupRequest deserializedMobileStartupRequest = new MobileStartupRequest(reqList);
            deserializedMobileStartupRequest.additionalProperties = additionalProperties;

            return deserializedMobileStartupRequest;
        });
    }
}
