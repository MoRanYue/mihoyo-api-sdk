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
 * The SdkTelemetryUserInfo model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class SdkTelemetryUserInfo implements JsonSerializable<SdkTelemetryUserInfo> {
    /*
     * The accountId property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String accountId;

    /*
     * The accountType property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String accountType;

    /*
     * The channelId property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String channelId;

    /*
     * The userId property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String userId;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of SdkTelemetryUserInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryUserInfo() {
    }

    /**
     * Get the accountId property: The accountId property.
     * 
     * @return the accountId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * Set the accountId property: The accountId property.
     * 
     * @param accountId the accountId value to set.
     * @return the SdkTelemetryUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryUserInfo setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get the accountType property: The accountType property.
     * 
     * @return the accountType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * Set the accountType property: The accountType property.
     * 
     * @param accountType the accountType value to set.
     * @return the SdkTelemetryUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryUserInfo setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * Get the channelId property: The channelId property.
     * 
     * @return the channelId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * Set the channelId property: The channelId property.
     * 
     * @param channelId the channelId value to set.
     * @return the SdkTelemetryUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryUserInfo setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * Get the userId property: The userId property.
     * 
     * @return the userId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getUserId() {
        return this.userId;
    }

    /**
     * Set the userId property: The userId property.
     * 
     * @param userId the userId value to set.
     * @return the SdkTelemetryUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryUserInfo setUserId(String userId) {
        this.userId = userId;
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
     * @return the SdkTelemetryUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryUserInfo setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("accountId", this.accountId);
        jsonWriter.writeStringField("accountType", this.accountType);
        jsonWriter.writeStringField("channelId", this.channelId);
        jsonWriter.writeStringField("userId", this.userId);
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
     * Reads an instance of SdkTelemetryUserInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SdkTelemetryUserInfo if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SdkTelemetryUserInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static SdkTelemetryUserInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SdkTelemetryUserInfo deserializedSdkTelemetryUserInfo = new SdkTelemetryUserInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("accountId".equals(fieldName)) {
                    deserializedSdkTelemetryUserInfo.accountId = reader.getString();
                } else if ("accountType".equals(fieldName)) {
                    deserializedSdkTelemetryUserInfo.accountType = reader.getString();
                } else if ("channelId".equals(fieldName)) {
                    deserializedSdkTelemetryUserInfo.channelId = reader.getString();
                } else if ("userId".equals(fieldName)) {
                    deserializedSdkTelemetryUserInfo.userId = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedSdkTelemetryUserInfo.additionalProperties = additionalProperties;

            return deserializedSdkTelemetryUserInfo;
        });
    }
}
