package proxy.staticProxy;

/**
 * Created by cdx0312
 * 2018/3/25
 * 继承
 */
public class Car2 extends Car{
    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        super.move();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println(endTime - startTime);
    }
}
