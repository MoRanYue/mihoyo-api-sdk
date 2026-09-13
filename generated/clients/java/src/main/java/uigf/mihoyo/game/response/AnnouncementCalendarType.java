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
 * The AnnouncementCalendarType model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class AnnouncementCalendarType implements JsonSerializable<AnnouncementCalendarType> {
    /*
     * The enabled property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean enabled;

    /*
     * The mi18n_name property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String mi18nName;

    /*
     * The remind property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean remind;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of AnnouncementCalendarType class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private AnnouncementCalendarType() {
    }

    /**
     * Get the enabled property: The enabled property.
     * 
     * @return the enabled value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isEnabled() {
        return this.enabled;
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
     * Get the remind property: The remind property.
     * 
     * @return the remind value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isRemind() {
        return this.remind;
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
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeStringField("mi18n_name", this.mi18nName);
        jsonWriter.writeBooleanField("remind", this.remind);
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
     * Reads an instance of AnnouncementCalendarType from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnnouncementCalendarType if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AnnouncementCalendarType.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static AnnouncementCalendarType fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AnnouncementCalendarType deserializedAnnouncementCalendarType = new AnnouncementCalendarType();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedAnnouncementCalendarType.enabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("mi18n_name".equals(fieldName)) {
                    deserializedAnnouncementCalendarType.mi18nName = reader.getString();
                } else if ("remind".equals(fieldName)) {
                    deserializedAnnouncementCalendarType.remind = reader.getNullable(JsonReader::getBoolean);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedAnnouncementCalendarType.additionalProperties = additionalProperties;

            return deserializedAnnouncementCalendarType;
        });
    }
}
