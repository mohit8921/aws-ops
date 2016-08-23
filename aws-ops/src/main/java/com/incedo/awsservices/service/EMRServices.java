package com.incedo.awsservices.service;

import com.incedo.awsservices.coremodel.EMRClusterModel;
import com.incedo.awsservices.coremodel.EMRCreateClusterModel;

/**
 * Created by sourabh.sar on 8/22/2016.
 */
public interface EMRServices {

    EMRClusterModel createCluster(EMRCreateClusterModel model);
}
