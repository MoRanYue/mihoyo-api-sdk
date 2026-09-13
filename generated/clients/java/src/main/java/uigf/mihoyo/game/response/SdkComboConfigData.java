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
 * Genshin SDK bootstrap configuration payloads. Dynamic settings remain maps.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class SdkComboConfigData implements JsonSerializable<SdkComboConfigData> {
    /*
     * The vals property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, String> vals;

    /*
     * Genshin SDK bootstrap configuration payloads. Dynamic settings remain maps.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of SdkComboConfigData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private SdkComboConfigData() {
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
     * Get the additionalProperties property: Genshin SDK bootstrap configuration payloads. Dynamic settings remain
     * maps.
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
     * Reads an instance of SdkComboConfigData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SdkComboConfigData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SdkComboConfigData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static SdkComboConfigData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SdkComboConfigData deserializedSdkComboConfigData = new SdkComboConfigData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("vals".equals(fieldName)) {
                    Map<String, String> vals = reader.readMap(reader1 -> reader1.getString());
                    deserializedSdkComboConfigData.vals = vals;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedSdkComboConfigData.additionalProperties = additionalProperties;

            return deserializedSdkComboConfigData;
        });
    }
}
