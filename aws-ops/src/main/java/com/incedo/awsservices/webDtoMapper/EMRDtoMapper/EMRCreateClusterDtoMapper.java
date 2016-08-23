package com.incedo.awsservices.webDtoMapper.EMRDtoMapper;

import com.incedo.awsservices.coremodel.EMRCreateClusterModel;
import com.incedo.awsservices.webdto.EMRCreateClusterDto;

/**
 * Created by sourabh.sar on 8/23/2016.
 */
public class EMRCreateClusterDtoMapper {

    public static EMRCreateClusterModel map(EMRCreateClusterDto dto) {
        return new EMRCreateClusterModel() {
            {
                setEC2KeyName(dto.EC2KeyName);
                setInstanceCount(dto.instanceCount);
                setJobFlowRole(dto.jobFlowRole);
                setServiceRole(dto.serviceRole);
                setLogURI(dto.logURI);
                setMasterInstanceType(dto.masterInstanceType);
                setSlaveInstanceType(dto.slaveInstanceType);
                setClusterName(dto.clusterName);
            }
        };
    }
}
