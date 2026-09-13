package uigf.mihoyo.api.response;

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
 * The MobileUnreadInfoUser model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MobileUnreadInfoUser implements JsonSerializable<MobileUnreadInfoUser> {
    /*
     * The avatar_url property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String avatarUrl;

    /*
     * The uid property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String uid;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileUnreadInfoUser class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileUnreadInfoUser() {
    }

    /**
     * Get the avatarUrl property: The avatar_url property.
     * 
     * @return the avatarUrl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    /**
     * Get the uid property: The uid property.
     * 
     * @return the uid value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getUid() {
        return this.uid;
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
        jsonWriter.writeStringField("avatar_url", this.avatarUrl);
        jsonWriter.writeStringField("uid", this.uid);
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
     * Reads an instance of MobileUnreadInfoUser from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileUnreadInfoUser if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobileUnreadInfoUser.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileUnreadInfoUser fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileUnreadInfoUser deserializedMobileUnreadInfoUser = new MobileUnreadInfoUser();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("avatar_url".equals(fieldName)) {
                    deserializedMobileUnreadInfoUser.avatarUrl = reader.getString();
                } else if ("uid".equals(fieldName)) {
                    deserializedMobileUnreadInfoUser.uid = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobileUnreadInfoUser.additionalProperties = additionalProperties;

            return deserializedMobileUnreadInfoUser;
        });
    }
}
