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
 * The AnnouncementGroup model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class AnnouncementGroup implements JsonSerializable<AnnouncementGroup> {
    /*
     * The list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<AnnouncementItem> list;

    /*
     * The type_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer typeId;

    /*
     * The type_label property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String typeLabel;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of AnnouncementGroup class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private AnnouncementGroup() {
    }

    /**
     * Get the list property: The list property.
     * 
     * @return the list value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<AnnouncementItem> getList() {
        return this.list;
    }

    /**
     * Get the typeId property: The type_id property.
     * 
     * @return the typeId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getTypeId() {
        return this.typeId;
    }

    /**
     * Get the typeLabel property: The type_label property.
     * 
     * @return the typeLabel value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getTypeLabel() {
        return this.typeLabel;
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
        jsonWriter.writeNumberField("type_id", this.typeId);
        jsonWriter.writeStringField("type_label", this.typeLabel);
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
     * Reads an instance of AnnouncementGroup from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnnouncementGroup if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AnnouncementGroup.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static AnnouncementGroup fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AnnouncementGroup deserializedAnnouncementGroup = new AnnouncementGroup();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("list".equals(fieldName)) {
                    List<AnnouncementItem> list = reader.readArray(reader1 -> AnnouncementItem.fromJson(reader1));
                    deserializedAnnouncementGroup.list = list;
                } else if ("type_id".equals(fieldName)) {
                    deserializedAnnouncementGroup.typeId = reader.getNullable(JsonReader::getInt);
                } else if ("type_label".equals(fieldName)) {
                    deserializedAnnouncementGroup.typeLabel = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedAnnouncementGroup.additionalProperties = additionalProperties;

            return deserializedAnnouncementGroup;
        });
    }
}
