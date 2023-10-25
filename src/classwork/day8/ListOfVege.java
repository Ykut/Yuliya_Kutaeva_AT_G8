package classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class ListOfVege {
    public static void main(String[] args) {

            List<String> vegetables = new ArrayList<>();
        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картоха");

            for (String str : vegetables) {
                System.out.print(str + " ");
            }
            int i=0;

            for (String str: vegetables) {
                if (str.contains("a"))
                    i++;
            }

        System.out.println(i);

        for (int j = 0; j < vegetables.size(); j++) {
            System.out.print(vegetables.get(j)+" ");
        }

        vegetables.remove("Огурец");
        vegetables.remove(3);






    }

}
