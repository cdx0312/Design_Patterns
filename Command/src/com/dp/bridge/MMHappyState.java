package com.dp.bridge;

public class MMHappyState extends MMState{
    @Override
    public void smile() {
        System.out.println("happy smile");
    }

    @Override
    public void cry() {
        System.out.println("happy cry");
    }

    @Override
    public void say() {
        System.out.println("happy say");
    }
}
