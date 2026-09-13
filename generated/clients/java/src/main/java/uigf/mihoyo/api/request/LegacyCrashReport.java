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
 * The LegacyCrashReport model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class LegacyCrashReport implements JsonSerializable<LegacyCrashReport> {
    /*
     * The auid property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String auid;

    /*
     * The backBuffer property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String backBuffer;

    /*
     * The buildUrl property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String buildUrl;

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
     * The errorCodeToPlatform property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer errorCodeToPlatform;

    /*
     * The errorLevel property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String errorLevel;

    /*
     * The exceptionSerialNum property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String exceptionSerialNum;

    /*
     * The frame property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String frame;

    /*
     * The gBuffer property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String gBuffer;

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
     * The is2g property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean is2g;

    /*
     * The loginTime property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long loginTime;

    /*
     * The logStr property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String logStr;

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
     * The needShowErrDlg property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean needShowErrDlg;

    /*
     * The notifyUserName property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String notifyUserName;

    /*
     * The operatingSystem property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String operatingSystem;

    /*
     * The platformType property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer platformType;

    /*
     * The pos property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String pos;

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
    private Integer subErrorCode;

    /*
     * The time property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String time;

    /*
     * The title property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String title;

    /*
     * The uid property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long uid;

    /*
     * The userName property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String userName;

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
     * Creates an instance of LegacyCrashReport class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport() {
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
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setAuid(String auid) {
        this.auid = auid;
        return this;
    }

    /**
     * Get the backBuffer property: The backBuffer property.
     * 
     * @return the backBuffer value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getBackBuffer() {
        return this.backBuffer;
    }

    /**
     * Set the backBuffer property: The backBuffer property.
     * 
     * @param backBuffer the backBuffer value to set.
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setBackBuffer(String backBuffer) {
        this.backBuffer = backBuffer;
        return this;
    }

    /**
     * Get the buildUrl property: The buildUrl property.
     * 
     * @return the buildUrl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getBuildUrl() {
        return this.buildUrl;
    }

    /**
     * Set the buildUrl property: The buildUrl property.
     * 
     * @param buildUrl the buildUrl value to set.
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setBuildUrl(String buildUrl) {
        this.buildUrl = buildUrl;
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
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setClientIp(String clientIp) {
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
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setCpuInfo(String cpuInfo) {
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
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setDeviceModel(String deviceModel) {
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
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setDeviceName(String deviceName) {
        this.deviceName = deviceName;
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
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setErrorCategory(String errorCategory) {
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
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the errorCodeToPlatform property: The errorCodeToPlatform property.
     * 
     * @return the errorCodeToPlatform value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getErrorCodeToPlatform() {
        return this.errorCodeToPlatform;
    }

    /**
     * Set the errorCodeToPlatform property: The errorCodeToPlatform property.
     * 
     * @param errorCodeToPlatform the errorCodeToPlatform value to set.
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setErrorCodeToPlatform(Integer errorCodeToPlatform) {
        this.errorCodeToPlatform = errorCodeToPlatform;
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
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setErrorLevel(String errorLevel) {
        this.errorLevel = errorLevel;
        return this;
    }

    /**
     * Get the exceptionSerialNum property: The exceptionSerialNum property.
     * 
     * @return the exceptionSerialNum value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getExceptionSerialNum() {
        return this.exceptionSerialNum;
    }

    /**
     * Set the exceptionSerialNum property: The exceptionSerialNum property.
     * 
     * @param exceptionSerialNum the exceptionSerialNum value to set.
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setExceptionSerialNum(String exceptionSerialNum) {
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
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setFrame(String frame) {
        this.frame = frame;
        return this;
    }

    /**
     * Get the gBuffer property: The gBuffer property.
     * 
     * @return the gBuffer value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getGBuffer() {
        return this.gBuffer;
    }

    /**
     * Set the gBuffer property: The gBuffer property.
     * 
     * @param gBuffer the gBuffer value to set.
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setGBuffer(String gBuffer) {
        this.gBuffer = gBuffer;
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
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setGpuInfo(String gpuInfo) {
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
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setGraphicsLevel(String graphicsLevel) {
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
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setGraphicsVersion(String graphicsVersion) {
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
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * Get the is2g property: The is2g property.
     * 
     * @return the is2g value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean is2g() {
        return this.is2g;
    }

    /**
     * Set the is2g property: The is2g property.
     * 
     * @param is2g the is2g value to set.
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setIs2g(Boolean is2g) {
        this.is2g = is2g;
        return this;
    }

    /**
     * Get the loginTime property: The loginTime property.
     * 
     * @return the loginTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getLoginTime() {
        return this.loginTime;
    }

    /**
     * Set the loginTime property: The loginTime property.
     * 
     * @param loginTime the loginTime value to set.
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setLoginTime(Long loginTime) {
        this.loginTime = loginTime;
        return this;
    }

    /**
     * Get the logStr property: The logStr property.
     * 
     * @return the logStr value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLogStr() {
        return this.logStr;
    }

    /**
     * Set the logStr property: The logStr property.
     * 
     * @param logStr the logStr value to set.
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setLogStr(String logStr) {
        this.logStr = logStr;
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
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setLogType(String logType) {
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
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setMemoryInfo(String memoryInfo) {
        this.memoryInfo = memoryInfo;
        return this;
    }

    /**
     * Get the needShowErrDlg property: The needShowErrDlg property.
     * 
     * @return the needShowErrDlg value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isNeedShowErrDlg() {
        return this.needShowErrDlg;
    }

    /**
     * Set the needShowErrDlg property: The needShowErrDlg property.
     * 
     * @param needShowErrDlg the needShowErrDlg value to set.
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setNeedShowErrDlg(Boolean needShowErrDlg) {
        this.needShowErrDlg = needShowErrDlg;
        return this;
    }

    /**
     * Get the notifyUserName property: The notifyUserName property.
     * 
     * @return the notifyUserName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getNotifyUserName() {
        return this.notifyUserName;
    }

    /**
     * Set the notifyUserName property: The notifyUserName property.
     * 
     * @param notifyUserName the notifyUserName value to set.
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setNotifyUserName(String notifyUserName) {
        this.notifyUserName = notifyUserName;
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
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * Get the platformType property: The platformType property.
     * 
     * @return the platformType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getPlatformType() {
        return this.platformType;
    }

    /**
     * Set the platformType property: The platformType property.
     * 
     * @param platformType the platformType value to set.
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setPlatformType(Integer platformType) {
        this.platformType = platformType;
        return this;
    }

    /**
     * Get the pos property: The pos property.
     * 
     * @return the pos value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getPos() {
        return this.pos;
    }

    /**
     * Set the pos property: The pos property.
     * 
     * @param pos the pos value to set.
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setPos(String pos) {
        this.pos = pos;
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
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setServerName(String serverName) {
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
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
        return this;
    }

    /**
     * Get the subErrorCode property: The subErrorCode property.
     * 
     * @return the subErrorCode value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getSubErrorCode() {
        return this.subErrorCode;
    }

    /**
     * Set the subErrorCode property: The subErrorCode property.
     * 
     * @param subErrorCode the subErrorCode value to set.
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setSubErrorCode(Integer subErrorCode) {
        this.subErrorCode = subErrorCode;
        return this;
    }

    /**
     * Get the time property: The time property.
     * 
     * @return the time value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getTime() {
        return this.time;
    }

    /**
     * Set the time property: The time property.
     * 
     * @param time the time value to set.
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * Get the title property: The title property.
     * 
     * @return the title value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getTitle() {
        return this.title;
    }

    /**
     * Set the title property: The title property.
     * 
     * @param title the title value to set.
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the uid property: The uid property.
     * 
     * @return the uid value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getUid() {
        return this.uid;
    }

    /**
     * Set the uid property: The uid property.
     * 
     * @param uid the uid value to set.
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setUid(Long uid) {
        this.uid = uid;
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
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setUserName(String userName) {
        this.userName = userName;
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
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setVersion(String version) {
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
     * @return the LegacyCrashReport object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LegacyCrashReport setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("backBuffer", this.backBuffer);
        jsonWriter.writeStringField("buildUrl", this.buildUrl);
        jsonWriter.writeStringField("clientIp", this.clientIp);
        jsonWriter.writeStringField("cpuInfo", this.cpuInfo);
        jsonWriter.writeStringField("deviceModel", this.deviceModel);
        jsonWriter.writeStringField("deviceName", this.deviceName);
        jsonWriter.writeStringField("errorCategory", this.errorCategory);
        jsonWriter.writeStringField("errorCode", this.errorCode);
        jsonWriter.writeNumberField("errorCodeToPlatform", this.errorCodeToPlatform);
        jsonWriter.writeStringField("errorLevel", this.errorLevel);
        jsonWriter.writeStringField("exceptionSerialNum", this.exceptionSerialNum);
        jsonWriter.writeStringField("frame", this.frame);
        jsonWriter.writeStringField("gBuffer", this.gBuffer);
        jsonWriter.writeStringField("gpuInfo", this.gpuInfo);
        jsonWriter.writeStringField("graphicsLevel", this.graphicsLevel);
        jsonWriter.writeStringField("graphicsVersion", this.graphicsVersion);
        jsonWriter.writeStringField("guid", this.guid);
        jsonWriter.writeBooleanField("is2g", this.is2g);
        jsonWriter.writeNumberField("loginTime", this.loginTime);
        jsonWriter.writeStringField("logStr", this.logStr);
        jsonWriter.writeStringField("logType", this.logType);
        jsonWriter.writeStringField("memoryInfo", this.memoryInfo);
        jsonWriter.writeBooleanField("needShowErrDlg", this.needShowErrDlg);
        jsonWriter.writeStringField("notifyUserName", this.notifyUserName);
        jsonWriter.writeStringField("operatingSystem", this.operatingSystem);
        jsonWriter.writeNumberField("platformType", this.platformType);
        jsonWriter.writeStringField("pos", this.pos);
        jsonWriter.writeStringField("serverName", this.serverName);
        jsonWriter.writeStringField("stackTrace", this.stackTrace);
        jsonWriter.writeNumberField("subErrorCode", this.subErrorCode);
        jsonWriter.writeStringField("time", this.time);
        jsonWriter.writeStringField("title", this.title);
        jsonWriter.writeNumberField("uid", this.uid);
        jsonWriter.writeStringField("userName", this.userName);
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
     * Reads an instance of LegacyCrashReport from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LegacyCrashReport if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the LegacyCrashReport.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static LegacyCrashReport fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LegacyCrashReport deserializedLegacyCrashReport = new LegacyCrashReport();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("auid".equals(fieldName)) {
                    deserializedLegacyCrashReport.auid = reader.getString();
                } else if ("backBuffer".equals(fieldName)) {
                    deserializedLegacyCrashReport.backBuffer = reader.getString();
                } else if ("buildUrl".equals(fieldName)) {
                    deserializedLegacyCrashReport.buildUrl = reader.getString();
                } else if ("clientIp".equals(fieldName)) {
                    deserializedLegacyCrashReport.clientIp = reader.getString();
                } else if ("cpuInfo".equals(fieldName)) {
                    deserializedLegacyCrashReport.cpuInfo = reader.getString();
                } else if ("deviceModel".equals(fieldName)) {
                    deserializedLegacyCrashReport.deviceModel = reader.getString();
                } else if ("deviceName".equals(fieldName)) {
                    deserializedLegacyCrashReport.deviceName = reader.getString();
                } else if ("errorCategory".equals(fieldName)) {
                    deserializedLegacyCrashReport.errorCategory = reader.getString();
                } else if ("errorCode".equals(fieldName)) {
                    deserializedLegacyCrashReport.errorCode = reader.getString();
                } else if ("errorCodeToPlatform".equals(fieldName)) {
                    deserializedLegacyCrashReport.errorCodeToPlatform = reader.getNullable(JsonReader::getInt);
                } else if ("errorLevel".equals(fieldName)) {
                    deserializedLegacyCrashReport.errorLevel = reader.getString();
                } else if ("exceptionSerialNum".equals(fieldName)) {
                    deserializedLegacyCrashReport.exceptionSerialNum = reader.getString();
                } else if ("frame".equals(fieldName)) {
                    deserializedLegacyCrashReport.frame = reader.getString();
                } else if ("gBuffer".equals(fieldName)) {
                    deserializedLegacyCrashReport.gBuffer = reader.getString();
                } else if ("gpuInfo".equals(fieldName)) {
                    deserializedLegacyCrashReport.gpuInfo = reader.getString();
                } else if ("graphicsLevel".equals(fieldName)) {
                    deserializedLegacyCrashReport.graphicsLevel = reader.getString();
                } else if ("graphicsVersion".equals(fieldName)) {
                    deserializedLegacyCrashReport.graphicsVersion = reader.getString();
                } else if ("guid".equals(fieldName)) {
                    deserializedLegacyCrashReport.guid = reader.getString();
                } else if ("is2g".equals(fieldName)) {
                    deserializedLegacyCrashReport.is2g = reader.getNullable(JsonReader::getBoolean);
                } else if ("loginTime".equals(fieldName)) {
                    deserializedLegacyCrashReport.loginTime = reader.getNullable(JsonReader::getLong);
                } else if ("logStr".equals(fieldName)) {
                    deserializedLegacyCrashReport.logStr = reader.getString();
                } else if ("logType".equals(fieldName)) {
                    deserializedLegacyCrashReport.logType = reader.getString();
                } else if ("memoryInfo".equals(fieldName)) {
                    deserializedLegacyCrashReport.memoryInfo = reader.getString();
                } else if ("needShowErrDlg".equals(fieldName)) {
                    deserializedLegacyCrashReport.needShowErrDlg = reader.getNullable(JsonReader::getBoolean);
                } else if ("notifyUserName".equals(fieldName)) {
                    deserializedLegacyCrashReport.notifyUserName = reader.getString();
                } else if ("operatingSystem".equals(fieldName)) {
                    deserializedLegacyCrashReport.operatingSystem = reader.getString();
                } else if ("platformType".equals(fieldName)) {
                    deserializedLegacyCrashReport.platformType = reader.getNullable(JsonReader::getInt);
                } else if ("pos".equals(fieldName)) {
                    deserializedLegacyCrashReport.pos = reader.getString();
                } else if ("serverName".equals(fieldName)) {
                    deserializedLegacyCrashReport.serverName = reader.getString();
                } else if ("stackTrace".equals(fieldName)) {
                    deserializedLegacyCrashReport.stackTrace = reader.getString();
                } else if ("subErrorCode".equals(fieldName)) {
                    deserializedLegacyCrashReport.subErrorCode = reader.getNullable(JsonReader::getInt);
                } else if ("time".equals(fieldName)) {
                    deserializedLegacyCrashReport.time = reader.getString();
                } else if ("title".equals(fieldName)) {
                    deserializedLegacyCrashReport.title = reader.getString();
                } else if ("uid".equals(fieldName)) {
                    deserializedLegacyCrashReport.uid = reader.getNullable(JsonReader::getLong);
                } else if ("userName".equals(fieldName)) {
                    deserializedLegacyCrashReport.userName = reader.getString();
                } else if ("version".equals(fieldName)) {
                    deserializedLegacyCrashReport.version = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedLegacyCrashReport.additionalProperties = additionalProperties;

            return deserializedLegacyCrashReport;
        });
    }
}
