package com.javaguru.practices.practice_7.task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayUtilsTest {

    @Test
    public void shouldFindAverage() {
        int[] array = new int[]{1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 9};
        int[] array2 = new int[]{2, -4, 3, 1, 23, 44, 32, 10};
        int[] array3 = new int[]{12, 13, 14, 3, 50, 13, 13};

        assertEquals(3.5454545454545454, ArrayUtils.findAverageInArray(array), 0.001);
        assertEquals(13.875, ArrayUtils.findAverageInArray(array2), 0.001);
        assertEquals(16.857142857142858, ArrayUtils.findAverageInArray(array3), 0.001);
    }

    @Test
    public void shouldFindMax() {
        int[] array = new int[]{1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 9};
        int[] array2 = new int[]{2, -4, 3, 1, 23, 44, 32, 10};
        int[] array3 = new int[]{12, 13, 14, 3, 50, 13, 13};

        assertEquals(9, ArrayUtils.findMaxInArray(array));
        assertEquals(44, ArrayUtils.findMaxInArray(array2));
        assertEquals(50, ArrayUtils.findMaxInArray(array3));

    }

    @Test
    public void shouldFindMinEven() {
        String[] array = new String[]{"A", "AB", "ABC", "ABCD"};
        String[] array2 = new String[]{"AAA", "BBB", "AAAAAA", "DDDD"};
        String[] array3 = new String[1];

        assertEquals("ABCD", ArrayUtils.findLongestWord(array));
        assertEquals("AAAAAA", ArrayUtils.findLongestWord(array2));
        assertEquals("", ArrayUtils.findLongestWord(array3));
    }
}