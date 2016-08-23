package com.incedo.awsservices.adapter;

import com.incedo.awsservices.coremodel.EMRClusterModel;
import com.incedo.awsservices.coremodel.EMRCreateClusterModel;

/**
 * Created by sourabh.sar on 8/22/2016.
 */
public interface EMRAdapter {

    EMRClusterModel createCluster(EMRCreateClusterModel model);
}
