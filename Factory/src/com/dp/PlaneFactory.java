package com.dp;

public class PlaneFactory extends VehicleFactory{

    @Override
    public Moveable create() {
        return new Plane();
    }
}
