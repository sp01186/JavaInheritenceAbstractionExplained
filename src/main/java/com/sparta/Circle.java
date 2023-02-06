package com.sparta;

public class Circle extends Shape{
    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public double calcArea(){
        return Math.PI * radius * radius;
    }

}
