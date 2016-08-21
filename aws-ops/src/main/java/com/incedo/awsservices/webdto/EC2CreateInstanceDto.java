package com.incedo.awsservices.webdto;

import com.amazonaws.services.ec2.model.IpPermission;

import java.util.List;

/**
 * Created by Sourabh on 8/21/2016.
 */
public class EC2CreateInstanceDto {

    public String keyPairName;
    public List<String> securityGroupNames;
    public String instanceType;
    public String imageId;
    public int minimumInstanceCount;
    public int maximumInstanceCount;
}
