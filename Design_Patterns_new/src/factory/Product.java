package factory;

/**
 * Created by cdx0312
 * 2018/3/24
 */
public class Product implements IProduct{
    @Override
    public void productMethod() {
        System.out.println("产品");
    }
}
