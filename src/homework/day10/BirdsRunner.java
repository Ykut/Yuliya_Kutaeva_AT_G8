package homework.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BirdsRunner {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        //Создать из списка поток данных, заменить в каждую букву "о" на букву "а"

        birds = birds.stream().map(s -> s.replace("о", "а")).peek(System.out::println).toList();

        //Собрать все слова в одну строку в ниждем регистре

        System.out.println(birds.stream().collect(Collectors.joining("")).toLowerCase());

        //Убрать все символы мягкого знака

        birds = birds.stream().map(s -> s.replace("ь", "")).peek(System.out::println).toList();
        System.out.println();

        //Разбить на новые строки по букве "б"
        birds = birds.stream().flatMap(s->Arrays.stream(s.split("б"))).peek(System.out::println).toList();
        System.out.println();

        //Отпечатать в консоль с новой строки в виде --Чайка--
        birds.forEach(s-> System.out.println("--" + s + "--"));
    }
}
