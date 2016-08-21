package com.incedo.awsservices.webDtoMapper;

import com.incedo.awsservices.coremodel.EC2InstanceModel;
import com.incedo.awsservices.coremodel.EC2RunInstanceResultModel;
import com.incedo.awsservices.coremodel.ReservationModel;
import com.incedo.awsservices.webdto.EC2InstanceDto;
import com.incedo.awsservices.webdto.EC2RunInstanceResultDto;
import com.incedo.awsservices.webdto.ReservationDto;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Sourabh on 8/21/2016.
 */
public class EC2RunInstanceResultDtoMapper {

    public static EC2RunInstanceResultDto map(EC2RunInstanceResultModel model) {
        EC2RunInstanceResultDto dto = new EC2RunInstanceResultDto();
        dto.reservationDto = map(model.getReservationModel());
        dto.ec2InstanceDto = map(model.getEc2InstanceModels());
        return dto;
    }

    private static List<EC2InstanceDto> map(List<EC2InstanceModel> ec2InstanceModels) {
        return ec2InstanceModels.stream().map(MAP).collect(Collectors.toList());
    }

    private static final Function<EC2InstanceModel,EC2InstanceDto> MAP =
            model -> new EC2InstanceDto() {
            {
                instanceId = model.getInstanceId();
                imageId = model.getImageId();
                state = model.getState();
                privateDnsName = model.getPrivateDnsName();
                publicDndName = model.getPublicDndName();
                keyName = model.getKeyName();
                instanceType = model.getInstanceType();
                launchTime = model.getLaunchTime();
                availabilityZone = model.getAvailabilityZone();
                monitoring = model.getMonitoring();
                subnetId = model.getSubnetId();
                vpcId = model.getVpcId();
                privateIpAddress = model.getPrivateIpAddress();
                publicIpAddress = model.getPublicIpAddress();
                architecture = model.getArchitecture();
                rootDeviceType = model.getRootDeviceType();
                rootDeviceName = model.getRootDeviceName();
                virtualizationType = model.getVirtualizationType();
                clientToken = model.getClientToken();
            }
    };

    private static ReservationDto map(ReservationModel reservationModel) {
        return new ReservationDto() {
            {
                reservationId = reservationModel.getReservationId();
                ownerId = reservationModel.getOwnerId();
            }
        };
    }
}
