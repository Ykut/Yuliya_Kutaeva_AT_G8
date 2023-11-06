package homework.day8.collectionTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Birds {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>(Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"));

        for (String str: birds) {
            System.out.printf("--%s--%n", str);
        }

        int count=0;
        for (String str : birds) {
            if (str.matches(".*[аеёиоуэюя].*[аеёиоуэюя].*"))
                count++;
        }
        System.out.println(count);

        for (int i = 0; i < birds.size(); i++) {
            System.out.printf("%s ", birds.get(i));
        }

        birds.set(3, "Синица");

        System.out.printf("%n");

        for (String bird:birds){
            System.out.printf("%s ",bird);
        }
    }

}
