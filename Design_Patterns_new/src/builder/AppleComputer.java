package builder;

/**
 * Created by cdx0312
 * 2018/3/24
 */
public class AppleComputer extends Computer{
    protected AppleComputer(){
    }

    @Override
    public void setmCpuCore(int mCpuCore) {
        super.mCpuCore = mCpuCore;
    }

    @Override
    public void setmRanSize(int mRanSize) {
        super.mRanSize = mRanSize;
    }

    @Override
    public void setmOs(String mOs) {
        super.mOs = mOs;
    }
}
