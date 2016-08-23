package com.incedo.awsservices.service;

import com.amazonaws.services.elasticmapreduce.model.RunJobFlowRequest;
import com.incedo.awsservices.adapter.EMRAdapter;
import com.incedo.awsservices.coremodel.EMRClusterModel;
import com.incedo.awsservices.coremodel.EMRCreateClusterModel;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sourabh.sar on 8/22/2016.
 */
public class EMRServicesImpl implements EMRServices {

    private EMRAdapter emrAdapter;

    @Autowired
    public EMRServicesImpl(EMRAdapter emrAdapter) {
        this.emrAdapter = emrAdapter;
    }

    @Override
    public EMRClusterModel createCluster(EMRCreateClusterModel model) {
        return emrAdapter.createCluster(model);
    }
}
