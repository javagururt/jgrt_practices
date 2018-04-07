package com.javaguru.practices.practice_2.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {


    @Test
    public void shouldCalculateArea() throws Exception {
        Circle firstCircle = new Circle(10);
        Circle secondCircle = new Circle(15);
        assertEquals(314.16, firstCircle.getArea(), 0.1);
        assertEquals(706.85, secondCircle.getArea(), 0.1);
    }
}