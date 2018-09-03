package com.dp.strategy;

public class Dog implements Comparable{
    private int food;

    public Dog(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    @Override
    public int compareTo(Object object) {
        Dog dog = (Dog)object;
        if (this.getFood() > dog.getFood())
            return 1;
        else if (this.getFood() < dog.getFood())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
