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
 * The MobileUnreadInfoData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MobileUnreadInfoData implements JsonSerializable<MobileUnreadInfoData> {
    /*
     * The latest_update_user_info property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileUnreadInfoUser latestUpdateUserInfo;

    /*
     * The unread_num property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer unreadNum;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileUnreadInfoData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileUnreadInfoData() {
    }

    /**
     * Get the latestUpdateUserInfo property: The latest_update_user_info property.
     * 
     * @return the latestUpdateUserInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileUnreadInfoUser getLatestUpdateUserInfo() {
        return this.latestUpdateUserInfo;
    }

    /**
     * Get the unreadNum property: The unread_num property.
     * 
     * @return the unreadNum value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getUnreadNum() {
        return this.unreadNum;
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
        jsonWriter.writeJsonField("latest_update_user_info", this.latestUpdateUserInfo);
        jsonWriter.writeNumberField("unread_num", this.unreadNum);
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
     * Reads an instance of MobileUnreadInfoData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileUnreadInfoData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobileUnreadInfoData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileUnreadInfoData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileUnreadInfoData deserializedMobileUnreadInfoData = new MobileUnreadInfoData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("latest_update_user_info".equals(fieldName)) {
                    deserializedMobileUnreadInfoData.latestUpdateUserInfo = MobileUnreadInfoUser.fromJson(reader);
                } else if ("unread_num".equals(fieldName)) {
                    deserializedMobileUnreadInfoData.unreadNum = reader.getNullable(JsonReader::getInt);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobileUnreadInfoData.additionalProperties = additionalProperties;

            return deserializedMobileUnreadInfoData;
        });
    }
}
