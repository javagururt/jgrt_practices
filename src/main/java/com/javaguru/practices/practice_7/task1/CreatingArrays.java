package com.javaguru.practices.practice_7.task1;

import java.util.Random;

class CreatingArrays {

    /**
     * Необходимо создать массив на n элементов и заполнить случайными числами от 10 до 20 (включительно)
     */

    Integer[] integerArray(int n) {
        Integer[] array = new Integer[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(11) + 10;
        }
        return array;
    }

    /**
     * Необходимо создать и заполнить массив строками от A - Z. Используйте ASCII таблицу
     * <p>
     * Hint 1: Приведение типов
     * int i = 65;
     * char c = (char) i; // A
     * <p>
     * Hint 2: Методы у объекта String
     * У объекта String существует множество методов. Один из них это valueOf(c),
     * с помощью которого можно получить строку из символа.
     * String.valueOf(c)
     */

    String[] stringArray() {
        String[] strings = new String[26];
        for (int i = 0, j = 65; i < strings.length && j <= 90; i++, j++) {
            char c = (char) j;
            strings[i] = String.valueOf(c);
        }
        return strings;
    }
}
