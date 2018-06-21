package com.javaguru.practices.practice_7.task3;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class SwapElementInArrayTest {


    @Test
    public void shouldSwapFirstAndMaxElement() {
        SwapElementInArray swapElementInArray = new SwapElementInArray();
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 5, 6, 2, 3, 1};
        Integer[] array2 = new Integer[]{5, 12, 3, 14, 5, 2, 3, 1};
        Integer[] array3 = new Integer[]{29, 1, 3, 4, 5};

        Integer[] result = swapElementInArray.swapFirstAndMaxElement(new Integer[]{6, 2, 3, 4, 5, 5, 1, 2, 3, 1});
        Integer[] result2 = swapElementInArray.swapFirstAndMaxElement(new Integer[]{5, 12, 3, 14, 5, 2, 3, 1});
        Integer[] result3 = swapElementInArray.swapFirstAndMaxElement(new Integer[]{29, 1, 3, 4, 5});

        assertThat(result).isEqualTo(array);
        assertThat(result2).isEqualTo(array2);
        assertThat(result3).isEqualTo(array3);
    }
}