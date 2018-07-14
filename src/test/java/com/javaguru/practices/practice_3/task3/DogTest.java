package com.javaguru.practices.practice_3.task3;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DogTest {

    @Test
    public void create() throws Exception {
        Class.forName("com.javaguru.practices.practice_3.task3.Dog");
    }

    @Test
    public void fieldName() throws Exception {
        Class.forName("com.javaguru.practices.practice_3.task3.Dog").getDeclaredField("name");
    }

    @Test
    public void fieldAge() throws Exception {
        Class.forName("com.javaguru.practices.practice_3.task3.Dog").getDeclaredField("age");
    }

    @Test
    public void fieldColor() throws Exception {
        Class.forName("com.javaguru.practices.practice_3.task3.Dog").getDeclaredField("color");
    }

    @Test
    public void gettersAndSetters() throws Exception {
        Class<?> dogClass = Class.forName("com.javaguru.practices.practice_3.task3.Dog");
        assertThat(dogClass.getDeclaredMethod("getColor")
                .getReturnType()).isEqualTo(String.class);
        assertThat(dogClass.getDeclaredMethod("getName")
                .getReturnType()).isEqualTo(String.class);
        assertThat(dogClass.getDeclaredMethod("getAge")
                .getReturnType()).isEqualTo(Integer.class);
        assertThat(dogClass.getDeclaredMethod("setColor", String.class)
                .getReturnType()).isEqualTo(void.class);
        assertThat(dogClass.getDeclaredMethod("setAge", Integer.class)
                .getReturnType()).isEqualTo(void.class);
        assertThat(dogClass.getDeclaredMethod("setName", String.class)
                .getReturnType()).isEqualTo(void.class);
    }

    @Test
    public void sleep() throws Exception {
        Class<?> dogClass = Class.forName("com.javaguru.practices.practice_3.task3.Dog");
        assertThat(dogClass.getDeclaredMethod("sleep")
                .getReturnType()).isEqualTo(void.class);
    }

    @Test
    public void eat() throws Exception {
        Class<?> dogClass = Class.forName("com.javaguru.practices.practice_3.task3.Dog");
        assertThat(dogClass.getDeclaredMethod("eat")
                .getReturnType()).isEqualTo(void.class);
    }
}