package com.javaguru.practices.practice_8.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CreatingLists {

    /**
     * Задание 1.
     * <p>
     * Необходимо реализовать метод createArrayList таким образом,
     * чтобы результатом выполнения метода был созданный и заполненный список(ArrayList) числами от 0 до 10
     * в убывающем порядке
     */

    List<Integer> createArrayList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            list.add(i);
        }
        return list;
    }

    /**
     * Задание 2.
     * <p>
     * Необходимо реализовать метод таким образом, чтобы результатом работы метода
     * был отсортированный в возр. порядке список нечетных чисел
     */

    List<Integer> createAndSortArrayListFromAnotherCollection(List<Integer> anotherList) {
        List<Integer> integers = new ArrayList<>(anotherList);
        Collections.sort(integers);
        return integers;
    }
}
