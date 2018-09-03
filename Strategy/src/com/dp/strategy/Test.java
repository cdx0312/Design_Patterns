package com.dp.strategy;

public class Test {
    public static void main(String[] args) {
        Cat[] a = {new Cat(5,5, new CatWeightComparator()), new Cat(3,3, new CatWeightComparator()), new Cat(1,1, new CatWeightComparator())};
//        Dog[] dogs = {new Dog(123), new Dog(122)};
        DataSorter.sort(a);
        DataSorter.print(a);
//        DataSorter.print(dogs);
//        DataSorter.sort(dogs);
//        DataSorter.print(dogs);
    }
}
