package com.incedo.awsservices.adapter.translator;

import com.amazonaws.services.elasticmapreduce.model.Cluster;
import com.incedo.awsservices.coremodel.EMRClusterModel;

/**
 * Created by sourabh.sar on 8/23/2016.
 */
public class EMRClusterTranslator {

    public static EMRClusterModel transform(Cluster cluster) {
        return new EMRClusterModel() {
            {
                setClusterId(cluster.getId());
                setClusterName(cluster.getName());
                setCreationDateTime(cluster.getStatus().getTimeline().getCreationDateTime());
                setReadyDateTime(cluster.getStatus().getTimeline().getReadyDateTime());
                setEndDateTime(cluster.getStatus().getTimeline().getEndDateTime());
                setServiceRole(cluster.getServiceRole());
                setLogUri(cluster.getLogUri());
                setMasterPublicDnsName(cluster.getMasterPublicDnsName());
                setState(cluster.getStatus().getState());
                setStateReason(cluster.getStatus().getStateChangeReason().getMessage());
                setRunningAmiVersion(cluster.getRunningAmiVersion());
            }
        };
    }
}
