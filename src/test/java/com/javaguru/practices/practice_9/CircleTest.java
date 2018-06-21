package com.javaguru.practices.practice_9;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CircleTest {

    @Test
    public void name() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Circle circle = new Circle();
        Annotation[] a = circle.getClass().getDeclaredAnnotations();
        for (Annotation anA : a) {
            System.out.println(anA);
        }

        Field[] declaredFields = circle.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        AnnotatedType annotatedSuperclass = circle.getClass().getAnnotatedSuperclass();

        System.out.println(annotatedSuperclass.getType().getTypeName());

        Method[] declaredMethods = circle.getClass().getDeclaredMethods();
        Method method = circle.getClass().getDeclaredMethod("getArea");
        for (int i = 0; i < declaredMethods.length; i++) {
            System.out.println(declaredMethods[i]);

            System.out.println(declaredMethods[i].invoke(circle));
        }
    }
}