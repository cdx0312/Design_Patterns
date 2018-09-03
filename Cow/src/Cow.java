public class Cow {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cow birth() {
        if (age > 4)
            return new Cow();
        return null;
    }
}
