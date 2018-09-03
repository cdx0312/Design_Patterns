package prototype;

/**
 * Created by cdx0312
 * 2018/3/25
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建对象
        ConcretePrototype original = new ConcretePrototype();
        original.setmText("first");
        original.addImage("pic 1");
        original.addImage("pic 2");
        original.addImage("pic 3");
        original.addImage("pic 4");
        original.showContent();

        ConcretePrototype clone = (ConcretePrototype) original.clone();
        clone.showContent();

        clone.setmText("clone");
        clone.showContent();

        original.showContent();
    }
}
