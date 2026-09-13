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
 * The MobileDiscussionData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MobileDiscussionData implements JsonSerializable<MobileDiscussionData> {
    /*
     * The discussion property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileDiscussion discussion;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileDiscussionData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileDiscussionData() {
    }

    /**
     * Get the discussion property: The discussion property.
     * 
     * @return the discussion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileDiscussion getDiscussion() {
        return this.discussion;
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
        jsonWriter.writeJsonField("discussion", this.discussion);
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
     * Reads an instance of MobileDiscussionData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileDiscussionData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobileDiscussionData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileDiscussionData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileDiscussionData deserializedMobileDiscussionData = new MobileDiscussionData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("discussion".equals(fieldName)) {
                    deserializedMobileDiscussionData.discussion = MobileDiscussion.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobileDiscussionData.additionalProperties = additionalProperties;

            return deserializedMobileDiscussionData;
        });
    }
}
