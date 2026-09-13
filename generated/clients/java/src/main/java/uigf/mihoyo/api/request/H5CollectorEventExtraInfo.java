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
import java.util.Map;

/**
 * The H5CollectorEventExtraInfo model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class H5CollectorEventExtraInfo implements JsonSerializable<H5CollectorEventExtraInfo> {
    /*
     * The season property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String season;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of H5CollectorEventExtraInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorEventExtraInfo() {
    }

    /**
     * Get the season property: The season property.
     * 
     * @return the season value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSeason() {
        return this.season;
    }

    /**
     * Set the season property: The season property.
     * 
     * @param season the season value to set.
     * @return the H5CollectorEventExtraInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorEventExtraInfo setSeason(String season) {
        this.season = season;
        return this;
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
     * @return the H5CollectorEventExtraInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorEventExtraInfo setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("season", this.season);
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
     * Reads an instance of H5CollectorEventExtraInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of H5CollectorEventExtraInfo if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the H5CollectorEventExtraInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static H5CollectorEventExtraInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            H5CollectorEventExtraInfo deserializedH5CollectorEventExtraInfo = new H5CollectorEventExtraInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("season".equals(fieldName)) {
                    deserializedH5CollectorEventExtraInfo.season = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedH5CollectorEventExtraInfo.additionalProperties = additionalProperties;

            return deserializedH5CollectorEventExtraInfo;
        });
    }
}
