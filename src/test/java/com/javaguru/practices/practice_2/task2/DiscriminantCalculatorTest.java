package com.javaguru.practices.practice_2.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiscriminantCalculatorTest {

    @Test
    public void calculate() {
        DiscriminantCalculator dc = new DiscriminantCalculator();
        assertEquals(0, dc.calculate(3,18,27));
        assertEquals(0, dc.calculate(16,-40,25));
        assertEquals(196, dc.calculate(1,-26,120));
    }
}