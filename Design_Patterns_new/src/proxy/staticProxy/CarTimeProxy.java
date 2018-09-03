package proxy.staticProxy;

/**
 * Created by cdx0312
 * 2018/3/25
 */

/**
 * 聚合的方法
 */
public class CarTimeProxy implements Moveable{

    private Moveable moveable;

    public CarTimeProxy(Moveable moveable) {
        this.moveable = moveable;
    }

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        moveable.move();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println(endTime - startTime);
    }
}
