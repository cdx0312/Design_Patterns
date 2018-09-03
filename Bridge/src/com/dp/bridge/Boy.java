package com.dp.bridge;

public class Boy {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void chase(MM mm){
//        Gift gift = new WarmGift(new Flower());
        Gift gift = new WildGift(new Ring());
    }

    public void give(GiftImpl gift, MM mm) {

    }
}
