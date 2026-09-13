package uigf.mihoyo.api.request;

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
 * The GameSdkLogInfo model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class GameSdkLogInfo implements JsonSerializable<GameSdkLogInfo> {
    /*
     * The action_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer actionId;

    /*
     * The action_name property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String actionName;

    /*
     * The c_body property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String cBody;

    /*
     * The log_time property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String logTime;

    /*
     * The platform_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String platformType;

    /*
     * The region property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String region;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GameSdkLogInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkLogInfo() {
    }

    /**
     * Get the actionId property: The action_id property.
     * 
     * @return the actionId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getActionId() {
        return this.actionId;
    }

    /**
     * Set the actionId property: The action_id property.
     * 
     * @param actionId the actionId value to set.
     * @return the GameSdkLogInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkLogInfo setActionId(Integer actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * Get the actionName property: The action_name property.
     * 
     * @return the actionName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getActionName() {
        return this.actionName;
    }

    /**
     * Set the actionName property: The action_name property.
     * 
     * @param actionName the actionName value to set.
     * @return the GameSdkLogInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkLogInfo setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * Get the cBody property: The c_body property.
     * 
     * @return the cBody value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getCBody() {
        return this.cBody;
    }

    /**
     * Set the cBody property: The c_body property.
     * 
     * @param cBody the cBody value to set.
     * @return the GameSdkLogInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkLogInfo setCBody(String cBody) {
        this.cBody = cBody;
        return this;
    }

    /**
     * Get the logTime property: The log_time property.
     * 
     * @return the logTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLogTime() {
        return this.logTime;
    }

    /**
     * Set the logTime property: The log_time property.
     * 
     * @param logTime the logTime value to set.
     * @return the GameSdkLogInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkLogInfo setLogTime(String logTime) {
        this.logTime = logTime;
        return this;
    }

    /**
     * Get the platformType property: The platform_type property.
     * 
     * @return the platformType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getPlatformType() {
        return this.platformType;
    }

    /**
     * Set the platformType property: The platform_type property.
     * 
     * @param platformType the platformType value to set.
     * @return the GameSdkLogInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkLogInfo setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }

    /**
     * Get the region property: The region property.
     * 
     * @return the region value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getRegion() {
        return this.region;
    }

    /**
     * Set the region property: The region property.
     * 
     * @param region the region value to set.
     * @return the GameSdkLogInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkLogInfo setRegion(String region) {
        this.region = region;
        return this;
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
     * Set the additionalProperties property: Additional properties.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the GameSdkLogInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkLogInfo setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("action_id", this.actionId);
        jsonWriter.writeStringField("action_name", this.actionName);
        jsonWriter.writeStringField("c_body", this.cBody);
        jsonWriter.writeStringField("log_time", this.logTime);
        jsonWriter.writeStringField("platform_type", this.platformType);
        jsonWriter.writeStringField("region", this.region);
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
     * Reads an instance of GameSdkLogInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GameSdkLogInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the GameSdkLogInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GameSdkLogInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GameSdkLogInfo deserializedGameSdkLogInfo = new GameSdkLogInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("action_id".equals(fieldName)) {
                    deserializedGameSdkLogInfo.actionId = reader.getNullable(JsonReader::getInt);
                } else if ("action_name".equals(fieldName)) {
                    deserializedGameSdkLogInfo.actionName = reader.getString();
                } else if ("c_body".equals(fieldName)) {
                    deserializedGameSdkLogInfo.cBody = reader.getString();
                } else if ("log_time".equals(fieldName)) {
                    deserializedGameSdkLogInfo.logTime = reader.getString();
                } else if ("platform_type".equals(fieldName)) {
                    deserializedGameSdkLogInfo.platformType = reader.getString();
                } else if ("region".equals(fieldName)) {
                    deserializedGameSdkLogInfo.region = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGameSdkLogInfo.additionalProperties = additionalProperties;

            return deserializedGameSdkLogInfo;
        });
    }
}
