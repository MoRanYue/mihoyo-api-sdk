package uigf.mihoyo.api.request;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.models.binarydata.BinaryData;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * The MobileWindowShowRequest model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MobileWindowShowRequest extends MobileWindowPrepareRequest {
    /*
     * The install_status property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final Map<String, BinaryData> installStatus;

    /*
     * The ticket property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String ticket;

    /**
     * Creates an instance of MobileWindowShowRequest class.
     * 
     * @param focusGame the focusGame value to set.
     * @param installStatus the installStatus value to set.
     * @param ticket the ticket value to set.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileWindowShowRequest(List<String> focusGame, Map<String, BinaryData> installStatus, String ticket) {
        super(focusGame);
        this.installStatus = installStatus;
        this.ticket = ticket;
    }

    /**
     * Get the installStatus property: The install_status property.
     * 
     * @return the installStatus value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getInstallStatus() {
        return this.installStatus;
    }

    /**
     * Get the ticket property: The ticket property.
     * 
     * @return the ticket value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getTicket() {
        return this.ticket;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("focus_game", getFocusGame(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("install_status", this.installStatus, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeStringField("ticket", this.ticket);
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, BinaryData> additionalProperty : getAdditionalProperties().entrySet()) {
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
     * Reads an instance of MobileWindowShowRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileWindowShowRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MobileWindowShowRequest.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileWindowShowRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<String> focusGame = null;
            Map<String, BinaryData> installStatus = null;
            String ticket = null;
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("focus_game".equals(fieldName)) {
                    focusGame = reader.readArray(reader1 -> reader1.getString());
                } else if ("install_status".equals(fieldName)) {
                    installStatus = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                } else if ("ticket".equals(fieldName)) {
                    ticket = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            MobileWindowShowRequest deserializedMobileWindowShowRequest
                = new MobileWindowShowRequest(focusGame, installStatus, ticket);
            deserializedMobileWindowShowRequest.setAdditionalProperties(additionalProperties);

            return deserializedMobileWindowShowRequest;
        });
    }
}
