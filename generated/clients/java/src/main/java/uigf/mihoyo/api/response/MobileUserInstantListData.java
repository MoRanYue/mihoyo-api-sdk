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
 * The MobileUserInstantListData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MobileUserInstantListData implements JsonSerializable<MobileUserInstantListData> {
    /*
     * The is_last property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isLast;

    /*
     * The list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> list;

    /*
     * The next_offset property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer nextOffset;

    /*
     * The top_post property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData topPost;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileUserInstantListData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileUserInstantListData() {
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
    public List<Map<String, BinaryData>> getList() {
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
     * Get the topPost property: The top_post property.
     * 
     * @return the topPost value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getTopPost() {
        return this.topPost;
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
        jsonWriter.writeArrayField("list", this.list,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeNumberField("next_offset", this.nextOffset);
        if (this.topPost != null) {
            jsonWriter.writeFieldName("top_post");
            this.topPost.writeTo(jsonWriter);
        }
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
     * Reads an instance of MobileUserInstantListData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileUserInstantListData if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobileUserInstantListData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileUserInstantListData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileUserInstantListData deserializedMobileUserInstantListData = new MobileUserInstantListData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("is_last".equals(fieldName)) {
                    deserializedMobileUserInstantListData.isLast = reader.getNullable(JsonReader::getBoolean);
                } else if ("list".equals(fieldName)) {
                    List<Map<String, BinaryData>> list = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedMobileUserInstantListData.list = list;
                } else if ("next_offset".equals(fieldName)) {
                    deserializedMobileUserInstantListData.nextOffset = reader.getNullable(JsonReader::getInt);
                } else if ("top_post".equals(fieldName)) {
                    deserializedMobileUserInstantListData.topPost
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobileUserInstantListData.additionalProperties = additionalProperties;

            return deserializedMobileUserInstantListData;
        });
    }
}
