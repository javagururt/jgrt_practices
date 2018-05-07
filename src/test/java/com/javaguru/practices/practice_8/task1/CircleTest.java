package com.javaguru.practices.practice_8.task1;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CircleTest {

    @Test
    public void name() {
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
        for (int i = 0; i < declaredMethods.length; i++) {
            System.out.println(declaredMethods[i]);
        }
    }
}