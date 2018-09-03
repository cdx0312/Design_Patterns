package proxy;

import proxy.staticProxy.Car;
import proxy.staticProxy.Moveable;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by cdx0312
 * 2018/3/25
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Car car = new Car();
        InvocationHandler h = new TimeHandler(car);
        Object o = Proxy.newProxyInstance(Moveable.class, h);
        ((Moveable)o).move();

    }
}
