package homework.day10;

import java.util.stream.Stream;

public class ElementsRunner {
    public static void main(String[] args) {

        Stream<String> elements = Stream.of(
                "Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");

        //Если слово нечетное, то заменить в нем все буквы "e" на букву "o", а если четное, то
        // заменить слово на число количества буков в этом слове

        //Stream<String> elementStream = IntStream.range(1, elements.toArray().length).


        //Оставить в потоке только уникальные значения
        //Отпечатать в консоль с новой строки
        //elementStream.distinct().toList().forEach(System.out::println);


    }
}
