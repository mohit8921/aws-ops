package com.incedo.awsservices.service;

import com.amazonaws.services.elasticmapreduce.model.RunJobFlowRequest;
import com.incedo.awsservices.adapter.EMRAdapter;
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
    public void createCluster() {

    }
}
