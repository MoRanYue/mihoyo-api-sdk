package uigf.mihoyo.game.response;

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
 * The SdkRedDotInfo model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class SdkRedDotInfo implements JsonSerializable<SdkRedDotInfo> {
    /*
     * The content_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer contentId;

    /*
     * The display property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean display;

    /*
     * The red_point_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer redPointType;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of SdkRedDotInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private SdkRedDotInfo() {
    }

    /**
     * Get the contentId property: The content_id property.
     * 
     * @return the contentId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getContentId() {
        return this.contentId;
    }

    /**
     * Get the display property: The display property.
     * 
     * @return the display value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isDisplay() {
        return this.display;
    }

    /**
     * Get the redPointType property: The red_point_type property.
     * 
     * @return the redPointType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getRedPointType() {
        return this.redPointType;
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
        jsonWriter.writeNumberField("content_id", this.contentId);
        jsonWriter.writeBooleanField("display", this.display);
        jsonWriter.writeNumberField("red_point_type", this.redPointType);
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
     * Reads an instance of SdkRedDotInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SdkRedDotInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SdkRedDotInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static SdkRedDotInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SdkRedDotInfo deserializedSdkRedDotInfo = new SdkRedDotInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("content_id".equals(fieldName)) {
                    deserializedSdkRedDotInfo.contentId = reader.getNullable(JsonReader::getInt);
                } else if ("display".equals(fieldName)) {
                    deserializedSdkRedDotInfo.display = reader.getNullable(JsonReader::getBoolean);
                } else if ("red_point_type".equals(fieldName)) {
                    deserializedSdkRedDotInfo.redPointType = reader.getNullable(JsonReader::getInt);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedSdkRedDotInfo.additionalProperties = additionalProperties;

            return deserializedSdkRedDotInfo;
        });
    }
}
