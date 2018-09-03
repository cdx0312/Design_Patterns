package proxy.staticProxy;

/**
 * Created by cdx0312
 * 2018/3/25
 */
public class Test {
    public static void main(String[] args) {
        Moveable car = new Car();
        CarTimeProxy carTimeProxy = new CarTimeProxy(car);
        CarLogProxy carLogProxy = new CarLogProxy(carTimeProxy);
        carLogProxy.move();
    }
}
