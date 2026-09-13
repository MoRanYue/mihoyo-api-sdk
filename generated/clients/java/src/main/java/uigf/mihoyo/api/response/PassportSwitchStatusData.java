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
 * The PassportSwitchStatusData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class PassportSwitchStatusData implements JsonSerializable<PassportSwitchStatusData> {
    /*
     * The enabled property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> enabled;

    /*
     * The switch_status_map property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> switchStatusMap;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of PassportSwitchStatusData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private PassportSwitchStatusData() {
    }

    /**
     * Get the enabled property: The enabled property.
     * 
     * @return the enabled value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getEnabled() {
        return this.enabled;
    }

    /**
     * Get the switchStatusMap property: The switch_status_map property.
     * 
     * @return the switchStatusMap value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getSwitchStatusMap() {
        return this.switchStatusMap;
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
        jsonWriter.writeMapField("enabled", this.enabled, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("switch_status_map", this.switchStatusMap, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
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
     * Reads an instance of PassportSwitchStatusData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PassportSwitchStatusData if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PassportSwitchStatusData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static PassportSwitchStatusData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PassportSwitchStatusData deserializedPassportSwitchStatusData = new PassportSwitchStatusData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    Map<String, BinaryData> enabled = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedPassportSwitchStatusData.enabled = enabled;
                } else if ("switch_status_map".equals(fieldName)) {
                    Map<String, BinaryData> switchStatusMap = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedPassportSwitchStatusData.switchStatusMap = switchStatusMap;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedPassportSwitchStatusData.additionalProperties = additionalProperties;

            return deserializedPassportSwitchStatusData;
        });
    }
}
