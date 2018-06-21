package com.javaguru.practices.practice_4.task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxOfTwoTest {

    @Test
    public void shouldGetMaxOfTwo() throws Exception {
        MaxOfTwo maxOfTwo = new MaxOfTwo();
        assertEquals(10, maxOfTwo.getMaxOfTwo(10,5));
        assertEquals(-1, maxOfTwo.getMaxOfTwo(-1,-5));
        assertEquals(30, maxOfTwo.getMaxOfTwo(30,30));
    }
}