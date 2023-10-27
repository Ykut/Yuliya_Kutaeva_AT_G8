package classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class ListofColors {
    public static void main(String[] args) {
        List<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Green");
        color.add("Orange");
        color.add("White");
        color.add("Black");

        for (String str : color) {
            System.out.print(str + " ");
        }

        color.add(2, "Pink");
        color.add(4, "Yellow");

        for(int i=0; i< color.size(); i++){
            System.out.println(color.get(i));
            System.out.println(color.get(i));
        }
    }
}
