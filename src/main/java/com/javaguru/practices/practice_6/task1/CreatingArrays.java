package com.javaguru.practices.practice_6.task1;

import java.util.Random;

class CreatingArrays {

    /**
     * Необходимо создать массив на 10 элементов и заполнить случайными числами
     */

    Integer[] integerArray() {
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt();
        }
        return array;
    }

    /**
     * Необходимо создать и заполнить массив строками от A - Z. Используйте ASCII таблицу
     *
     * Hint 1: Приведение типов
     *      int i = 65;
     *      char c = (char) i; // A
     *
     * Hint 2: Методы у объекта String
     *      У объекта String существует множество методов. Один из них это valueOf(c),
     *      с помощью которого можно получить строку из символа.
     *      String.valueOf(c)
     */

    String[] stringArray() {
        String[] strings = new String[25];
        for (int i = 0, j = 65; i < strings.length && j <= 90; i++, j++) {
            char c = (char) j;
            strings[i] = String.valueOf(c);
        }
        return null;
    }
}
