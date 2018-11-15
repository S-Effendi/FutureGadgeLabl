package com.futureGadgeLab.app;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class FeeStructureTest {

    private FeeStructure feeStructure;

    @Before
    public void setUp() throws Exception {
        feeStructure = new FeeStructure();
    }

    @Test
    public void testThatForSevenMinutes_ThenItWillChargeFiveRands() {
        BigDecimal result = feeStructure.getTariff(7);

        assertEquals(result.intValue(), 5);
    }

    @Test
    public void testThatForSixtyMinutes_ThenItWillChargeTenRands() {
        BigDecimal result = feeStructure.getTariff(60);

        assertEquals(result.intValue(), 10);
    }

    @Test
    public void testThatForFiveMinutes_ThenItWillChargeTenRands() {
        BigDecimal result = feeStructure.getTariff(5);

        assertEquals(result.intValue(), 5);
    }
}