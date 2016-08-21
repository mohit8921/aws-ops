package com.incedo.awsservices.webdto;

import java.util.List;

/**
 * Created by Sourabh on 8/21/2016.
 */
public class IpPermissionDto {

    public String ipProtocol;
    public String ipFromPort;
    public String ipToPort;
    public List<String> ipRanges;
}
