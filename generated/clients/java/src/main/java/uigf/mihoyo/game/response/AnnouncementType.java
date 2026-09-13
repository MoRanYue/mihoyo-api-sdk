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
 * The AnnouncementType model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class AnnouncementType implements JsonSerializable<AnnouncementType> {
    /*
     * The id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer id;

    /*
     * The mi18n_name property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String mi18nName;

    /*
     * The name property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String name;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of AnnouncementType class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private AnnouncementType() {
    }

    /**
     * Get the id property: The id property.
     * 
     * @return the id value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getId() {
        return this.id;
    }

    /**
     * Get the mi18nName property: The mi18n_name property.
     * 
     * @return the mi18nName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getMi18nName() {
        return this.mi18nName;
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getName() {
        return this.name;
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
        jsonWriter.writeNumberField("id", this.id);
        jsonWriter.writeStringField("mi18n_name", this.mi18nName);
        jsonWriter.writeStringField("name", this.name);
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
     * Reads an instance of AnnouncementType from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnnouncementType if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AnnouncementType.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static AnnouncementType fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AnnouncementType deserializedAnnouncementType = new AnnouncementType();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedAnnouncementType.id = reader.getNullable(JsonReader::getInt);
                } else if ("mi18n_name".equals(fieldName)) {
                    deserializedAnnouncementType.mi18nName = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedAnnouncementType.name = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedAnnouncementType.additionalProperties = additionalProperties;

            return deserializedAnnouncementType;
        });
    }
}
