package com.futureGadgeLab.app;
import java.util.concurrent.atomic.AtomicInteger;

public class ParkingValidation
{

    private Boolean validation;
    private int availableSpaces, currentLotId = 1;

    private AtomicInteger parkingLots = new AtomicInteger (5);

    Parking parking= new Parking();

    public ParkingValidation() {
    }


    public Boolean getValidation() {
        return true;
    }

    public int getAvailableLots() {

        currentLotId = parking.getLotId(currentLotId);

        if (currentLotId == 1) {
            availableSpaces = 50;
        } else if (currentLotId == 1 && availableSpaces == 0) {

            currentLotId++;
            availableSpaces = 50;
            parking.getLotId(currentLotId);
        } else {
            currentLotId = parkingLots.getAndIncrement();
        }
        parking.setLotId(currentLotId);
        return availableSpaces;
    }

        public int getAvailableSpaces () {
            return 0;
    }
}
