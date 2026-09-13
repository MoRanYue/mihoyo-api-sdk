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
 * The SdkRedDotData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class SdkRedDotData implements JsonSerializable<SdkRedDotData> {
    /*
     * The infos property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<SdkRedDotInfo> infos;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of SdkRedDotData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private SdkRedDotData() {
    }

    /**
     * Get the infos property: The infos property.
     * 
     * @return the infos value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<SdkRedDotInfo> getInfos() {
        return this.infos;
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
        jsonWriter.writeArrayField("infos", this.infos, (writer, element) -> writer.writeJson(element));
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
     * Reads an instance of SdkRedDotData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SdkRedDotData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SdkRedDotData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static SdkRedDotData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SdkRedDotData deserializedSdkRedDotData = new SdkRedDotData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("infos".equals(fieldName)) {
                    List<SdkRedDotInfo> infos = reader.readArray(reader1 -> SdkRedDotInfo.fromJson(reader1));
                    deserializedSdkRedDotData.infos = infos;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedSdkRedDotData.additionalProperties = additionalProperties;

            return deserializedSdkRedDotData;
        });
    }
}
