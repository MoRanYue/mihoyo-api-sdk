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
 * The GenshinActivityCalendarData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class GenshinActivityCalendarData implements JsonSerializable<GenshinActivityCalendarData> {
    /*
     * The act_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> actList;

    /*
     * The avatar_card_pool_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> avatarCardPoolList;

    /*
     * The fixed_act_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> fixedActList;

    /*
     * The mixed_card_pool_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> mixedCardPoolList;

    /*
     * The selected_act_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> selectedActList;

    /*
     * The selected_avatar_card_pool_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> selectedAvatarCardPoolList;

    /*
     * The selected_mixed_card_pool_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> selectedMixedCardPoolList;

    /*
     * The weapon_card_pool_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> weaponCardPoolList;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GenshinActivityCalendarData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GenshinActivityCalendarData() {
    }

    /**
     * Get the actList property: The act_list property.
     * 
     * @return the actList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getActList() {
        return this.actList;
    }

    /**
     * Get the avatarCardPoolList property: The avatar_card_pool_list property.
     * 
     * @return the avatarCardPoolList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getAvatarCardPoolList() {
        return this.avatarCardPoolList;
    }

    /**
     * Get the fixedActList property: The fixed_act_list property.
     * 
     * @return the fixedActList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getFixedActList() {
        return this.fixedActList;
    }

    /**
     * Get the mixedCardPoolList property: The mixed_card_pool_list property.
     * 
     * @return the mixedCardPoolList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getMixedCardPoolList() {
        return this.mixedCardPoolList;
    }

    /**
     * Get the selectedActList property: The selected_act_list property.
     * 
     * @return the selectedActList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getSelectedActList() {
        return this.selectedActList;
    }

    /**
     * Get the selectedAvatarCardPoolList property: The selected_avatar_card_pool_list property.
     * 
     * @return the selectedAvatarCardPoolList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getSelectedAvatarCardPoolList() {
        return this.selectedAvatarCardPoolList;
    }

    /**
     * Get the selectedMixedCardPoolList property: The selected_mixed_card_pool_list property.
     * 
     * @return the selectedMixedCardPoolList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getSelectedMixedCardPoolList() {
        return this.selectedMixedCardPoolList;
    }

    /**
     * Get the weaponCardPoolList property: The weapon_card_pool_list property.
     * 
     * @return the weaponCardPoolList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getWeaponCardPoolList() {
        return this.weaponCardPoolList;
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
        jsonWriter.writeArrayField("act_list", this.actList,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeArrayField("avatar_card_pool_list", this.avatarCardPoolList,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeArrayField("fixed_act_list", this.fixedActList,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeArrayField("mixed_card_pool_list", this.mixedCardPoolList, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeArrayField("selected_act_list", this.selectedActList,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeArrayField("selected_avatar_card_pool_list", this.selectedAvatarCardPoolList,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeArrayField("selected_mixed_card_pool_list", this.selectedMixedCardPoolList,
            (writer, element) -> {
                if (element == null) {
                    writer.writeNull();
                } else {
                    element.writeTo(writer);
                }
            });
        jsonWriter.writeArrayField("weapon_card_pool_list", this.weaponCardPoolList,
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
     * Reads an instance of GenshinActivityCalendarData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GenshinActivityCalendarData if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GenshinActivityCalendarData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GenshinActivityCalendarData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GenshinActivityCalendarData deserializedGenshinActivityCalendarData = new GenshinActivityCalendarData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("act_list".equals(fieldName)) {
                    List<Map<String, BinaryData>> actList
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedGenshinActivityCalendarData.actList = actList;
                } else if ("avatar_card_pool_list".equals(fieldName)) {
                    List<Map<String, BinaryData>> avatarCardPoolList
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedGenshinActivityCalendarData.avatarCardPoolList = avatarCardPoolList;
                } else if ("fixed_act_list".equals(fieldName)) {
                    List<Map<String, BinaryData>> fixedActList
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedGenshinActivityCalendarData.fixedActList = fixedActList;
                } else if ("mixed_card_pool_list".equals(fieldName)) {
                    List<BinaryData> mixedCardPoolList = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGenshinActivityCalendarData.mixedCardPoolList = mixedCardPoolList;
                } else if ("selected_act_list".equals(fieldName)) {
                    List<Map<String, BinaryData>> selectedActList
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedGenshinActivityCalendarData.selectedActList = selectedActList;
                } else if ("selected_avatar_card_pool_list".equals(fieldName)) {
                    List<Map<String, BinaryData>> selectedAvatarCardPoolList
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedGenshinActivityCalendarData.selectedAvatarCardPoolList = selectedAvatarCardPoolList;
                } else if ("selected_mixed_card_pool_list".equals(fieldName)) {
                    List<BinaryData> selectedMixedCardPoolList = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGenshinActivityCalendarData.selectedMixedCardPoolList = selectedMixedCardPoolList;
                } else if ("weapon_card_pool_list".equals(fieldName)) {
                    List<Map<String, BinaryData>> weaponCardPoolList
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedGenshinActivityCalendarData.weaponCardPoolList = weaponCardPoolList;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGenshinActivityCalendarData.additionalProperties = additionalProperties;

            return deserializedGenshinActivityCalendarData;
        });
    }
}
