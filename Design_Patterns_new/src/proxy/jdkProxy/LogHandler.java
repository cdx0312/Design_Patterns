package proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by cdx0312
 * 2018/3/25
 */
public class LogHandler implements InvocationHandler{

    private Object target;

    public LogHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("begin log");
        method.invoke(target);
        System.out.println("end log");
        return null;
    }
}
