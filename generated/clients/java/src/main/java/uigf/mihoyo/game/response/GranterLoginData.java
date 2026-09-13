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
 * The GranterLoginData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class GranterLoginData implements JsonSerializable<GranterLoginData> {
    /*
     * The account_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer accountType;

    /*
     * The combo_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String comboId;

    /*
     * The combo_token property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String comboToken;

    /*
     * The data property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String data;

    /*
     * The fatigue_remind property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GranterFatigueRemind fatigueRemind;

    /*
     * The heartbeat property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean heartbeat;

    /*
     * The open_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String openId;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GranterLoginData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GranterLoginData() {
    }

    /**
     * Get the accountType property: The account_type property.
     * 
     * @return the accountType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getAccountType() {
        return this.accountType;
    }

    /**
     * Get the comboId property: The combo_id property.
     * 
     * @return the comboId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getComboId() {
        return this.comboId;
    }

    /**
     * Get the comboToken property: The combo_token property.
     * 
     * @return the comboToken value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getComboToken() {
        return this.comboToken;
    }

    /**
     * Get the data property: The data property.
     * 
     * @return the data value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getData() {
        return this.data;
    }

    /**
     * Get the fatigueRemind property: The fatigue_remind property.
     * 
     * @return the fatigueRemind value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GranterFatigueRemind getFatigueRemind() {
        return this.fatigueRemind;
    }

    /**
     * Get the heartbeat property: The heartbeat property.
     * 
     * @return the heartbeat value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isHeartbeat() {
        return this.heartbeat;
    }

    /**
     * Get the openId property: The open_id property.
     * 
     * @return the openId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getOpenId() {
        return this.openId;
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
        jsonWriter.writeNumberField("account_type", this.accountType);
        jsonWriter.writeStringField("combo_id", this.comboId);
        jsonWriter.writeStringField("combo_token", this.comboToken);
        jsonWriter.writeStringField("data", this.data);
        jsonWriter.writeJsonField("fatigue_remind", this.fatigueRemind);
        jsonWriter.writeBooleanField("heartbeat", this.heartbeat);
        jsonWriter.writeStringField("open_id", this.openId);
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
     * Reads an instance of GranterLoginData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GranterLoginData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the GranterLoginData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GranterLoginData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GranterLoginData deserializedGranterLoginData = new GranterLoginData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("account_type".equals(fieldName)) {
                    deserializedGranterLoginData.accountType = reader.getNullable(JsonReader::getInt);
                } else if ("combo_id".equals(fieldName)) {
                    deserializedGranterLoginData.comboId = reader.getString();
                } else if ("combo_token".equals(fieldName)) {
                    deserializedGranterLoginData.comboToken = reader.getString();
                } else if ("data".equals(fieldName)) {
                    deserializedGranterLoginData.data = reader.getString();
                } else if ("fatigue_remind".equals(fieldName)) {
                    deserializedGranterLoginData.fatigueRemind = GranterFatigueRemind.fromJson(reader);
                } else if ("heartbeat".equals(fieldName)) {
                    deserializedGranterLoginData.heartbeat = reader.getNullable(JsonReader::getBoolean);
                } else if ("open_id".equals(fieldName)) {
                    deserializedGranterLoginData.openId = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGranterLoginData.additionalProperties = additionalProperties;

            return deserializedGranterLoginData;
        });
    }
}
