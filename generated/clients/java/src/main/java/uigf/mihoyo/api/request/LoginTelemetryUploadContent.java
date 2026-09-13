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
 * The LoginTelemetryUploadContent model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class LoginTelemetryUploadContent implements JsonSerializable<LoginTelemetryUploadContent> {
    /*
     * The deviceinfo property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private LoginTelemetryDeviceInfo deviceinfo;

    /*
     * The loginfo property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private LoginTelemetryLogInfo loginfo;

    /*
     * The userinfo property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private LoginTelemetryUserInfo userinfo;

    /*
     * The versioninfo property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private LoginTelemetryVersionInfo versioninfo;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of LoginTelemetryUploadContent class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryUploadContent() {
    }

    /**
     * Get the deviceinfo property: The deviceinfo property.
     * 
     * @return the deviceinfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryDeviceInfo getDeviceinfo() {
        return this.deviceinfo;
    }

    /**
     * Set the deviceinfo property: The deviceinfo property.
     * 
     * @param deviceinfo the deviceinfo value to set.
     * @return the LoginTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryUploadContent setDeviceinfo(LoginTelemetryDeviceInfo deviceinfo) {
        this.deviceinfo = deviceinfo;
        return this;
    }

    /**
     * Get the loginfo property: The loginfo property.
     * 
     * @return the loginfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryLogInfo getLoginfo() {
        return this.loginfo;
    }

    /**
     * Set the loginfo property: The loginfo property.
     * 
     * @param loginfo the loginfo value to set.
     * @return the LoginTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryUploadContent setLoginfo(LoginTelemetryLogInfo loginfo) {
        this.loginfo = loginfo;
        return this;
    }

    /**
     * Get the userinfo property: The userinfo property.
     * 
     * @return the userinfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryUserInfo getUserinfo() {
        return this.userinfo;
    }

    /**
     * Set the userinfo property: The userinfo property.
     * 
     * @param userinfo the userinfo value to set.
     * @return the LoginTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryUploadContent setUserinfo(LoginTelemetryUserInfo userinfo) {
        this.userinfo = userinfo;
        return this;
    }

    /**
     * Get the versioninfo property: The versioninfo property.
     * 
     * @return the versioninfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryVersionInfo getVersioninfo() {
        return this.versioninfo;
    }

    /**
     * Set the versioninfo property: The versioninfo property.
     * 
     * @param versioninfo the versioninfo value to set.
     * @return the LoginTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryUploadContent setVersioninfo(LoginTelemetryVersionInfo versioninfo) {
        this.versioninfo = versioninfo;
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
     * @return the LoginTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryUploadContent setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeJsonField("deviceinfo", this.deviceinfo);
        jsonWriter.writeJsonField("loginfo", this.loginfo);
        jsonWriter.writeJsonField("userinfo", this.userinfo);
        jsonWriter.writeJsonField("versioninfo", this.versioninfo);
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
     * Reads an instance of LoginTelemetryUploadContent from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoginTelemetryUploadContent if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LoginTelemetryUploadContent.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static LoginTelemetryUploadContent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LoginTelemetryUploadContent deserializedLoginTelemetryUploadContent = new LoginTelemetryUploadContent();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("deviceinfo".equals(fieldName)) {
                    deserializedLoginTelemetryUploadContent.deviceinfo = LoginTelemetryDeviceInfo.fromJson(reader);
                } else if ("loginfo".equals(fieldName)) {
                    deserializedLoginTelemetryUploadContent.loginfo = LoginTelemetryLogInfo.fromJson(reader);
                } else if ("userinfo".equals(fieldName)) {
                    deserializedLoginTelemetryUploadContent.userinfo = LoginTelemetryUserInfo.fromJson(reader);
                } else if ("versioninfo".equals(fieldName)) {
                    deserializedLoginTelemetryUploadContent.versioninfo = LoginTelemetryVersionInfo.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedLoginTelemetryUploadContent.additionalProperties = additionalProperties;

            return deserializedLoginTelemetryUploadContent;
        });
    }
}
