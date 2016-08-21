package com.incedo.awsservices.webdto;

import java.util.Date;

/**
 * Created by Sourabh on 8/21/2016.
 */
public class EC2InstanceDto {

    public String instanceId;
    public String imageId;
    public String state;
    public String privateDnsName;
    public String publicDndName;
    public String keyName;
    public String instanceType;
    public Date launchTime;
    public String availabilityZone;
    public String monitoring;
    public String subnetId;
    public String vpcId;
    public String privateIpAddress;
    public String publicIpAddress;
    public String architecture;
    public String rootDeviceType;
    public String rootDeviceName;
    public String virtualizationType;
    public String clientToken;
}
