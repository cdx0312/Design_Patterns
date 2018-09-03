package prototype;

import java.util.ArrayList;

/**
 * Created by cdx0312
 * 2018/3/25
 */
public class ConcretePrototype implements Cloneable{
    private String mText;
    private ArrayList<String> mImages = new ArrayList<>();

    public ConcretePrototype() {
        System.out.println("concretePrototype构造函数");
    }

    /**
     * 浅拷贝
     * @return
     * @throws CloneNotSupportedException
     */
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        try {
//            ConcretePrototype concretePrototype = (ConcretePrototype) super.clone();
//            concretePrototype.mText = this.mText;
//            concretePrototype.mImages = this.mImages;
//            return concretePrototype;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }

    /**
     * 深拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            ConcretePrototype concretePrototype = (ConcretePrototype) super.clone();
            concretePrototype.mText = this.mText;
            concretePrototype.mImages = (ArrayList<String>) this.mImages.clone();
            return concretePrototype;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getmImages() {
        return mImages;
    }

    public void setmImages(ArrayList<String> mImages) {
        this.mImages = mImages;
    }

    public void addImage(String img) {
        this.mImages.add(img);
    }

    public void showContent() {
        System.out.println("==========start===========");
        System.out.println("Text:  " + mText);
        System.out.println("Images List: ");
        for (String string : mImages) {
            System.out.println("image name : " + string);
        }
        System.out.println("============end==========");
    }
}
