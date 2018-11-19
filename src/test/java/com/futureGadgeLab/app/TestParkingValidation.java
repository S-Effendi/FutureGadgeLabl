package java.com.futureGadgeLab.app;

import com.futureGadgeLab.app.ParkingValidation;
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
    public void testParkingAvailabilty() {
        Boolean result = parkingValidation.getSpaceAvailability();

        assertTrue("There are no parking spaces available", result);
    }


    @Test
    public void getAvailableLots(){
        int result = parkingValidation.getAvailableLots();

        assertEquals(1, result);
    }

    @Test
    public void getAvailableSpaces(){
        int result = parkingValidation.getAvailableSpaces();

        assertEquals(50, result);
    }

    @Test
    public void testNumberOfParkingSpaces(){
        int parkingSpaces;

        parkingSpaces = parkingValidation.getAvailableSpaces();

        assertEquals(parkingSpaces, parkingValidation.getAvailableSpaces());
    }

}
