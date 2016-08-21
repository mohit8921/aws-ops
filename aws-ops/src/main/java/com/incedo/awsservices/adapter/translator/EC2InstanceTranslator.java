package com.incedo.awsservices.adapter.translator;

import com.amazonaws.services.ec2.model.Instance;
import com.amazonaws.services.ec2.model.Reservation;
import com.amazonaws.services.ec2.model.RunInstancesResult;
import com.incedo.awsservices.coremodel.EC2InstanceModel;
import com.incedo.awsservices.coremodel.EC2RunInstanceResultModel;
import com.incedo.awsservices.coremodel.ReservationModel;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Sourabh on 8/21/2016.
 */
public class EC2InstanceTranslator {

    public static EC2RunInstanceResultModel transform(RunInstancesResult result) {
        EC2RunInstanceResultModel model = new EC2RunInstanceResultModel();
        model.setReservationModel(transform(result.getReservation()));
        model.setEc2InstanceModels(transform(result.getReservation().getInstances()));
        return model;
    }

    private static List<EC2InstanceModel> transform(List<Instance> instances) {
        return instances.stream().map(TRANSFORM).collect(Collectors.toList());
    }

    private static final Function<Instance,EC2InstanceModel> TRANSFORM =
            instance -> new EC2InstanceModel(){
                {
                    setInstanceId(instance.getInstanceId());
                    setImageId(instance.getImageId());
                    setState(instance.getState().getName());
                    setPrivateDnsName(instance.getPrivateDnsName());
                    setPublicDndName(instance.getPublicDnsName());
                    setKeyName(instance.getKeyName());
                    setInstanceType(instance.getInstanceType());
                    setLaunchTime(instance.getLaunchTime());
                    setAvailabilityZone(instance.getPlacement().getAvailabilityZone());
                    setSubnetId(instance.getSubnetId());
                    setVpcId(instance.getVpcId());
                    setPrivateIpAddress(instance.getPrivateIpAddress());
                    setPublicIpAddress(instance.getPublicIpAddress());
                    setArchitecture(instance.getArchitecture());
                    setRootDeviceType(instance.getRootDeviceType());
                    setRootDeviceName(instance.getRootDeviceName());
                    setVirtualizationType(instance.getVirtualizationType());
                    setClientToken(instance.getClientToken());
                    setMonitoring(instance.getMonitoring().getState());
                }
            };

    private static ReservationModel transform(Reservation reservation) {
        ReservationModel reservationModel = new ReservationModel();
        reservationModel.setOwnerId(reservation.getOwnerId());
        reservationModel.setReservationId(reservation.getReservationId());
        return reservationModel;
    }
}
