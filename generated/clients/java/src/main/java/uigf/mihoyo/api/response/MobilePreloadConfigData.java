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
 * The MobilePreloadConfigData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MobilePreloadConfigData implements JsonSerializable<MobilePreloadConfigData> {
    /*
     * The need_preload property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean needPreload;

    /*
     * The need_update property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean needUpdate;

    /*
     * The rn_preload property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> rnPreload;

    /*
     * The rn_update_infos property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> rnUpdateInfos;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobilePreloadConfigData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobilePreloadConfigData() {
    }

    /**
     * Get the needPreload property: The need_preload property.
     * 
     * @return the needPreload value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isNeedPreload() {
        return this.needPreload;
    }

    /**
     * Get the needUpdate property: The need_update property.
     * 
     * @return the needUpdate value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isNeedUpdate() {
        return this.needUpdate;
    }

    /**
     * Get the rnPreload property: The rn_preload property.
     * 
     * @return the rnPreload value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getRnPreload() {
        return this.rnPreload;
    }

    /**
     * Get the rnUpdateInfos property: The rn_update_infos property.
     * 
     * @return the rnUpdateInfos value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getRnUpdateInfos() {
        return this.rnUpdateInfos;
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
        jsonWriter.writeBooleanField("need_preload", this.needPreload);
        jsonWriter.writeBooleanField("need_update", this.needUpdate);
        jsonWriter.writeArrayField("rn_preload", this.rnPreload,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeArrayField("rn_update_infos", this.rnUpdateInfos, (writer, element) -> {
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
     * Reads an instance of MobilePreloadConfigData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobilePreloadConfigData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobilePreloadConfigData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobilePreloadConfigData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobilePreloadConfigData deserializedMobilePreloadConfigData = new MobilePreloadConfigData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("need_preload".equals(fieldName)) {
                    deserializedMobilePreloadConfigData.needPreload = reader.getNullable(JsonReader::getBoolean);
                } else if ("need_update".equals(fieldName)) {
                    deserializedMobilePreloadConfigData.needUpdate = reader.getNullable(JsonReader::getBoolean);
                } else if ("rn_preload".equals(fieldName)) {
                    List<Map<String, BinaryData>> rnPreload
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedMobilePreloadConfigData.rnPreload = rnPreload;
                } else if ("rn_update_infos".equals(fieldName)) {
                    List<BinaryData> rnUpdateInfos = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobilePreloadConfigData.rnUpdateInfos = rnUpdateInfos;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobilePreloadConfigData.additionalProperties = additionalProperties;

            return deserializedMobilePreloadConfigData;
        });
    }
}
