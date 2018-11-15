package com.futureGadgeLab.proxy;

import com.futureGadgeLab.app.Parking;

import java.util.concurrent.atomic.AtomicInteger;

public class ParkingValidation
{

    private int availableSpaces;

    Parking parking;

    AtomicInteger result = new AtomicInteger (parking.getLotId());

    public Boolean getValidation() {
        return null;
    }

    public int getAvailableSpaces() {
        return availableSpaces;
    }

}
