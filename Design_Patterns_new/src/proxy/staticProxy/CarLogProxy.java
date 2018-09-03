package proxy.staticProxy;

/**
 * Created by cdx0312
 * 2018/3/25
 */

/**
 * 聚合的方法
 */
public class CarLogProxy implements Moveable{

    private Moveable moveable;

    public CarLogProxy(Moveable moveable) {
        this.moveable = moveable;
    }

    @Override
    public void move() {
        System.out.println("log start");
        moveable.move();
        System.out.println("log end");
    }
}
