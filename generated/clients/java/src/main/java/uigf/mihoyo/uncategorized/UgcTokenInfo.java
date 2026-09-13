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
 * The UgcTokenInfo model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class UgcTokenInfo implements JsonSerializable<UgcTokenInfo> {
    /*
     * The expire property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String expire;

    /*
     * The level property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String level;

    /*
     * The nickname property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String nickname;

    /*
     * The region property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String region;

    /*
     * The ugc_token property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String ugcToken;

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
     * Creates an instance of UgcTokenInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private UgcTokenInfo() {
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
     * Get the level property: The level property.
     * 
     * @return the level value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLevel() {
        return this.level;
    }

    /**
     * Get the nickname property: The nickname property.
     * 
     * @return the nickname value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getNickname() {
        return this.nickname;
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
     * Get the ugcToken property: The ugc_token property.
     * 
     * @return the ugcToken value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getUgcToken() {
        return this.ugcToken;
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
        jsonWriter.writeStringField("expire", this.expire);
        jsonWriter.writeStringField("level", this.level);
        jsonWriter.writeStringField("nickname", this.nickname);
        jsonWriter.writeStringField("region", this.region);
        jsonWriter.writeStringField("ugc_token", this.ugcToken);
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
     * Reads an instance of UgcTokenInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UgcTokenInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the UgcTokenInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static UgcTokenInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UgcTokenInfo deserializedUgcTokenInfo = new UgcTokenInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("expire".equals(fieldName)) {
                    deserializedUgcTokenInfo.expire = reader.getString();
                } else if ("level".equals(fieldName)) {
                    deserializedUgcTokenInfo.level = reader.getString();
                } else if ("nickname".equals(fieldName)) {
                    deserializedUgcTokenInfo.nickname = reader.getString();
                } else if ("region".equals(fieldName)) {
                    deserializedUgcTokenInfo.region = reader.getString();
                } else if ("ugc_token".equals(fieldName)) {
                    deserializedUgcTokenInfo.ugcToken = reader.getString();
                } else if ("uid".equals(fieldName)) {
                    deserializedUgcTokenInfo.uid = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedUgcTokenInfo.additionalProperties = additionalProperties;

            return deserializedUgcTokenInfo;
        });
    }
}
