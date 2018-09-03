package factory;

/**
 * Created by cdx0312
 * 2018/3/24
 */
public class Factory1 implements IFactory{
    @Override
    public IProduct createProduct() {
        return new Product1();
    }
}
