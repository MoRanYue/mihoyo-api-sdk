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
import java.util.List;
import java.util.Map;

/**
 * The AnnouncementContentData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class AnnouncementContentData implements JsonSerializable<AnnouncementContentData> {
    /*
     * The list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<AnnouncementContentItem> list;

    /*
     * The pic_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> picList;

    /*
     * The pic_total property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer picTotal;

    /*
     * The total property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer total;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of AnnouncementContentData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private AnnouncementContentData() {
    }

    /**
     * Get the list property: The list property.
     * 
     * @return the list value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<AnnouncementContentItem> getList() {
        return this.list;
    }

    /**
     * Get the picList property: The pic_list property.
     * 
     * @return the picList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getPicList() {
        return this.picList;
    }

    /**
     * Get the picTotal property: The pic_total property.
     * 
     * @return the picTotal value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getPicTotal() {
        return this.picTotal;
    }

    /**
     * Get the total property: The total property.
     * 
     * @return the total value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getTotal() {
        return this.total;
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
        jsonWriter.writeArrayField("list", this.list, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("pic_list", this.picList, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeNumberField("pic_total", this.picTotal);
        jsonWriter.writeNumberField("total", this.total);
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
     * Reads an instance of AnnouncementContentData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnnouncementContentData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AnnouncementContentData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static AnnouncementContentData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AnnouncementContentData deserializedAnnouncementContentData = new AnnouncementContentData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("list".equals(fieldName)) {
                    List<AnnouncementContentItem> list
                        = reader.readArray(reader1 -> AnnouncementContentItem.fromJson(reader1));
                    deserializedAnnouncementContentData.list = list;
                } else if ("pic_list".equals(fieldName)) {
                    List<BinaryData> picList = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedAnnouncementContentData.picList = picList;
                } else if ("pic_total".equals(fieldName)) {
                    deserializedAnnouncementContentData.picTotal = reader.getNullable(JsonReader::getInt);
                } else if ("total".equals(fieldName)) {
                    deserializedAnnouncementContentData.total = reader.getNullable(JsonReader::getInt);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedAnnouncementContentData.additionalProperties = additionalProperties;

            return deserializedAnnouncementContentData;
        });
    }
}
