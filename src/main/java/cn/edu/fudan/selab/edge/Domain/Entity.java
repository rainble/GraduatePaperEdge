package cn.edu.fudan.selab.edge.Domain;

import cn.edu.fudan.selab.edge.Enums.DeviceStatus;

import java.sql.Timestamp;

public class Entity {

    private String abilityDesc;
    private int entityId;
    private String LocationId;
    private boolean entityStatus;
    private String callUrl;
    private Timestamp lastCallTime;

    @Override
    public String toString() {
        return "Entity{" +
                "ability='" + abilityDesc + '\'' +
                ", entityId=" + entityId +
                ", LocationId='" + LocationId + '\'' +
                ", deviceStatus=" + entityStatus +
                ", callUrl='" + callUrl + '\'' +
                ", lastCallTime=" + lastCallTime +
                '}';
    }

    public void setAbility(String ability) {
        this.abilityDesc = ability;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public void setLocationId(String locationId) {
        LocationId = locationId;
    }

    public void setDeviceStatus(boolean entityStatus) {
        this.entityStatus = entityStatus;
    }

    public void setCallUrl(String callUrl) {
        this.callUrl = callUrl;
    }

    public void setLastCallTime(Timestamp lastCallTime) {
        this.lastCallTime = lastCallTime;
    }

    public String getAbility() {
        return abilityDesc;
    }

    public int getEntityId() {
        return entityId;
    }

    public String getLocationId() {
        return LocationId;
    }

    public boolean isDeviceStatus() {
        return entityStatus;
    }

    public String getCallUrl() {
        return callUrl;
    }

    public Timestamp getLastCallTime() {
        return lastCallTime;
    }
}
