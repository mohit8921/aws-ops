package com.incedo.awsservices.webDtoMapper.EMRDtoMapper;

import com.incedo.awsservices.coremodel.EMRClusterModel;
import com.incedo.awsservices.webdto.EMRClusterDto;

/**
 * Created by sourabh.sar on 8/23/2016.
 */
public class EMRClusterDtoMapper {

    public static EMRClusterDto map(EMRClusterModel model) {
        return new EMRClusterDto() {
            {
                clusterId = model.getClusterId();
                clusterName = model.getClusterName();
                state = model.getState();
                stateReason = model.getStateReason();
                creationDateTime = model.getCreationDateTime();
                readyDateTime = model.getReadyDateTime();
                endDateTime = model.getEndDateTime();
                logUri = model.getLogUri();
                runningAmiVersion = model.getRunningAmiVersion();
                serviceRole = model.getServiceRole();
                masterPublicDnsName = model.getMasterPublicDnsName();
            }
        };
    }
}
