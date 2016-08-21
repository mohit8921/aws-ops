package com.incedo.awsservices.controller;

import com.incedo.awsservices.coremodel.EC2RunInstanceResultModel;
import com.incedo.awsservices.service.EC2Services;
import com.incedo.awsservices.webDtoMapper.EC2DtoMapper.EC2CreateInstanceDtoMapper;
import com.incedo.awsservices.webDtoMapper.EC2DtoMapper.EC2SecurityGroupDtoMapper;
import com.incedo.awsservices.webDtoMapper.EC2RunInstanceResultDtoMapper;
import com.incedo.awsservices.webDtoMapper.KeyPairDtoMapper;
import com.incedo.awsservices.webdto.EC2CreateInstanceDto;
import com.incedo.awsservices.webdto.EC2RunInstanceResultDto;
import com.incedo.awsservices.webdto.KeyPairDto;
import com.incedo.awsservices.webdto.SecurityGroupDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sourabh on 8/20/2016.
 */
@RestController
public class EC2Controller {

    private EC2Services ec2Services;

    @Autowired
    public EC2Controller(EC2Services ec2Services) {
        this.ec2Services = ec2Services;
    }

    @RequestMapping(value = "/createSecurityGroups", method = RequestMethod.POST, headers = "Accept=application/json")
    public void createSecurityGroup(@RequestBody SecurityGroupDto securityGroupDto) {
        ec2Services.createSecurityGroups(EC2SecurityGroupDtoMapper.map(securityGroupDto));
    }

    @RequestMapping(value = "/createKeyPair", method = RequestMethod.POST, headers = "Accept=application/json")
    public KeyPairDto createKeyPair(@RequestBody KeyPairDto keyPairDto) {
        return KeyPairDtoMapper.map(ec2Services.createKeyPair(keyPairDto.keyName));
    }

    @RequestMapping(value = "/createEC2Instance", method = RequestMethod.POST, headers = "Accept=application/json")
    public EC2RunInstanceResultDto createEC2Instance(@RequestBody EC2CreateInstanceDto ec2CreateInstanceDto) {
        EC2RunInstanceResultModel model = ec2Services.createEC2Instance(EC2CreateInstanceDtoMapper.map(ec2CreateInstanceDto));
        return EC2RunInstanceResultDtoMapper.map(model);
    }

}
