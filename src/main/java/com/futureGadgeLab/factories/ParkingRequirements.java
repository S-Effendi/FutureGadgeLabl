package com.futureGadgeLab.factories;

import com.futureGadgeLab.app.Parking;

import java.math.BigDecimal;

public abstract class ParkingRequirements {
    Parking parking = new Parking();

    public int getTicketId() {
        return parking.getTicketId();
    }

    public BigDecimal getFee() {
        return parking.getFee();
    }

}
