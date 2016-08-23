package com.incedo.awsservices.controller;

import com.incedo.awsservices.coremodel.EC2RunInstanceResultModel;
import com.incedo.awsservices.service.EMRServices;
import com.incedo.awsservices.webDtoMapper.EC2DtoMapper.EC2CreateInstanceDtoMapper;
import com.incedo.awsservices.webDtoMapper.EC2DtoMapper.EC2RunInstanceResultDtoMapper;
import com.incedo.awsservices.webDtoMapper.EMRDtoMapper.EMRClusterDtoMapper;
import com.incedo.awsservices.webDtoMapper.EMRDtoMapper.EMRCreateClusterDtoMapper;
import com.incedo.awsservices.webdto.EC2CreateInstanceDto;
import com.incedo.awsservices.webdto.EC2RunInstanceResultDto;
import com.incedo.awsservices.webdto.EMRClusterDto;
import com.incedo.awsservices.webdto.EMRCreateClusterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sourabh.sar on 8/22/2016.
 */
@RestController
public class EMRController {

    private EMRServices emrServices;

    @Autowired
    public EMRController(EMRServices emrServices) {
        this.emrServices = emrServices;
    }

    @RequestMapping(value = "/createCluster", method = RequestMethod.POST, headers = "Accept=application/json")
    public EMRClusterDto createCluster(@RequestBody EMRCreateClusterDto emrCreateClusterDto) {
        return EMRClusterDtoMapper.map(
                emrServices.createCluster(
                        EMRCreateClusterDtoMapper.map(emrCreateClusterDto)));
    }
}
