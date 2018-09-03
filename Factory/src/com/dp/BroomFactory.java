package com.dp;

public class BroomFactory extends VehicleFactory{

    @Override
    public Moveable create() {
        return new Broom();
    }
}
