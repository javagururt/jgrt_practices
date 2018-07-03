package com.javaguru.practices.practice_9;

/**
 * 1. Необходимо сделать так, чтобы класс Circle был унаследован
 * от класса Shape. Ключевое слово "extends"
 * <p>
 * 2. Необходимо переопределить методы класса Shape таким образом,
 * чтобы результатом работы методов были вычислены площадь и периметр
 */
class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
