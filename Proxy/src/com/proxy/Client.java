package com.proxy;

public class Client {
    public static void main(String[] args) throws Exception {
        Tank tank = new Tank();
        InvocationHandler h = new TimeHandler(tank);


        Moveable moveable = (Moveable) Proxy.newProxyInstance(Moveable.class, h);

        moveable.move();
    }
}
