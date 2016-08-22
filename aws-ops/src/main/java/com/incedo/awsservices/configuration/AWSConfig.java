package com.incedo.awsservices.configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce;
import com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduceClient;
import com.incedo.awsservices.adapter.EC2Adapter;
import com.incedo.awsservices.adapter.EC2AdapterImpl;
import com.incedo.awsservices.adapter.EMRAdapter;
import com.incedo.awsservices.adapter.EMRAdapterImpl;
import com.incedo.awsservices.service.EC2Services;
import com.incedo.awsservices.service.EC2ServicesImpl;
import com.incedo.awsservices.service.EMRServices;
import com.incedo.awsservices.service.EMRServicesImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.io.IOException;

/**
 * Created by Sourabh on 8/20/2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.incedo.awsservices.*"})
public class AWSConfig {

    @Bean
    public AWSCredentials awsCredentials() throws IOException {
        return new PropertiesCredentials(Thread.currentThread()
                .getContextClassLoader().getResourceAsStream("AwsCredentials.properties"));
    }

    @Bean
    public AmazonEC2 amazonEC2(AWSCredentials awsCredentials) {
        AmazonEC2 amazonEC2 = new AmazonEC2Client(awsCredentials);
        amazonEC2.setEndpoint("ec2.us-west-2.amazonaws.com" );
        return amazonEC2;
    }

    @Bean
    public EC2Adapter ec2Adapter(AmazonEC2 amazonEC2) {
        return new EC2AdapterImpl(amazonEC2);
    }

    @Bean
    public EC2Services ec2Services(EC2Adapter ec2Adapter) {
        return new EC2ServicesImpl(ec2Adapter);
    }

    @Bean
    public AmazonElasticMapReduce amazonElasticMapReduce() throws IOException {
        return new AmazonElasticMapReduceClient(awsCredentials());
    }

    @Bean
    public EMRAdapter emrAdapter(AmazonElasticMapReduce amazonElasticMapReduce) {
        return new EMRAdapterImpl(amazonElasticMapReduce);
    }

    @Bean
    public EMRServices emrServices(EMRAdapter emrAdapter) {
        return new EMRServicesImpl(emrAdapter);
    }
}
