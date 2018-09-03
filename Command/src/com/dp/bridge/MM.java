package com.dp.bridge;

public class MM {
    private String name;
    private MMState state = new MMHappyState();

    public MMState getState() {
        return state;
    }

    public void setState(MMState state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void smile() {
        state.smile();
    }

    public void cry(){
        state.cry();
    }

    public void say() {
        this.state.say();
    }
}
