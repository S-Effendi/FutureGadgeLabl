package com.futureGadgeLab.app;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicInteger;

public class ParkingTicket implements ParkingRequirements {

    private int ticketId;
    private AtomicInteger lotId;
    private int availableParking;

    @Override
    public BigDecimal tariff() {
//        return tariff;
        return null;
    }

    @Override
    public boolean getTicketId() {

        return false;
    }


}
