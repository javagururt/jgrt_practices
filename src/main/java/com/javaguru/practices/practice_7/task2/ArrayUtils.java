package com.javaguru.practices.practice_7.task2;

class ArrayUtils {

    /**
     * Задание 1.
     * Необходимо реализовать метод findAverageInArray таким образом, чтобы результатом
     * выполнения данного метода было среднее арифметическое всех элементов
     * переданного массива
     */

    public static double findAverageInArray(int[] array) {
        int sum = 0;
        for (int anArray : array) {
            sum += anArray;
        }
        return (double) sum / array.length;
    }

    /**
     * Задание 2. Поиск наибольшего числа в массиве
     * <p>
     * Необходимо реализовать метод findMaxInArray таким образом, чтобы результатом работы
     * было наибольшее число из всех элементов переданного в метод массива
     */

    public static int findMaxInArray(int[] array) {
        int max = array[0];
        for (int anArray : array) {
            if (anArray > max) {
                max = anArray;
            }
        }
        return max;
    }

    /**
     * Задание 3. Самое длинное слово в массиве
     * <p>
     * Необходимо реализовать метод findLongestWord таким образом, чтобы результатом
     * работы было найдено самое длинное слово в массиве.
     * <p>
     * В случае если массив пустой вернуть пустую строку
     */

    public static String findLongestWord(String[] array) {
        String max = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (array[i].length() > max.length()) {
                    max = array[i];
                }
            }
        }
        return max;
    }

}
