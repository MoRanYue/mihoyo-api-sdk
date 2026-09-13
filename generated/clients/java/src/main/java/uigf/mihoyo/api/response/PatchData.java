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
 * The PatchData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class PatchData implements JsonSerializable<PatchData> {
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
     * The file_name property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String fileName;

    /*
     * The file_url property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String fileUrl;

    /*
     * The im_page_ids property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> imPageIds;

    /*
     * The md5 property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String md5;

    /*
     * The patch_action property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer patchAction;

    /*
     * The patch_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long patchId;

    /*
     * The patch_strategy_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long patchStrategyId;

    /*
     * The patch_version property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String patchVersion;

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
     * Creates an instance of PatchData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private PatchData() {
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
     * Get the fileName property: The file_name property.
     * 
     * @return the fileName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getFileName() {
        return this.fileName;
    }

    /**
     * Get the fileUrl property: The file_url property.
     * 
     * @return the fileUrl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * Get the imPageIds property: The im_page_ids property.
     * 
     * @return the imPageIds value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getImPageIds() {
        return this.imPageIds;
    }

    /**
     * Get the md5 property: The md5 property.
     * 
     * @return the md5 value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getMd5() {
        return this.md5;
    }

    /**
     * Get the patchAction property: The patch_action property.
     * 
     * @return the patchAction value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getPatchAction() {
        return this.patchAction;
    }

    /**
     * Get the patchId property: The patch_id property.
     * 
     * @return the patchId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getPatchId() {
        return this.patchId;
    }

    /**
     * Get the patchStrategyId property: The patch_strategy_id property.
     * 
     * @return the patchStrategyId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getPatchStrategyId() {
        return this.patchStrategyId;
    }

    /**
     * Get the patchVersion property: The patch_version property.
     * 
     * @return the patchVersion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getPatchVersion() {
        return this.patchVersion;
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
        jsonWriter.writeStringField("dialog_content", this.dialogContent);
        jsonWriter.writeStringField("dialog_content_en", this.dialogContentEn);
        jsonWriter.writeNumberField("dialog_num", this.dialogNum);
        jsonWriter.writeNumberField("dialog_period", this.dialogPeriod);
        jsonWriter.writeNumberField("dialog_period_type", this.dialogPeriodType);
        jsonWriter.writeStringField("dialog_title", this.dialogTitle);
        jsonWriter.writeStringField("file_name", this.fileName);
        jsonWriter.writeStringField("file_url", this.fileUrl);
        jsonWriter.writeArrayField("im_page_ids", this.imPageIds, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeStringField("md5", this.md5);
        jsonWriter.writeNumberField("patch_action", this.patchAction);
        jsonWriter.writeNumberField("patch_id", this.patchId);
        jsonWriter.writeNumberField("patch_strategy_id", this.patchStrategyId);
        jsonWriter.writeStringField("patch_version", this.patchVersion);
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
     * Reads an instance of PatchData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PatchData if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the PatchData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static PatchData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PatchData deserializedPatchData = new PatchData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dialog_content".equals(fieldName)) {
                    deserializedPatchData.dialogContent = reader.getString();
                } else if ("dialog_content_en".equals(fieldName)) {
                    deserializedPatchData.dialogContentEn = reader.getString();
                } else if ("dialog_num".equals(fieldName)) {
                    deserializedPatchData.dialogNum = reader.getNullable(JsonReader::getInt);
                } else if ("dialog_period".equals(fieldName)) {
                    deserializedPatchData.dialogPeriod = reader.getNullable(JsonReader::getInt);
                } else if ("dialog_period_type".equals(fieldName)) {
                    deserializedPatchData.dialogPeriodType = reader.getNullable(JsonReader::getInt);
                } else if ("dialog_title".equals(fieldName)) {
                    deserializedPatchData.dialogTitle = reader.getString();
                } else if ("file_name".equals(fieldName)) {
                    deserializedPatchData.fileName = reader.getString();
                } else if ("file_url".equals(fieldName)) {
                    deserializedPatchData.fileUrl = reader.getString();
                } else if ("im_page_ids".equals(fieldName)) {
                    List<BinaryData> imPageIds = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedPatchData.imPageIds = imPageIds;
                } else if ("md5".equals(fieldName)) {
                    deserializedPatchData.md5 = reader.getString();
                } else if ("patch_action".equals(fieldName)) {
                    deserializedPatchData.patchAction = reader.getNullable(JsonReader::getInt);
                } else if ("patch_id".equals(fieldName)) {
                    deserializedPatchData.patchId = reader.getNullable(JsonReader::getLong);
                } else if ("patch_strategy_id".equals(fieldName)) {
                    deserializedPatchData.patchStrategyId = reader.getNullable(JsonReader::getLong);
                } else if ("patch_version".equals(fieldName)) {
                    deserializedPatchData.patchVersion = reader.getString();
                } else if ("update_recommended_intensity".equals(fieldName)) {
                    deserializedPatchData.updateRecommendedIntensity = reader.getString();
                } else if ("update_type".equals(fieldName)) {
                    deserializedPatchData.updateType = reader.getNullable(JsonReader::getInt);
                } else if ("user_defined".equals(fieldName)) {
                    deserializedPatchData.userDefined = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedPatchData.additionalProperties = additionalProperties;

            return deserializedPatchData;
        });
    }
}
