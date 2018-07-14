package com.javaguru.practices.practice_4.task3;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvenOrOddTest {

    @Test
    public void isEven() {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        assertTrue(evenOrOdd.isEven(10));
        assertFalse(evenOrOdd.isEven(1));
    }

}