package factory.abstractFactory;

/**
 * Created by cdx0312
 * 2018/3/24
 */
public class Factory implements AbstratFactory{
    @Override
    public IProductA createProductA() {
        return new ProductA();
    }

    @Override
    public IProductB createProductB() {
        return new ProductB();
    }
}
