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
 * The StaticLatestVersionData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class StaticLatestVersionData implements JsonSerializable<StaticLatestVersionData> {
    /*
     * The version property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String version;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of StaticLatestVersionData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private StaticLatestVersionData() {
    }

    /**
     * Get the version property: The version property.
     * 
     * @return the version value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getVersion() {
        return this.version;
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
        jsonWriter.writeStringField("version", this.version);
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
     * Reads an instance of StaticLatestVersionData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticLatestVersionData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StaticLatestVersionData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static StaticLatestVersionData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StaticLatestVersionData deserializedStaticLatestVersionData = new StaticLatestVersionData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("version".equals(fieldName)) {
                    deserializedStaticLatestVersionData.version = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedStaticLatestVersionData.additionalProperties = additionalProperties;

            return deserializedStaticLatestVersionData;
        });
    }
}
