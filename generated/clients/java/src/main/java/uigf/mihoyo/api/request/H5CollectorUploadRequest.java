package uigf.mihoyo.api.request;

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
 * The H5CollectorUploadRequest model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class H5CollectorUploadRequest implements JsonSerializable<H5CollectorUploadRequest> {
    /*
     * The analysis_version property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String analysisVersion;

    /*
     * The data_belong property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String dataBelong;

    /*
     * The event_info property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final H5CollectorEventInfo eventInfo;

    /*
     * The mia_session_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String miaSessionId;

    /*
     * The mia_session_step property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String miaSessionStep;

    /*
     * The page_info property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final H5CollectorPageInfo pageInfo;

    /*
     * The type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String type;

    /*
     * The user_info property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final H5CollectorUserInfo userInfo;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of H5CollectorUploadRequest class.
     * 
     * @param analysisVersion the analysisVersion value to set.
     * @param dataBelong the dataBelong value to set.
     * @param eventInfo the eventInfo value to set.
     * @param miaSessionId the miaSessionId value to set.
     * @param miaSessionStep the miaSessionStep value to set.
     * @param pageInfo the pageInfo value to set.
     * @param type the type value to set.
     * @param userInfo the userInfo value to set.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorUploadRequest(String analysisVersion, String dataBelong, H5CollectorEventInfo eventInfo,
        String miaSessionId, String miaSessionStep, H5CollectorPageInfo pageInfo, String type,
        H5CollectorUserInfo userInfo) {
        this.analysisVersion = analysisVersion;
        this.dataBelong = dataBelong;
        this.eventInfo = eventInfo;
        this.miaSessionId = miaSessionId;
        this.miaSessionStep = miaSessionStep;
        this.pageInfo = pageInfo;
        this.type = type;
        this.userInfo = userInfo;
    }

    /**
     * Get the analysisVersion property: The analysis_version property.
     * 
     * @return the analysisVersion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAnalysisVersion() {
        return this.analysisVersion;
    }

    /**
     * Get the dataBelong property: The data_belong property.
     * 
     * @return the dataBelong value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDataBelong() {
        return this.dataBelong;
    }

    /**
     * Get the eventInfo property: The event_info property.
     * 
     * @return the eventInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorEventInfo getEventInfo() {
        return this.eventInfo;
    }

    /**
     * Get the miaSessionId property: The mia_session_id property.
     * 
     * @return the miaSessionId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getMiaSessionId() {
        return this.miaSessionId;
    }

    /**
     * Get the miaSessionStep property: The mia_session_step property.
     * 
     * @return the miaSessionStep value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getMiaSessionStep() {
        return this.miaSessionStep;
    }

    /**
     * Get the pageInfo property: The page_info property.
     * 
     * @return the pageInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getType() {
        return this.type;
    }

    /**
     * Get the userInfo property: The user_info property.
     * 
     * @return the userInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorUserInfo getUserInfo() {
        return this.userInfo;
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
     * Set the additionalProperties property: Additional properties.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the H5CollectorUploadRequest object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorUploadRequest setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("analysis_version", this.analysisVersion);
        jsonWriter.writeStringField("data_belong", this.dataBelong);
        jsonWriter.writeJsonField("event_info", this.eventInfo);
        jsonWriter.writeStringField("mia_session_id", this.miaSessionId);
        jsonWriter.writeStringField("mia_session_step", this.miaSessionStep);
        jsonWriter.writeJsonField("page_info", this.pageInfo);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("user_info", this.userInfo);
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
     * Reads an instance of H5CollectorUploadRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of H5CollectorUploadRequest if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the H5CollectorUploadRequest.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static H5CollectorUploadRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String analysisVersion = null;
            String dataBelong = null;
            H5CollectorEventInfo eventInfo = null;
            String miaSessionId = null;
            String miaSessionStep = null;
            H5CollectorPageInfo pageInfo = null;
            String type = null;
            H5CollectorUserInfo userInfo = null;
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("analysis_version".equals(fieldName)) {
                    analysisVersion = reader.getString();
                } else if ("data_belong".equals(fieldName)) {
                    dataBelong = reader.getString();
                } else if ("event_info".equals(fieldName)) {
                    eventInfo = H5CollectorEventInfo.fromJson(reader);
                } else if ("mia_session_id".equals(fieldName)) {
                    miaSessionId = reader.getString();
                } else if ("mia_session_step".equals(fieldName)) {
                    miaSessionStep = reader.getString();
                } else if ("page_info".equals(fieldName)) {
                    pageInfo = H5CollectorPageInfo.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else if ("user_info".equals(fieldName)) {
                    userInfo = H5CollectorUserInfo.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            H5CollectorUploadRequest deserializedH5CollectorUploadRequest = new H5CollectorUploadRequest(
                analysisVersion, dataBelong, eventInfo, miaSessionId, miaSessionStep, pageInfo, type, userInfo);
            deserializedH5CollectorUploadRequest.additionalProperties = additionalProperties;

            return deserializedH5CollectorUploadRequest;
        });
    }
}
