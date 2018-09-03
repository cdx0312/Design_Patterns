package proxy.jdkProxy;

import proxy.staticProxy.Car;
import proxy.staticProxy.Moveable;

import java.lang.reflect.Proxy;

/**
 * Created by cdx0312
 * 2018/3/25
 */
public class Test2 {
    public static void main(String[] args) {
        Car car = new Car();
        LogHandler logHandler = new LogHandler(car);
        Moveable m = (Moveable) Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(), logHandler);
        Moveable m1 = (Moveable) Proxy.newProxyInstance(m.getClass().getClassLoader(), m.getClass().getInterfaces(), new TimeHandler(m));
        m1.move();
    }
}
