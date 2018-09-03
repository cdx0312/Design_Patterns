package builder;

/**
 * Created by cdx0312
 * 2018/3/24
 */
public abstract class Builder {
    public abstract void buildCPU(int core);

    public abstract void buildRAM(int gb);

    public abstract void buildOs(String os);

    public abstract Computer create();
}
