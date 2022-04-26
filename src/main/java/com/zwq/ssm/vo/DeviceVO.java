package com.zwq.ssm.vo;

import java.util.Date;

public class DeviceVO {
    private Integer deviceId;

    private Byte deviceType;

    private String deviceName;

    private String deviceDesc;

    private Byte deviceStatus;

    private String devicePhone;

    private String deviceVersion;

    private Integer deviceVillageId;

    private Integer deviceUnitId;

    private Integer deviceBuildingId;

    private Integer deviceFloorId;

    private Date deviceCreateTime;

    private Date deviceUpdateTime;

    private Date deviceStartTime;

    private Date deviceDownTime;

    private String villageName;

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Byte getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Byte deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public String getDeviceDesc() {
        return deviceDesc;
    }

    public void setDeviceDesc(String deviceDesc) {
        this.deviceDesc = deviceDesc == null ? null : deviceDesc.trim();
    }

    public Byte getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(Byte deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getDevicePhone() {
        return devicePhone;
    }

    public void setDevicePhone(String devicePhone) {
        this.devicePhone = devicePhone == null ? null : devicePhone.trim();
    }

    public String getDeviceVersion() {
        return deviceVersion;
    }

    public void setDeviceVersion(String deviceVersion) {
        this.deviceVersion = deviceVersion == null ? null : deviceVersion.trim();
    }

    public Integer getDeviceVillageId() {
        return deviceVillageId;
    }

    public void setDeviceVillageId(Integer deviceVillageId) {
        this.deviceVillageId = deviceVillageId;
    }

    public Integer getDeviceUnitId() {
        return deviceUnitId;
    }

    public void setDeviceUnitId(Integer deviceUnitId) {
        this.deviceUnitId = deviceUnitId;
    }

    public Integer getDeviceBuildingId() {
        return deviceBuildingId;
    }

    public void setDeviceBuildingId(Integer deviceBuildingId) {
        this.deviceBuildingId = deviceBuildingId;
    }

    public Integer getDeviceFloorId() {
        return deviceFloorId;
    }

    public void setDeviceFloorId(Integer deviceFloorId) {
        this.deviceFloorId = deviceFloorId;
    }

    public Date getDeviceCreateTime() {
        return deviceCreateTime;
    }

    public void setDeviceCreateTime(Date deviceCreateTime) {
        this.deviceCreateTime = deviceCreateTime;
    }

    public Date getDeviceUpdateTime() {
        return deviceUpdateTime;
    }

    public void setDeviceUpdateTime(Date deviceUpdateTime) {
        this.deviceUpdateTime = deviceUpdateTime;
    }

    public Date getDeviceStartTime() {
        return deviceStartTime;
    }

    public void setDeviceStartTime(Date deviceStartTime) {
        this.deviceStartTime = deviceStartTime;
    }

    public Date getDeviceDownTime() {
        return deviceDownTime;
    }

    public void setDeviceDownTime(Date deviceDownTime) {
        this.deviceDownTime = deviceDownTime;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    @Override
    public String toString() {
        return "DeviceVO{" +
                "deviceId=" + deviceId +
                ", deviceType=" + deviceType +
                ", deviceName='" + deviceName + '\'' +
                ", deviceDesc='" + deviceDesc + '\'' +
                ", deviceStatus=" + deviceStatus +
                ", devicePhone='" + devicePhone + '\'' +
                ", deviceVersion='" + deviceVersion + '\'' +
                ", deviceVillageId=" + deviceVillageId +
                ", deviceUnitId=" + deviceUnitId +
                ", deviceBuildingId=" + deviceBuildingId +
                ", deviceFloorId=" + deviceFloorId +
                ", deviceCreateTime=" + deviceCreateTime +
                ", deviceUpdateTime=" + deviceUpdateTime +
                ", deviceStartTime=" + deviceStartTime +
                ", deviceDownTime=" + deviceDownTime +
                ", villageName='" + villageName + '\'' +
                '}';
    }
}