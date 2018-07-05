package com.javaguru.practices.practice_4.task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositiveOrNegativeTest {

    @Test
    public void shouldBePositive() {
        PositiveOrNegative positiveOrNegative = new PositiveOrNegative();
        assertEquals("Positive", positiveOrNegative.getPositiveOrNegative(10));
    }

    @Test
    public void shouldBeNegative() {
        PositiveOrNegative positiveOrNegative = new PositiveOrNegative();
        assertEquals("Negative", positiveOrNegative.getPositiveOrNegative(-10));
    }

    @Test
    public void shouldBeZero() {
        PositiveOrNegative positiveOrNegative = new PositiveOrNegative();
        assertEquals("Zero", positiveOrNegative.getPositiveOrNegative(0));
    }
}