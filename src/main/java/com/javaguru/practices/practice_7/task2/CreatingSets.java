package com.javaguru.practices.practice_7.task2;

import java.util.*;

class CreatingSets {

    Set<String> createEmptyHashSet() {
        return new HashSet<>();
    }

    Set<String> createAndSortSet(List<String> list) {
        Set<String> strings = new TreeSet<>(new ReverseOrderStringComparator());
        strings.addAll(list);
        return strings;
    }
}
