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
import java.util.Map;

/**
 * The MobileTeenagerInfoData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MobileTeenagerInfoData implements JsonSerializable<MobileTeenagerInfoData> {
    /*
     * The available_duration property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer availableDuration;

    /*
     * The disable_end_time property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long disableEndTime;

    /*
     * The disable_start_time property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long disableStartTime;

    /*
     * The is_enabled property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isEnabled;

    /*
     * The is_force property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isForce;

    /*
     * The is_real_name property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isRealName;

    /*
     * The is_teenager property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isTeenager;

    /*
     * The loop_period property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer loopPeriod;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileTeenagerInfoData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileTeenagerInfoData() {
    }

    /**
     * Get the availableDuration property: The available_duration property.
     * 
     * @return the availableDuration value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getAvailableDuration() {
        return this.availableDuration;
    }

    /**
     * Get the disableEndTime property: The disable_end_time property.
     * 
     * @return the disableEndTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getDisableEndTime() {
        return this.disableEndTime;
    }

    /**
     * Get the disableStartTime property: The disable_start_time property.
     * 
     * @return the disableStartTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getDisableStartTime() {
        return this.disableStartTime;
    }

    /**
     * Get the isEnabled property: The is_enabled property.
     * 
     * @return the isEnabled value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Get the isForce property: The is_force property.
     * 
     * @return the isForce value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isForce() {
        return this.isForce;
    }

    /**
     * Get the isRealName property: The is_real_name property.
     * 
     * @return the isRealName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isRealName() {
        return this.isRealName;
    }

    /**
     * Get the isTeenager property: The is_teenager property.
     * 
     * @return the isTeenager value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isTeenager() {
        return this.isTeenager;
    }

    /**
     * Get the loopPeriod property: The loop_period property.
     * 
     * @return the loopPeriod value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getLoopPeriod() {
        return this.loopPeriod;
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
        jsonWriter.writeNumberField("available_duration", this.availableDuration);
        jsonWriter.writeNumberField("disable_end_time", this.disableEndTime);
        jsonWriter.writeNumberField("disable_start_time", this.disableStartTime);
        jsonWriter.writeBooleanField("is_enabled", this.isEnabled);
        jsonWriter.writeBooleanField("is_force", this.isForce);
        jsonWriter.writeBooleanField("is_real_name", this.isRealName);
        jsonWriter.writeBooleanField("is_teenager", this.isTeenager);
        jsonWriter.writeNumberField("loop_period", this.loopPeriod);
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
     * Reads an instance of MobileTeenagerInfoData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileTeenagerInfoData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobileTeenagerInfoData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileTeenagerInfoData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileTeenagerInfoData deserializedMobileTeenagerInfoData = new MobileTeenagerInfoData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("available_duration".equals(fieldName)) {
                    deserializedMobileTeenagerInfoData.availableDuration = reader.getNullable(JsonReader::getInt);
                } else if ("disable_end_time".equals(fieldName)) {
                    deserializedMobileTeenagerInfoData.disableEndTime = reader.getNullable(JsonReader::getLong);
                } else if ("disable_start_time".equals(fieldName)) {
                    deserializedMobileTeenagerInfoData.disableStartTime = reader.getNullable(JsonReader::getLong);
                } else if ("is_enabled".equals(fieldName)) {
                    deserializedMobileTeenagerInfoData.isEnabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("is_force".equals(fieldName)) {
                    deserializedMobileTeenagerInfoData.isForce = reader.getNullable(JsonReader::getBoolean);
                } else if ("is_real_name".equals(fieldName)) {
                    deserializedMobileTeenagerInfoData.isRealName = reader.getNullable(JsonReader::getBoolean);
                } else if ("is_teenager".equals(fieldName)) {
                    deserializedMobileTeenagerInfoData.isTeenager = reader.getNullable(JsonReader::getBoolean);
                } else if ("loop_period".equals(fieldName)) {
                    deserializedMobileTeenagerInfoData.loopPeriod = reader.getNullable(JsonReader::getInt);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobileTeenagerInfoData.additionalProperties = additionalProperties;

            return deserializedMobileTeenagerInfoData;
        });
    }
}
