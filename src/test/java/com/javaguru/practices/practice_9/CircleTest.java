package com.javaguru.practices.practice_9;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void createCircle() throws ClassNotFoundException {
        Class.forName("com.javaguru.practices.practice_9.Circle");
    }

    @Test
    public void extendFromShape() throws ClassNotFoundException {
        assertEquals(Shape.class.getName(), Class.forName("com.javaguru.practices.practice_9.Circle").getSuperclass().getName());
    }

    @Test
    public void overrideGetAreaAndGetPerimeter() throws ClassNotFoundException, NoSuchMethodException {
        Method calculateArea = Class.forName("com.javaguru.practices.practice_9.Circle").getDeclaredMethod("calculateArea");
        Method calculatePerimeter = Class.forName("com.javaguru.practices.practice_9.Circle").getDeclaredMethod("calculatePerimeter");
        assertEquals(calculateArea.getReturnType(), double.class);
        assertEquals(calculatePerimeter.getReturnType(), double.class);
    }

    @Test
    public void addConstructor() throws ClassNotFoundException, NoSuchMethodException {
        Class.forName("com.javaguru.practices.practice_9.Circle").getConstructor(double.class);
    }

    @Test
    public void calculateArea() throws Exception {
        Constructor<?> constructor = Class.forName("com.javaguru.practices.practice_9.Circle").getConstructor(double.class);
        Object firstCircle = constructor.newInstance(20);
        Object secondCircle = constructor.newInstance(2);
        Object thirdCircle = constructor.newInstance(4);

        Method calculateArea = firstCircle.getClass().getDeclaredMethod("calculateArea");
        double firstResult = (double) calculateArea.invoke(firstCircle);
        double secondResult = (double) calculateArea.invoke(secondCircle);
        double thirdResult = (double) calculateArea.invoke(thirdCircle);

        assertEquals(1256.63, firstResult, 0.01);
        assertEquals(12.56, secondResult, 0.01);
        assertEquals(50.26, thirdResult, 0.01);
    }

    @Test
    public void calculatePerimeter() throws Exception {
        Constructor<?> constructor = Class.forName("com.javaguru.practices.practice_9.Circle").getConstructor(double.class);
        Object firstCircle = constructor.newInstance(20);
        Object secondCircle = constructor.newInstance(2);
        Object thirdCircle = constructor.newInstance(4);

        Method calculatePerimeter = firstCircle.getClass().getDeclaredMethod("calculatePerimeter");
        double firstResult = (double) calculatePerimeter.invoke(firstCircle);
        double secondResult = (double) calculatePerimeter.invoke(secondCircle);
        double thirdResult = (double) calculatePerimeter.invoke(thirdCircle);

        assertEquals(125.66, firstResult, 0.01);
        assertEquals(12.56, secondResult, 0.01);
        assertEquals(25.13, thirdResult, 0.01);
    }
}