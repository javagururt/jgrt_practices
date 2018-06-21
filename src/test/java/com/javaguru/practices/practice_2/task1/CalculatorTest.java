package com.javaguru.practices.practice_2.task1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void shouldSum() {
        assertEquals(200, calculator.sum(150, 50));
        assertEquals(50, calculator.sum(-13, 63));
    }

    @Test
    public void shouldSubtract() {
        assertEquals(20, calculator.subtract(70, 50));
        assertEquals(-80, calculator.subtract(-70, 10));
    }

    @Test
    public void shouldMultiply() {
        assertEquals(200, calculator.multiply(4, 50));
        assertEquals(-45, calculator.multiply(3, -15));
    }

    @Test
    public void shouldDivide() {
        assertEquals(2.5, calculator.divide(10, 4), 0);
        assertEquals(10, calculator.divide(30, 3), 0);
    }
}