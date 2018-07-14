package com.javaguru.practices.practice_6.task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumInRangeTest {

    @Test
    public void sum() {
        SumInRange sumInRange = new SumInRange();
        assertEquals(5050, sumInRange.sum(0, 100));
        assertEquals(55, sumInRange.sum(0, 10));
    }

}