package com.javaguru.practices.practice_4.task1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxOfTwoTest {

    @Test
    public void getMaxOfTwo() {
        MaxOfTwo maxOfTwo = new MaxOfTwo();
        assertEquals(10, maxOfTwo.getMaxOfTwo(10, 5));
        assertEquals(-1, maxOfTwo.getMaxOfTwo(-5, -1));
        assertEquals(30, maxOfTwo.getMaxOfTwo(30, 30));
    }
}