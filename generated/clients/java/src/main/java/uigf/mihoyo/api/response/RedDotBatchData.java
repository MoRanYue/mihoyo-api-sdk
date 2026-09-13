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
 * The RedDotBatchData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class RedDotBatchData implements JsonSerializable<RedDotBatchData> {
    /*
     * The game_status property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private RedDotGameStatus gameStatus;

    /*
     * The status property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean status;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of RedDotBatchData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private RedDotBatchData() {
    }

    /**
     * Get the gameStatus property: The game_status property.
     * 
     * @return the gameStatus value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public RedDotGameStatus getGameStatus() {
        return this.gameStatus;
    }

    /**
     * Get the status property: The status property.
     * 
     * @return the status value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isStatus() {
        return this.status;
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
        jsonWriter.writeJsonField("game_status", this.gameStatus);
        jsonWriter.writeBooleanField("status", this.status);
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
     * Reads an instance of RedDotBatchData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RedDotBatchData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RedDotBatchData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static RedDotBatchData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RedDotBatchData deserializedRedDotBatchData = new RedDotBatchData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("game_status".equals(fieldName)) {
                    deserializedRedDotBatchData.gameStatus = RedDotGameStatus.fromJson(reader);
                } else if ("status".equals(fieldName)) {
                    deserializedRedDotBatchData.status = reader.getNullable(JsonReader::getBoolean);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedRedDotBatchData.additionalProperties = additionalProperties;

            return deserializedRedDotBatchData;
        });
    }
}
