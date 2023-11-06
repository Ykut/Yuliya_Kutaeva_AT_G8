package homework.day8.collectionTask;

import java.util.ArrayList;
import java.util.List;

public class Cities {
    public static void main(String[] args) {
        List <String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String str:cities) {
            System.out.println(str);
        }

        int j=0;

        for (String str: cities) {
            j += str.length();
        }

        System.out.println(j);

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i)+" ");
        }
    }
}
