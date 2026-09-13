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
 * The AnnouncementItem model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class AnnouncementItem implements JsonSerializable<AnnouncementItem> {
    /*
     * The alert property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer alert;

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
     * The country property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String country;

    /*
     * The end_time property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String endTime;

    /*
     * The extra_remind property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer extraRemind;

    /*
     * The has_content property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean hasContent;

    /*
     * The lang property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String lang;

    /*
     * The login_alert property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer loginAlert;

    /*
     * The logout_remind property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer logoutRemind;

    /*
     * The logout_remind_ver property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer logoutRemindVer;

    /*
     * The need_remind_text property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer needRemindText;

    /*
     * The remind property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer remind;

    /*
     * The remind_consumption_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer remindConsumptionType;

    /*
     * The remind_text property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String remindText;

    /*
     * The remind_ver property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer remindVer;

    /*
     * The start_time property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String startTime;

    /*
     * The subtitle property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String subtitle;

    /*
     * The tag_end_time property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String tagEndTime;

    /*
     * The tag_icon property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String tagIcon;

    /*
     * The tag_icon_hover property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String tagIconHover;

    /*
     * The tag_label property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String tagLabel;

    /*
     * The tag_start_time property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String tagStartTime;

    /*
     * The title property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String title;

    /*
     * The type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer type;

    /*
     * The type_label property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String typeLabel;

    /*
     * The weak_remind property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer weakRemind;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of AnnouncementItem class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private AnnouncementItem() {
    }

    /**
     * Get the alert property: The alert property.
     * 
     * @return the alert value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getAlert() {
        return this.alert;
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
     * Get the country property: The country property.
     * 
     * @return the country value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getCountry() {
        return this.country;
    }

    /**
     * Get the endTime property: The end_time property.
     * 
     * @return the endTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * Get the extraRemind property: The extra_remind property.
     * 
     * @return the extraRemind value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getExtraRemind() {
        return this.extraRemind;
    }

    /**
     * Get the hasContent property: The has_content property.
     * 
     * @return the hasContent value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isHasContent() {
        return this.hasContent;
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
     * Get the loginAlert property: The login_alert property.
     * 
     * @return the loginAlert value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getLoginAlert() {
        return this.loginAlert;
    }

    /**
     * Get the logoutRemind property: The logout_remind property.
     * 
     * @return the logoutRemind value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getLogoutRemind() {
        return this.logoutRemind;
    }

    /**
     * Get the logoutRemindVer property: The logout_remind_ver property.
     * 
     * @return the logoutRemindVer value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getLogoutRemindVer() {
        return this.logoutRemindVer;
    }

    /**
     * Get the needRemindText property: The need_remind_text property.
     * 
     * @return the needRemindText value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getNeedRemindText() {
        return this.needRemindText;
    }

    /**
     * Get the remind property: The remind property.
     * 
     * @return the remind value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getRemind() {
        return this.remind;
    }

    /**
     * Get the remindConsumptionType property: The remind_consumption_type property.
     * 
     * @return the remindConsumptionType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getRemindConsumptionType() {
        return this.remindConsumptionType;
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
     * Get the remindVer property: The remind_ver property.
     * 
     * @return the remindVer value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getRemindVer() {
        return this.remindVer;
    }

    /**
     * Get the startTime property: The start_time property.
     * 
     * @return the startTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getStartTime() {
        return this.startTime;
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
     * Get the tagEndTime property: The tag_end_time property.
     * 
     * @return the tagEndTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getTagEndTime() {
        return this.tagEndTime;
    }

    /**
     * Get the tagIcon property: The tag_icon property.
     * 
     * @return the tagIcon value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getTagIcon() {
        return this.tagIcon;
    }

    /**
     * Get the tagIconHover property: The tag_icon_hover property.
     * 
     * @return the tagIconHover value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getTagIconHover() {
        return this.tagIconHover;
    }

    /**
     * Get the tagLabel property: The tag_label property.
     * 
     * @return the tagLabel value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getTagLabel() {
        return this.tagLabel;
    }

    /**
     * Get the tagStartTime property: The tag_start_time property.
     * 
     * @return the tagStartTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getTagStartTime() {
        return this.tagStartTime;
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
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getType() {
        return this.type;
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
     * Get the weakRemind property: The weak_remind property.
     * 
     * @return the weakRemind value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getWeakRemind() {
        return this.weakRemind;
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
        jsonWriter.writeNumberField("alert", this.alert);
        jsonWriter.writeNumberField("ann_id", this.annId);
        jsonWriter.writeStringField("banner", this.banner);
        jsonWriter.writeStringField("content", this.content);
        jsonWriter.writeStringField("country", this.country);
        jsonWriter.writeStringField("end_time", this.endTime);
        jsonWriter.writeNumberField("extra_remind", this.extraRemind);
        jsonWriter.writeBooleanField("has_content", this.hasContent);
        jsonWriter.writeStringField("lang", this.lang);
        jsonWriter.writeNumberField("login_alert", this.loginAlert);
        jsonWriter.writeNumberField("logout_remind", this.logoutRemind);
        jsonWriter.writeNumberField("logout_remind_ver", this.logoutRemindVer);
        jsonWriter.writeNumberField("need_remind_text", this.needRemindText);
        jsonWriter.writeNumberField("remind", this.remind);
        jsonWriter.writeNumberField("remind_consumption_type", this.remindConsumptionType);
        jsonWriter.writeStringField("remind_text", this.remindText);
        jsonWriter.writeNumberField("remind_ver", this.remindVer);
        jsonWriter.writeStringField("start_time", this.startTime);
        jsonWriter.writeStringField("subtitle", this.subtitle);
        jsonWriter.writeStringField("tag_end_time", this.tagEndTime);
        jsonWriter.writeStringField("tag_icon", this.tagIcon);
        jsonWriter.writeStringField("tag_icon_hover", this.tagIconHover);
        jsonWriter.writeStringField("tag_label", this.tagLabel);
        jsonWriter.writeStringField("tag_start_time", this.tagStartTime);
        jsonWriter.writeStringField("title", this.title);
        jsonWriter.writeNumberField("type", this.type);
        jsonWriter.writeStringField("type_label", this.typeLabel);
        jsonWriter.writeNumberField("weak_remind", this.weakRemind);
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
     * Reads an instance of AnnouncementItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnnouncementItem if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AnnouncementItem.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static AnnouncementItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AnnouncementItem deserializedAnnouncementItem = new AnnouncementItem();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("alert".equals(fieldName)) {
                    deserializedAnnouncementItem.alert = reader.getNullable(JsonReader::getInt);
                } else if ("ann_id".equals(fieldName)) {
                    deserializedAnnouncementItem.annId = reader.getNullable(JsonReader::getInt);
                } else if ("banner".equals(fieldName)) {
                    deserializedAnnouncementItem.banner = reader.getString();
                } else if ("content".equals(fieldName)) {
                    deserializedAnnouncementItem.content = reader.getString();
                } else if ("country".equals(fieldName)) {
                    deserializedAnnouncementItem.country = reader.getString();
                } else if ("end_time".equals(fieldName)) {
                    deserializedAnnouncementItem.endTime = reader.getString();
                } else if ("extra_remind".equals(fieldName)) {
                    deserializedAnnouncementItem.extraRemind = reader.getNullable(JsonReader::getInt);
                } else if ("has_content".equals(fieldName)) {
                    deserializedAnnouncementItem.hasContent = reader.getNullable(JsonReader::getBoolean);
                } else if ("lang".equals(fieldName)) {
                    deserializedAnnouncementItem.lang = reader.getString();
                } else if ("login_alert".equals(fieldName)) {
                    deserializedAnnouncementItem.loginAlert = reader.getNullable(JsonReader::getInt);
                } else if ("logout_remind".equals(fieldName)) {
                    deserializedAnnouncementItem.logoutRemind = reader.getNullable(JsonReader::getInt);
                } else if ("logout_remind_ver".equals(fieldName)) {
                    deserializedAnnouncementItem.logoutRemindVer = reader.getNullable(JsonReader::getInt);
                } else if ("need_remind_text".equals(fieldName)) {
                    deserializedAnnouncementItem.needRemindText = reader.getNullable(JsonReader::getInt);
                } else if ("remind".equals(fieldName)) {
                    deserializedAnnouncementItem.remind = reader.getNullable(JsonReader::getInt);
                } else if ("remind_consumption_type".equals(fieldName)) {
                    deserializedAnnouncementItem.remindConsumptionType = reader.getNullable(JsonReader::getInt);
                } else if ("remind_text".equals(fieldName)) {
                    deserializedAnnouncementItem.remindText = reader.getString();
                } else if ("remind_ver".equals(fieldName)) {
                    deserializedAnnouncementItem.remindVer = reader.getNullable(JsonReader::getInt);
                } else if ("start_time".equals(fieldName)) {
                    deserializedAnnouncementItem.startTime = reader.getString();
                } else if ("subtitle".equals(fieldName)) {
                    deserializedAnnouncementItem.subtitle = reader.getString();
                } else if ("tag_end_time".equals(fieldName)) {
                    deserializedAnnouncementItem.tagEndTime = reader.getString();
                } else if ("tag_icon".equals(fieldName)) {
                    deserializedAnnouncementItem.tagIcon = reader.getString();
                } else if ("tag_icon_hover".equals(fieldName)) {
                    deserializedAnnouncementItem.tagIconHover = reader.getString();
                } else if ("tag_label".equals(fieldName)) {
                    deserializedAnnouncementItem.tagLabel = reader.getString();
                } else if ("tag_start_time".equals(fieldName)) {
                    deserializedAnnouncementItem.tagStartTime = reader.getString();
                } else if ("title".equals(fieldName)) {
                    deserializedAnnouncementItem.title = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedAnnouncementItem.type = reader.getNullable(JsonReader::getInt);
                } else if ("type_label".equals(fieldName)) {
                    deserializedAnnouncementItem.typeLabel = reader.getString();
                } else if ("weak_remind".equals(fieldName)) {
                    deserializedAnnouncementItem.weakRemind = reader.getNullable(JsonReader::getInt);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedAnnouncementItem.additionalProperties = additionalProperties;

            return deserializedAnnouncementItem;
        });
    }
}
