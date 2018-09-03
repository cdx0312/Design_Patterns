package singleton;


/**
 * Created by cdx0312
 * 2018/3/23
 * 饿汉，基于ClassLoader机制避免了多线程的同步问题，加载过程较慢，获取对象速度较快
 * 不过instance在类装载时就实例化。虽然大多数情况下调用单例模式的getInstance方法导致类加载，但是也不能确定没有其他
 * 静态方法导致类被加载，从而没有达到懒加载的效果。
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }
}
