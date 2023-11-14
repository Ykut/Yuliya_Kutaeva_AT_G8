package homework.day9.stream;

import java.util.ArrayList;
import java.util.List;

public class CitiesRunner {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        int summ = cities.stream().mapToInt(String::length).sum();

        System.out.println(summ);
    }
}
