package com.dp.bridge;

public class MMUnhappyState extends MMState{
    @Override
    public void smile() {
        System.out.println("unhappy smile");
    }

    @Override
    public void cry() {
        System.out.println("unhappy cry");
    }

    @Override
    public void say() {
        System.out.println("unhappy say");
    }
}
