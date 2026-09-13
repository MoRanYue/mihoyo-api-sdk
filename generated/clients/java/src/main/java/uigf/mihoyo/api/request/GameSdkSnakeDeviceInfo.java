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
 * The GameSdkSnakeDeviceInfo model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class GameSdkSnakeDeviceInfo implements JsonSerializable<GameSdkSnakeDeviceInfo> {
    /*
     * The bundle_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String bundleId;

    /*
     * The channel_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String channelId;

    /*
     * The channel_subid property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String channelSubid;

    /*
     * The channel_subid_int property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer channelSubidInt;

    /*
     * The current_cps property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String currentCps;

    /*
     * The device_fp property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String deviceFp;

    /*
     * The device_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String deviceId;

    /*
     * The device_model property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String deviceModel;

    /*
     * The device_name property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String deviceName;

    /*
     * The ip property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String ip;

    /*
     * The network_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String networkType;

    /*
     * The os property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String os;

    /*
     * The plat property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer plat;

    /*
     * The register_cps property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String registerCps;

    /*
     * The uapc property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String uapc;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GameSdkSnakeDeviceInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkSnakeDeviceInfo() {
    }

    /**
     * Get the bundleId property: The bundle_id property.
     * 
     * @return the bundleId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * Set the bundleId property: The bundle_id property.
     * 
     * @param bundleId the bundleId value to set.
     * @return the GameSdkSnakeDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkSnakeDeviceInfo setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * Get the channelId property: The channel_id property.
     * 
     * @return the channelId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * Set the channelId property: The channel_id property.
     * 
     * @param channelId the channelId value to set.
     * @return the GameSdkSnakeDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkSnakeDeviceInfo setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * Get the channelSubid property: The channel_subid property.
     * 
     * @return the channelSubid value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getChannelSubid() {
        return this.channelSubid;
    }

    /**
     * Set the channelSubid property: The channel_subid property.
     * 
     * @param channelSubid the channelSubid value to set.
     * @return the GameSdkSnakeDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkSnakeDeviceInfo setChannelSubid(String channelSubid) {
        this.channelSubid = channelSubid;
        return this;
    }

    /**
     * Get the channelSubidInt property: The channel_subid_int property.
     * 
     * @return the channelSubidInt value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getChannelSubidInt() {
        return this.channelSubidInt;
    }

    /**
     * Set the channelSubidInt property: The channel_subid_int property.
     * 
     * @param channelSubidInt the channelSubidInt value to set.
     * @return the GameSdkSnakeDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkSnakeDeviceInfo setChannelSubidInt(Integer channelSubidInt) {
        this.channelSubidInt = channelSubidInt;
        return this;
    }

    /**
     * Get the currentCps property: The current_cps property.
     * 
     * @return the currentCps value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getCurrentCps() {
        return this.currentCps;
    }

    /**
     * Set the currentCps property: The current_cps property.
     * 
     * @param currentCps the currentCps value to set.
     * @return the GameSdkSnakeDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkSnakeDeviceInfo setCurrentCps(String currentCps) {
        this.currentCps = currentCps;
        return this;
    }

    /**
     * Get the deviceFp property: The device_fp property.
     * 
     * @return the deviceFp value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDeviceFp() {
        return this.deviceFp;
    }

    /**
     * Set the deviceFp property: The device_fp property.
     * 
     * @param deviceFp the deviceFp value to set.
     * @return the GameSdkSnakeDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkSnakeDeviceInfo setDeviceFp(String deviceFp) {
        this.deviceFp = deviceFp;
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
     * @return the GameSdkSnakeDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkSnakeDeviceInfo setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get the deviceModel property: The device_model property.
     * 
     * @return the deviceModel value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDeviceModel() {
        return this.deviceModel;
    }

    /**
     * Set the deviceModel property: The device_model property.
     * 
     * @param deviceModel the deviceModel value to set.
     * @return the GameSdkSnakeDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkSnakeDeviceInfo setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }

    /**
     * Get the deviceName property: The device_name property.
     * 
     * @return the deviceName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * Set the deviceName property: The device_name property.
     * 
     * @param deviceName the deviceName value to set.
     * @return the GameSdkSnakeDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkSnakeDeviceInfo setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * Get the ip property: The ip property.
     * 
     * @return the ip value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getIp() {
        return this.ip;
    }

    /**
     * Set the ip property: The ip property.
     * 
     * @param ip the ip value to set.
     * @return the GameSdkSnakeDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkSnakeDeviceInfo setIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * Get the networkType property: The network_type property.
     * 
     * @return the networkType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * Set the networkType property: The network_type property.
     * 
     * @param networkType the networkType value to set.
     * @return the GameSdkSnakeDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkSnakeDeviceInfo setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * Get the os property: The os property.
     * 
     * @return the os value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getOs() {
        return this.os;
    }

    /**
     * Set the os property: The os property.
     * 
     * @param os the os value to set.
     * @return the GameSdkSnakeDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkSnakeDeviceInfo setOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * Get the plat property: The plat property.
     * 
     * @return the plat value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getPlat() {
        return this.plat;
    }

    /**
     * Set the plat property: The plat property.
     * 
     * @param plat the plat value to set.
     * @return the GameSdkSnakeDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkSnakeDeviceInfo setPlat(Integer plat) {
        this.plat = plat;
        return this;
    }

    /**
     * Get the registerCps property: The register_cps property.
     * 
     * @return the registerCps value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getRegisterCps() {
        return this.registerCps;
    }

    /**
     * Set the registerCps property: The register_cps property.
     * 
     * @param registerCps the registerCps value to set.
     * @return the GameSdkSnakeDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkSnakeDeviceInfo setRegisterCps(String registerCps) {
        this.registerCps = registerCps;
        return this;
    }

    /**
     * Get the uapc property: The uapc property.
     * 
     * @return the uapc value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getUapc() {
        return this.uapc;
    }

    /**
     * Set the uapc property: The uapc property.
     * 
     * @param uapc the uapc value to set.
     * @return the GameSdkSnakeDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkSnakeDeviceInfo setUapc(String uapc) {
        this.uapc = uapc;
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
     * @return the GameSdkSnakeDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkSnakeDeviceInfo setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("bundle_id", this.bundleId);
        jsonWriter.writeStringField("channel_id", this.channelId);
        jsonWriter.writeStringField("channel_subid", this.channelSubid);
        jsonWriter.writeNumberField("channel_subid_int", this.channelSubidInt);
        jsonWriter.writeStringField("current_cps", this.currentCps);
        jsonWriter.writeStringField("device_fp", this.deviceFp);
        jsonWriter.writeStringField("device_id", this.deviceId);
        jsonWriter.writeStringField("device_model", this.deviceModel);
        jsonWriter.writeStringField("device_name", this.deviceName);
        jsonWriter.writeStringField("ip", this.ip);
        jsonWriter.writeStringField("network_type", this.networkType);
        jsonWriter.writeStringField("os", this.os);
        jsonWriter.writeNumberField("plat", this.plat);
        jsonWriter.writeStringField("register_cps", this.registerCps);
        jsonWriter.writeStringField("uapc", this.uapc);
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
     * Reads an instance of GameSdkSnakeDeviceInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GameSdkSnakeDeviceInfo if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GameSdkSnakeDeviceInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GameSdkSnakeDeviceInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GameSdkSnakeDeviceInfo deserializedGameSdkSnakeDeviceInfo = new GameSdkSnakeDeviceInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("bundle_id".equals(fieldName)) {
                    deserializedGameSdkSnakeDeviceInfo.bundleId = reader.getString();
                } else if ("channel_id".equals(fieldName)) {
                    deserializedGameSdkSnakeDeviceInfo.channelId = reader.getString();
                } else if ("channel_subid".equals(fieldName)) {
                    deserializedGameSdkSnakeDeviceInfo.channelSubid = reader.getString();
                } else if ("channel_subid_int".equals(fieldName)) {
                    deserializedGameSdkSnakeDeviceInfo.channelSubidInt = reader.getNullable(JsonReader::getInt);
                } else if ("current_cps".equals(fieldName)) {
                    deserializedGameSdkSnakeDeviceInfo.currentCps = reader.getString();
                } else if ("device_fp".equals(fieldName)) {
                    deserializedGameSdkSnakeDeviceInfo.deviceFp = reader.getString();
                } else if ("device_id".equals(fieldName)) {
                    deserializedGameSdkSnakeDeviceInfo.deviceId = reader.getString();
                } else if ("device_model".equals(fieldName)) {
                    deserializedGameSdkSnakeDeviceInfo.deviceModel = reader.getString();
                } else if ("device_name".equals(fieldName)) {
                    deserializedGameSdkSnakeDeviceInfo.deviceName = reader.getString();
                } else if ("ip".equals(fieldName)) {
                    deserializedGameSdkSnakeDeviceInfo.ip = reader.getString();
                } else if ("network_type".equals(fieldName)) {
                    deserializedGameSdkSnakeDeviceInfo.networkType = reader.getString();
                } else if ("os".equals(fieldName)) {
                    deserializedGameSdkSnakeDeviceInfo.os = reader.getString();
                } else if ("plat".equals(fieldName)) {
                    deserializedGameSdkSnakeDeviceInfo.plat = reader.getNullable(JsonReader::getInt);
                } else if ("register_cps".equals(fieldName)) {
                    deserializedGameSdkSnakeDeviceInfo.registerCps = reader.getString();
                } else if ("uapc".equals(fieldName)) {
                    deserializedGameSdkSnakeDeviceInfo.uapc = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGameSdkSnakeDeviceInfo.additionalProperties = additionalProperties;

            return deserializedGameSdkSnakeDeviceInfo;
        });
    }
}
