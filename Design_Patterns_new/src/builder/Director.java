package builder;

/**
 * Created by cdx0312
 * 2018/3/24
 */
public class Director {
    Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(int cpu, int ram, String os) {
        builder.buildCPU(cpu);
        builder.buildRAM(ram);
        builder.buildOs(os);
    }
}
