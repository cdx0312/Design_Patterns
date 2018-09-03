import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Cow> cows = new ArrayList<>();
        Cow cow = new Cow();
        cow.setAge(5);
        cows.add(cow);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < cows.size(); j++) {
                Cow cow1 = cows.get(j);
                Cow cow2 = cow1.birth();
                if (cow2 != null) {
                    cows.add(cow2);
                }
                cow1.setAge(cow1.getAge()+1);
            }
            System.out.println(i + cows.size());
        }
        System.out.println(cows.size());
    }
}
