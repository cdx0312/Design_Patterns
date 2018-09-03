package com.dp.strategy;

public class CatWeightComparator implements java.util.Comparator{
    @Override
    public int compare(Object object1, Object object2) {
        Cat cat1 = (Cat)object1;
        Cat cat2 = (Cat)object2;
        if (cat1.getWeight() > cat2.getWeight())
            return -1;
        else if (cat1.getWeight()<cat2.getWeight())
            return 1;
        else
            return 0;
    }
}
