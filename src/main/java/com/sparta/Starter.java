package com.sparta;

public class Starter {
    public static void start() {
        Shape circle = new Circle(4);
        System.out.println(circle.calcArea());
        Shape square = new Square(5);
        System.out.println(square.calcArea());
    }
}
