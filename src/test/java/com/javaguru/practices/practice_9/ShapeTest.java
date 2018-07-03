package com.javaguru.practices.practice_9;

import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShapeTest {

    @Test
    public void shouldHaveAbstractMethods() throws NoSuchMethodException {
        Method getArea = Shape.class.getDeclaredMethod("getArea");
        Method getPerimeter = Shape.class.getDeclaredMethod("getPerimeter");
        assertEquals(getArea.getReturnType(), double.class);
        assertEquals(getPerimeter.getReturnType(), double.class);
        assertTrue(Modifier.isAbstract(getArea.getModifiers()));
        assertTrue(Modifier.isAbstract(getPerimeter.getModifiers()));
    }
}