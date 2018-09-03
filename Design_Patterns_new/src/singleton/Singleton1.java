package singleton;

/**
 * Created by cdx0312
 * 2018/3/24
 * 懒汉设计模式，线程安全，但是效率很低，每次调用getInstance方法都需要
 * 获得锁，而大多数情况下不需要同步
 */
public class Singleton1 {
    private Singleton1(){
    }

    private static Singleton1 singleton1;

    public static synchronized Singleton1 getInstacne(){
        if (singleton1 == null)
            singleton1 = new Singleton1();
        return singleton1;
    }
}
