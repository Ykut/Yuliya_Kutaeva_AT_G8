package homework.day8.collectionTask;

import java.util.ArrayList;
import java.util.List;

public class Elements {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("Text");
        elements.add("field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String str: elements){
            System.out.printf("%s ", str);
        }

        int count=0;
        for(String str: elements){
            if(str.matches(".*-.*"))
                count++;
        }
        System.out.println("\n"+count);

        for (int i = 0; i < elements.size(); i++) {
            System.out.printf("%s ",elements.get(i));
        }

        System.out.printf("\n");

        elements.add(4, "Spinner");
        elements.remove(2);
        elements.set(5, "Switch");

        for (String str:elements) {
            System.out.printf("%s ", str);
        }
    }
}
