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
 * The CommunityAppConfigData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class CommunityAppConfigData implements JsonSerializable<CommunityAppConfigData> {
    /*
     * The config property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, String> config;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of CommunityAppConfigData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private CommunityAppConfigData() {
    }

    /**
     * Get the config property: The config property.
     * 
     * @return the config value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, String> getConfig() {
        return this.config;
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
        jsonWriter.writeMapField("config", this.config, (writer, element) -> writer.writeString(element));
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
     * Reads an instance of CommunityAppConfigData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CommunityAppConfigData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CommunityAppConfigData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static CommunityAppConfigData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CommunityAppConfigData deserializedCommunityAppConfigData = new CommunityAppConfigData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("config".equals(fieldName)) {
                    Map<String, String> config = reader.readMap(reader1 -> reader1.getString());
                    deserializedCommunityAppConfigData.config = config;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedCommunityAppConfigData.additionalProperties = additionalProperties;

            return deserializedCommunityAppConfigData;
        });
    }
}
