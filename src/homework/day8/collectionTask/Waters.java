package homework.day8.collectionTask;

import homework.day8.objects.Water;

import java.util.Arrays;
import java.util.List;

public class Waters {
    public static void main(String[] args) {
        List<Water> water = Arrays.asList(new Water("����������", "���"),
                new Water("����������", "���"), new Water("������", "���������"));

        for (Water pairs: water){
            System.out.println(pairs.getColor()+"-"+pairs.toString());
        }
    }
}
