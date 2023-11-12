package homework.day10;

import homework.day8.objects.Sand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SandboxRunner {
    public static void main(String[] args) {
        List<Sand> sandbox = new ArrayList<>();

        //Заполнить 5 объектами песка с весом (12, 8, 15, 7, 11)
        // и именами (Речной, Речной, Карьерный, Карьерный, Речной) соответственно

        sandbox = Arrays.asList(
                new Sand(12, "Речной"),
                new Sand(8, "Речной"),
                new Sand(15, "Карьерный"),
                new Sand(7, "Карьерный"),
                new Sand(11, "Речной")
        );
//Отфильтровать только тот песок, который весит больше 9
// и имя которого содержит букву "ч"

        sandbox.stream().filter(sand -> sand.getWeight() > 9 && sand.getName().contains("ч"))
                .peek(System.out::println).toList();

//Отсортировать по весу в восходящем порядке

        sandbox.stream().sorted(Comparator.comparingInt(Sand::getWeight)).peek(System.out::println).toList();

//На основании существующего потока данных создать новый, в котором каждый новый Sand имеет вес умноженный на 2,
// и имя в верхнем регистре

        List<Sand> newSandbox = sandbox.stream().map(sand -> {
            sand.setWeight(sand.getWeight() * 2);
            sand.setName(sand.getName().toUpperCase());
            return sand;
        }).peek(System.out::println).toList();

//На основании получившегося потока данных создать коллекцию Map, где ключ - это вес, а значение - имя

        newSandbox.stream().collect(Collectors.toMap(Sand::getWeight, Sand::getName))
                .forEach((key, value) -> System.out.println(key + " " + value));

    }
}
