package com.javaguru.practices.practice_7.task1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CreatingArraysTest {

    @Test
    public void integerArray() {
        CreatingArrays creatingArrays = new CreatingArrays();
        int n = 1000;
        Integer[] array = creatingArrays.integerArray(n);

        assertEquals(n, array.length);

        for (int i = 10; i <= 20; i++) {
            assertTrue(Arrays.asList(array).contains(i));
        }

    }

    @Test
    public void stringArray() {
        CreatingArrays creatingArrays = new CreatingArrays();
        String[] actual = creatingArrays.stringArray();
        String[] expected = new String[]{
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
                "U", "V", "W", "X", "Y", "Z" };

        assertArrayEquals(expected, actual);
    }
}