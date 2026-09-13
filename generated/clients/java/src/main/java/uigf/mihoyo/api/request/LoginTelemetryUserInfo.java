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
 * The LoginTelemetryUserInfo model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class LoginTelemetryUserInfo implements JsonSerializable<LoginTelemetryUserInfo> {
    /*
     * The accountId property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String accountId;

    /*
     * The accountType property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer accountType;

    /*
     * The channelId property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer channelId;

    /*
     * The mid property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String mid;

    /*
     * The userId property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long userId;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of LoginTelemetryUserInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryUserInfo() {
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
     * @return the LoginTelemetryUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryUserInfo setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get the accountType property: The accountType property.
     * 
     * @return the accountType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getAccountType() {
        return this.accountType;
    }

    /**
     * Set the accountType property: The accountType property.
     * 
     * @param accountType the accountType value to set.
     * @return the LoginTelemetryUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryUserInfo setAccountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * Get the channelId property: The channelId property.
     * 
     * @return the channelId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getChannelId() {
        return this.channelId;
    }

    /**
     * Set the channelId property: The channelId property.
     * 
     * @param channelId the channelId value to set.
     * @return the LoginTelemetryUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryUserInfo setChannelId(Integer channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * Get the mid property: The mid property.
     * 
     * @return the mid value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getMid() {
        return this.mid;
    }

    /**
     * Set the mid property: The mid property.
     * 
     * @param mid the mid value to set.
     * @return the LoginTelemetryUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryUserInfo setMid(String mid) {
        this.mid = mid;
        return this;
    }

    /**
     * Get the userId property: The userId property.
     * 
     * @return the userId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getUserId() {
        return this.userId;
    }

    /**
     * Set the userId property: The userId property.
     * 
     * @param userId the userId value to set.
     * @return the LoginTelemetryUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryUserInfo setUserId(Long userId) {
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
     * @return the LoginTelemetryUserInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryUserInfo setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeNumberField("accountType", this.accountType);
        jsonWriter.writeNumberField("channelId", this.channelId);
        jsonWriter.writeStringField("mid", this.mid);
        jsonWriter.writeNumberField("userId", this.userId);
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
     * Reads an instance of LoginTelemetryUserInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoginTelemetryUserInfo if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LoginTelemetryUserInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static LoginTelemetryUserInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LoginTelemetryUserInfo deserializedLoginTelemetryUserInfo = new LoginTelemetryUserInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("accountId".equals(fieldName)) {
                    deserializedLoginTelemetryUserInfo.accountId = reader.getString();
                } else if ("accountType".equals(fieldName)) {
                    deserializedLoginTelemetryUserInfo.accountType = reader.getNullable(JsonReader::getInt);
                } else if ("channelId".equals(fieldName)) {
                    deserializedLoginTelemetryUserInfo.channelId = reader.getNullable(JsonReader::getInt);
                } else if ("mid".equals(fieldName)) {
                    deserializedLoginTelemetryUserInfo.mid = reader.getString();
                } else if ("userId".equals(fieldName)) {
                    deserializedLoginTelemetryUserInfo.userId = reader.getNullable(JsonReader::getLong);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedLoginTelemetryUserInfo.additionalProperties = additionalProperties;

            return deserializedLoginTelemetryUserInfo;
        });
    }
}
