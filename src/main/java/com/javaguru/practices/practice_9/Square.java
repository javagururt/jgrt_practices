package com.javaguru.practices.practice_9;

/**
 * 1. Необходимо сделать так, чтобы класс Square был унаследован
 * от класса Shape. Ключевое слово "extends"
 * <p>
 * 2. Необходимо переопределить методы класса Shape таким образом,
 * чтобы результатом работы методов были вычислены площадь и периметр
 */
class Square extends Shape {

    private double side;

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    double getPerimeter() {
        return side * 4;
    }
}
