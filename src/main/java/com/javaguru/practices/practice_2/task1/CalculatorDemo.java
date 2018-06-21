package com.javaguru.practices.practice_2.task1;

class CalculatorDemo {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum result: " + calc.sum(10, 20));
        System.out.println("Subtract result: " + calc.divide(10, 20));
        System.out.println("Multiply result: " + calc.multiply(10, 20));
        System.out.println("Divide result: " + calc.divide(200, 2));
    }
}
