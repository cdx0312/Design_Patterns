package factory.abstractFactory;

import factory.simpleFactory.Product;

/**
 * Created by cdx0312
 * 2018/3/24
 */
public class Client {
    public static void main(String[] args) {
        //生产产品
        AbstratFactory factory = new Factory();
        IProductA productA = factory.createProductA();
        productA.productMethod();
        IProductB productB = factory.createProductB();
        productB.productMethod();
        //生产产品1

        AbstratFactory factory1 = new Factory1();
        IProductA productA1 = factory1.createProductA();
        IProductB productB1 = factory1.createProductB();
        productA1.productMethod();
        productB1.productMethod();
    }
}
