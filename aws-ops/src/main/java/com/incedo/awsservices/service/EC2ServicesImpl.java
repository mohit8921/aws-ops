package com.incedo.awsservices.service;

import com.amazonaws.services.ec2.model.*;
import com.incedo.awsservices.adapter.EC2Adapter;
import com.incedo.awsservices.coremodel.EC2CreateInstanceModel;
import com.incedo.awsservices.coremodel.EC2RunInstanceResultModel;
import com.incedo.awsservices.coremodel.KeyPairModel;
import com.incedo.awsservices.coremodel.SecurityGroup;
import com.incedo.awsservices.utils.AwsOpsUtility;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/**
 * Created by Sourabh on 8/20/2016.
 */
public class EC2ServicesImpl implements EC2Services {

    private EC2Adapter ec2Adapter;

    @Autowired
    public EC2ServicesImpl(EC2Adapter ec2Adapter) {
        this.ec2Adapter = ec2Adapter;
    }

    @Override
    public void fetchEC2Configurations() {

    }

    @Override
    public KeyPairModel createKeyPair(String keyName) {
        return ec2Adapter.createKeyPair(new CreateKeyPairRequest(keyName));
    }

    @Override
    public EC2RunInstanceResultModel createEC2Instance(EC2CreateInstanceModel ec2CreateInstanceModel) {
        return ec2Adapter.createEC2Instance(ec2CreateInstanceModel);
    }

    @Override
    public void createSecurityGroups(SecurityGroup securityGroup) {
        CreateSecurityGroupRequest csgr =
                new CreateSecurityGroupRequest(securityGroup.getGroupName(),securityGroup.getDescription());
        AuthorizeSecurityGroupIngressRequest asgr =
                new AuthorizeSecurityGroupIngressRequest(securityGroup.getGroupName(),securityGroup.getIpPermissions());
        ec2Adapter.createSecurityGroup(csgr,asgr);
    }
}
