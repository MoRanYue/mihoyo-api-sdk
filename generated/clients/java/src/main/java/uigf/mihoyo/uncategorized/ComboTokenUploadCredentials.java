package uigf.mihoyo.uncategorized;

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
 * The ComboTokenUploadCredentials model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class ComboTokenUploadCredentials implements JsonSerializable<ComboTokenUploadCredentials> {
    /*
     * The access_key_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String accessKeyId;

    /*
     * The access_key_secret property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String accessKeySecret;

    /*
     * The bucket property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String bucket;

    /*
     * The dir property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String dir;

    /*
     * The endpoint property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String endpoint;

    /*
     * The expire property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String expire;

    /*
     * The expire_str property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String expireStr;

    /*
     * The oss_callback_url property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String ossCallbackUrl;

    /*
     * The region property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String region;

    /*
     * The security_token property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String securityToken;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of ComboTokenUploadCredentials class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private ComboTokenUploadCredentials() {
    }

    /**
     * Get the accessKeyId property: The access_key_id property.
     * 
     * @return the accessKeyId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * Get the accessKeySecret property: The access_key_secret property.
     * 
     * @return the accessKeySecret value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    /**
     * Get the bucket property: The bucket property.
     * 
     * @return the bucket value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getBucket() {
        return this.bucket;
    }

    /**
     * Get the dir property: The dir property.
     * 
     * @return the dir value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDir() {
        return this.dir;
    }

    /**
     * Get the endpoint property: The endpoint property.
     * 
     * @return the endpoint value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Get the expire property: The expire property.
     * 
     * @return the expire value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getExpire() {
        return this.expire;
    }

    /**
     * Get the expireStr property: The expire_str property.
     * 
     * @return the expireStr value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getExpireStr() {
        return this.expireStr;
    }

    /**
     * Get the ossCallbackUrl property: The oss_callback_url property.
     * 
     * @return the ossCallbackUrl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getOssCallbackUrl() {
        return this.ossCallbackUrl;
    }

    /**
     * Get the region property: The region property.
     * 
     * @return the region value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getRegion() {
        return this.region;
    }

    /**
     * Get the securityToken property: The security_token property.
     * 
     * @return the securityToken value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSecurityToken() {
        return this.securityToken;
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
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("access_key_id", this.accessKeyId);
        jsonWriter.writeStringField("access_key_secret", this.accessKeySecret);
        jsonWriter.writeStringField("bucket", this.bucket);
        jsonWriter.writeStringField("dir", this.dir);
        jsonWriter.writeStringField("endpoint", this.endpoint);
        jsonWriter.writeStringField("expire", this.expire);
        jsonWriter.writeStringField("expire_str", this.expireStr);
        jsonWriter.writeStringField("oss_callback_url", this.ossCallbackUrl);
        jsonWriter.writeStringField("region", this.region);
        jsonWriter.writeStringField("security_token", this.securityToken);
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
     * Reads an instance of ComboTokenUploadCredentials from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ComboTokenUploadCredentials if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ComboTokenUploadCredentials.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static ComboTokenUploadCredentials fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ComboTokenUploadCredentials deserializedComboTokenUploadCredentials = new ComboTokenUploadCredentials();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("access_key_id".equals(fieldName)) {
                    deserializedComboTokenUploadCredentials.accessKeyId = reader.getString();
                } else if ("access_key_secret".equals(fieldName)) {
                    deserializedComboTokenUploadCredentials.accessKeySecret = reader.getString();
                } else if ("bucket".equals(fieldName)) {
                    deserializedComboTokenUploadCredentials.bucket = reader.getString();
                } else if ("dir".equals(fieldName)) {
                    deserializedComboTokenUploadCredentials.dir = reader.getString();
                } else if ("endpoint".equals(fieldName)) {
                    deserializedComboTokenUploadCredentials.endpoint = reader.getString();
                } else if ("expire".equals(fieldName)) {
                    deserializedComboTokenUploadCredentials.expire = reader.getString();
                } else if ("expire_str".equals(fieldName)) {
                    deserializedComboTokenUploadCredentials.expireStr = reader.getString();
                } else if ("oss_callback_url".equals(fieldName)) {
                    deserializedComboTokenUploadCredentials.ossCallbackUrl = reader.getString();
                } else if ("region".equals(fieldName)) {
                    deserializedComboTokenUploadCredentials.region = reader.getString();
                } else if ("security_token".equals(fieldName)) {
                    deserializedComboTokenUploadCredentials.securityToken = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedComboTokenUploadCredentials.additionalProperties = additionalProperties;

            return deserializedComboTokenUploadCredentials;
        });
    }
}
