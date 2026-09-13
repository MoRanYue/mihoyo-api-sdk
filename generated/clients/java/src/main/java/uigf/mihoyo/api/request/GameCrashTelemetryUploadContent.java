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
 * The GameCrashTelemetryUploadContent model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class GameCrashTelemetryUploadContent implements JsonSerializable<GameCrashTelemetryUploadContent> {
    /*
     * The auid property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String auid;

    /*
     * The clientIp property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String clientIp;

    /*
     * The cpuInfo property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String cpuInfo;

    /*
     * The deviceModel property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String deviceModel;

    /*
     * The deviceName property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String deviceName;

    /*
     * The error_code property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer errorCodeNumeric;

    /*
     * The errorCategory property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String errorCategory;

    /*
     * The errorCode property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String errorCode;

    /*
     * The errorLevel property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String errorLevel;

    /*
     * The exceptionSerialNum property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long exceptionSerialNum;

    /*
     * The frame property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String frame;

    /*
     * The gpuInfo property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String gpuInfo;

    /*
     * The graphicsLevel property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String graphicsLevel;

    /*
     * The graphicsVersion property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String graphicsVersion;

    /*
     * The guid property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String guid;

    /*
     * The isRelease property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isRelease;

    /*
     * The logType property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String logType;

    /*
     * The memoryInfo property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String memoryInfo;

    /*
     * The message property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String message;

    /*
     * The notifyUser property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String notifyUser;

    /*
     * The operatingSystem property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String operatingSystem;

    /*
     * The projectNick property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String projectNick;

    /*
     * The serverName property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String serverName;

    /*
     * The stackTrace property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String stackTrace;

    /*
     * The subErrorCode property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String subErrorCode;

    /*
     * The time property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long time;

    /*
     * The user_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long userId;

    /*
     * The userName property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String userName;

    /*
     * The userNick property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String userNick;

    /*
     * The version property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String version;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GameCrashTelemetryUploadContent class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent() {
    }

    /**
     * Get the auid property: The auid property.
     * 
     * @return the auid value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAuid() {
        return this.auid;
    }

    /**
     * Set the auid property: The auid property.
     * 
     * @param auid the auid value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setAuid(String auid) {
        this.auid = auid;
        return this;
    }

    /**
     * Get the clientIp property: The clientIp property.
     * 
     * @return the clientIp value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * Set the clientIp property: The clientIp property.
     * 
     * @param clientIp the clientIp value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * Get the cpuInfo property: The cpuInfo property.
     * 
     * @return the cpuInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getCpuInfo() {
        return this.cpuInfo;
    }

    /**
     * Set the cpuInfo property: The cpuInfo property.
     * 
     * @param cpuInfo the cpuInfo value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setCpuInfo(String cpuInfo) {
        this.cpuInfo = cpuInfo;
        return this;
    }

    /**
     * Get the deviceModel property: The deviceModel property.
     * 
     * @return the deviceModel value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDeviceModel() {
        return this.deviceModel;
    }

    /**
     * Set the deviceModel property: The deviceModel property.
     * 
     * @param deviceModel the deviceModel value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }

    /**
     * Get the deviceName property: The deviceName property.
     * 
     * @return the deviceName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * Set the deviceName property: The deviceName property.
     * 
     * @param deviceName the deviceName value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * Get the errorCodeNumeric property: The error_code property.
     * 
     * @return the errorCodeNumeric value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getErrorCodeNumeric() {
        return this.errorCodeNumeric;
    }

    /**
     * Set the errorCodeNumeric property: The error_code property.
     * 
     * @param errorCodeNumeric the errorCodeNumeric value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setErrorCodeNumeric(Integer errorCodeNumeric) {
        this.errorCodeNumeric = errorCodeNumeric;
        return this;
    }

    /**
     * Get the errorCategory property: The errorCategory property.
     * 
     * @return the errorCategory value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getErrorCategory() {
        return this.errorCategory;
    }

    /**
     * Set the errorCategory property: The errorCategory property.
     * 
     * @param errorCategory the errorCategory value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setErrorCategory(String errorCategory) {
        this.errorCategory = errorCategory;
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     * 
     * @return the errorCode value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     * 
     * @param errorCode the errorCode value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the errorLevel property: The errorLevel property.
     * 
     * @return the errorLevel value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getErrorLevel() {
        return this.errorLevel;
    }

    /**
     * Set the errorLevel property: The errorLevel property.
     * 
     * @param errorLevel the errorLevel value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setErrorLevel(String errorLevel) {
        this.errorLevel = errorLevel;
        return this;
    }

    /**
     * Get the exceptionSerialNum property: The exceptionSerialNum property.
     * 
     * @return the exceptionSerialNum value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getExceptionSerialNum() {
        return this.exceptionSerialNum;
    }

    /**
     * Set the exceptionSerialNum property: The exceptionSerialNum property.
     * 
     * @param exceptionSerialNum the exceptionSerialNum value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setExceptionSerialNum(Long exceptionSerialNum) {
        this.exceptionSerialNum = exceptionSerialNum;
        return this;
    }

    /**
     * Get the frame property: The frame property.
     * 
     * @return the frame value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getFrame() {
        return this.frame;
    }

    /**
     * Set the frame property: The frame property.
     * 
     * @param frame the frame value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setFrame(String frame) {
        this.frame = frame;
        return this;
    }

    /**
     * Get the gpuInfo property: The gpuInfo property.
     * 
     * @return the gpuInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getGpuInfo() {
        return this.gpuInfo;
    }

    /**
     * Set the gpuInfo property: The gpuInfo property.
     * 
     * @param gpuInfo the gpuInfo value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setGpuInfo(String gpuInfo) {
        this.gpuInfo = gpuInfo;
        return this;
    }

    /**
     * Get the graphicsLevel property: The graphicsLevel property.
     * 
     * @return the graphicsLevel value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getGraphicsLevel() {
        return this.graphicsLevel;
    }

    /**
     * Set the graphicsLevel property: The graphicsLevel property.
     * 
     * @param graphicsLevel the graphicsLevel value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setGraphicsLevel(String graphicsLevel) {
        this.graphicsLevel = graphicsLevel;
        return this;
    }

    /**
     * Get the graphicsVersion property: The graphicsVersion property.
     * 
     * @return the graphicsVersion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getGraphicsVersion() {
        return this.graphicsVersion;
    }

    /**
     * Set the graphicsVersion property: The graphicsVersion property.
     * 
     * @param graphicsVersion the graphicsVersion value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setGraphicsVersion(String graphicsVersion) {
        this.graphicsVersion = graphicsVersion;
        return this;
    }

    /**
     * Get the guid property: The guid property.
     * 
     * @return the guid value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getGuid() {
        return this.guid;
    }

    /**
     * Set the guid property: The guid property.
     * 
     * @param guid the guid value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * Get the isRelease property: The isRelease property.
     * 
     * @return the isRelease value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isRelease() {
        return this.isRelease;
    }

    /**
     * Set the isRelease property: The isRelease property.
     * 
     * @param isRelease the isRelease value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setIsRelease(Boolean isRelease) {
        this.isRelease = isRelease;
        return this;
    }

    /**
     * Get the logType property: The logType property.
     * 
     * @return the logType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLogType() {
        return this.logType;
    }

    /**
     * Set the logType property: The logType property.
     * 
     * @param logType the logType value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setLogType(String logType) {
        this.logType = logType;
        return this;
    }

    /**
     * Get the memoryInfo property: The memoryInfo property.
     * 
     * @return the memoryInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getMemoryInfo() {
        return this.memoryInfo;
    }

    /**
     * Set the memoryInfo property: The memoryInfo property.
     * 
     * @param memoryInfo the memoryInfo value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setMemoryInfo(String memoryInfo) {
        this.memoryInfo = memoryInfo;
        return this;
    }

    /**
     * Get the message property: The message property.
     * 
     * @return the message value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: The message property.
     * 
     * @param message the message value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the notifyUser property: The notifyUser property.
     * 
     * @return the notifyUser value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getNotifyUser() {
        return this.notifyUser;
    }

    /**
     * Set the notifyUser property: The notifyUser property.
     * 
     * @param notifyUser the notifyUser value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setNotifyUser(String notifyUser) {
        this.notifyUser = notifyUser;
        return this;
    }

    /**
     * Get the operatingSystem property: The operatingSystem property.
     * 
     * @return the operatingSystem value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * Set the operatingSystem property: The operatingSystem property.
     * 
     * @param operatingSystem the operatingSystem value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * Get the projectNick property: The projectNick property.
     * 
     * @return the projectNick value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getProjectNick() {
        return this.projectNick;
    }

    /**
     * Set the projectNick property: The projectNick property.
     * 
     * @param projectNick the projectNick value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setProjectNick(String projectNick) {
        this.projectNick = projectNick;
        return this;
    }

    /**
     * Get the serverName property: The serverName property.
     * 
     * @return the serverName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getServerName() {
        return this.serverName;
    }

    /**
     * Set the serverName property: The serverName property.
     * 
     * @param serverName the serverName value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Get the stackTrace property: The stackTrace property.
     * 
     * @return the stackTrace value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getStackTrace() {
        return this.stackTrace;
    }

    /**
     * Set the stackTrace property: The stackTrace property.
     * 
     * @param stackTrace the stackTrace value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
        return this;
    }

    /**
     * Get the subErrorCode property: The subErrorCode property.
     * 
     * @return the subErrorCode value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSubErrorCode() {
        return this.subErrorCode;
    }

    /**
     * Set the subErrorCode property: The subErrorCode property.
     * 
     * @param subErrorCode the subErrorCode value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setSubErrorCode(String subErrorCode) {
        this.subErrorCode = subErrorCode;
        return this;
    }

    /**
     * Get the time property: The time property.
     * 
     * @return the time value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getTime() {
        return this.time;
    }

    /**
     * Set the time property: The time property.
     * 
     * @param time the time value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * Get the userId property: The user_id property.
     * 
     * @return the userId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getUserId() {
        return this.userId;
    }

    /**
     * Set the userId property: The user_id property.
     * 
     * @param userId the userId value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get the userName property: The userName property.
     * 
     * @return the userName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getUserName() {
        return this.userName;
    }

    /**
     * Set the userName property: The userName property.
     * 
     * @param userName the userName value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the userNick property: The userNick property.
     * 
     * @return the userNick value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getUserNick() {
        return this.userNick;
    }

    /**
     * Set the userNick property: The userNick property.
     * 
     * @param userNick the userNick value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }

    /**
     * Get the version property: The version property.
     * 
     * @return the version value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version property.
     * 
     * @param version the version value to set.
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setVersion(String version) {
        this.version = version;
        return this;
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
     * @return the GameCrashTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("auid", this.auid);
        jsonWriter.writeStringField("clientIp", this.clientIp);
        jsonWriter.writeStringField("cpuInfo", this.cpuInfo);
        jsonWriter.writeStringField("deviceModel", this.deviceModel);
        jsonWriter.writeStringField("deviceName", this.deviceName);
        jsonWriter.writeNumberField("error_code", this.errorCodeNumeric);
        jsonWriter.writeStringField("errorCategory", this.errorCategory);
        jsonWriter.writeStringField("errorCode", this.errorCode);
        jsonWriter.writeStringField("errorLevel", this.errorLevel);
        jsonWriter.writeNumberField("exceptionSerialNum", this.exceptionSerialNum);
        jsonWriter.writeStringField("frame", this.frame);
        jsonWriter.writeStringField("gpuInfo", this.gpuInfo);
        jsonWriter.writeStringField("graphicsLevel", this.graphicsLevel);
        jsonWriter.writeStringField("graphicsVersion", this.graphicsVersion);
        jsonWriter.writeStringField("guid", this.guid);
        jsonWriter.writeBooleanField("isRelease", this.isRelease);
        jsonWriter.writeStringField("logType", this.logType);
        jsonWriter.writeStringField("memoryInfo", this.memoryInfo);
        jsonWriter.writeStringField("message", this.message);
        jsonWriter.writeStringField("notifyUser", this.notifyUser);
        jsonWriter.writeStringField("operatingSystem", this.operatingSystem);
        jsonWriter.writeStringField("projectNick", this.projectNick);
        jsonWriter.writeStringField("serverName", this.serverName);
        jsonWriter.writeStringField("stackTrace", this.stackTrace);
        jsonWriter.writeStringField("subErrorCode", this.subErrorCode);
        jsonWriter.writeNumberField("time", this.time);
        jsonWriter.writeNumberField("user_id", this.userId);
        jsonWriter.writeStringField("userName", this.userName);
        jsonWriter.writeStringField("userNick", this.userNick);
        jsonWriter.writeStringField("version", this.version);
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
     * Reads an instance of GameCrashTelemetryUploadContent from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GameCrashTelemetryUploadContent if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GameCrashTelemetryUploadContent.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GameCrashTelemetryUploadContent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GameCrashTelemetryUploadContent deserializedGameCrashTelemetryUploadContent
                = new GameCrashTelemetryUploadContent();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("auid".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.auid = reader.getString();
                } else if ("clientIp".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.clientIp = reader.getString();
                } else if ("cpuInfo".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.cpuInfo = reader.getString();
                } else if ("deviceModel".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.deviceModel = reader.getString();
                } else if ("deviceName".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.deviceName = reader.getString();
                } else if ("error_code".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.errorCodeNumeric
                        = reader.getNullable(JsonReader::getInt);
                } else if ("errorCategory".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.errorCategory = reader.getString();
                } else if ("errorCode".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.errorCode = reader.getString();
                } else if ("errorLevel".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.errorLevel = reader.getString();
                } else if ("exceptionSerialNum".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.exceptionSerialNum
                        = reader.getNullable(JsonReader::getLong);
                } else if ("frame".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.frame = reader.getString();
                } else if ("gpuInfo".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.gpuInfo = reader.getString();
                } else if ("graphicsLevel".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.graphicsLevel = reader.getString();
                } else if ("graphicsVersion".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.graphicsVersion = reader.getString();
                } else if ("guid".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.guid = reader.getString();
                } else if ("isRelease".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.isRelease = reader.getNullable(JsonReader::getBoolean);
                } else if ("logType".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.logType = reader.getString();
                } else if ("memoryInfo".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.memoryInfo = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.message = reader.getString();
                } else if ("notifyUser".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.notifyUser = reader.getString();
                } else if ("operatingSystem".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.operatingSystem = reader.getString();
                } else if ("projectNick".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.projectNick = reader.getString();
                } else if ("serverName".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.serverName = reader.getString();
                } else if ("stackTrace".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.stackTrace = reader.getString();
                } else if ("subErrorCode".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.subErrorCode = reader.getString();
                } else if ("time".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.time = reader.getNullable(JsonReader::getLong);
                } else if ("user_id".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.userId = reader.getNullable(JsonReader::getLong);
                } else if ("userName".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.userName = reader.getString();
                } else if ("userNick".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.userNick = reader.getString();
                } else if ("version".equals(fieldName)) {
                    deserializedGameCrashTelemetryUploadContent.version = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGameCrashTelemetryUploadContent.additionalProperties = additionalProperties;

            return deserializedGameCrashTelemetryUploadContent;
        });
    }
}
