package com.sparta;

public class Goose extends Bird implements CanFly, CanSquawk {
//    @Override
//    public void fly() {
//        System.out.println("Goose flies");
//    }

    @Override
    public void squawk() {
        System.out.println("Squawk, not sqwuartk");
    }

    @Override
    public void iAmABird() {
        System.out.println("I am a bird");
    }
}
