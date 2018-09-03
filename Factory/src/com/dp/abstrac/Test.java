package com.dp.abstrac;

public class Test {
    public static void main(String[] args) {
//        DefaultFactory factory = new DefaultFactory();
        MagicFactory factory = new MagicFactory();
        Vehicle vehicle = factory.createVehicle();
        vehicle.run();
        Weapon weapon = factory.createWeapon();
        weapon.shoot();
        Food food = factory.createFood();
        food.printName();
    }
}
