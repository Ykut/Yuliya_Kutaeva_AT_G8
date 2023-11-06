package homework.day8.collectionTask;

import homework.day8.objects.Water;

import java.util.Arrays;
import java.util.List;

public class Waters {
    public static void main(String[] args) {
        List<Water> water = Arrays.asList(new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"), new Water("Мутная", "Аммиачный"));

        for (Water pairs: water){
            System.out.println(pairs.getColor()+"-"+pairs.toString());
        }
    }
}
