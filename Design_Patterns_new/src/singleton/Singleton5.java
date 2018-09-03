package singleton;

/**
 * Created by cdx0312
 * 2018/3/30
 * 默认枚举类实例的创建是线程安全的，并且在任何情况下都是单例，上述的几种
 * 单例在反序列化的情况下会创建对象，将一个单例实例对象写到磁盘再读回来，
 * 从而获得一个实例。反序列化操作提供了
 */
public enum Singleton5 {
    INSTANCE;
    public void doSomething() {
    }
}
