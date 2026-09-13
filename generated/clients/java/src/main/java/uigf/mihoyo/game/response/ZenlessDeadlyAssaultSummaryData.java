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
 * The ZenlessDeadlyAssaultSummaryData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class ZenlessDeadlyAssaultSummaryData implements JsonSerializable<ZenlessDeadlyAssaultSummaryData> {
    /*
     * The avatar_icon property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String avatarIcon;

    /*
     * The end_time property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> endTime;

    /*
     * The list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> list;

    /*
     * The nick_name property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String nickName;

    /*
     * The room_max_score property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer roomMaxScore;

    /*
     * The start_time property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> startTime;

    /*
     * The total_max_score property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer totalMaxScore;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of ZenlessDeadlyAssaultSummaryData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private ZenlessDeadlyAssaultSummaryData() {
    }

    /**
     * Get the avatarIcon property: The avatar_icon property.
     * 
     * @return the avatarIcon value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAvatarIcon() {
        return this.avatarIcon;
    }

    /**
     * Get the endTime property: The end_time property.
     * 
     * @return the endTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getEndTime() {
        return this.endTime;
    }

    /**
     * Get the list property: The list property.
     * 
     * @return the list value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getList() {
        return this.list;
    }

    /**
     * Get the nickName property: The nick_name property.
     * 
     * @return the nickName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getNickName() {
        return this.nickName;
    }

    /**
     * Get the roomMaxScore property: The room_max_score property.
     * 
     * @return the roomMaxScore value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getRoomMaxScore() {
        return this.roomMaxScore;
    }

    /**
     * Get the startTime property: The start_time property.
     * 
     * @return the startTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getStartTime() {
        return this.startTime;
    }

    /**
     * Get the totalMaxScore property: The total_max_score property.
     * 
     * @return the totalMaxScore value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getTotalMaxScore() {
        return this.totalMaxScore;
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
        jsonWriter.writeStringField("avatar_icon", this.avatarIcon);
        jsonWriter.writeMapField("end_time", this.endTime, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeArrayField("list", this.list, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeStringField("nick_name", this.nickName);
        jsonWriter.writeNumberField("room_max_score", this.roomMaxScore);
        jsonWriter.writeMapField("start_time", this.startTime, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeNumberField("total_max_score", this.totalMaxScore);
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
     * Reads an instance of ZenlessDeadlyAssaultSummaryData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ZenlessDeadlyAssaultSummaryData if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ZenlessDeadlyAssaultSummaryData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static ZenlessDeadlyAssaultSummaryData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ZenlessDeadlyAssaultSummaryData deserializedZenlessDeadlyAssaultSummaryData
                = new ZenlessDeadlyAssaultSummaryData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("avatar_icon".equals(fieldName)) {
                    deserializedZenlessDeadlyAssaultSummaryData.avatarIcon = reader.getString();
                } else if ("end_time".equals(fieldName)) {
                    Map<String, BinaryData> endTime = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessDeadlyAssaultSummaryData.endTime = endTime;
                } else if ("list".equals(fieldName)) {
                    List<BinaryData> list = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessDeadlyAssaultSummaryData.list = list;
                } else if ("nick_name".equals(fieldName)) {
                    deserializedZenlessDeadlyAssaultSummaryData.nickName = reader.getString();
                } else if ("room_max_score".equals(fieldName)) {
                    deserializedZenlessDeadlyAssaultSummaryData.roomMaxScore = reader.getNullable(JsonReader::getInt);
                } else if ("start_time".equals(fieldName)) {
                    Map<String, BinaryData> startTime = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessDeadlyAssaultSummaryData.startTime = startTime;
                } else if ("total_max_score".equals(fieldName)) {
                    deserializedZenlessDeadlyAssaultSummaryData.totalMaxScore = reader.getNullable(JsonReader::getInt);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedZenlessDeadlyAssaultSummaryData.additionalProperties = additionalProperties;

            return deserializedZenlessDeadlyAssaultSummaryData;
        });
    }
}
