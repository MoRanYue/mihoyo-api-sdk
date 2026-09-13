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
import java.util.List;
import java.util.Map;

/**
 * The MobileBusinessesData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MobileBusinessesData implements JsonSerializable<MobileBusinessesData> {
    /*
     * The businesses property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<String> businesses;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileBusinessesData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileBusinessesData() {
    }

    /**
     * Get the businesses property: The businesses property.
     * 
     * @return the businesses value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<String> getBusinesses() {
        return this.businesses;
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
        jsonWriter.writeArrayField("businesses", this.businesses, (writer, element) -> writer.writeString(element));
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
     * Reads an instance of MobileBusinessesData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileBusinessesData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobileBusinessesData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileBusinessesData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileBusinessesData deserializedMobileBusinessesData = new MobileBusinessesData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("businesses".equals(fieldName)) {
                    List<String> businesses = reader.readArray(reader1 -> reader1.getString());
                    deserializedMobileBusinessesData.businesses = businesses;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobileBusinessesData.additionalProperties = additionalProperties;

            return deserializedMobileBusinessesData;
        });
    }
}
