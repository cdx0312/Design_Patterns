package singleton;

/**
 * Created by cdx0312
 * 2018/3/24
 * 懒汉设计模式，线程不安全
 */
public class Singleton2 {
    private Singleton2(){
    }

    private static Singleton2 singleton1;

    public static Singleton2 getInstacne(){
        if (singleton1 == null)
            singleton1 = new Singleton2();
        return singleton1;
    }
}
