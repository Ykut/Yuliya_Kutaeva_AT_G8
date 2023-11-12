package homework.day10;

import homework.day8.objects.Water;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaterRunner {
    public static void main(String[] args) {
        //Создать поток данных water класса Water (через new Stream.of)
        //из 4 объектов воды с цветом (Прозрачная, Прозрачная, Мутная, Синяя)
        // и запахом (Нет, Нет, Аммиачный, Мятный) соответственно

        Stream<Water> water = Stream.of(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"),
                new Water("Синяя", "Мятный")
        );
//Отфильтровать воду, цвет которой не "Прозрачная"

        //water.filter(water1 -> !water1.getColor().equals("Прозрачная")).peek(System.out::println).toList();

//Отсортировать в нисходящем порядке по запаху

        //water.sorted((w1,w2)->-w1.getSmell().compareTo(w2.getSmell())).peek(System.out::println).toList();

//На основании существующего потока данных создать новый, в котором каждая новая Water
// имеет запах с удвоенной буквой ы, если такая встречается

        List<Water> newWater = water.map(water1 -> {
            if (water1.getSmell().contains("ы"))
                water1.setSmell(water1.getSmell().replace("ы", "ыы"));
            return water1;
        }).peek(System.out::println).toList();

//Обьединить запах всех обьектов в одну строку

        String smellString = newWater.stream().map(Water::getSmell).collect(Collectors.joining());

//Найти количество буков в ней и отпечатать в консоль

        System.out.println(Arrays.stream(smellString.split("")).count());

    }
}
