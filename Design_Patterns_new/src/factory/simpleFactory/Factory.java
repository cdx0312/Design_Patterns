package factory.simpleFactory;

/**
 * Created by cdx0312
 * 2018/3/24
 */
public class Factory {
    public Product createFactory(int type) {
        if (type == 1)
            return new Product1();
        else
            return new Product2();
    }
}
