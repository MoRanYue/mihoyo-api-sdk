package uigf.mihoyo.uncategorized;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.models.binarydata.BinaryData;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The ExperimentListRequest model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class ExperimentListRequest implements JsonSerializable<ExperimentListRequest> {
    /*
     * The app_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final BinaryData appId;

    /*
     * The app_sign property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String appSign;

    /*
     * The experiment_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String experimentId;

    /*
     * The params property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final List<ExperimentParameter> params;

    /*
     * The scene_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String sceneId;

    /*
     * The uid property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String uid;

    /**
     * Creates an instance of ExperimentListRequest class.
     * 
     * @param appId the appId value to set.
     * @param appSign the appSign value to set.
     * @param params the params value to set.
     * @param uid the uid value to set.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public ExperimentListRequest(BinaryData appId, String appSign, List<ExperimentParameter> params, String uid) {
        this.appId = appId;
        this.appSign = appSign;
        this.params = params;
        this.uid = uid;
    }

    /**
     * Get the appId property: The app_id property.
     * 
     * @return the appId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getAppId() {
        return this.appId;
    }

    /**
     * Get the appSign property: The app_sign property.
     * 
     * @return the appSign value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAppSign() {
        return this.appSign;
    }

    /**
     * Get the experimentId property: The experiment_id property.
     * 
     * @return the experimentId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getExperimentId() {
        return this.experimentId;
    }

    /**
     * Set the experimentId property: The experiment_id property.
     * 
     * @param experimentId the experimentId value to set.
     * @return the ExperimentListRequest object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public ExperimentListRequest setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }

    /**
     * Get the params property: The params property.
     * 
     * @return the params value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<ExperimentParameter> getParams() {
        return this.params;
    }

    /**
     * Get the sceneId property: The scene_id property.
     * 
     * @return the sceneId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * Set the sceneId property: The scene_id property.
     * 
     * @param sceneId the sceneId value to set.
     * @return the ExperimentListRequest object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public ExperimentListRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
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
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeFieldName("app_id");
        this.appId.writeTo(jsonWriter);
        jsonWriter.writeStringField("app_sign", this.appSign);
        jsonWriter.writeArrayField("params", this.params, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("uid", this.uid);
        jsonWriter.writeStringField("experiment_id", this.experimentId);
        jsonWriter.writeStringField("scene_id", this.sceneId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExperimentListRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExperimentListRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExperimentListRequest.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static ExperimentListRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BinaryData appId = null;
            String appSign = null;
            List<ExperimentParameter> params = null;
            String uid = null;
            String experimentId = null;
            String sceneId = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("app_id".equals(fieldName)) {
                    appId = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("app_sign".equals(fieldName)) {
                    appSign = reader.getString();
                } else if ("params".equals(fieldName)) {
                    params = reader.readArray(reader1 -> ExperimentParameter.fromJson(reader1));
                } else if ("uid".equals(fieldName)) {
                    uid = reader.getString();
                } else if ("experiment_id".equals(fieldName)) {
                    experimentId = reader.getString();
                } else if ("scene_id".equals(fieldName)) {
                    sceneId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            ExperimentListRequest deserializedExperimentListRequest
                = new ExperimentListRequest(appId, appSign, params, uid);
            deserializedExperimentListRequest.experimentId = experimentId;
            deserializedExperimentListRequest.sceneId = sceneId;

            return deserializedExperimentListRequest;
        });
    }
}
