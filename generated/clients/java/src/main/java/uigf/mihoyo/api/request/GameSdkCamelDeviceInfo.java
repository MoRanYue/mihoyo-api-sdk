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
 * The GameSdkCamelDeviceInfo model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class GameSdkCamelDeviceInfo implements JsonSerializable<GameSdkCamelDeviceInfo> {
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
     * The deviceSciX property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer deviceSciX;

    /*
     * The deviceSciY property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer deviceSciY;

    /*
     * The dpi property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer dpi;

    /*
     * The networkType property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String networkType;

    /*
     * The platform property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer platform;

    /*
     * The platformName property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String platformName;

    /*
     * The processorCount property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer processorCount;

    /*
     * The processorType property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String processorType;

    /*
     * The ramCapacity property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long ramCapacity;

    /*
     * The ramRemain property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long ramRemain;

    /*
     * The systemInfo property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String systemInfo;

    /*
     * The systemLang property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String systemLang;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GameSdkCamelDeviceInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkCamelDeviceInfo() {
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
     * @return the GameSdkCamelDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkCamelDeviceInfo setDeviceId(String deviceId) {
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
     * @return the GameSdkCamelDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkCamelDeviceInfo setDeviceModel(String deviceModel) {
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
     * @return the GameSdkCamelDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkCamelDeviceInfo setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * Get the deviceSciX property: The deviceSciX property.
     * 
     * @return the deviceSciX value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getDeviceSciX() {
        return this.deviceSciX;
    }

    /**
     * Set the deviceSciX property: The deviceSciX property.
     * 
     * @param deviceSciX the deviceSciX value to set.
     * @return the GameSdkCamelDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkCamelDeviceInfo setDeviceSciX(Integer deviceSciX) {
        this.deviceSciX = deviceSciX;
        return this;
    }

    /**
     * Get the deviceSciY property: The deviceSciY property.
     * 
     * @return the deviceSciY value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getDeviceSciY() {
        return this.deviceSciY;
    }

    /**
     * Set the deviceSciY property: The deviceSciY property.
     * 
     * @param deviceSciY the deviceSciY value to set.
     * @return the GameSdkCamelDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkCamelDeviceInfo setDeviceSciY(Integer deviceSciY) {
        this.deviceSciY = deviceSciY;
        return this;
    }

    /**
     * Get the dpi property: The dpi property.
     * 
     * @return the dpi value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getDpi() {
        return this.dpi;
    }

    /**
     * Set the dpi property: The dpi property.
     * 
     * @param dpi the dpi value to set.
     * @return the GameSdkCamelDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkCamelDeviceInfo setDpi(Integer dpi) {
        this.dpi = dpi;
        return this;
    }

    /**
     * Get the networkType property: The networkType property.
     * 
     * @return the networkType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * Set the networkType property: The networkType property.
     * 
     * @param networkType the networkType value to set.
     * @return the GameSdkCamelDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkCamelDeviceInfo setNetworkType(String networkType) {
        this.networkType = networkType;
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
     * @return the GameSdkCamelDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkCamelDeviceInfo setPlatform(Integer platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the platformName property: The platformName property.
     * 
     * @return the platformName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getPlatformName() {
        return this.platformName;
    }

    /**
     * Set the platformName property: The platformName property.
     * 
     * @param platformName the platformName value to set.
     * @return the GameSdkCamelDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkCamelDeviceInfo setPlatformName(String platformName) {
        this.platformName = platformName;
        return this;
    }

    /**
     * Get the processorCount property: The processorCount property.
     * 
     * @return the processorCount value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getProcessorCount() {
        return this.processorCount;
    }

    /**
     * Set the processorCount property: The processorCount property.
     * 
     * @param processorCount the processorCount value to set.
     * @return the GameSdkCamelDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkCamelDeviceInfo setProcessorCount(Integer processorCount) {
        this.processorCount = processorCount;
        return this;
    }

    /**
     * Get the processorType property: The processorType property.
     * 
     * @return the processorType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getProcessorType() {
        return this.processorType;
    }

    /**
     * Set the processorType property: The processorType property.
     * 
     * @param processorType the processorType value to set.
     * @return the GameSdkCamelDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkCamelDeviceInfo setProcessorType(String processorType) {
        this.processorType = processorType;
        return this;
    }

    /**
     * Get the ramCapacity property: The ramCapacity property.
     * 
     * @return the ramCapacity value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getRamCapacity() {
        return this.ramCapacity;
    }

    /**
     * Set the ramCapacity property: The ramCapacity property.
     * 
     * @param ramCapacity the ramCapacity value to set.
     * @return the GameSdkCamelDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkCamelDeviceInfo setRamCapacity(Long ramCapacity) {
        this.ramCapacity = ramCapacity;
        return this;
    }

    /**
     * Get the ramRemain property: The ramRemain property.
     * 
     * @return the ramRemain value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getRamRemain() {
        return this.ramRemain;
    }

    /**
     * Set the ramRemain property: The ramRemain property.
     * 
     * @param ramRemain the ramRemain value to set.
     * @return the GameSdkCamelDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkCamelDeviceInfo setRamRemain(Long ramRemain) {
        this.ramRemain = ramRemain;
        return this;
    }

    /**
     * Get the systemInfo property: The systemInfo property.
     * 
     * @return the systemInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSystemInfo() {
        return this.systemInfo;
    }

    /**
     * Set the systemInfo property: The systemInfo property.
     * 
     * @param systemInfo the systemInfo value to set.
     * @return the GameSdkCamelDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkCamelDeviceInfo setSystemInfo(String systemInfo) {
        this.systemInfo = systemInfo;
        return this;
    }

    /**
     * Get the systemLang property: The systemLang property.
     * 
     * @return the systemLang value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSystemLang() {
        return this.systemLang;
    }

    /**
     * Set the systemLang property: The systemLang property.
     * 
     * @param systemLang the systemLang value to set.
     * @return the GameSdkCamelDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkCamelDeviceInfo setSystemLang(String systemLang) {
        this.systemLang = systemLang;
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
     * @return the GameSdkCamelDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkCamelDeviceInfo setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("deviceId", this.deviceId);
        jsonWriter.writeStringField("deviceModel", this.deviceModel);
        jsonWriter.writeStringField("deviceName", this.deviceName);
        jsonWriter.writeNumberField("deviceSciX", this.deviceSciX);
        jsonWriter.writeNumberField("deviceSciY", this.deviceSciY);
        jsonWriter.writeNumberField("dpi", this.dpi);
        jsonWriter.writeStringField("networkType", this.networkType);
        jsonWriter.writeNumberField("platform", this.platform);
        jsonWriter.writeStringField("platformName", this.platformName);
        jsonWriter.writeNumberField("processorCount", this.processorCount);
        jsonWriter.writeStringField("processorType", this.processorType);
        jsonWriter.writeNumberField("ramCapacity", this.ramCapacity);
        jsonWriter.writeNumberField("ramRemain", this.ramRemain);
        jsonWriter.writeStringField("systemInfo", this.systemInfo);
        jsonWriter.writeStringField("systemLang", this.systemLang);
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
     * Reads an instance of GameSdkCamelDeviceInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GameSdkCamelDeviceInfo if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GameSdkCamelDeviceInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GameSdkCamelDeviceInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GameSdkCamelDeviceInfo deserializedGameSdkCamelDeviceInfo = new GameSdkCamelDeviceInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("deviceId".equals(fieldName)) {
                    deserializedGameSdkCamelDeviceInfo.deviceId = reader.getString();
                } else if ("deviceModel".equals(fieldName)) {
                    deserializedGameSdkCamelDeviceInfo.deviceModel = reader.getString();
                } else if ("deviceName".equals(fieldName)) {
                    deserializedGameSdkCamelDeviceInfo.deviceName = reader.getString();
                } else if ("deviceSciX".equals(fieldName)) {
                    deserializedGameSdkCamelDeviceInfo.deviceSciX = reader.getNullable(JsonReader::getInt);
                } else if ("deviceSciY".equals(fieldName)) {
                    deserializedGameSdkCamelDeviceInfo.deviceSciY = reader.getNullable(JsonReader::getInt);
                } else if ("dpi".equals(fieldName)) {
                    deserializedGameSdkCamelDeviceInfo.dpi = reader.getNullable(JsonReader::getInt);
                } else if ("networkType".equals(fieldName)) {
                    deserializedGameSdkCamelDeviceInfo.networkType = reader.getString();
                } else if ("platform".equals(fieldName)) {
                    deserializedGameSdkCamelDeviceInfo.platform = reader.getNullable(JsonReader::getInt);
                } else if ("platformName".equals(fieldName)) {
                    deserializedGameSdkCamelDeviceInfo.platformName = reader.getString();
                } else if ("processorCount".equals(fieldName)) {
                    deserializedGameSdkCamelDeviceInfo.processorCount = reader.getNullable(JsonReader::getInt);
                } else if ("processorType".equals(fieldName)) {
                    deserializedGameSdkCamelDeviceInfo.processorType = reader.getString();
                } else if ("ramCapacity".equals(fieldName)) {
                    deserializedGameSdkCamelDeviceInfo.ramCapacity = reader.getNullable(JsonReader::getLong);
                } else if ("ramRemain".equals(fieldName)) {
                    deserializedGameSdkCamelDeviceInfo.ramRemain = reader.getNullable(JsonReader::getLong);
                } else if ("systemInfo".equals(fieldName)) {
                    deserializedGameSdkCamelDeviceInfo.systemInfo = reader.getString();
                } else if ("systemLang".equals(fieldName)) {
                    deserializedGameSdkCamelDeviceInfo.systemLang = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGameSdkCamelDeviceInfo.additionalProperties = additionalProperties;

            return deserializedGameSdkCamelDeviceInfo;
        });
    }
}
