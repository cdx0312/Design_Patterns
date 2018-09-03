package builder;

/**
 * Created by cdx0312
 * 2018/3/24
 */
public class Test {
    public static void main(String[] args) {
        Builder builder = new AppleBuilder();
        Director director = new Director(builder);
        director.construct(4,2,"Max OS X 10.0.3");
        System.out.println(builder.create().toString());
    }
}
