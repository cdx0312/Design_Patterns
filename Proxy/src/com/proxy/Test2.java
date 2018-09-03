package com.proxy;

import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args) {
        Method[] methods = com.proxy.Moveable.class.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
