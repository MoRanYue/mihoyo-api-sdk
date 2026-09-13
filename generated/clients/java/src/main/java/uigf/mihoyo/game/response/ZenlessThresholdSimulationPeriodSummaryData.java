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
 * The ZenlessThresholdSimulationPeriodSummaryData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class ZenlessThresholdSimulationPeriodSummaryData
    implements JsonSerializable<ZenlessThresholdSimulationPeriodSummaryData> {
    /*
     * The has_detail_record property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean hasDetailRecord;

    /*
     * The void_front_battle_abstract_info_brief property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> voidFrontBattleAbstractInfoBrief;

    /*
     * The void_front_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long voidFrontId;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of ZenlessThresholdSimulationPeriodSummaryData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private ZenlessThresholdSimulationPeriodSummaryData() {
    }

    /**
     * Get the hasDetailRecord property: The has_detail_record property.
     * 
     * @return the hasDetailRecord value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isHasDetailRecord() {
        return this.hasDetailRecord;
    }

    /**
     * Get the voidFrontBattleAbstractInfoBrief property: The void_front_battle_abstract_info_brief property.
     * 
     * @return the voidFrontBattleAbstractInfoBrief value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getVoidFrontBattleAbstractInfoBrief() {
        return this.voidFrontBattleAbstractInfoBrief;
    }

    /**
     * Get the voidFrontId property: The void_front_id property.
     * 
     * @return the voidFrontId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getVoidFrontId() {
        return this.voidFrontId;
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
        jsonWriter.writeBooleanField("has_detail_record", this.hasDetailRecord);
        jsonWriter.writeMapField("void_front_battle_abstract_info_brief", this.voidFrontBattleAbstractInfoBrief,
            (writer, element) -> {
                if (element == null) {
                    writer.writeNull();
                } else {
                    element.writeTo(writer);
                }
            });
        jsonWriter.writeNumberField("void_front_id", this.voidFrontId);
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
     * Reads an instance of ZenlessThresholdSimulationPeriodSummaryData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ZenlessThresholdSimulationPeriodSummaryData if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ZenlessThresholdSimulationPeriodSummaryData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static ZenlessThresholdSimulationPeriodSummaryData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ZenlessThresholdSimulationPeriodSummaryData deserializedZenlessThresholdSimulationPeriodSummaryData
                = new ZenlessThresholdSimulationPeriodSummaryData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("has_detail_record".equals(fieldName)) {
                    deserializedZenlessThresholdSimulationPeriodSummaryData.hasDetailRecord
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("void_front_battle_abstract_info_brief".equals(fieldName)) {
                    Map<String, BinaryData> voidFrontBattleAbstractInfoBrief = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessThresholdSimulationPeriodSummaryData.voidFrontBattleAbstractInfoBrief
                        = voidFrontBattleAbstractInfoBrief;
                } else if ("void_front_id".equals(fieldName)) {
                    deserializedZenlessThresholdSimulationPeriodSummaryData.voidFrontId
                        = reader.getNullable(JsonReader::getLong);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedZenlessThresholdSimulationPeriodSummaryData.additionalProperties = additionalProperties;

            return deserializedZenlessThresholdSimulationPeriodSummaryData;
        });
    }
}
