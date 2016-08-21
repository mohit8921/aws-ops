package com.incedo.awsservices.coremodel;

import java.util.List;

/**
 * Created by Sourabh on 8/21/2016.
 */
public class EC2RunInstanceResultModel {

    private ReservationModel reservationModel;
    private List<EC2InstanceModel> ec2InstanceModels;

    public ReservationModel getReservationModel() {
        return reservationModel;
    }

    public void setReservationModel(ReservationModel reservationModel) {
        this.reservationModel = reservationModel;
    }

    public List<EC2InstanceModel> getEc2InstanceModels() {
        return ec2InstanceModels;
    }

    public void setEc2InstanceModels(List<EC2InstanceModel> ec2InstanceModels) {
        this.ec2InstanceModels = ec2InstanceModels;
    }
}
