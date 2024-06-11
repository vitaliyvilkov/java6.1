package ru.netology.java6.services;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long allSales(long[] sales) {
        long amount = 0;

        for (long i : sales) {
            amount = amount + i;
        }
        return amount;

    }

    public long averageSales(long[] sales) {
        long amount = allSales(sales);
        return amount / sales.length;

    }

    public int belowAverage(long[] sales) {
        long average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int aboveAverage(long[] sales) {
        long average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }

}
