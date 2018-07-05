package com.javaguru.practices.practice_9;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void shouldExtendsFromShapeAndOverrideMethods() throws Exception {
        Method getArea = Class.forName("com.javaguru.practices.practice_9.Circle").getDeclaredMethod("getArea");
        Method getPerimeter = Class.forName("com.javaguru.practices.practice_9.Circle").getDeclaredMethod("getPerimeter");
        assertEquals(getArea.getReturnType(), double.class);
        assertEquals(getPerimeter.getReturnType(), double.class);
        Class.forName("com.javaguru.practices.practice_9.Circle").getConstructor(double.class);
        assertEquals(Shape.class.getName(), Class.forName("com.javaguru.practices.practice_9.Circle").getSuperclass().getName());
    }

    @Test
    public void shouldCalculateArea() throws Exception {
        Constructor<?> constructor = Class.forName("com.javaguru.practices.practice_9.Circle").getConstructor(double.class);
        Object firstCircle = constructor.newInstance(20);
        Object secondCircle = constructor.newInstance(2);
        Object thirdCircle = constructor.newInstance(4);

        Method getArea = firstCircle.getClass().getDeclaredMethod("getArea");
        double firstResult = (double) getArea.invoke(firstCircle);
        double secondResult = (double) getArea.invoke(secondCircle);
        double thirdResult = (double) getArea.invoke(thirdCircle);

        assertEquals(1256.63, firstResult, 0.01);
        assertEquals(12.56, secondResult, 0.01);
        assertEquals(50.26, thirdResult, 0.01);
    }
}