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
 * The AnnouncementContentItem model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class AnnouncementContentItem implements JsonSerializable<AnnouncementContentItem> {
    /*
     * The ann_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer annId;

    /*
     * The banner property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String banner;

    /*
     * The content property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String content;

    /*
     * The lang property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String lang;

    /*
     * The remind_text property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String remindText;

    /*
     * The subtitle property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String subtitle;

    /*
     * The title property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String title;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of AnnouncementContentItem class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private AnnouncementContentItem() {
    }

    /**
     * Get the annId property: The ann_id property.
     * 
     * @return the annId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getAnnId() {
        return this.annId;
    }

    /**
     * Get the banner property: The banner property.
     * 
     * @return the banner value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getBanner() {
        return this.banner;
    }

    /**
     * Get the content property: The content property.
     * 
     * @return the content value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getContent() {
        return this.content;
    }

    /**
     * Get the lang property: The lang property.
     * 
     * @return the lang value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLang() {
        return this.lang;
    }

    /**
     * Get the remindText property: The remind_text property.
     * 
     * @return the remindText value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getRemindText() {
        return this.remindText;
    }

    /**
     * Get the subtitle property: The subtitle property.
     * 
     * @return the subtitle value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSubtitle() {
        return this.subtitle;
    }

    /**
     * Get the title property: The title property.
     * 
     * @return the title value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getTitle() {
        return this.title;
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
        jsonWriter.writeNumberField("ann_id", this.annId);
        jsonWriter.writeStringField("banner", this.banner);
        jsonWriter.writeStringField("content", this.content);
        jsonWriter.writeStringField("lang", this.lang);
        jsonWriter.writeStringField("remind_text", this.remindText);
        jsonWriter.writeStringField("subtitle", this.subtitle);
        jsonWriter.writeStringField("title", this.title);
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
     * Reads an instance of AnnouncementContentItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnnouncementContentItem if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AnnouncementContentItem.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static AnnouncementContentItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AnnouncementContentItem deserializedAnnouncementContentItem = new AnnouncementContentItem();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ann_id".equals(fieldName)) {
                    deserializedAnnouncementContentItem.annId = reader.getNullable(JsonReader::getInt);
                } else if ("banner".equals(fieldName)) {
                    deserializedAnnouncementContentItem.banner = reader.getString();
                } else if ("content".equals(fieldName)) {
                    deserializedAnnouncementContentItem.content = reader.getString();
                } else if ("lang".equals(fieldName)) {
                    deserializedAnnouncementContentItem.lang = reader.getString();
                } else if ("remind_text".equals(fieldName)) {
                    deserializedAnnouncementContentItem.remindText = reader.getString();
                } else if ("subtitle".equals(fieldName)) {
                    deserializedAnnouncementContentItem.subtitle = reader.getString();
                } else if ("title".equals(fieldName)) {
                    deserializedAnnouncementContentItem.title = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedAnnouncementContentItem.additionalProperties = additionalProperties;

            return deserializedAnnouncementContentItem;
        });
    }
}
