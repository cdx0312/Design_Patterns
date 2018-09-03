package com.dp.strategy;
import java.lang.Comparable;

import java.util.List;

public class DataSorter {
    public static void sort(Object[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i; j < list.length; j++) {
                Comparable o1 = (Comparable)list[i];
                Comparable o2 = (Comparable)list[j];
                if (o1.compareTo(o2) > 0) {
                    swap(list, i, j);
                }
            }
        }
    }

    private static void swap(Object[] list, int i, int j) {
        Object temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static void print(Object[] list) {
        System.out.print("[");
        for (int i = 0; i < list.length - 1; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.print(list[list.length - 1] + "]");
    }
}
