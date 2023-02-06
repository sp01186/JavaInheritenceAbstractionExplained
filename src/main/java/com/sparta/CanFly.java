package com.sparta;

public interface CanFly {
    public static final int i = 1;
    default void fly(){
        System.out.println("this thing flies");
    };
}
