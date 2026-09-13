package uigf.mihoyo.game.response;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.models.binarydata.BinaryData;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * The GranterFatigueRemind model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class GranterFatigueRemind implements JsonSerializable<GranterFatigueRemind> {
    /*
     * The durations property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Integer> durations;

    /*
     * The nickname property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String nickname;

    /*
     * The reset_point property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer resetPoint;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GranterFatigueRemind class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GranterFatigueRemind() {
    }

    /**
     * Get the durations property: The durations property.
     * 
     * @return the durations value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Integer> getDurations() {
        return this.durations;
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
     * Get the resetPoint property: The reset_point property.
     * 
     * @return the resetPoint value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getResetPoint() {
        return this.resetPoint;
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
        jsonWriter.writeArrayField("durations", this.durations, (writer, element) -> writer.writeInt(element));
        jsonWriter.writeStringField("nickname", this.nickname);
        jsonWriter.writeNumberField("reset_point", this.resetPoint);
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
     * Reads an instance of GranterFatigueRemind from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GranterFatigueRemind if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GranterFatigueRemind.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GranterFatigueRemind fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GranterFatigueRemind deserializedGranterFatigueRemind = new GranterFatigueRemind();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("durations".equals(fieldName)) {
                    List<Integer> durations = reader.readArray(reader1 -> reader1.getInt());
                    deserializedGranterFatigueRemind.durations = durations;
                } else if ("nickname".equals(fieldName)) {
                    deserializedGranterFatigueRemind.nickname = reader.getString();
                } else if ("reset_point".equals(fieldName)) {
                    deserializedGranterFatigueRemind.resetPoint = reader.getNullable(JsonReader::getInt);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGranterFatigueRemind.additionalProperties = additionalProperties;

            return deserializedGranterFatigueRemind;
        });
    }
}
