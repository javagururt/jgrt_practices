package com.javaguru.practices.practice_4.task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOrOddTest {

    @Test
    public void shouldBeEven() {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        assertTrue(evenOrOdd.isEven(10));
    }

    @Test
    public void shouldBeOdd() {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        assertFalse(evenOrOdd.isEven(1));
    }
}