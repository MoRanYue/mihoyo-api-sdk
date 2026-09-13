package uigf.mihoyo.uncategorized;

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
 * The ExperimentAssignment model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class ExperimentAssignment implements JsonSerializable<ExperimentAssignment> {
    /*
     * The code property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer code;

    /*
     * The config_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String configId;

    /*
     * The configs property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> configs;

    /*
     * The experimentWhiteList property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean experimentWhiteList;

    /*
     * The period_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String periodId;

    /*
     * The sceneWhiteList property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean sceneWhiteList;

    /*
     * The type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer type;

    /*
     * The version property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String version;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of ExperimentAssignment class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private ExperimentAssignment() {
    }

    /**
     * Get the code property: The code property.
     * 
     * @return the code value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getCode() {
        return this.code;
    }

    /**
     * Get the configId property: The config_id property.
     * 
     * @return the configId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getConfigId() {
        return this.configId;
    }

    /**
     * Get the configs property: The configs property.
     * 
     * @return the configs value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getConfigs() {
        return this.configs;
    }

    /**
     * Get the experimentWhiteList property: The experimentWhiteList property.
     * 
     * @return the experimentWhiteList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isExperimentWhiteList() {
        return this.experimentWhiteList;
    }

    /**
     * Get the periodId property: The period_id property.
     * 
     * @return the periodId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getPeriodId() {
        return this.periodId;
    }

    /**
     * Get the sceneWhiteList property: The sceneWhiteList property.
     * 
     * @return the sceneWhiteList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isSceneWhiteList() {
        return this.sceneWhiteList;
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getType() {
        return this.type;
    }

    /**
     * Get the version property: The version property.
     * 
     * @return the version value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getVersion() {
        return this.version;
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
        jsonWriter.writeNumberField("code", this.code);
        jsonWriter.writeStringField("config_id", this.configId);
        jsonWriter.writeMapField("configs", this.configs, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeBooleanField("experimentWhiteList", this.experimentWhiteList);
        jsonWriter.writeStringField("period_id", this.periodId);
        jsonWriter.writeBooleanField("sceneWhiteList", this.sceneWhiteList);
        jsonWriter.writeNumberField("type", this.type);
        jsonWriter.writeStringField("version", this.version);
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
     * Reads an instance of ExperimentAssignment from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExperimentAssignment if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExperimentAssignment.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static ExperimentAssignment fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExperimentAssignment deserializedExperimentAssignment = new ExperimentAssignment();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedExperimentAssignment.code = reader.getNullable(JsonReader::getInt);
                } else if ("config_id".equals(fieldName)) {
                    deserializedExperimentAssignment.configId = reader.getString();
                } else if ("configs".equals(fieldName)) {
                    Map<String, BinaryData> configs = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedExperimentAssignment.configs = configs;
                } else if ("experimentWhiteList".equals(fieldName)) {
                    deserializedExperimentAssignment.experimentWhiteList = reader.getNullable(JsonReader::getBoolean);
                } else if ("period_id".equals(fieldName)) {
                    deserializedExperimentAssignment.periodId = reader.getString();
                } else if ("sceneWhiteList".equals(fieldName)) {
                    deserializedExperimentAssignment.sceneWhiteList = reader.getNullable(JsonReader::getBoolean);
                } else if ("type".equals(fieldName)) {
                    deserializedExperimentAssignment.type = reader.getNullable(JsonReader::getInt);
                } else if ("version".equals(fieldName)) {
                    deserializedExperimentAssignment.version = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedExperimentAssignment.additionalProperties = additionalProperties;

            return deserializedExperimentAssignment;
        });
    }
}
