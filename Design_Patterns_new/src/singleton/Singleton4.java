package singleton;

/**
 * Created by cdx0312
 * 2018/3/30
 * 静态内部类单例：
 * 第一次加载Singleton类时并不会初始化是Instance，只有第一次调用Singleton
 * 方法时虚拟机加载SingletonHolder并初始化sInstance，这样不仅能确保线程安
 * 全也能保证Singleton的唯一性，推荐使用。
 */
public class Singleton4 {
    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder{
        private static final Singleton4 sInstance = new Singleton4();
    }
}
