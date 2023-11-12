package homework.day10;

import homework.day8.objects.Sand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class SandboxRunner {
    public static void main(String[] args) throws IOException {
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

        Map<Integer, String> newSandboxMap = newSandbox.stream().collect(Collectors.toMap(Sand::getWeight, Sand::getName));

//Отпечатать каждый из элементов карты в виде value:key в текстовый файл

        BufferedWriter out = new BufferedWriter(new FileWriter("SandboxMap.txt"));

        newSandboxMap.forEach((key, value) -> {
            try {
                out.write(key + ":" +value+"\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        out.close();

    }
}
