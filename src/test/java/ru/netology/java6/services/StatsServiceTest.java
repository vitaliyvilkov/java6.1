package ru.netology.java6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void testAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAll = 180;
        long actualAll = service.allSales(sales);
        Assertions.assertEquals(expectedAll, actualAll);
    }

    @Test
    public void testAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverage = 15;
        double actualAverage = service.averageSales(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMax = 8;
        double actualMax = service.maxSales(sales);
        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMin = 9;
        double actualMin = service.minSales(sales);
        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void testBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedBelowAverage = 5;
        double actualBelowAverage = service.belowAverage(sales);
        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
    }

    @Test
    public void testAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAboveAverage = 5;
        double actualAboveAverage = service.aboveAverage(sales);
        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);
    }
}
