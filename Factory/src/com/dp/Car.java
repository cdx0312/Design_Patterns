package com.dp;

public class Car implements Moveable{

    private static Car car = new Car();

    Car(){}

    public static Car getInstance() {
        return car;
    }

    public void run() {
        System.out.println("running   !!!");
    }
}
