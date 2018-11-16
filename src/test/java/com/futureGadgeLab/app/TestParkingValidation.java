package com.futureGadgeLab.app;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class TestParkingValidation {

    ParkingValidation parkingValidation;

    @Before
    public void setUp() throws Exception {
        parkingValidation = new ParkingValidation();
    }

    @Test
    public void getAvailableLots(){
        int result = parkingValidation.getAvailableLots();

        assertEquals(1, result);
    }


    @Test
    public void testParkingAvailabilty() {
        Boolean result = parkingValidation.getValidation();

        assertTrue("There are no parking spaces available", result);
    }

    @Test
    public void testNumberOfParkingSpaces(){
        int parkingSpaces;

        parkingSpaces = parkingValidation.getAvailableSpaces();

        assertEquals(parkingSpaces, parkingValidation.getAvailableSpaces());
    }

}
