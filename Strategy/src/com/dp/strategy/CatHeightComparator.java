package com.dp.strategy;

public class CatHeightComparator implements java.util.Comparator<Cat>{
    @Override
    public int compare(Cat object1, Cat object2) {
        Cat cat1 = (Cat)object1;
        Cat cat2 = (Cat)object2;
        if (cat1.getHeight() > cat2.getHeight())
            return 1;
        else if (cat1.getHeight()<cat2.getHeight())
            return -1;
        else
            return 0;
    }
}
