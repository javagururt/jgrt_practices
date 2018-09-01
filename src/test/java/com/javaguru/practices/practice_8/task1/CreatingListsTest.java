package com.javaguru.practices.practice_8.task1;

import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class CreatingListsTest {
    @Test
    public void createArrayList() {
        CreatingLists creatingLists = new CreatingLists();
        List<Integer> integers = creatingLists.createArrayList(100);
        List<Integer> expectedArray = IntStream.range(1, 101)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        assertEquals(expectedArray, integers);
    }

    @Test
    public void sortArrayList() {
        List<Integer> integers = IntStream.range(1, 101)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        CreatingLists creatingLists = new CreatingLists();
        creatingLists.sortArrayList(integers);
        List<Integer> expectedArray = IntStream.range(1, 101)
                .boxed()
                .collect(Collectors.toList());
        assertEquals(expectedArray, integers);
    }
}