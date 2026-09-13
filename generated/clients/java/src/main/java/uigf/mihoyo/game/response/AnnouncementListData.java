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
 * The AnnouncementListData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class AnnouncementListData implements JsonSerializable<AnnouncementListData> {
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
     * The banner property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String banner;

    /*
     * The calendar_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private AnnouncementCalendarType calendarType;

    /*
     * The list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<AnnouncementGroup> list;

    /*
     * The pic_alert property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean picAlert;

    /*
     * The pic_alert_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer picAlertId;

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
     * The pic_type_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> picTypeList;

    /*
     * The static_sign property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String staticSign;

    /*
     * The t property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String t;

    /*
     * The timezone property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer timezone;

    /*
     * The total property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer total;

    /*
     * The type_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<AnnouncementType> typeList;

    /*
     * The use_webp property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String useWebp;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of AnnouncementListData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private AnnouncementListData() {
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
     * Get the banner property: The banner property.
     * 
     * @return the banner value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getBanner() {
        return this.banner;
    }

    /**
     * Get the calendarType property: The calendar_type property.
     * 
     * @return the calendarType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public AnnouncementCalendarType getCalendarType() {
        return this.calendarType;
    }

    /**
     * Get the list property: The list property.
     * 
     * @return the list value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<AnnouncementGroup> getList() {
        return this.list;
    }

    /**
     * Get the picAlert property: The pic_alert property.
     * 
     * @return the picAlert value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isPicAlert() {
        return this.picAlert;
    }

    /**
     * Get the picAlertId property: The pic_alert_id property.
     * 
     * @return the picAlertId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getPicAlertId() {
        return this.picAlertId;
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
     * Get the picTypeList property: The pic_type_list property.
     * 
     * @return the picTypeList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getPicTypeList() {
        return this.picTypeList;
    }

    /**
     * Get the staticSign property: The static_sign property.
     * 
     * @return the staticSign value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getStaticSign() {
        return this.staticSign;
    }

    /**
     * Get the t property: The t property.
     * 
     * @return the t value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getT() {
        return this.t;
    }

    /**
     * Get the timezone property: The timezone property.
     * 
     * @return the timezone value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getTimezone() {
        return this.timezone;
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
     * Get the typeList property: The type_list property.
     * 
     * @return the typeList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<AnnouncementType> getTypeList() {
        return this.typeList;
    }

    /**
     * Get the useWebp property: The use_webp property.
     * 
     * @return the useWebp value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getUseWebp() {
        return this.useWebp;
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
        jsonWriter.writeBooleanField("alert", this.alert);
        jsonWriter.writeNumberField("alert_id", this.alertId);
        jsonWriter.writeStringField("banner", this.banner);
        jsonWriter.writeJsonField("calendar_type", this.calendarType);
        jsonWriter.writeArrayField("list", this.list, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("pic_alert", this.picAlert);
        jsonWriter.writeNumberField("pic_alert_id", this.picAlertId);
        jsonWriter.writeArrayField("pic_list", this.picList, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeNumberField("pic_total", this.picTotal);
        jsonWriter.writeArrayField("pic_type_list", this.picTypeList, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeStringField("static_sign", this.staticSign);
        jsonWriter.writeStringField("t", this.t);
        jsonWriter.writeNumberField("timezone", this.timezone);
        jsonWriter.writeNumberField("total", this.total);
        jsonWriter.writeArrayField("type_list", this.typeList, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("use_webp", this.useWebp);
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
     * Reads an instance of AnnouncementListData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnnouncementListData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AnnouncementListData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static AnnouncementListData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AnnouncementListData deserializedAnnouncementListData = new AnnouncementListData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("alert".equals(fieldName)) {
                    deserializedAnnouncementListData.alert = reader.getNullable(JsonReader::getBoolean);
                } else if ("alert_id".equals(fieldName)) {
                    deserializedAnnouncementListData.alertId = reader.getNullable(JsonReader::getInt);
                } else if ("banner".equals(fieldName)) {
                    deserializedAnnouncementListData.banner = reader.getString();
                } else if ("calendar_type".equals(fieldName)) {
                    deserializedAnnouncementListData.calendarType = AnnouncementCalendarType.fromJson(reader);
                } else if ("list".equals(fieldName)) {
                    List<AnnouncementGroup> list = reader.readArray(reader1 -> AnnouncementGroup.fromJson(reader1));
                    deserializedAnnouncementListData.list = list;
                } else if ("pic_alert".equals(fieldName)) {
                    deserializedAnnouncementListData.picAlert = reader.getNullable(JsonReader::getBoolean);
                } else if ("pic_alert_id".equals(fieldName)) {
                    deserializedAnnouncementListData.picAlertId = reader.getNullable(JsonReader::getInt);
                } else if ("pic_list".equals(fieldName)) {
                    List<BinaryData> picList = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedAnnouncementListData.picList = picList;
                } else if ("pic_total".equals(fieldName)) {
                    deserializedAnnouncementListData.picTotal = reader.getNullable(JsonReader::getInt);
                } else if ("pic_type_list".equals(fieldName)) {
                    List<BinaryData> picTypeList = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedAnnouncementListData.picTypeList = picTypeList;
                } else if ("static_sign".equals(fieldName)) {
                    deserializedAnnouncementListData.staticSign = reader.getString();
                } else if ("t".equals(fieldName)) {
                    deserializedAnnouncementListData.t = reader.getString();
                } else if ("timezone".equals(fieldName)) {
                    deserializedAnnouncementListData.timezone = reader.getNullable(JsonReader::getInt);
                } else if ("total".equals(fieldName)) {
                    deserializedAnnouncementListData.total = reader.getNullable(JsonReader::getInt);
                } else if ("type_list".equals(fieldName)) {
                    List<AnnouncementType> typeList = reader.readArray(reader1 -> AnnouncementType.fromJson(reader1));
                    deserializedAnnouncementListData.typeList = typeList;
                } else if ("use_webp".equals(fieldName)) {
                    deserializedAnnouncementListData.useWebp = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedAnnouncementListData.additionalProperties = additionalProperties;

            return deserializedAnnouncementListData;
        });
    }
}
