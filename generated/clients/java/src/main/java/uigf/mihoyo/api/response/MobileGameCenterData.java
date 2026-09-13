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
 * The MobileGameCenterData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MobileGameCenterData implements JsonSerializable<MobileGameCenterData> {
    /*
     * The auto_download_enable_map property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> autoDownloadEnableMap;

    /*
     * The download_mode property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String downloadMode;

    /*
     * The game_download_experiment property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> gameDownloadExperiment;

    /*
     * The list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> list;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileGameCenterData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileGameCenterData() {
    }

    /**
     * Get the autoDownloadEnableMap property: The auto_download_enable_map property.
     * 
     * @return the autoDownloadEnableMap value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getAutoDownloadEnableMap() {
        return this.autoDownloadEnableMap;
    }

    /**
     * Get the downloadMode property: The download_mode property.
     * 
     * @return the downloadMode value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDownloadMode() {
        return this.downloadMode;
    }

    /**
     * Get the gameDownloadExperiment property: The game_download_experiment property.
     * 
     * @return the gameDownloadExperiment value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getGameDownloadExperiment() {
        return this.gameDownloadExperiment;
    }

    /**
     * Get the list property: The list property.
     * 
     * @return the list value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getList() {
        return this.list;
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
        jsonWriter.writeMapField("auto_download_enable_map", this.autoDownloadEnableMap, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeStringField("download_mode", this.downloadMode);
        jsonWriter.writeMapField("game_download_experiment", this.gameDownloadExperiment, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeArrayField("list", this.list,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
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
     * Reads an instance of MobileGameCenterData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileGameCenterData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobileGameCenterData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileGameCenterData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileGameCenterData deserializedMobileGameCenterData = new MobileGameCenterData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("auto_download_enable_map".equals(fieldName)) {
                    Map<String, BinaryData> autoDownloadEnableMap = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileGameCenterData.autoDownloadEnableMap = autoDownloadEnableMap;
                } else if ("download_mode".equals(fieldName)) {
                    deserializedMobileGameCenterData.downloadMode = reader.getString();
                } else if ("game_download_experiment".equals(fieldName)) {
                    Map<String, BinaryData> gameDownloadExperiment = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileGameCenterData.gameDownloadExperiment = gameDownloadExperiment;
                } else if ("list".equals(fieldName)) {
                    List<Map<String, BinaryData>> list = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedMobileGameCenterData.list = list;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobileGameCenterData.additionalProperties = additionalProperties;

            return deserializedMobileGameCenterData;
        });
    }
}
