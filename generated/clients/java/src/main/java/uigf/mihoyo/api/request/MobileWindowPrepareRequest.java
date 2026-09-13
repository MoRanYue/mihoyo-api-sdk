package uigf.mihoyo.api.request;

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
 * The MobileWindowPrepareRequest model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public class MobileWindowPrepareRequest implements JsonSerializable<MobileWindowPrepareRequest> {
    /*
     * The focus_game property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final List<String> focusGame;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileWindowPrepareRequest class.
     * 
     * @param focusGame the focusGame value to set.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileWindowPrepareRequest(List<String> focusGame) {
        this.focusGame = focusGame;
    }

    /**
     * Get the focusGame property: The focus_game property.
     * 
     * @return the focusGame value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<String> getFocusGame() {
        return this.focusGame;
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
     * Set the additionalProperties property: Additional properties.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MobileWindowPrepareRequest object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileWindowPrepareRequest setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("focus_game", this.focusGame, (writer, element) -> writer.writeString(element));
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
     * Reads an instance of MobileWindowPrepareRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileWindowPrepareRequest if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MobileWindowPrepareRequest.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileWindowPrepareRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<String> focusGame = null;
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("focus_game".equals(fieldName)) {
                    focusGame = reader.readArray(reader1 -> reader1.getString());
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            MobileWindowPrepareRequest deserializedMobileWindowPrepareRequest
                = new MobileWindowPrepareRequest(focusGame);
            deserializedMobileWindowPrepareRequest.additionalProperties = additionalProperties;

            return deserializedMobileWindowPrepareRequest;
        });
    }
}
