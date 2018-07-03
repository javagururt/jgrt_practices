package com.javaguru.practices.practice_8.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CreatingLists {

    /**
     * Задание 1.
     * <p>
     * Необходимо реализовать метод createArrayList таким образом,
     * чтобы результатом выполнения метода был созданный и заполненный список(ArrayList) числами от 1 до size
     * в убывающем порядке
     */

    List<Integer> createArrayList(int size) {
        return null;
    }

    /**
     * Задание 2.
     * <p>
     * Необходимо реализовать метод таким образом, чтобы результатом работы метода
     * был отсортированный в возр. порядке список целых чисел
     */

    List<Integer> sortArrayList(List<Integer> anotherList) {
        List<Integer> integers = new ArrayList<>(anotherList);
        Collections.sort(integers);
        return integers;
    }
}
