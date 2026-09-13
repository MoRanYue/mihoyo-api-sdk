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
import java.util.List;
import java.util.Map;

/**
 * The ZenlessLedgerMonthInfoData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class ZenlessLedgerMonthInfoData implements JsonSerializable<ZenlessLedgerMonthInfoData> {
    /*
     * The current_month property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String currentMonth;

    /*
     * The data_month property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String dataMonth;

    /*
     * The month_data property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> monthData;

    /*
     * The optional_month property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<String> optionalMonth;

    /*
     * The region property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String region;

    /*
     * The role_info property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> roleInfo;

    /*
     * The uid property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String uid;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of ZenlessLedgerMonthInfoData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private ZenlessLedgerMonthInfoData() {
    }

    /**
     * Get the currentMonth property: The current_month property.
     * 
     * @return the currentMonth value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getCurrentMonth() {
        return this.currentMonth;
    }

    /**
     * Get the dataMonth property: The data_month property.
     * 
     * @return the dataMonth value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDataMonth() {
        return this.dataMonth;
    }

    /**
     * Get the monthData property: The month_data property.
     * 
     * @return the monthData value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getMonthData() {
        return this.monthData;
    }

    /**
     * Get the optionalMonth property: The optional_month property.
     * 
     * @return the optionalMonth value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<String> getOptionalMonth() {
        return this.optionalMonth;
    }

    /**
     * Get the region property: The region property.
     * 
     * @return the region value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getRegion() {
        return this.region;
    }

    /**
     * Get the roleInfo property: The role_info property.
     * 
     * @return the roleInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getRoleInfo() {
        return this.roleInfo;
    }

    /**
     * Get the uid property: The uid property.
     * 
     * @return the uid value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getUid() {
        return this.uid;
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
        jsonWriter.writeStringField("current_month", this.currentMonth);
        jsonWriter.writeStringField("data_month", this.dataMonth);
        jsonWriter.writeMapField("month_data", this.monthData, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeArrayField("optional_month", this.optionalMonth,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("region", this.region);
        jsonWriter.writeMapField("role_info", this.roleInfo, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeStringField("uid", this.uid);
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
     * Reads an instance of ZenlessLedgerMonthInfoData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ZenlessLedgerMonthInfoData if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ZenlessLedgerMonthInfoData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static ZenlessLedgerMonthInfoData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ZenlessLedgerMonthInfoData deserializedZenlessLedgerMonthInfoData = new ZenlessLedgerMonthInfoData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("current_month".equals(fieldName)) {
                    deserializedZenlessLedgerMonthInfoData.currentMonth = reader.getString();
                } else if ("data_month".equals(fieldName)) {
                    deserializedZenlessLedgerMonthInfoData.dataMonth = reader.getString();
                } else if ("month_data".equals(fieldName)) {
                    Map<String, BinaryData> monthData = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessLedgerMonthInfoData.monthData = monthData;
                } else if ("optional_month".equals(fieldName)) {
                    List<String> optionalMonth = reader.readArray(reader1 -> reader1.getString());
                    deserializedZenlessLedgerMonthInfoData.optionalMonth = optionalMonth;
                } else if ("region".equals(fieldName)) {
                    deserializedZenlessLedgerMonthInfoData.region = reader.getString();
                } else if ("role_info".equals(fieldName)) {
                    Map<String, BinaryData> roleInfo = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessLedgerMonthInfoData.roleInfo = roleInfo;
                } else if ("uid".equals(fieldName)) {
                    deserializedZenlessLedgerMonthInfoData.uid = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedZenlessLedgerMonthInfoData.additionalProperties = additionalProperties;

            return deserializedZenlessLedgerMonthInfoData;
        });
    }
}
