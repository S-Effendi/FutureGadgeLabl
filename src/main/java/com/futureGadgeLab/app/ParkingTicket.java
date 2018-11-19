package com.futureGadgeLab.app;

public class ParkingTicket {

    protected int duration;
    Parking parking;

    public int getDuration(){

        if (parking.ticketIssued == true) {

            int entryTimeHour = parking.getEntryTime().getHours();
            int entryTimeMinutes = parking.getEntryTime().getMinutes();
            int exitTimeHour = parking.getExitTime().getHours();
            int exitTimeMinutes = parking.getExitTime().getMinutes();

            entryTimeHour = entryTimeHour * 60;
            exitTimeHour = exitTimeHour * 60;

            int entryTime = entryTimeHour + entryTimeMinutes;
            int exitTime = exitTimeHour + exitTimeMinutes;

            duration = (exitTime - entryTime);
        }
        return duration;
    }

}
