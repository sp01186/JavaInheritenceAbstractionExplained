package com.sparta;

public class Square extends Shape{
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calcArea() {
        return this.sideLength*this.sideLength;
    }
}
