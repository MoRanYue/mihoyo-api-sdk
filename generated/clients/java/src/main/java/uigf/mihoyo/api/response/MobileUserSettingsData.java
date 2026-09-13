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
 * The MobileUserSettingsData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MobileUserSettingsData implements JsonSerializable<MobileUserSettingsData> {
    /*
     * The is_merge_unfollow property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isMergeUnfollow;

    /*
     * The is_receive_from_unfollow property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isReceiveFromUnfollow;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileUserSettingsData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileUserSettingsData() {
    }

    /**
     * Get the isMergeUnfollow property: The is_merge_unfollow property.
     * 
     * @return the isMergeUnfollow value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isMergeUnfollow() {
        return this.isMergeUnfollow;
    }

    /**
     * Get the isReceiveFromUnfollow property: The is_receive_from_unfollow property.
     * 
     * @return the isReceiveFromUnfollow value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isReceiveFromUnfollow() {
        return this.isReceiveFromUnfollow;
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
        jsonWriter.writeBooleanField("is_merge_unfollow", this.isMergeUnfollow);
        jsonWriter.writeBooleanField("is_receive_from_unfollow", this.isReceiveFromUnfollow);
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
     * Reads an instance of MobileUserSettingsData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileUserSettingsData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobileUserSettingsData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileUserSettingsData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileUserSettingsData deserializedMobileUserSettingsData = new MobileUserSettingsData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("is_merge_unfollow".equals(fieldName)) {
                    deserializedMobileUserSettingsData.isMergeUnfollow = reader.getNullable(JsonReader::getBoolean);
                } else if ("is_receive_from_unfollow".equals(fieldName)) {
                    deserializedMobileUserSettingsData.isReceiveFromUnfollow
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobileUserSettingsData.additionalProperties = additionalProperties;

            return deserializedMobileUserSettingsData;
        });
    }
}
