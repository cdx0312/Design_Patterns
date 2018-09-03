package factory.simpleFactory;

/**
 * Created by cdx0312
 * 2018/3/24
 */
public class Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Product product1 = factory.createFactory(1);
        Product product2 = factory.createFactory(2);
    }
}
