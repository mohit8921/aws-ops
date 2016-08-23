package com.incedo.awsservices.webdto;

import java.util.Date;

/**
 * Created by sourabh.sar on 8/23/2016.
 */
public class EMRClusterDto {

    public String clusterId;
    public String clusterName;
    public String state;
    public String stateReason;
    public Date creationDateTime;
    public Date readyDateTime;
    public Date endDateTime;
    public String logUri;
    public String runningAmiVersion;
    public String serviceRole;
    public String masterPublicDnsName;
}
