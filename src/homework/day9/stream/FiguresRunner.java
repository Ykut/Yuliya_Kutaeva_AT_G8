package homework.day9.stream;

import java.util.List;
import java.util.stream.Stream;

public class FiguresRunner {
    public static void main(String[] args) {

        List<String> figures = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс").toList();

        //Заменить каждое слово на целое число, соответствующее количеству буков в слове
        List<Integer> figuresToNum = figures.stream().map(s -> s.length()).toList();

        //Отфильтровать числа, которые больше 4

        figuresToNum = figuresToNum.stream().filter(s -> s > 4).toList();
        figuresToNum.forEach(System.out::println);

    }
}
