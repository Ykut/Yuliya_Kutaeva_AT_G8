package homework.day8.collectionTask;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for(String str: butterflies){
            System.out.printf("\"%s\"", str);
        }

        int i=0;

        for (String str2: butterflies) {
            if(str2.contains("o"))
                i++;
        }

        System.out.println("\n"+i);

        for (int j = 0; j < butterflies.size(); j++) {
            System.out.printf("%s"+" ", butterflies.get(j));
        }

        for (String str3:butterflies) {

            System.out.println(str3);
        }



    }
}
