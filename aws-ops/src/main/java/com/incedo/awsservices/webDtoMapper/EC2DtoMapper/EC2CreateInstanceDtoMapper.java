package com.incedo.awsservices.webDtoMapper.EC2DtoMapper;

import com.incedo.awsservices.coremodel.EC2CreateInstanceModel;
import com.incedo.awsservices.webdto.EC2CreateInstanceDto;

/**
 * Created by Sourabh on 8/21/2016.
 */
public class EC2CreateInstanceDtoMapper {

    public static EC2CreateInstanceModel map(EC2CreateInstanceDto dto) {
        return new EC2CreateInstanceModel() {
            {
                setImageId(dto.imageId);
                setInstanceType(dto.instanceType);
                setKeyPairName(dto.keyPairName);
                setMaximumInstanceCount(dto.maximumInstanceCount);
                setMinimumInstanceCount(dto.minimumInstanceCount);
                setSecurityGroupNames(dto.securityGroupNames);
            }
        };
    }
}
