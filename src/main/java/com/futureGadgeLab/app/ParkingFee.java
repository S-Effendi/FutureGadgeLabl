package com.futureGadgeLab.app;

import java.math.BigDecimal;
import java.util.Date;

public class ParkingFee implements ParkingDisplay {

    public int ticketId;
    private Date entryTime;
    private Date exitTime;
    private BigDecimal fee;

    Parking parking = new Parking();

    @Override
    public BigDecimal tariff() {
        return null;
    }

    @Override
    public boolean getTicketId() {

        if (ticketId == parking.getTicketId()){
            return true;
        }
        return false;
    }
}
