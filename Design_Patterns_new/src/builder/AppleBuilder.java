package builder;

/**
 * Created by cdx0312
 * 2018/3/24
 */
public class AppleBuilder extends Builder{

    private Computer mApplePC = new AppleComputer();

    @Override
    public void buildCPU(int core) {
        mApplePC.setmCpuCore(core);
    }

    @Override
    public void buildRAM(int gb) {
        mApplePC.setmRanSize(gb);
    }

    @Override
    public void buildOs(String os) {
        mApplePC.setmOs(os);
    }

    @Override
    public Computer create() {
        return mApplePC;
    }
}
