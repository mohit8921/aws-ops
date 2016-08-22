package com.incedo.awsservices.adapter;

import com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sourabh.sar on 8/22/2016.
 */
public class EMRAdapterImpl implements EMRAdapter {

    private AmazonElasticMapReduce amazonElasticMapReduce;

    @Autowired
    public EMRAdapterImpl(AmazonElasticMapReduce amazonElasticMapReduce) {
        this.amazonElasticMapReduce = amazonElasticMapReduce;
    }

    @Override
    public void createCluster() {
    }
}
