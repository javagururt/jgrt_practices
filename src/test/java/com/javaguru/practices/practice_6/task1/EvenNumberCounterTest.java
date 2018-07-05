package com.javaguru.practices.practice_6.task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberCounterTest {

    @Test
    public void shouldCountEvenNumbers() {
        EvenNumberCounter evenNumberCounter = new EvenNumberCounter();
        assertEquals(11, evenNumberCounter.getEvenNumberCount(0,20));
        assertEquals(16, evenNumberCounter.getEvenNumberCount(-10,20));
        assertEquals(0, evenNumberCounter.getEvenNumberCount(10,0));
    }
}