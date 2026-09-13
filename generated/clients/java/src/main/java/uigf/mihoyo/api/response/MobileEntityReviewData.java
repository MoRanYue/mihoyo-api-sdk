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
import java.util.List;
import java.util.Map;

/**
 * The MobileEntityReviewData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MobileEntityReviewData implements JsonSerializable<MobileEntityReviewData> {
    /*
     * The is_last property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isLast;

    /*
     * The list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> list;

    /*
     * The next_offset property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer nextOffset;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileEntityReviewData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileEntityReviewData() {
    }

    /**
     * Get the isLast property: The is_last property.
     * 
     * @return the isLast value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isLast() {
        return this.isLast;
    }

    /**
     * Get the list property: The list property.
     * 
     * @return the list value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getList() {
        return this.list;
    }

    /**
     * Get the nextOffset property: The next_offset property.
     * 
     * @return the nextOffset value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getNextOffset() {
        return this.nextOffset;
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
        jsonWriter.writeBooleanField("is_last", this.isLast);
        jsonWriter.writeArrayField("list", this.list, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeNumberField("next_offset", this.nextOffset);
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
     * Reads an instance of MobileEntityReviewData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileEntityReviewData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobileEntityReviewData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileEntityReviewData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileEntityReviewData deserializedMobileEntityReviewData = new MobileEntityReviewData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("is_last".equals(fieldName)) {
                    deserializedMobileEntityReviewData.isLast = reader.getNullable(JsonReader::getBoolean);
                } else if ("list".equals(fieldName)) {
                    List<BinaryData> list = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileEntityReviewData.list = list;
                } else if ("next_offset".equals(fieldName)) {
                    deserializedMobileEntityReviewData.nextOffset = reader.getNullable(JsonReader::getInt);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobileEntityReviewData.additionalProperties = additionalProperties;

            return deserializedMobileEntityReviewData;
        });
    }
}
