package com.javaguru.practices.practice_3.task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositiveOrNegativeTest {

    @Test
    public void shouldBePositive() throws Exception {
        PositiveOrNegative positiveOrNegative = new PositiveOrNegative();
        assertEquals("Positive", positiveOrNegative.getPositiveOrNegative(10));
    }

    @Test
    public void shouldBeNegative() throws Exception {
        PositiveOrNegative positiveOrNegative = new PositiveOrNegative();
        assertEquals("Negative", positiveOrNegative.getPositiveOrNegative(-10));
    }

    @Test
    public void shouldBeZero() throws Exception {
        PositiveOrNegative positiveOrNegative = new PositiveOrNegative();
        assertEquals("Zero", positiveOrNegative.getPositiveOrNegative(0));
    }
}