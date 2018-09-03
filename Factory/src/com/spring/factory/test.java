package com.spring.factory;

import java.io.IOException;
import java.util.Properties;

public class test {
    public static void main(String[] args) throws Exception{
        BeanFactory factory = new ClassPathXmlApplicationContext("com/spring/factory/applicationContext.xml");
        Object object = factory.getBean("v");
        Moveable moveable = (Moveable)object;
        moveable.run();
    }
}
