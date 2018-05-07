package com.javaguru.practices.practice_7.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CreatingLists {

    List<Integer> createArrayList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            list.add(i);
        }
        return list;
    }

    List<Integer> createAndSortArrayListFromAnotherCollection(List<Integer> anotherList) {
        List<Integer> integers = new ArrayList<>(anotherList);
        Collections.sort(integers);
        return integers;
    }
}
