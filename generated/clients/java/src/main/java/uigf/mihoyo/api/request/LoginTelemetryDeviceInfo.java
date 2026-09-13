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
 * The LoginTelemetryDeviceInfo model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class LoginTelemetryDeviceInfo implements JsonSerializable<LoginTelemetryDeviceInfo> {
    /*
     * The bundleId property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String bundleId;

    /*
     * The clientType property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String clientType;

    /*
     * The cps property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String cps;

    /*
     * The deviceFp property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String deviceFp;

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
     * The ip property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String ip;

    /*
     * The isp property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String isp;

    /*
     * The platform property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String platform;

    /*
     * The registerCPS property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String registerCPS;

    /*
     * The sciX property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer sciX;

    /*
     * The sciY property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer sciY;

    /*
     * The sourceDeviceId property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String sourceDeviceId;

    /*
     * The systemInfo property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String systemInfo;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of LoginTelemetryDeviceInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryDeviceInfo() {
    }

    /**
     * Get the bundleId property: The bundleId property.
     * 
     * @return the bundleId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * Set the bundleId property: The bundleId property.
     * 
     * @param bundleId the bundleId value to set.
     * @return the LoginTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryDeviceInfo setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * Get the clientType property: The clientType property.
     * 
     * @return the clientType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getClientType() {
        return this.clientType;
    }

    /**
     * Set the clientType property: The clientType property.
     * 
     * @param clientType the clientType value to set.
     * @return the LoginTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryDeviceInfo setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }

    /**
     * Get the cps property: The cps property.
     * 
     * @return the cps value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getCps() {
        return this.cps;
    }

    /**
     * Set the cps property: The cps property.
     * 
     * @param cps the cps value to set.
     * @return the LoginTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryDeviceInfo setCps(String cps) {
        this.cps = cps;
        return this;
    }

    /**
     * Get the deviceFp property: The deviceFp property.
     * 
     * @return the deviceFp value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDeviceFp() {
        return this.deviceFp;
    }

    /**
     * Set the deviceFp property: The deviceFp property.
     * 
     * @param deviceFp the deviceFp value to set.
     * @return the LoginTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryDeviceInfo setDeviceFp(String deviceFp) {
        this.deviceFp = deviceFp;
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
     * @return the LoginTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryDeviceInfo setDeviceId(String deviceId) {
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
     * @return the LoginTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryDeviceInfo setDeviceModel(String deviceModel) {
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
     * @return the LoginTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryDeviceInfo setDeviceName(String deviceName) {
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
     * @return the LoginTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryDeviceInfo setIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * Get the isp property: The isp property.
     * 
     * @return the isp value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getIsp() {
        return this.isp;
    }

    /**
     * Set the isp property: The isp property.
     * 
     * @param isp the isp value to set.
     * @return the LoginTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryDeviceInfo setIsp(String isp) {
        this.isp = isp;
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
     * @return the LoginTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryDeviceInfo setPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the registerCPS property: The registerCPS property.
     * 
     * @return the registerCPS value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getRegisterCPS() {
        return this.registerCPS;
    }

    /**
     * Set the registerCPS property: The registerCPS property.
     * 
     * @param registerCPS the registerCPS value to set.
     * @return the LoginTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryDeviceInfo setRegisterCPS(String registerCPS) {
        this.registerCPS = registerCPS;
        return this;
    }

    /**
     * Get the sciX property: The sciX property.
     * 
     * @return the sciX value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getSciX() {
        return this.sciX;
    }

    /**
     * Set the sciX property: The sciX property.
     * 
     * @param sciX the sciX value to set.
     * @return the LoginTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryDeviceInfo setSciX(Integer sciX) {
        this.sciX = sciX;
        return this;
    }

    /**
     * Get the sciY property: The sciY property.
     * 
     * @return the sciY value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getSciY() {
        return this.sciY;
    }

    /**
     * Set the sciY property: The sciY property.
     * 
     * @param sciY the sciY value to set.
     * @return the LoginTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryDeviceInfo setSciY(Integer sciY) {
        this.sciY = sciY;
        return this;
    }

    /**
     * Get the sourceDeviceId property: The sourceDeviceId property.
     * 
     * @return the sourceDeviceId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSourceDeviceId() {
        return this.sourceDeviceId;
    }

    /**
     * Set the sourceDeviceId property: The sourceDeviceId property.
     * 
     * @param sourceDeviceId the sourceDeviceId value to set.
     * @return the LoginTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryDeviceInfo setSourceDeviceId(String sourceDeviceId) {
        this.sourceDeviceId = sourceDeviceId;
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
     * @return the LoginTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryDeviceInfo setSystemInfo(String systemInfo) {
        this.systemInfo = systemInfo;
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
     * @return the LoginTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryDeviceInfo setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("bundleId", this.bundleId);
        jsonWriter.writeStringField("clientType", this.clientType);
        jsonWriter.writeStringField("cps", this.cps);
        jsonWriter.writeStringField("deviceFp", this.deviceFp);
        jsonWriter.writeStringField("deviceId", this.deviceId);
        jsonWriter.writeStringField("deviceModel", this.deviceModel);
        jsonWriter.writeStringField("deviceName", this.deviceName);
        jsonWriter.writeStringField("ip", this.ip);
        jsonWriter.writeStringField("isp", this.isp);
        jsonWriter.writeStringField("platform", this.platform);
        jsonWriter.writeStringField("registerCPS", this.registerCPS);
        jsonWriter.writeNumberField("sciX", this.sciX);
        jsonWriter.writeNumberField("sciY", this.sciY);
        jsonWriter.writeStringField("sourceDeviceId", this.sourceDeviceId);
        jsonWriter.writeStringField("systemInfo", this.systemInfo);
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
     * Reads an instance of LoginTelemetryDeviceInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoginTelemetryDeviceInfo if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LoginTelemetryDeviceInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static LoginTelemetryDeviceInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LoginTelemetryDeviceInfo deserializedLoginTelemetryDeviceInfo = new LoginTelemetryDeviceInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("bundleId".equals(fieldName)) {
                    deserializedLoginTelemetryDeviceInfo.bundleId = reader.getString();
                } else if ("clientType".equals(fieldName)) {
                    deserializedLoginTelemetryDeviceInfo.clientType = reader.getString();
                } else if ("cps".equals(fieldName)) {
                    deserializedLoginTelemetryDeviceInfo.cps = reader.getString();
                } else if ("deviceFp".equals(fieldName)) {
                    deserializedLoginTelemetryDeviceInfo.deviceFp = reader.getString();
                } else if ("deviceId".equals(fieldName)) {
                    deserializedLoginTelemetryDeviceInfo.deviceId = reader.getString();
                } else if ("deviceModel".equals(fieldName)) {
                    deserializedLoginTelemetryDeviceInfo.deviceModel = reader.getString();
                } else if ("deviceName".equals(fieldName)) {
                    deserializedLoginTelemetryDeviceInfo.deviceName = reader.getString();
                } else if ("ip".equals(fieldName)) {
                    deserializedLoginTelemetryDeviceInfo.ip = reader.getString();
                } else if ("isp".equals(fieldName)) {
                    deserializedLoginTelemetryDeviceInfo.isp = reader.getString();
                } else if ("platform".equals(fieldName)) {
                    deserializedLoginTelemetryDeviceInfo.platform = reader.getString();
                } else if ("registerCPS".equals(fieldName)) {
                    deserializedLoginTelemetryDeviceInfo.registerCPS = reader.getString();
                } else if ("sciX".equals(fieldName)) {
                    deserializedLoginTelemetryDeviceInfo.sciX = reader.getNullable(JsonReader::getInt);
                } else if ("sciY".equals(fieldName)) {
                    deserializedLoginTelemetryDeviceInfo.sciY = reader.getNullable(JsonReader::getInt);
                } else if ("sourceDeviceId".equals(fieldName)) {
                    deserializedLoginTelemetryDeviceInfo.sourceDeviceId = reader.getString();
                } else if ("systemInfo".equals(fieldName)) {
                    deserializedLoginTelemetryDeviceInfo.systemInfo = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedLoginTelemetryDeviceInfo.additionalProperties = additionalProperties;

            return deserializedLoginTelemetryDeviceInfo;
        });
    }
}
