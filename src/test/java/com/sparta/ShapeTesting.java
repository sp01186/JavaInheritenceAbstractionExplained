package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTesting {

    @Test
    @DisplayName("Testing a circle")
    public void testingCalculateAreaOfCircle() {
        int radius = 5;
        Shape circle = new Circle(radius);
        double result = circle.calcArea();
        Assertions.assertTrue(78.5398163 > (result-0.1) && 78.5398163 < (result+0.1));
    }

    @Test
    @DisplayName("Testing the square class")
    public void testingCalculateAreaOfSquare() {
        double width =8;
        Shape square = new Square(width);
        double result = square.calcArea();
        Assertions.assertEquals(64, result);
    }
}

