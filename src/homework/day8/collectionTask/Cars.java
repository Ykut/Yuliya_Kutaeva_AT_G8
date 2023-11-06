package homework.day8.collectionTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<String>(Arrays.asList("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди"));

        for (String str: cars) {
            System.out.printf("\"%s\"%n", str);
        }

        for (int i=0; i< cars.size();i++) {
            if (cars.get(i).length()>4)
                cars.remove(i);
        }

        for (String  car2:cars) {
            System.out.print(car2+" ");
        }
    }
}
