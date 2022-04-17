package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxFin() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 11, 800, 4, 20, 17000};
        long expectedMaxFin = 17000;

        long actualMaxFin = service.findMax(incomesInBillions);

        assertEquals(expectedMaxFin, actualMaxFin);
    }

}
