package classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class ListOfNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("���");
        names.add("����");
        names.add("���");
        names.add("����");
        names.add("����");

        for (String str: names){
            System.out.print(str + " ");
        }

        names.set(2,"���");
        names.set(4,"����");

        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }

        names.remove("���");

        names.remove(3);

        for(String str: names){
            System.out.print(str + " ");
        }
    }
}
