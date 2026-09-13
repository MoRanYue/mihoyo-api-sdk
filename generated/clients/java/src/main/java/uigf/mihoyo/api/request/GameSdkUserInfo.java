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
 * The GameSdkUserInfo model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class GameSdkUserInfo implements JsonSerializable<GameSdkUserInfo> {
    /*
     * The account_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String accountType;

    /*
     * The level property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String level;

    /*
     * The open_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String openId;

    /*
     * The tag property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String tag;

    /*
     * The uid property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String uid;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GameSdkUserInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkUserInfo() {
    }

    /**
     * Get the accountType property: The account_type property.
     * 
     * @return the accountType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * Set the accountType property: The account_type property.
     * 
     * @param accountType the accountType value to set.
     * @return the GameSdkUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkUserInfo setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * Get the level property: The level property.
     * 
     * @return the level value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLevel() {
        return this.level;
    }

    /**
     * Set the level property: The level property.
     * 
     * @param level the level value to set.
     * @return the GameSdkUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkUserInfo setLevel(String level) {
        this.level = level;
        return this;
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
     * Set the openId property: The open_id property.
     * 
     * @param openId the openId value to set.
     * @return the GameSdkUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkUserInfo setOpenId(String openId) {
        this.openId = openId;
        return this;
    }

    /**
     * Get the tag property: The tag property.
     * 
     * @return the tag value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getTag() {
        return this.tag;
    }

    /**
     * Set the tag property: The tag property.
     * 
     * @param tag the tag value to set.
     * @return the GameSdkUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkUserInfo setTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get the uid property: The uid property.
     * 
     * @return the uid value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getUid() {
        return this.uid;
    }

    /**
     * Set the uid property: The uid property.
     * 
     * @param uid the uid value to set.
     * @return the GameSdkUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkUserInfo setUid(String uid) {
        this.uid = uid;
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
     * @return the GameSdkUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkUserInfo setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("account_type", this.accountType);
        jsonWriter.writeStringField("level", this.level);
        jsonWriter.writeStringField("open_id", this.openId);
        jsonWriter.writeStringField("tag", this.tag);
        jsonWriter.writeStringField("uid", this.uid);
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
     * Reads an instance of GameSdkUserInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GameSdkUserInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the GameSdkUserInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GameSdkUserInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GameSdkUserInfo deserializedGameSdkUserInfo = new GameSdkUserInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("account_type".equals(fieldName)) {
                    deserializedGameSdkUserInfo.accountType = reader.getString();
                } else if ("level".equals(fieldName)) {
                    deserializedGameSdkUserInfo.level = reader.getString();
                } else if ("open_id".equals(fieldName)) {
                    deserializedGameSdkUserInfo.openId = reader.getString();
                } else if ("tag".equals(fieldName)) {
                    deserializedGameSdkUserInfo.tag = reader.getString();
                } else if ("uid".equals(fieldName)) {
                    deserializedGameSdkUserInfo.uid = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGameSdkUserInfo.additionalProperties = additionalProperties;

            return deserializedGameSdkUserInfo;
        });
    }
}
