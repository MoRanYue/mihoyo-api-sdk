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
 * The ZenlessDailyNoteData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class ZenlessDailyNoteData implements JsonSerializable<ZenlessDailyNoteData> {
    /*
     * The abyss_refresh property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long abyssRefresh;

    /*
     * The bounty_commission property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> bountyCommission;

    /*
     * The cafe_state property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String cafeState;

    /*
     * The card_sign property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String cardSign;

    /*
     * The coffee property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData coffee;

    /*
     * The energy property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> energy;

    /*
     * The is_other_sub property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isOtherSub;

    /*
     * The is_sub property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isSub;

    /*
     * The member_card property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> memberCard;

    /*
     * The survey_points property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData surveyPoints;

    /*
     * The temple_running property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> templeRunning;

    /*
     * The vhs_sale property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> vhsSale;

    /*
     * The vitality property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> vitality;

    /*
     * The weekly_task property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData weeklyTask;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of ZenlessDailyNoteData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private ZenlessDailyNoteData() {
    }

    /**
     * Get the abyssRefresh property: The abyss_refresh property.
     * 
     * @return the abyssRefresh value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getAbyssRefresh() {
        return this.abyssRefresh;
    }

    /**
     * Get the bountyCommission property: The bounty_commission property.
     * 
     * @return the bountyCommission value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getBountyCommission() {
        return this.bountyCommission;
    }

    /**
     * Get the cafeState property: The cafe_state property.
     * 
     * @return the cafeState value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getCafeState() {
        return this.cafeState;
    }

    /**
     * Get the cardSign property: The card_sign property.
     * 
     * @return the cardSign value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getCardSign() {
        return this.cardSign;
    }

    /**
     * Get the coffee property: The coffee property.
     * 
     * @return the coffee value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getCoffee() {
        return this.coffee;
    }

    /**
     * Get the energy property: The energy property.
     * 
     * @return the energy value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getEnergy() {
        return this.energy;
    }

    /**
     * Get the isOtherSub property: The is_other_sub property.
     * 
     * @return the isOtherSub value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isOtherSub() {
        return this.isOtherSub;
    }

    /**
     * Get the isSub property: The is_sub property.
     * 
     * @return the isSub value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isSub() {
        return this.isSub;
    }

    /**
     * Get the memberCard property: The member_card property.
     * 
     * @return the memberCard value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getMemberCard() {
        return this.memberCard;
    }

    /**
     * Get the surveyPoints property: The survey_points property.
     * 
     * @return the surveyPoints value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getSurveyPoints() {
        return this.surveyPoints;
    }

    /**
     * Get the templeRunning property: The temple_running property.
     * 
     * @return the templeRunning value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getTempleRunning() {
        return this.templeRunning;
    }

    /**
     * Get the vhsSale property: The vhs_sale property.
     * 
     * @return the vhsSale value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getVhsSale() {
        return this.vhsSale;
    }

    /**
     * Get the vitality property: The vitality property.
     * 
     * @return the vitality value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getVitality() {
        return this.vitality;
    }

    /**
     * Get the weeklyTask property: The weekly_task property.
     * 
     * @return the weeklyTask value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getWeeklyTask() {
        return this.weeklyTask;
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
        jsonWriter.writeNumberField("abyss_refresh", this.abyssRefresh);
        jsonWriter.writeMapField("bounty_commission", this.bountyCommission, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeStringField("cafe_state", this.cafeState);
        jsonWriter.writeStringField("card_sign", this.cardSign);
        if (this.coffee != null) {
            jsonWriter.writeFieldName("coffee");
            this.coffee.writeTo(jsonWriter);
        }
        jsonWriter.writeMapField("energy", this.energy, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeBooleanField("is_other_sub", this.isOtherSub);
        jsonWriter.writeBooleanField("is_sub", this.isSub);
        jsonWriter.writeMapField("member_card", this.memberCard, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        if (this.surveyPoints != null) {
            jsonWriter.writeFieldName("survey_points");
            this.surveyPoints.writeTo(jsonWriter);
        }
        jsonWriter.writeMapField("temple_running", this.templeRunning, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("vhs_sale", this.vhsSale, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("vitality", this.vitality, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        if (this.weeklyTask != null) {
            jsonWriter.writeFieldName("weekly_task");
            this.weeklyTask.writeTo(jsonWriter);
        }
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
     * Reads an instance of ZenlessDailyNoteData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ZenlessDailyNoteData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ZenlessDailyNoteData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static ZenlessDailyNoteData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ZenlessDailyNoteData deserializedZenlessDailyNoteData = new ZenlessDailyNoteData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("abyss_refresh".equals(fieldName)) {
                    deserializedZenlessDailyNoteData.abyssRefresh = reader.getNullable(JsonReader::getLong);
                } else if ("bounty_commission".equals(fieldName)) {
                    Map<String, BinaryData> bountyCommission = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessDailyNoteData.bountyCommission = bountyCommission;
                } else if ("cafe_state".equals(fieldName)) {
                    deserializedZenlessDailyNoteData.cafeState = reader.getString();
                } else if ("card_sign".equals(fieldName)) {
                    deserializedZenlessDailyNoteData.cardSign = reader.getString();
                } else if ("coffee".equals(fieldName)) {
                    deserializedZenlessDailyNoteData.coffee
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("energy".equals(fieldName)) {
                    Map<String, BinaryData> energy = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessDailyNoteData.energy = energy;
                } else if ("is_other_sub".equals(fieldName)) {
                    deserializedZenlessDailyNoteData.isOtherSub = reader.getNullable(JsonReader::getBoolean);
                } else if ("is_sub".equals(fieldName)) {
                    deserializedZenlessDailyNoteData.isSub = reader.getNullable(JsonReader::getBoolean);
                } else if ("member_card".equals(fieldName)) {
                    Map<String, BinaryData> memberCard = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessDailyNoteData.memberCard = memberCard;
                } else if ("survey_points".equals(fieldName)) {
                    deserializedZenlessDailyNoteData.surveyPoints
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("temple_running".equals(fieldName)) {
                    Map<String, BinaryData> templeRunning = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessDailyNoteData.templeRunning = templeRunning;
                } else if ("vhs_sale".equals(fieldName)) {
                    Map<String, BinaryData> vhsSale = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessDailyNoteData.vhsSale = vhsSale;
                } else if ("vitality".equals(fieldName)) {
                    Map<String, BinaryData> vitality = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessDailyNoteData.vitality = vitality;
                } else if ("weekly_task".equals(fieldName)) {
                    deserializedZenlessDailyNoteData.weeklyTask
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedZenlessDailyNoteData.additionalProperties = additionalProperties;

            return deserializedZenlessDailyNoteData;
        });
    }
}
