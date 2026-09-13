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
 * The ZenlessGachaCalendarData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class ZenlessGachaCalendarData implements JsonSerializable<ZenlessGachaCalendarData> {
    /*
     * The avatar_gacha_schedule_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> avatarGachaScheduleList;

    /*
     * The weapon_gacha_schedule_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> weaponGachaScheduleList;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of ZenlessGachaCalendarData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private ZenlessGachaCalendarData() {
    }

    /**
     * Get the avatarGachaScheduleList property: The avatar_gacha_schedule_list property.
     * 
     * @return the avatarGachaScheduleList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getAvatarGachaScheduleList() {
        return this.avatarGachaScheduleList;
    }

    /**
     * Get the weaponGachaScheduleList property: The weapon_gacha_schedule_list property.
     * 
     * @return the weaponGachaScheduleList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getWeaponGachaScheduleList() {
        return this.weaponGachaScheduleList;
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
        jsonWriter.writeArrayField("avatar_gacha_schedule_list", this.avatarGachaScheduleList,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeArrayField("weapon_gacha_schedule_list", this.weaponGachaScheduleList,
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
     * Reads an instance of ZenlessGachaCalendarData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ZenlessGachaCalendarData if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ZenlessGachaCalendarData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static ZenlessGachaCalendarData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ZenlessGachaCalendarData deserializedZenlessGachaCalendarData = new ZenlessGachaCalendarData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("avatar_gacha_schedule_list".equals(fieldName)) {
                    List<Map<String, BinaryData>> avatarGachaScheduleList
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedZenlessGachaCalendarData.avatarGachaScheduleList = avatarGachaScheduleList;
                } else if ("weapon_gacha_schedule_list".equals(fieldName)) {
                    List<Map<String, BinaryData>> weaponGachaScheduleList
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedZenlessGachaCalendarData.weaponGachaScheduleList = weaponGachaScheduleList;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedZenlessGachaCalendarData.additionalProperties = additionalProperties;

            return deserializedZenlessGachaCalendarData;
        });
    }
}
