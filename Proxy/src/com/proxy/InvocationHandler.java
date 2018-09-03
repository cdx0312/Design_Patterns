package com.proxy;

import java.lang.reflect.Method;

public interface InvocationHandler {
    public void invoke(Object object, Method method);
}
