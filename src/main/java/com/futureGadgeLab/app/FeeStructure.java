package com.futureGadgeLab.app;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class FeeStructure {

    Map<Integer, BigDecimal> categoryToTariff = new HashMap<>();

    public FeeStructure() {
        // 0 - 60 => R5
        // 60 - 120 => R10
        categoryToTariff.put(7, BigDecimal.valueOf(5));
        categoryToTariff.put(60, BigDecimal.TEN);
    }

    /**
     * For a given number of minutes, then return the appropriate tariffs
     * @param minutes
     * @return
     */
    public BigDecimal getTariff(int minutes) {
        return categoryToTariff.get(minutes);
    }
}
