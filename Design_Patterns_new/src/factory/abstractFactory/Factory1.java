package factory.abstractFactory;

/**
 * Created by cdx0312
 * 2018/3/24
 */
public class Factory1 implements AbstratFactory{
    @Override
    public IProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public IProductB createProductB() {
        return new ProductB1();
    }
}
