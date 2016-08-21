package com.incedo.awsservices.adapter;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.model.*;
import com.incedo.awsservices.adapter.translator.EC2InstanceTranslator;
import com.incedo.awsservices.adapter.translator.EC2KeyPairTranslator;
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
public class EC2AdapterImpl implements EC2Adapter {

    private AmazonEC2 amazonEC2;

    @Autowired
    public EC2AdapterImpl(AmazonEC2 amazonEC2) {
        this.amazonEC2 = amazonEC2;
    }

    @Override
    public void createSecurityGroup(CreateSecurityGroupRequest csgr, AuthorizeSecurityGroupIngressRequest asgr) {
        amazonEC2.createSecurityGroup(csgr);
        amazonEC2.authorizeSecurityGroupIngress(asgr);
    }

    @Override
    public KeyPairModel createKeyPair(CreateKeyPairRequest newKeyRequest) {
        CreateKeyPairResult keyresult = amazonEC2.createKeyPair(newKeyRequest);
        try {
            AwsOpsUtility.storePEMFile(keyresult.getKeyPair());
        } catch (IOException e) {
            System.out.println("Error in storing PEM file : " + e);
        }
        return EC2KeyPairTranslator.transform(keyresult.getKeyPair());
    }

    @Override
    public EC2RunInstanceResultModel createEC2Instance(EC2CreateInstanceModel model) {
        RunInstancesRequest rir = new RunInstancesRequest(
                model.getImageId(),model.getMinimumInstanceCount(),model.getMaximumInstanceCount());
        rir.setInstanceType(model.getInstanceType());
        rir.setKeyName(model.getKeyPairName());
        rir.setSecurityGroups(model.getSecurityGroupNames());
        return EC2InstanceTranslator.transform(amazonEC2.runInstances(rir));
    }
}
