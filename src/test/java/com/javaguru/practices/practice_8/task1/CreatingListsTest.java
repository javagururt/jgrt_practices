package com.javaguru.practices.practice_8.task1;

import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class CreatingListsTest {
    @Test
    public void shouldCreateArrayList() {
        CreatingLists creatingLists = new CreatingLists();
        List<Integer> integers = creatingLists.createArrayList(100);
        List<Integer> expectedArray = IntStream.range(1, 101)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        assertEquals(expectedArray, integers);
    }
}