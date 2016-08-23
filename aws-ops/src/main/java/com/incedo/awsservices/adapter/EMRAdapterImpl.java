package com.incedo.awsservices.adapter;

import com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce;
import com.amazonaws.services.elasticmapreduce.model.DescribeClusterRequest;
import com.amazonaws.services.elasticmapreduce.model.JobFlowInstancesConfig;
import com.amazonaws.services.elasticmapreduce.model.RunJobFlowRequest;
import com.amazonaws.services.elasticmapreduce.model.StepConfig;
import com.amazonaws.services.elasticmapreduce.util.StepFactory;
import com.incedo.awsservices.adapter.translator.EMRClusterTranslator;
import com.incedo.awsservices.coremodel.EMRClusterModel;
import com.incedo.awsservices.coremodel.EMRCreateClusterModel;
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
    public EMRClusterModel createCluster(EMRCreateClusterModel model) {
        StepFactory stepFactory = new StepFactory();
        StepConfig enabledebugging = new StepConfig()
                .withName("Enable debugging")
                .withActionOnFailure("TERMINATE_JOB_FLOW")
                .withHadoopJarStep(stepFactory.newEnableDebuggingStep());

        StepConfig installHive = new StepConfig()
                .withName("Install Hive")
                .withActionOnFailure("TERMINATE_JOB_FLOW")
                .withHadoopJarStep(stepFactory.newInstallHiveStep());

        RunJobFlowRequest request = new RunJobFlowRequest()
                .withName(model.getClusterName())
                .withAmiVersion("3.8")
                .withSteps(enabledebugging, installHive)

                .withLogUri(model.getLogURI())
                .withServiceRole(model.getServiceRole())
                .withJobFlowRole(model.getJobFlowRole())
                .withInstances(new JobFlowInstancesConfig()
                        .withEc2KeyName(model.getEC2KeyName())
                        .withInstanceCount(model.getInstanceCount())
                        .withKeepJobFlowAliveWhenNoSteps(true)
                        .withMasterInstanceType(model.getMasterInstanceType())
                        .withSlaveInstanceType(model.getSlaveInstanceType()));
        String id = amazonElasticMapReduce.runJobFlow(request).getJobFlowId();
        return EMRClusterTranslator.transform(
                amazonElasticMapReduce.describeCluster(
                        new DescribeClusterRequest().withClusterId(id)).getCluster());
    }
}
