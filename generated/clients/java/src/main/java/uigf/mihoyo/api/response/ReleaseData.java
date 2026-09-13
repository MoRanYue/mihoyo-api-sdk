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
 * The ReleaseData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class ReleaseData implements JsonSerializable<ReleaseData> {
    /*
     * The dialog property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String dialog;

    /*
     * The dialog_content property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String dialogContent;

    /*
     * The dialog_content_en property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String dialogContentEn;

    /*
     * The dialog_num property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer dialogNum;

    /*
     * The dialog_period property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer dialogPeriod;

    /*
     * The dialog_period_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer dialogPeriodType;

    /*
     * The dialog_title property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String dialogTitle;

    /*
     * The dialog_title_en property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String dialogTitleEn;

    /*
     * The has_update property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean hasUpdate;

    /*
     * The hyp_game_ids property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> hypGameIds;

    /*
     * The loop_way property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String loopWay;

    /*
     * The package_md5 property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String packageMd5;

    /*
     * The package_name property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String packageName;

    /*
     * The package_size property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String packageSize;

    /*
     * The package_url property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String packageUrl;

    /*
     * The package_version property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String packageVersion;

    /*
     * The silent property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String silent;

    /*
     * The strategy_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long strategyId;

    /*
     * The update_recommended_intensity property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String updateRecommendedIntensity;

    /*
     * The update_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer updateType;

    /*
     * The user_defined property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String userDefined;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of ReleaseData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private ReleaseData() {
    }

    /**
     * Get the dialog property: The dialog property.
     * 
     * @return the dialog value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDialog() {
        return this.dialog;
    }

    /**
     * Get the dialogContent property: The dialog_content property.
     * 
     * @return the dialogContent value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDialogContent() {
        return this.dialogContent;
    }

    /**
     * Get the dialogContentEn property: The dialog_content_en property.
     * 
     * @return the dialogContentEn value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDialogContentEn() {
        return this.dialogContentEn;
    }

    /**
     * Get the dialogNum property: The dialog_num property.
     * 
     * @return the dialogNum value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getDialogNum() {
        return this.dialogNum;
    }

    /**
     * Get the dialogPeriod property: The dialog_period property.
     * 
     * @return the dialogPeriod value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getDialogPeriod() {
        return this.dialogPeriod;
    }

    /**
     * Get the dialogPeriodType property: The dialog_period_type property.
     * 
     * @return the dialogPeriodType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getDialogPeriodType() {
        return this.dialogPeriodType;
    }

    /**
     * Get the dialogTitle property: The dialog_title property.
     * 
     * @return the dialogTitle value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDialogTitle() {
        return this.dialogTitle;
    }

    /**
     * Get the dialogTitleEn property: The dialog_title_en property.
     * 
     * @return the dialogTitleEn value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDialogTitleEn() {
        return this.dialogTitleEn;
    }

    /**
     * Get the hasUpdate property: The has_update property.
     * 
     * @return the hasUpdate value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isHasUpdate() {
        return this.hasUpdate;
    }

    /**
     * Get the hypGameIds property: The hyp_game_ids property.
     * 
     * @return the hypGameIds value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getHypGameIds() {
        return this.hypGameIds;
    }

    /**
     * Get the loopWay property: The loop_way property.
     * 
     * @return the loopWay value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLoopWay() {
        return this.loopWay;
    }

    /**
     * Get the packageMd5 property: The package_md5 property.
     * 
     * @return the packageMd5 value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getPackageMd5() {
        return this.packageMd5;
    }

    /**
     * Get the packageName property: The package_name property.
     * 
     * @return the packageName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getPackageName() {
        return this.packageName;
    }

    /**
     * Get the packageSize property: The package_size property.
     * 
     * @return the packageSize value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getPackageSize() {
        return this.packageSize;
    }

    /**
     * Get the packageUrl property: The package_url property.
     * 
     * @return the packageUrl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getPackageUrl() {
        return this.packageUrl;
    }

    /**
     * Get the packageVersion property: The package_version property.
     * 
     * @return the packageVersion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getPackageVersion() {
        return this.packageVersion;
    }

    /**
     * Get the silent property: The silent property.
     * 
     * @return the silent value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSilent() {
        return this.silent;
    }

    /**
     * Get the strategyId property: The strategy_id property.
     * 
     * @return the strategyId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getStrategyId() {
        return this.strategyId;
    }

    /**
     * Get the updateRecommendedIntensity property: The update_recommended_intensity property.
     * 
     * @return the updateRecommendedIntensity value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getUpdateRecommendedIntensity() {
        return this.updateRecommendedIntensity;
    }

    /**
     * Get the updateType property: The update_type property.
     * 
     * @return the updateType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getUpdateType() {
        return this.updateType;
    }

    /**
     * Get the userDefined property: The user_defined property.
     * 
     * @return the userDefined value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getUserDefined() {
        return this.userDefined;
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
        jsonWriter.writeStringField("dialog", this.dialog);
        jsonWriter.writeStringField("dialog_content", this.dialogContent);
        jsonWriter.writeStringField("dialog_content_en", this.dialogContentEn);
        jsonWriter.writeNumberField("dialog_num", this.dialogNum);
        jsonWriter.writeNumberField("dialog_period", this.dialogPeriod);
        jsonWriter.writeNumberField("dialog_period_type", this.dialogPeriodType);
        jsonWriter.writeStringField("dialog_title", this.dialogTitle);
        jsonWriter.writeStringField("dialog_title_en", this.dialogTitleEn);
        jsonWriter.writeBooleanField("has_update", this.hasUpdate);
        jsonWriter.writeArrayField("hyp_game_ids", this.hypGameIds, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeStringField("loop_way", this.loopWay);
        jsonWriter.writeStringField("package_md5", this.packageMd5);
        jsonWriter.writeStringField("package_name", this.packageName);
        jsonWriter.writeStringField("package_size", this.packageSize);
        jsonWriter.writeStringField("package_url", this.packageUrl);
        jsonWriter.writeStringField("package_version", this.packageVersion);
        jsonWriter.writeStringField("silent", this.silent);
        jsonWriter.writeNumberField("strategy_id", this.strategyId);
        jsonWriter.writeStringField("update_recommended_intensity", this.updateRecommendedIntensity);
        jsonWriter.writeNumberField("update_type", this.updateType);
        jsonWriter.writeStringField("user_defined", this.userDefined);
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
     * Reads an instance of ReleaseData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReleaseData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ReleaseData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static ReleaseData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReleaseData deserializedReleaseData = new ReleaseData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dialog".equals(fieldName)) {
                    deserializedReleaseData.dialog = reader.getString();
                } else if ("dialog_content".equals(fieldName)) {
                    deserializedReleaseData.dialogContent = reader.getString();
                } else if ("dialog_content_en".equals(fieldName)) {
                    deserializedReleaseData.dialogContentEn = reader.getString();
                } else if ("dialog_num".equals(fieldName)) {
                    deserializedReleaseData.dialogNum = reader.getNullable(JsonReader::getInt);
                } else if ("dialog_period".equals(fieldName)) {
                    deserializedReleaseData.dialogPeriod = reader.getNullable(JsonReader::getInt);
                } else if ("dialog_period_type".equals(fieldName)) {
                    deserializedReleaseData.dialogPeriodType = reader.getNullable(JsonReader::getInt);
                } else if ("dialog_title".equals(fieldName)) {
                    deserializedReleaseData.dialogTitle = reader.getString();
                } else if ("dialog_title_en".equals(fieldName)) {
                    deserializedReleaseData.dialogTitleEn = reader.getString();
                } else if ("has_update".equals(fieldName)) {
                    deserializedReleaseData.hasUpdate = reader.getNullable(JsonReader::getBoolean);
                } else if ("hyp_game_ids".equals(fieldName)) {
                    List<BinaryData> hypGameIds = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedReleaseData.hypGameIds = hypGameIds;
                } else if ("loop_way".equals(fieldName)) {
                    deserializedReleaseData.loopWay = reader.getString();
                } else if ("package_md5".equals(fieldName)) {
                    deserializedReleaseData.packageMd5 = reader.getString();
                } else if ("package_name".equals(fieldName)) {
                    deserializedReleaseData.packageName = reader.getString();
                } else if ("package_size".equals(fieldName)) {
                    deserializedReleaseData.packageSize = reader.getString();
                } else if ("package_url".equals(fieldName)) {
                    deserializedReleaseData.packageUrl = reader.getString();
                } else if ("package_version".equals(fieldName)) {
                    deserializedReleaseData.packageVersion = reader.getString();
                } else if ("silent".equals(fieldName)) {
                    deserializedReleaseData.silent = reader.getString();
                } else if ("strategy_id".equals(fieldName)) {
                    deserializedReleaseData.strategyId = reader.getNullable(JsonReader::getLong);
                } else if ("update_recommended_intensity".equals(fieldName)) {
                    deserializedReleaseData.updateRecommendedIntensity = reader.getString();
                } else if ("update_type".equals(fieldName)) {
                    deserializedReleaseData.updateType = reader.getNullable(JsonReader::getInt);
                } else if ("user_defined".equals(fieldName)) {
                    deserializedReleaseData.userDefined = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedReleaseData.additionalProperties = additionalProperties;

            return deserializedReleaseData;
        });
    }
}
