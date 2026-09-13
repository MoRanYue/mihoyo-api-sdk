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
 * The GateAddressData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class GateAddressData implements JsonSerializable<GateAddressData> {
    /*
     * The address_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<GateAddress> addressList;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GateAddressData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GateAddressData() {
    }

    /**
     * Get the addressList property: The address_list property.
     * 
     * @return the addressList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<GateAddress> getAddressList() {
        return this.addressList;
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
        jsonWriter.writeArrayField("address_list", this.addressList, (writer, element) -> writer.writeJson(element));
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
     * Reads an instance of GateAddressData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GateAddressData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the GateAddressData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GateAddressData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GateAddressData deserializedGateAddressData = new GateAddressData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("address_list".equals(fieldName)) {
                    List<GateAddress> addressList = reader.readArray(reader1 -> GateAddress.fromJson(reader1));
                    deserializedGateAddressData.addressList = addressList;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGateAddressData.additionalProperties = additionalProperties;

            return deserializedGateAddressData;
        });
    }
}
