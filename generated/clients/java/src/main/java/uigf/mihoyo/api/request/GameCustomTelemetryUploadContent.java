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
 * The GameCustomTelemetryUploadContent model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class GameCustomTelemetryUploadContent implements JsonSerializable<GameCustomTelemetryUploadContent> {
    /*
     * The auid property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String auid;

    /*
     * The clientIp property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String clientIp;

    /*
     * The cpuInfo property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String cpuInfo;

    /*
     * The deviceId property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String deviceId;

    /*
     * The deviceModel property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String deviceModel;

    /*
     * The deviceName property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String deviceName;

    /*
     * The gpuInfo property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String gpuInfo;

    /*
     * The isRelease property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isRelease;

    /*
     * The memoryInfo property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String memoryInfo;

    /*
     * The msg property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String msg;

    /*
     * The msgKey property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String msgKey;

    /*
     * The operatingSystem property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String operatingSystem;

    /*
     * The platform property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer platform;

    /*
     * The serverName property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String serverName;

    /*
     * The user_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long userId;

    /*
     * The version property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String version;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GameCustomTelemetryUploadContent class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryUploadContent() {
    }

    /**
     * Get the auid property: The auid property.
     * 
     * @return the auid value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAuid() {
        return this.auid;
    }

    /**
     * Set the auid property: The auid property.
     * 
     * @param auid the auid value to set.
     * @return the GameCustomTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryUploadContent setAuid(String auid) {
        this.auid = auid;
        return this;
    }

    /**
     * Get the clientIp property: The clientIp property.
     * 
     * @return the clientIp value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * Set the clientIp property: The clientIp property.
     * 
     * @param clientIp the clientIp value to set.
     * @return the GameCustomTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryUploadContent setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * Get the cpuInfo property: The cpuInfo property.
     * 
     * @return the cpuInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getCpuInfo() {
        return this.cpuInfo;
    }

    /**
     * Set the cpuInfo property: The cpuInfo property.
     * 
     * @param cpuInfo the cpuInfo value to set.
     * @return the GameCustomTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryUploadContent setCpuInfo(String cpuInfo) {
        this.cpuInfo = cpuInfo;
        return this;
    }

    /**
     * Get the deviceId property: The deviceId property.
     * 
     * @return the deviceId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * Set the deviceId property: The deviceId property.
     * 
     * @param deviceId the deviceId value to set.
     * @return the GameCustomTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryUploadContent setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get the deviceModel property: The deviceModel property.
     * 
     * @return the deviceModel value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDeviceModel() {
        return this.deviceModel;
    }

    /**
     * Set the deviceModel property: The deviceModel property.
     * 
     * @param deviceModel the deviceModel value to set.
     * @return the GameCustomTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryUploadContent setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }

    /**
     * Get the deviceName property: The deviceName property.
     * 
     * @return the deviceName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * Set the deviceName property: The deviceName property.
     * 
     * @param deviceName the deviceName value to set.
     * @return the GameCustomTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryUploadContent setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * Get the gpuInfo property: The gpuInfo property.
     * 
     * @return the gpuInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getGpuInfo() {
        return this.gpuInfo;
    }

    /**
     * Set the gpuInfo property: The gpuInfo property.
     * 
     * @param gpuInfo the gpuInfo value to set.
     * @return the GameCustomTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryUploadContent setGpuInfo(String gpuInfo) {
        this.gpuInfo = gpuInfo;
        return this;
    }

    /**
     * Get the isRelease property: The isRelease property.
     * 
     * @return the isRelease value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isRelease() {
        return this.isRelease;
    }

    /**
     * Set the isRelease property: The isRelease property.
     * 
     * @param isRelease the isRelease value to set.
     * @return the GameCustomTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryUploadContent setIsRelease(Boolean isRelease) {
        this.isRelease = isRelease;
        return this;
    }

    /**
     * Get the memoryInfo property: The memoryInfo property.
     * 
     * @return the memoryInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getMemoryInfo() {
        return this.memoryInfo;
    }

    /**
     * Set the memoryInfo property: The memoryInfo property.
     * 
     * @param memoryInfo the memoryInfo value to set.
     * @return the GameCustomTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryUploadContent setMemoryInfo(String memoryInfo) {
        this.memoryInfo = memoryInfo;
        return this;
    }

    /**
     * Get the msg property: The msg property.
     * 
     * @return the msg value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getMsg() {
        return this.msg;
    }

    /**
     * Set the msg property: The msg property.
     * 
     * @param msg the msg value to set.
     * @return the GameCustomTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryUploadContent setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * Get the msgKey property: The msgKey property.
     * 
     * @return the msgKey value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getMsgKey() {
        return this.msgKey;
    }

    /**
     * Set the msgKey property: The msgKey property.
     * 
     * @param msgKey the msgKey value to set.
     * @return the GameCustomTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryUploadContent setMsgKey(String msgKey) {
        this.msgKey = msgKey;
        return this;
    }

    /**
     * Get the operatingSystem property: The operatingSystem property.
     * 
     * @return the operatingSystem value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * Set the operatingSystem property: The operatingSystem property.
     * 
     * @param operatingSystem the operatingSystem value to set.
     * @return the GameCustomTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryUploadContent setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * Get the platform property: The platform property.
     * 
     * @return the platform value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getPlatform() {
        return this.platform;
    }

    /**
     * Set the platform property: The platform property.
     * 
     * @param platform the platform value to set.
     * @return the GameCustomTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryUploadContent setPlatform(Integer platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the serverName property: The serverName property.
     * 
     * @return the serverName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getServerName() {
        return this.serverName;
    }

    /**
     * Set the serverName property: The serverName property.
     * 
     * @param serverName the serverName value to set.
     * @return the GameCustomTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryUploadContent setServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Get the userId property: The user_id property.
     * 
     * @return the userId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getUserId() {
        return this.userId;
    }

    /**
     * Set the userId property: The user_id property.
     * 
     * @param userId the userId value to set.
     * @return the GameCustomTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryUploadContent setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get the version property: The version property.
     * 
     * @return the version value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version property.
     * 
     * @param version the version value to set.
     * @return the GameCustomTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryUploadContent setVersion(String version) {
        this.version = version;
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
     * @return the GameCustomTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryUploadContent setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("auid", this.auid);
        jsonWriter.writeStringField("clientIp", this.clientIp);
        jsonWriter.writeStringField("cpuInfo", this.cpuInfo);
        jsonWriter.writeStringField("deviceId", this.deviceId);
        jsonWriter.writeStringField("deviceModel", this.deviceModel);
        jsonWriter.writeStringField("deviceName", this.deviceName);
        jsonWriter.writeStringField("gpuInfo", this.gpuInfo);
        jsonWriter.writeBooleanField("isRelease", this.isRelease);
        jsonWriter.writeStringField("memoryInfo", this.memoryInfo);
        jsonWriter.writeStringField("msg", this.msg);
        jsonWriter.writeStringField("msgKey", this.msgKey);
        jsonWriter.writeStringField("operatingSystem", this.operatingSystem);
        jsonWriter.writeNumberField("platform", this.platform);
        jsonWriter.writeStringField("serverName", this.serverName);
        jsonWriter.writeNumberField("user_id", this.userId);
        jsonWriter.writeStringField("version", this.version);
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
     * Reads an instance of GameCustomTelemetryUploadContent from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GameCustomTelemetryUploadContent if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GameCustomTelemetryUploadContent.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GameCustomTelemetryUploadContent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GameCustomTelemetryUploadContent deserializedGameCustomTelemetryUploadContent
                = new GameCustomTelemetryUploadContent();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("auid".equals(fieldName)) {
                    deserializedGameCustomTelemetryUploadContent.auid = reader.getString();
                } else if ("clientIp".equals(fieldName)) {
                    deserializedGameCustomTelemetryUploadContent.clientIp = reader.getString();
                } else if ("cpuInfo".equals(fieldName)) {
                    deserializedGameCustomTelemetryUploadContent.cpuInfo = reader.getString();
                } else if ("deviceId".equals(fieldName)) {
                    deserializedGameCustomTelemetryUploadContent.deviceId = reader.getString();
                } else if ("deviceModel".equals(fieldName)) {
                    deserializedGameCustomTelemetryUploadContent.deviceModel = reader.getString();
                } else if ("deviceName".equals(fieldName)) {
                    deserializedGameCustomTelemetryUploadContent.deviceName = reader.getString();
                } else if ("gpuInfo".equals(fieldName)) {
                    deserializedGameCustomTelemetryUploadContent.gpuInfo = reader.getString();
                } else if ("isRelease".equals(fieldName)) {
                    deserializedGameCustomTelemetryUploadContent.isRelease = reader.getNullable(JsonReader::getBoolean);
                } else if ("memoryInfo".equals(fieldName)) {
                    deserializedGameCustomTelemetryUploadContent.memoryInfo = reader.getString();
                } else if ("msg".equals(fieldName)) {
                    deserializedGameCustomTelemetryUploadContent.msg = reader.getString();
                } else if ("msgKey".equals(fieldName)) {
                    deserializedGameCustomTelemetryUploadContent.msgKey = reader.getString();
                } else if ("operatingSystem".equals(fieldName)) {
                    deserializedGameCustomTelemetryUploadContent.operatingSystem = reader.getString();
                } else if ("platform".equals(fieldName)) {
                    deserializedGameCustomTelemetryUploadContent.platform = reader.getNullable(JsonReader::getInt);
                } else if ("serverName".equals(fieldName)) {
                    deserializedGameCustomTelemetryUploadContent.serverName = reader.getString();
                } else if ("user_id".equals(fieldName)) {
                    deserializedGameCustomTelemetryUploadContent.userId = reader.getNullable(JsonReader::getLong);
                } else if ("version".equals(fieldName)) {
                    deserializedGameCustomTelemetryUploadContent.version = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGameCustomTelemetryUploadContent.additionalProperties = additionalProperties;

            return deserializedGameCustomTelemetryUploadContent;
        });
    }
}
