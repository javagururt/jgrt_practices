package com.javaguru.practices.practice_2.task1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanTest {

    @Test
    public void shouldCreateHumansWithNameAndAge() throws Exception {
        Human firstHuman = new Human("Vasya", 30);
        Human secondHuman = new Human("Bob", 20);

        assertEquals(firstHuman.getAge(), 30);
        assertEquals(firstHuman.getName(), "Vasya");

        assertEquals(secondHuman.getAge(), 20);
        assertEquals(secondHuman.getName(), "Bob");
    }
}