package com.incedo.awsservices.adapter;

import com.amazonaws.services.ec2.model.*;
import com.incedo.awsservices.coremodel.EC2CreateInstanceModel;
import com.incedo.awsservices.coremodel.EC2RunInstanceResultModel;
import com.incedo.awsservices.coremodel.KeyPairModel;
import com.incedo.awsservices.coremodel.SecurityGroup;

/**
 * Created by Sourabh on 8/20/2016.
 */
public interface EC2Adapter {

    void createSecurityGroup(CreateSecurityGroupRequest csgr, AuthorizeSecurityGroupIngressRequest asgr);
    KeyPairModel createKeyPair(CreateKeyPairRequest newKeyRequest);
    EC2RunInstanceResultModel createEC2Instance(EC2CreateInstanceModel model);
}
