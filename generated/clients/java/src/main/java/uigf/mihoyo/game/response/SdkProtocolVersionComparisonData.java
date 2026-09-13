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
import java.util.Map;

/**
 * The SdkProtocolVersionComparisonData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class SdkProtocolVersionComparisonData implements JsonSerializable<SdkProtocolVersionComparisonData> {
    /*
     * The modified property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean modified;

    /*
     * The protocol property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private SdkProtocolVersion protocol;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of SdkProtocolVersionComparisonData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private SdkProtocolVersionComparisonData() {
    }

    /**
     * Get the modified property: The modified property.
     * 
     * @return the modified value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isModified() {
        return this.modified;
    }

    /**
     * Get the protocol property: The protocol property.
     * 
     * @return the protocol value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkProtocolVersion getProtocol() {
        return this.protocol;
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
        jsonWriter.writeBooleanField("modified", this.modified);
        jsonWriter.writeJsonField("protocol", this.protocol);
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
     * Reads an instance of SdkProtocolVersionComparisonData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SdkProtocolVersionComparisonData if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SdkProtocolVersionComparisonData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static SdkProtocolVersionComparisonData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SdkProtocolVersionComparisonData deserializedSdkProtocolVersionComparisonData
                = new SdkProtocolVersionComparisonData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("modified".equals(fieldName)) {
                    deserializedSdkProtocolVersionComparisonData.modified = reader.getNullable(JsonReader::getBoolean);
                } else if ("protocol".equals(fieldName)) {
                    deserializedSdkProtocolVersionComparisonData.protocol = SdkProtocolVersion.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedSdkProtocolVersionComparisonData.additionalProperties = additionalProperties;

            return deserializedSdkProtocolVersionComparisonData;
        });
    }
}
