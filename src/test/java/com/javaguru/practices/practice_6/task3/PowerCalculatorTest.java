package com.javaguru.practices.practice_6.task3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowerCalculatorTest {

    @Test
    public void pow() {
        PowerCalculator pc = new PowerCalculator();
        assertEquals(Math.pow(2, 3), pc.pow(2, 3), 0.1);
        assertEquals(Math.pow(2, 0), pc.pow(2, 0), 0.1);
        assertEquals(Math.pow(0, 3), pc.pow(0, 3), 0.1);
        assertEquals(Math.pow(10, 3), pc.pow(10, 3), 0.1);
    }
}