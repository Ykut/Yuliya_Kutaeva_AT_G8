package homework.day8.collectionTask;

import java.util.ArrayList;
import java.util.List;

public class Noodles {
    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");
        for (String str:noodles) {
            System.out.printf("-%s%n", str);
        }
//не меняет а на o
        for (String str2: noodles) {
            if (str2.contains("a")){
                str2.replace("a", "o");
            }
        }

        for (int i = 0; i < noodles.size(); i++) {
            System.out.printf("%s ", noodles.get(i));
        }





    }
}
