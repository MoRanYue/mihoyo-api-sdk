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
 * The SdkFeCnConfigData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class SdkFeCnConfigData implements JsonSerializable<SdkFeCnConfigData> {
    /*
     * The vals property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, String> vals;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of SdkFeCnConfigData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private SdkFeCnConfigData() {
    }

    /**
     * Get the vals property: The vals property.
     * 
     * @return the vals value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, String> getVals() {
        return this.vals;
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
        jsonWriter.writeMapField("vals", this.vals, (writer, element) -> writer.writeString(element));
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
     * Reads an instance of SdkFeCnConfigData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SdkFeCnConfigData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SdkFeCnConfigData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static SdkFeCnConfigData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SdkFeCnConfigData deserializedSdkFeCnConfigData = new SdkFeCnConfigData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("vals".equals(fieldName)) {
                    Map<String, String> vals = reader.readMap(reader1 -> reader1.getString());
                    deserializedSdkFeCnConfigData.vals = vals;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedSdkFeCnConfigData.additionalProperties = additionalProperties;

            return deserializedSdkFeCnConfigData;
        });
    }
}
