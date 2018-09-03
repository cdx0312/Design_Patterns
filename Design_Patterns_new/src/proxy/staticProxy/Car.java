package proxy.staticProxy;

import java.util.Random;

/**
 * Created by cdx0312
 * 2018/3/25
 */
public class Car implements Moveable{

    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
