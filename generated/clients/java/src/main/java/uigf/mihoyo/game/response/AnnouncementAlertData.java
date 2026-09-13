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
 * Genshin announcement alert state shared by regular and UGC announcements.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class AnnouncementAlertData implements JsonSerializable<AnnouncementAlertData> {
    /*
     * The alert property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean alert;

    /*
     * The alert_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer alertId;

    /*
     * The extra_remind property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean extraRemind;

    /*
     * The remind property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean remind;

    /*
     * The remind_text property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String remindText;

    /*
     * Genshin announcement alert state shared by regular and UGC announcements.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of AnnouncementAlertData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private AnnouncementAlertData() {
    }

    /**
     * Get the alert property: The alert property.
     * 
     * @return the alert value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isAlert() {
        return this.alert;
    }

    /**
     * Get the alertId property: The alert_id property.
     * 
     * @return the alertId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getAlertId() {
        return this.alertId;
    }

    /**
     * Get the extraRemind property: The extra_remind property.
     * 
     * @return the extraRemind value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isExtraRemind() {
        return this.extraRemind;
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
     * Get the remindText property: The remind_text property.
     * 
     * @return the remindText value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getRemindText() {
        return this.remindText;
    }

    /**
     * Get the additionalProperties property: Genshin announcement alert state shared by regular and UGC announcements.
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
        jsonWriter.writeBooleanField("alert", this.alert);
        jsonWriter.writeNumberField("alert_id", this.alertId);
        jsonWriter.writeBooleanField("extra_remind", this.extraRemind);
        jsonWriter.writeBooleanField("remind", this.remind);
        jsonWriter.writeStringField("remind_text", this.remindText);
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
     * Reads an instance of AnnouncementAlertData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnnouncementAlertData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AnnouncementAlertData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static AnnouncementAlertData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AnnouncementAlertData deserializedAnnouncementAlertData = new AnnouncementAlertData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("alert".equals(fieldName)) {
                    deserializedAnnouncementAlertData.alert = reader.getNullable(JsonReader::getBoolean);
                } else if ("alert_id".equals(fieldName)) {
                    deserializedAnnouncementAlertData.alertId = reader.getNullable(JsonReader::getInt);
                } else if ("extra_remind".equals(fieldName)) {
                    deserializedAnnouncementAlertData.extraRemind = reader.getNullable(JsonReader::getBoolean);
                } else if ("remind".equals(fieldName)) {
                    deserializedAnnouncementAlertData.remind = reader.getNullable(JsonReader::getBoolean);
                } else if ("remind_text".equals(fieldName)) {
                    deserializedAnnouncementAlertData.remindText = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedAnnouncementAlertData.additionalProperties = additionalProperties;

            return deserializedAnnouncementAlertData;
        });
    }
}
