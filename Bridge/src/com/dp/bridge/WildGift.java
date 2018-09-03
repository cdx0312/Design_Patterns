package com.dp.bridge;

public class WildGift extends Gift{

    public WildGift(Ring ring) {
        this.giftImp = ring;
    }
}

//使用桥接：两个维度，排列组合，
// 将一个维度的引用放在父类，
