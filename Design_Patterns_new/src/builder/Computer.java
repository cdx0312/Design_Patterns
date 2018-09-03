package builder;

/**
 * Created by cdx0312
 * 2018/3/24
 */
public abstract class Computer {
    protected int mCpuCore = 1;
    protected int mRanSize = 0;
    protected String mOs = "Dos";

    public Computer() {
    }

    public abstract void setmCpuCore(int mCpuCore);

    public abstract void setmRanSize(int mRanSize);

    public abstract void setmOs(String mOs);

    @Override
    public String toString() {
        return "Computer{" +
                "mCpuCore=" + mCpuCore +
                ", mRanSize=" + mRanSize +
                ", mOs='" + mOs + '\'' +
                '}';
    }
}
