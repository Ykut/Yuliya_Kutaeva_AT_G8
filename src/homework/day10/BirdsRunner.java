package homework.day10;

import java.util.Arrays;
import java.util.List;

public class BirdsRunner {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        //Создать из списка поток данных, заменить в каждую букву "о" на букву "а"
        birds = birds.stream().map(s -> s.replace("о", "а")).toList();
        birds.forEach(System.out::println);

        //Собрать все слова в одну строку в ниждем регистре
        birds = birds.stream().map(s->s.toLowerCase()).toList();
        birds.forEach(s-> System.out.print(s+" "));

        //Убрать все символы мягкого знака
        birds = birds.stream().map(s -> s.replace("ь", "")).toList();
        birds.forEach(s-> System.out.print(s+" "));

        //Разбить на новые строки по букве "б"
        birds = birds.stream().flatMap(s->Arrays.stream(s.split("б"))).toList();
        birds.forEach(System.out::println);

        //Отпечатать в консоль с новой строки в виде --Чайка--
        birds.forEach(s-> System.out.println("--" + s + "--"));
    }
}
