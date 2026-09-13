package uigf.mihoyo.passport;

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
 * The ReactivateInfo model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class ReactivateInfo implements JsonSerializable<ReactivateInfo> {
    /*
     * The delete_after_days property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String deleteAfterDays;

    /*
     * The deleting_biz_account property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean deletingBizAccount;

    /*
     * The reactivate_biz property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String reactivateBiz;

    /*
     * The required property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean required;

    /*
     * The ticket property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String ticket;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of ReactivateInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private ReactivateInfo() {
    }

    /**
     * Get the deleteAfterDays property: The delete_after_days property.
     * 
     * @return the deleteAfterDays value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDeleteAfterDays() {
        return this.deleteAfterDays;
    }

    /**
     * Get the deletingBizAccount property: The deleting_biz_account property.
     * 
     * @return the deletingBizAccount value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isDeletingBizAccount() {
        return this.deletingBizAccount;
    }

    /**
     * Get the reactivateBiz property: The reactivate_biz property.
     * 
     * @return the reactivateBiz value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getReactivateBiz() {
        return this.reactivateBiz;
    }

    /**
     * Get the required property: The required property.
     * 
     * @return the required value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isRequired() {
        return this.required;
    }

    /**
     * Get the ticket property: The ticket property.
     * 
     * @return the ticket value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getTicket() {
        return this.ticket;
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
        jsonWriter.writeStringField("delete_after_days", this.deleteAfterDays);
        jsonWriter.writeBooleanField("deleting_biz_account", this.deletingBizAccount);
        jsonWriter.writeStringField("reactivate_biz", this.reactivateBiz);
        jsonWriter.writeBooleanField("required", this.required);
        jsonWriter.writeStringField("ticket", this.ticket);
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
     * Reads an instance of ReactivateInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReactivateInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ReactivateInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static ReactivateInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReactivateInfo deserializedReactivateInfo = new ReactivateInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("delete_after_days".equals(fieldName)) {
                    deserializedReactivateInfo.deleteAfterDays = reader.getString();
                } else if ("deleting_biz_account".equals(fieldName)) {
                    deserializedReactivateInfo.deletingBizAccount = reader.getNullable(JsonReader::getBoolean);
                } else if ("reactivate_biz".equals(fieldName)) {
                    deserializedReactivateInfo.reactivateBiz = reader.getString();
                } else if ("required".equals(fieldName)) {
                    deserializedReactivateInfo.required = reader.getNullable(JsonReader::getBoolean);
                } else if ("ticket".equals(fieldName)) {
                    deserializedReactivateInfo.ticket = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedReactivateInfo.additionalProperties = additionalProperties;

            return deserializedReactivateInfo;
        });
    }
}
