package com.javaguru.practices.practice_4.task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositiveOrNegativeTest {

    @Test
    public void getPositiveOrNegative() {
        PositiveOrNegative positiveOrNegative = new PositiveOrNegative();
        assertEquals("Positive", positiveOrNegative.getPositiveOrNegative(10));
        assertEquals("Negative", positiveOrNegative.getPositiveOrNegative(-10));
        assertEquals("Zero", positiveOrNegative.getPositiveOrNegative(0));
    }
}