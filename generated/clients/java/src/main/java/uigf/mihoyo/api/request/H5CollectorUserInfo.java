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
 * The H5CollectorUserInfo model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class H5CollectorUserInfo implements JsonSerializable<H5CollectorUserInfo> {
    /*
     * The account_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String accountId;

    /*
     * The auth_key property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String authKey;

    /*
     * The device property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String device;

    /*
     * The device_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String deviceId;

    /*
     * The game_biz property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String gameBiz;

    /*
     * The game_region property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String gameRegion;

    /*
     * The game_uid property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String gameUid;

    /*
     * The lang property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String lang;

    /*
     * The platform property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String platform;

    /*
     * The uuid property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String uuid;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of H5CollectorUserInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorUserInfo() {
    }

    /**
     * Get the accountId property: The account_id property.
     * 
     * @return the accountId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * Set the accountId property: The account_id property.
     * 
     * @param accountId the accountId value to set.
     * @return the H5CollectorUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorUserInfo setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get the authKey property: The auth_key property.
     * 
     * @return the authKey value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * Set the authKey property: The auth_key property.
     * 
     * @param authKey the authKey value to set.
     * @return the H5CollectorUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorUserInfo setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }

    /**
     * Get the device property: The device property.
     * 
     * @return the device value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDevice() {
        return this.device;
    }

    /**
     * Set the device property: The device property.
     * 
     * @param device the device value to set.
     * @return the H5CollectorUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorUserInfo setDevice(String device) {
        this.device = device;
        return this;
    }

    /**
     * Get the deviceId property: The device_id property.
     * 
     * @return the deviceId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * Set the deviceId property: The device_id property.
     * 
     * @param deviceId the deviceId value to set.
     * @return the H5CollectorUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorUserInfo setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get the gameBiz property: The game_biz property.
     * 
     * @return the gameBiz value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getGameBiz() {
        return this.gameBiz;
    }

    /**
     * Set the gameBiz property: The game_biz property.
     * 
     * @param gameBiz the gameBiz value to set.
     * @return the H5CollectorUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorUserInfo setGameBiz(String gameBiz) {
        this.gameBiz = gameBiz;
        return this;
    }

    /**
     * Get the gameRegion property: The game_region property.
     * 
     * @return the gameRegion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getGameRegion() {
        return this.gameRegion;
    }

    /**
     * Set the gameRegion property: The game_region property.
     * 
     * @param gameRegion the gameRegion value to set.
     * @return the H5CollectorUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorUserInfo setGameRegion(String gameRegion) {
        this.gameRegion = gameRegion;
        return this;
    }

    /**
     * Get the gameUid property: The game_uid property.
     * 
     * @return the gameUid value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getGameUid() {
        return this.gameUid;
    }

    /**
     * Set the gameUid property: The game_uid property.
     * 
     * @param gameUid the gameUid value to set.
     * @return the H5CollectorUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorUserInfo setGameUid(String gameUid) {
        this.gameUid = gameUid;
        return this;
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
     * Set the lang property: The lang property.
     * 
     * @param lang the lang value to set.
     * @return the H5CollectorUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorUserInfo setLang(String lang) {
        this.lang = lang;
        return this;
    }

    /**
     * Get the platform property: The platform property.
     * 
     * @return the platform value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getPlatform() {
        return this.platform;
    }

    /**
     * Set the platform property: The platform property.
     * 
     * @param platform the platform value to set.
     * @return the H5CollectorUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorUserInfo setPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the uuid property: The uuid property.
     * 
     * @return the uuid value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getUuid() {
        return this.uuid;
    }

    /**
     * Set the uuid property: The uuid property.
     * 
     * @param uuid the uuid value to set.
     * @return the H5CollectorUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorUserInfo setUuid(String uuid) {
        this.uuid = uuid;
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
     * @return the H5CollectorUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorUserInfo setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("account_id", this.accountId);
        jsonWriter.writeStringField("auth_key", this.authKey);
        jsonWriter.writeStringField("device", this.device);
        jsonWriter.writeStringField("device_id", this.deviceId);
        jsonWriter.writeStringField("game_biz", this.gameBiz);
        jsonWriter.writeStringField("game_region", this.gameRegion);
        jsonWriter.writeStringField("game_uid", this.gameUid);
        jsonWriter.writeStringField("lang", this.lang);
        jsonWriter.writeStringField("platform", this.platform);
        jsonWriter.writeStringField("uuid", this.uuid);
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
     * Reads an instance of H5CollectorUserInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of H5CollectorUserInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the H5CollectorUserInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static H5CollectorUserInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            H5CollectorUserInfo deserializedH5CollectorUserInfo = new H5CollectorUserInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("account_id".equals(fieldName)) {
                    deserializedH5CollectorUserInfo.accountId = reader.getString();
                } else if ("auth_key".equals(fieldName)) {
                    deserializedH5CollectorUserInfo.authKey = reader.getString();
                } else if ("device".equals(fieldName)) {
                    deserializedH5CollectorUserInfo.device = reader.getString();
                } else if ("device_id".equals(fieldName)) {
                    deserializedH5CollectorUserInfo.deviceId = reader.getString();
                } else if ("game_biz".equals(fieldName)) {
                    deserializedH5CollectorUserInfo.gameBiz = reader.getString();
                } else if ("game_region".equals(fieldName)) {
                    deserializedH5CollectorUserInfo.gameRegion = reader.getString();
                } else if ("game_uid".equals(fieldName)) {
                    deserializedH5CollectorUserInfo.gameUid = reader.getString();
                } else if ("lang".equals(fieldName)) {
                    deserializedH5CollectorUserInfo.lang = reader.getString();
                } else if ("platform".equals(fieldName)) {
                    deserializedH5CollectorUserInfo.platform = reader.getString();
                } else if ("uuid".equals(fieldName)) {
                    deserializedH5CollectorUserInfo.uuid = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedH5CollectorUserInfo.additionalProperties = additionalProperties;

            return deserializedH5CollectorUserInfo;
        });
    }
}
