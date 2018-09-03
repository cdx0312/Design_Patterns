package proxy;

import java.lang.reflect.Method;

/**
 * Created by cdx0312
 * 2018/3/26
 */
public interface InvocationHandler {
    public void invoke(Object o, Method m);
}
