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
 * The StaticResourceVersionsData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class StaticResourceVersionsData implements JsonSerializable<StaticResourceVersionsData> {
    /*
     * The divider property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String divider;

    /*
     * The emoticon_set property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String emoticonSet;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of StaticResourceVersionsData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private StaticResourceVersionsData() {
    }

    /**
     * Get the divider property: The divider property.
     * 
     * @return the divider value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDivider() {
        return this.divider;
    }

    /**
     * Get the emoticonSet property: The emoticon_set property.
     * 
     * @return the emoticonSet value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getEmoticonSet() {
        return this.emoticonSet;
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
        jsonWriter.writeStringField("divider", this.divider);
        jsonWriter.writeStringField("emoticon_set", this.emoticonSet);
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
     * Reads an instance of StaticResourceVersionsData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticResourceVersionsData if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StaticResourceVersionsData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static StaticResourceVersionsData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StaticResourceVersionsData deserializedStaticResourceVersionsData = new StaticResourceVersionsData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("divider".equals(fieldName)) {
                    deserializedStaticResourceVersionsData.divider = reader.getString();
                } else if ("emoticon_set".equals(fieldName)) {
                    deserializedStaticResourceVersionsData.emoticonSet = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedStaticResourceVersionsData.additionalProperties = additionalProperties;

            return deserializedStaticResourceVersionsData;
        });
    }
}
