package com.incedo.awsservices.coremodel;

import java.util.Date;

/**
 * Created by Sourabh on 8/21/2016.
 */
public class EC2InstanceModel {

    private String instanceId;
    private String imageId;
    private String state;
    private String privateDnsName;
    private String publicDndName;
    private String keyName;
    private String instanceType;
    private Date launchTime;
    private String availabilityZone;
    private String monitoring;
    private String subnetId;
    private String vpcId;
    private String privateIpAddress;
    private String publicIpAddress;
    private String architecture;
    private String rootDeviceType;
    private String rootDeviceName;
    private String virtualizationType;
    private String clientToken;

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPrivateDnsName() {
        return privateDnsName;
    }

    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    public String getPublicDndName() {
        return publicDndName;
    }

    public void setPublicDndName(String publicDndName) {
        this.publicDndName = publicDndName;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public Date getLaunchTime() {
        return launchTime;
    }

    public void setLaunchTime(Date launchTime) {
        this.launchTime = launchTime;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public String getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(String monitoring) {
        this.monitoring = monitoring;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public String getRootDeviceType() {
        return rootDeviceType;
    }

    public void setRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }

    public String getRootDeviceName() {
        return rootDeviceName;
    }

    public void setRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
    }

    public String getVirtualizationType() {
        return virtualizationType;
    }

    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
}
