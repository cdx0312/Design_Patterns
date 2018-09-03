package proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by cdx0312
 * 2018/3/25
 */
public class TimeHandler implements InvocationHandler{

    private Object target;

    public TimeHandler(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy 被代理的对象
     * @param method 被代理对象的方法
     * @param args 被代理对象的方法的参数
     * @return Object对象，方法的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("time begin");
        method.invoke(target);
        System.out.println("time end");
        return null;
    }
}
