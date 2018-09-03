package factory;

/**
 * Created by cdx0312
 * 2018/3/24
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory = new Factory();
        IProduct product = factory.createProduct();
        product.productMethod();

        IFactory factory1 = new Factory1();
        IProduct product1 = factory1.createProduct();
        product1.productMethod();
    }
}
