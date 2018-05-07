package com.javaguru.practices.practice_xx;

import java.util.*;
import java.util.stream.Collectors;

class Streams {

    List<Integer> oddList(List<Integer> integers) {
        return integers.stream()
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());
    }

    Optional<Integer> findFirstEvenNumberInStream(List<Integer> integers) {
        return integers.stream()
                .filter(i -> i % 2 == 0)
                .findFirst();
    }

    List<String> toUpperCase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    Integer sum(List<Integer> integers) {
        return integers.stream()
                .filter(i -> i % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    String collectAllWords(List<String> strings) {
        return strings.stream()
                .collect(Collectors.joining(","));
    }

    Set<String> uniqueWords(List<String> notUniqueWords) {
        return notUniqueWords.stream()
                .filter(s -> s.length() > 5)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        Class<?>[] interfaces = strings.getClass().getInterfaces();
        for (int i = 0; i < interfaces.length; i++) {
            System.out.println(interfaces[i].getName());
        }
    }
}
