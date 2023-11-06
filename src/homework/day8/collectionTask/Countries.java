package homework.day8.collectionTask;

import java.util.ArrayList;
import java.util.List;

public class Countries {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for (String str: countries) {
            System.out.print(str + ", ");
        }

        int i=0;
        for (String str2: countries) {
            if (str2.length()<7)
                i++;
        }
        System.out.println(i);

        for (int j = 0; j < countries.size(); j++) {
            System.out.println(countries.get(j));
        }

    }
}
