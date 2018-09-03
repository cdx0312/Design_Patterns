package com.dp;

public class Test {
    public static void main(String[] args) {
//        Car car =  Car.getInstance();
//        Car car1 = Car.getInstance();
        VehicleFactory factory = new CarFactory();
        Moveable m = factory.create();
//        System.out.println(car == car1);
//        car.run();
        m.run();
    }
}
