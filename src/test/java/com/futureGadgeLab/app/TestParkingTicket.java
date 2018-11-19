package java.com.futureGadgeLab.app;

import com.futureGadgeLab.app.ParkingTicket;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestParkingTicket
{
    ParkingTicket parkingTicket;

    @Before
    public void setUp() throws Exception {
        parkingTicket = new ParkingTicket();
    }

    @Test
    public void testDuration(){
        int result = parkingTicket.getDuration();
        assertEquals(" ", result);
    }

}