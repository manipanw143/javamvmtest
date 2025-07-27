package com.example;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("10 - 5 = " + calc.subtract(10, 5));
    }
}
