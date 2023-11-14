package homework.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NumbersModRunner {
    public static void main(String[] args) {
        //Создать поток данных целых чисел numbersMod из 8 чисел (626, 435, 9, 1463268, 24, 2237, 33, 9090) через (Stream.of())

        List<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090).toList();

        //Отфильтровать те числа, которые содержать цифру 3

        numbersMod = numbersMod.stream().filter(integer -> integer.toString()
                .contains("3")).peek(System.out::println).toList();
        System.out.println();
        //Разбить числа на отдельные цифры и заменить цифры соответствующими словами

        List <String> numbersMod1 = numbersMod.stream().flatMap(integer -> Arrays.stream(integer.toString().split("")))
                .map(s -> {
                    switch (s) {
                        case "0" -> s = "ноль";
                        case "1" -> s = "один";
                        case "2" -> s = "два";
                        case "3" -> s = "три";
                        case "4" -> s = "четыре";
                        case "5" -> s = "пять";
                        case "6" -> s = "шесть";
                        case "7" -> s = "семь";
                        case "8" -> s = "восемь";
                        case "9" -> s = "девять";
                    }
                    return s;
                }).peek(System.out::println).toList();
        System.out.println();
        //Оставить только уникальные слова, отсортировать в нисходящем порядке и отпечатать в консоль с новой строки

        numbersMod1.stream().distinct().sorted((s1,s2)->-s1.compareTo(s2)).toList().forEach(System.out::println);
    }
}
