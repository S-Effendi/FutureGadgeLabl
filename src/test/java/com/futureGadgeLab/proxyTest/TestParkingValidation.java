package com.futureGadgeLab.proxyTest;

import com.futureGadgeLab.proxy.ParkingValidation;
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

//    @Test
//    public void testNumberOfElements(){
//        int [] lotIdArray = parkingValidation.getLotId();
//
//        assertEquals(lotIdArray.length, parkingValidation.getLotId());
//    }

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
