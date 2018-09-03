package com.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler{
    private Object target;

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public TimeHandler(Object target) {
        this.target = target;
    }

    @Override
    public void invoke(Object object, Method method) {
        long start = System.currentTimeMillis();
        System.out.println("startTime: " + start);
        try {
            method.invoke(target);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("endTime : " + end);
        System.out.println("time : " + (end - start));
    }
}
