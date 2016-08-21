package com.incedo.awsservices.coremodel;

/**
 * Created by Sourabh on 8/21/2016.
 */
public class ReservationModel {

    private String reservationId;
    private String ownerId;

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
}
