package singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cdx0312
 * 2018/3/30
 * 使用容器实现单例模式
 * 用SingletonManager 将多种的单例类统一管理，在使用时根据key获取对象
 * 对应类型的对象。这种方式使得我们可以管理多种类型的单例，并且在使用
 * 时可以通过统一的接口进行获取操作，降低了用户的使用成本，也对用户隐
 * 藏了具体实现，降低了耦合度。
 */
public class Singleton6 {
    private static Map<String, Object> objectMap = new HashMap<>();
    private Singleton6() {
    }

    public static void registerService(String key, Object instance) {
        if (!objectMap.containsKey(key)) {
            objectMap.put(key, instance);
        }
    }

    public static Object getService(String key) {
        return objectMap.get(key);
    }
}
