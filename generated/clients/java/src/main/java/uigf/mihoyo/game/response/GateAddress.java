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
 * Gateway IP and port candidates returned by the CN dispatch service.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class GateAddress implements JsonSerializable<GateAddress> {
    /*
     * The ip property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String ip;

    /*
     * The port property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer port;

    /*
     * Gateway IP and port candidates returned by the CN dispatch service.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GateAddress class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GateAddress() {
    }

    /**
     * Get the ip property: The ip property.
     * 
     * @return the ip value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getIp() {
        return this.ip;
    }

    /**
     * Get the port property: The port property.
     * 
     * @return the port value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getPort() {
        return this.port;
    }

    /**
     * Get the additionalProperties property: Gateway IP and port candidates returned by the CN dispatch service.
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
        jsonWriter.writeStringField("ip", this.ip);
        jsonWriter.writeNumberField("port", this.port);
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
     * Reads an instance of GateAddress from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GateAddress if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the GateAddress.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GateAddress fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GateAddress deserializedGateAddress = new GateAddress();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ip".equals(fieldName)) {
                    deserializedGateAddress.ip = reader.getString();
                } else if ("port".equals(fieldName)) {
                    deserializedGateAddress.port = reader.getNullable(JsonReader::getInt);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGateAddress.additionalProperties = additionalProperties;

            return deserializedGateAddress;
        });
    }
}
