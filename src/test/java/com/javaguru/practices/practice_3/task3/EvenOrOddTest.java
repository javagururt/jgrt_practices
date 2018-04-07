package com.javaguru.practices.practice_3.task3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenOrOddTest {

    @Test
    public void shouldBeEven() throws Exception {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        assertEquals(true, evenOrOdd.isEven(10));
    }

    @Test
    public void shouldBeOdd() throws Exception {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        assertEquals(false, evenOrOdd.isEven(1));
    }
}