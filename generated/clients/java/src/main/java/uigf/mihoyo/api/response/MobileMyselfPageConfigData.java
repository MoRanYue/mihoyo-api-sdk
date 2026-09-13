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
 * The MobileMyselfPageConfigData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MobileMyselfPageConfigData implements JsonSerializable<MobileMyselfPageConfigData> {
    /*
     * The app_personal_entry property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> appPersonalEntry;

    /*
     * The app_personal_unread property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> appPersonalUnread;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileMyselfPageConfigData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileMyselfPageConfigData() {
    }

    /**
     * Get the appPersonalEntry property: The app_personal_entry property.
     * 
     * @return the appPersonalEntry value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getAppPersonalEntry() {
        return this.appPersonalEntry;
    }

    /**
     * Get the appPersonalUnread property: The app_personal_unread property.
     * 
     * @return the appPersonalUnread value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getAppPersonalUnread() {
        return this.appPersonalUnread;
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
        jsonWriter.writeMapField("app_personal_entry", this.appPersonalEntry, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("app_personal_unread", this.appPersonalUnread, (writer, element) -> {
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
     * Reads an instance of MobileMyselfPageConfigData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileMyselfPageConfigData if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobileMyselfPageConfigData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileMyselfPageConfigData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileMyselfPageConfigData deserializedMobileMyselfPageConfigData = new MobileMyselfPageConfigData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("app_personal_entry".equals(fieldName)) {
                    Map<String, BinaryData> appPersonalEntry = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileMyselfPageConfigData.appPersonalEntry = appPersonalEntry;
                } else if ("app_personal_unread".equals(fieldName)) {
                    Map<String, BinaryData> appPersonalUnread = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileMyselfPageConfigData.appPersonalUnread = appPersonalUnread;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobileMyselfPageConfigData.additionalProperties = additionalProperties;

            return deserializedMobileMyselfPageConfigData;
        });
    }
}
