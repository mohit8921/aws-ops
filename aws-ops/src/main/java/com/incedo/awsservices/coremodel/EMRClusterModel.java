package com.incedo.awsservices.coremodel;

import java.util.Date;

/**
 * Created by sourabh.sar on 8/23/2016.
 */
public class EMRClusterModel {

    private String clusterId;
    private String clusterName;
    private String state;
    private String stateReason;
    private Date creationDateTime;
    private Date readyDateTime;
    private Date endDateTime;
    private String logUri;
    private String runningAmiVersion;
    private String serviceRole;
    private String masterPublicDnsName;

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateReason() {
        return stateReason;
    }

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    public Date getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public Date getReadyDateTime() {
        return readyDateTime;
    }

    public void setReadyDateTime(Date readyDateTime) {
        this.readyDateTime = readyDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public String getLogUri() {
        return logUri;
    }

    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }

    public String getRunningAmiVersion() {
        return runningAmiVersion;
    }

    public void setRunningAmiVersion(String runningAmiVersion) {
        this.runningAmiVersion = runningAmiVersion;
    }

    public String getServiceRole() {
        return serviceRole;
    }

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    public String getMasterPublicDnsName() {
        return masterPublicDnsName;
    }

    public void setMasterPublicDnsName(String masterPublicDnsName) {
        this.masterPublicDnsName = masterPublicDnsName;
    }
}

