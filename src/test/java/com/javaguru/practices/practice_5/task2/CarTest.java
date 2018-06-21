package com.javaguru.practices.practice_5.task2;

import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void shouldAddGettersAndSetters() throws Exception {
        Car car = new Car();
        car.getClass().getDeclaredMethod("getColor");
        car.getClass().getDeclaredMethod("getManufacturer");
        car.getClass().getDeclaredMethod("setColor", String.class);
        car.getClass().getDeclaredMethod("setManufacturer", String.class);
    }

    @Test
    public void shouldOverrideToString() throws Exception {
        Car car = new Car();
        Method setColor = car.getClass().getDeclaredMethod("setColor", String.class);
        Method setManufacturer = car.getClass().getDeclaredMethod("setManufacturer", String.class);

        setColor.invoke(car, "Red");
        setManufacturer.invoke(car, "BMW");

        assertEquals(car.toString(), "Car{manufacturer='BMW', color='Red'}");
    }

    @Test
    public void shouldBeEquals() throws Exception {
        Car car = new Car();
        Method setColor = car.getClass().getDeclaredMethod("setColor", String.class);
        Method setManufacturer = car.getClass().getDeclaredMethod("setManufacturer", String.class);

        setColor.invoke(car, "Red");
        setManufacturer.invoke(car, "BMW");

        Car car2 = new Car();
        setColor.invoke(car2, "Red");
        setManufacturer.invoke(car2, "BMW");
        assertEquals(car, car2);
    }
}