package com.javaguru.practices.practice_7.task3;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class SwapElementInArrayTest {


    @Test
    public void swapFirstAndMaxElement() {
        SwapElementInArray swapElementInArray = new SwapElementInArray();

        Integer[] result = swapElementInArray.swapFirstAndMaxElement(new Integer[]{1, 2, 3, 4, 5, 5, 6, 2, 3, 1});
        Integer[] result2 = swapElementInArray.swapFirstAndMaxElement(new Integer[]{5, 12, 3, 14, 5, 2, 3, 1});
        Integer[] result3 = swapElementInArray.swapFirstAndMaxElement(new Integer[]{29, 1, 3, 4, 5});

        Integer[] expectedArray = new Integer[]{6, 2, 3, 4, 5, 5, 1, 2, 3, 1};
        Integer[] expectedArray2 = new Integer[]{14, 12, 3, 5, 5, 2, 3, 1};
        Integer[] expectedArray3 = new Integer[]{29, 1, 3, 4, 5};

        assertThat(expectedArray).isEqualTo(result);
        assertThat(expectedArray2).isEqualTo(result2);
        assertThat(expectedArray3).isEqualTo(result3);
    }
}