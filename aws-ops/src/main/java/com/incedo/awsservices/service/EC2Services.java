package com.incedo.awsservices.service;

import com.incedo.awsservices.coremodel.EC2CreateInstanceModel;
import com.incedo.awsservices.coremodel.EC2RunInstanceResultModel;
import com.incedo.awsservices.coremodel.KeyPairModel;
import com.incedo.awsservices.coremodel.SecurityGroup;

import java.util.List;

/**
 * Created by Sourabh on 8/20/2016.
 */
public interface EC2Services {

    void fetchEC2Configurations();
    KeyPairModel createKeyPair(String keyName);
    EC2RunInstanceResultModel createEC2Instance(EC2CreateInstanceModel ec2CreateInstanceModel);
    void createSecurityGroups(SecurityGroup securityGroup);
}
