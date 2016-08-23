package com.incedo.awsservices.coremodel;

/**
 * Created by sourabh.sar on 8/23/2016.
 */
public class EMRCreateClusterModel {

    private String serviceRole;
    private String jobFlowRole;
    private String EC2KeyName;
    private int instanceCount;
    private String masterInstanceType;
    private String slaveInstanceType;
    private String logURI;
    private String clusterName;

    public String getLogURI() {
        return logURI;
    }

    public void setLogURI(String logURI) {
        this.logURI = logURI;
    }

    public String getServiceRole() {
        return serviceRole;
    }

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    public String getJobFlowRole() {
        return jobFlowRole;
    }

    public void setJobFlowRole(String jobFlowRole) {
        this.jobFlowRole = jobFlowRole;
    }

    public String getEC2KeyName() {
        return EC2KeyName;
    }

    public void setEC2KeyName(String EC2KeyName) {
        this.EC2KeyName = EC2KeyName;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(int instanceCount) {
        this.instanceCount = instanceCount;
    }

    public String getMasterInstanceType() {
        return masterInstanceType;
    }

    public void setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
    }

    public String getSlaveInstanceType() {
        return slaveInstanceType;
    }

    public void setSlaveInstanceType(String slaveInstanceType) {
        this.slaveInstanceType = slaveInstanceType;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }
}
