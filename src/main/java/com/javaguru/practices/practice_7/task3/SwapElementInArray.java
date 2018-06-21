package com.javaguru.practices.practice_7.task3;

class SwapElementInArray {

    /**
     * Задание 1.
     * <p>
     * Необходимо реализовать метод swapFirstAndMaxElement таким образом, чтобы
     * в переданном массиве первый элемент и элемент с максимальным значением
     * были поменяны местами
     */

    Integer[] swapFirstAndMaxElement(Integer[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        Integer max = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }
        int tmp = array[0];
        array[0] = array[maxIndex];
        array[maxIndex] = tmp;
        return array;
    }
}
