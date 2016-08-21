package com.incedo.awsservices.webDtoMapper.EC2DtoMapper;

import com.amazonaws.services.ec2.model.IpPermission;
import com.incedo.awsservices.coremodel.SecurityGroup;
import com.incedo.awsservices.webdto.IpPermissionDto;
import com.incedo.awsservices.webdto.SecurityGroupDto;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Sourabh on 8/21/2016.
 */
public class EC2SecurityGroupDtoMapper {

    public static SecurityGroup map(SecurityGroupDto securityGroupDto) {
        SecurityGroup securityGroup = new SecurityGroup();
        securityGroup.setGroupName(securityGroupDto.groupName);
        securityGroup.setDescription(securityGroupDto.description);
        securityGroup.setIpPermissions(map(securityGroupDto.ipPermissions));
        return securityGroup;
    }

    private static List<IpPermission> map(List<IpPermissionDto> ipPermissions) {
        return ipPermissions.stream().map(permission -> {
            IpPermission ipPermission = new IpPermission();
            ipPermission.setIpProtocol(permission.ipProtocol);
            ipPermission.setFromPort(Integer.valueOf(permission.ipFromPort));
            ipPermission.setToPort(Integer.valueOf(permission.ipToPort));
            ipPermission.setIpRanges(permission.ipRanges);
            return ipPermission;
        }).collect(Collectors.toList());
    }
}
