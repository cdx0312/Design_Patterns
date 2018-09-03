package proxy.jdkProxy;

import proxy.staticProxy.Car;
import proxy.staticProxy.Moveable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by cdx0312
 * 2018/3/25
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car();

        InvocationHandler h = new TimeHandler(car);
        Class<?> cls = car.getClass();

        /**
         * loader：类加载器
         * interfaces：实现接口
         * h ：invocationHandler
         */
        Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);

        m.move();
    }
}
