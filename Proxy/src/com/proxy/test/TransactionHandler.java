package com.proxy.test;

import com.proxy.InvocationHandler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TransactionHandler implements InvocationHandler{
    private Object target;

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public TransactionHandler(Object target) {
        this.target = target;
    }

    @Override
    public void invoke(Object object, Method method) {
        System.out.println("Transaction start!!!!");
        try {
            method.invoke(target);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("Transaction commit!!!!");
    }
}
