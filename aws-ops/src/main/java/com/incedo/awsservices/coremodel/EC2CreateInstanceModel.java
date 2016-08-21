package com.incedo.awsservices.coremodel;

import com.incedo.awsservices.webdto.SecurityGroupDto;

import java.util.List;

/**
 * Created by Sourabh on 8/21/2016.
 */
public class EC2CreateInstanceModel {

    private String keyPairName;
    private List<String> securityGroupNames;
    private String instanceType;
    private String imageId;
    private int minimumInstanceCount;
    private int maximumInstanceCount;

    public String getKeyPairName() {
        return keyPairName;
    }

    public void setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
    }

    public List<String> getSecurityGroupNames() {
        return securityGroupNames;
    }

    public void setSecurityGroupNames(List<String> securityGroupNames) {
        this.securityGroupNames = securityGroupNames;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public int getMinimumInstanceCount() {
        return minimumInstanceCount;
    }

    public void setMinimumInstanceCount(int minimumInstanceCount) {
        this.minimumInstanceCount = minimumInstanceCount;
    }

    public int getMaximumInstanceCount() {
        return maximumInstanceCount;
    }

    public void setMaximumInstanceCount(int maximumInstanceCount) {
        this.maximumInstanceCount = maximumInstanceCount;
    }
}
