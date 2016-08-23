package com.incedo.awsservices.webdto;

/**
 * Created by sourabh.sar on 8/23/2016.
 */
public class EMRCreateClusterDto {

    public String serviceRole;
    public String jobFlowRole;
    public String EC2KeyName;
    public int instanceCount;
    public String masterInstanceType;
    public String slaveInstanceType;
    public String logURI;
    public String clusterName;
}
