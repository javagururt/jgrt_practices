package com.javaguru.practices.practice_5.task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumInRangeTest {

    @Test
    public void shouldSumFromZeroToOneHundred() throws Exception {
        SumInRange sumInRange = new SumInRange();
        assertEquals(5050, sumInRange.sum(0, 100));
    }

    @Test
    public void shouldSumFromZeroToTen() throws Exception {
        SumInRange sumInRange = new SumInRange();
        assertEquals(55, sumInRange.sum(0, 10));
    }
}