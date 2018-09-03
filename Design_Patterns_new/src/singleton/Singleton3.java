package singleton;

/**
 * Created by cdx0312
 * 2018/3/30
 * 双重检查模式，第一次是为了减少不必要的同步，当singleton对象存在时，
 * 直接返回实例对象，则同步只发生在多个线程同时调用getInstance加载类
 * 第二次判空是为了singleton为null才创建实例。
 * DCL优点是资源利用率高，第一次执行getInstance时单例对象才被实例化，效率高。
 * 缺点是第一次加载速度慢，高并发场景中也会影响其性能，但是也存在DCL失效，
 * 建议使用静态内部类单例模式来替代DCL
 */
public class Singleton3 {
    private volatile static Singleton3 singleton;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (singleton == null) {
            synchronized (Singleton3.class) {
                if (singleton == null) {
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }
}
