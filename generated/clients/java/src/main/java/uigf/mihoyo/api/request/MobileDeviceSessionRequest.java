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
 * The MobileDeviceSessionRequest model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class MobileDeviceSessionRequest implements JsonSerializable<MobileDeviceSessionRequest> {
    /*
     * The app_version property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String appVersion;

    /*
     * The device_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String deviceId;

    /*
     * The device_name property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String deviceName;

    /*
     * The os_version property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String osVersion;

    /*
     * The platform property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String platform;

    /*
     * The registration_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String registrationId;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileDeviceSessionRequest class.
     * 
     * @param appVersion the appVersion value to set.
     * @param deviceId the deviceId value to set.
     * @param deviceName the deviceName value to set.
     * @param osVersion the osVersion value to set.
     * @param platform the platform value to set.
     * @param registrationId the registrationId value to set.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileDeviceSessionRequest(String appVersion, String deviceId, String deviceName, String osVersion,
        String platform, String registrationId) {
        this.appVersion = appVersion;
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.osVersion = osVersion;
        this.platform = platform;
        this.registrationId = registrationId;
    }

    /**
     * Get the appVersion property: The app_version property.
     * 
     * @return the appVersion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAppVersion() {
        return this.appVersion;
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
     * Get the deviceName property: The device_name property.
     * 
     * @return the deviceName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * Get the osVersion property: The os_version property.
     * 
     * @return the osVersion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getOsVersion() {
        return this.osVersion;
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
     * Get the registrationId property: The registration_id property.
     * 
     * @return the registrationId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getRegistrationId() {
        return this.registrationId;
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
     * @return the MobileDeviceSessionRequest object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileDeviceSessionRequest setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("app_version", this.appVersion);
        jsonWriter.writeStringField("device_id", this.deviceId);
        jsonWriter.writeStringField("device_name", this.deviceName);
        jsonWriter.writeStringField("os_version", this.osVersion);
        jsonWriter.writeStringField("platform", this.platform);
        jsonWriter.writeStringField("registration_id", this.registrationId);
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
     * Reads an instance of MobileDeviceSessionRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileDeviceSessionRequest if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MobileDeviceSessionRequest.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileDeviceSessionRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String appVersion = null;
            String deviceId = null;
            String deviceName = null;
            String osVersion = null;
            String platform = null;
            String registrationId = null;
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("app_version".equals(fieldName)) {
                    appVersion = reader.getString();
                } else if ("device_id".equals(fieldName)) {
                    deviceId = reader.getString();
                } else if ("device_name".equals(fieldName)) {
                    deviceName = reader.getString();
                } else if ("os_version".equals(fieldName)) {
                    osVersion = reader.getString();
                } else if ("platform".equals(fieldName)) {
                    platform = reader.getString();
                } else if ("registration_id".equals(fieldName)) {
                    registrationId = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            MobileDeviceSessionRequest deserializedMobileDeviceSessionRequest
                = new MobileDeviceSessionRequest(appVersion, deviceId, deviceName, osVersion, platform, registrationId);
            deserializedMobileDeviceSessionRequest.additionalProperties = additionalProperties;

            return deserializedMobileDeviceSessionRequest;
        });
    }
}
