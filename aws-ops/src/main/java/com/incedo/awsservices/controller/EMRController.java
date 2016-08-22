package com.incedo.awsservices.controller;

import com.incedo.awsservices.service.EMRServices;
import org.springframework.beans.factory.annotation.Autowired;
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
}
