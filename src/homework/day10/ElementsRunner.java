package homework.day10;

import java.util.List;
import java.util.stream.Stream;

public class ElementsRunner {
    public static void main(String[] args) {

        List<String> elements = Stream.of(
                "Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb").toList();

        //Если слово нечетное, то заменить в нем все буквы "e" на букву "o", а если четное, то
        // заменить слово на число количества буков в этом слове

        elements = elements.stream().map(element -> {
            if ((element.indexOf(element) + 1) % 2 != 0) {
                element = element.replace("e", "o");
                return element;
            } else return element = Integer.toString(element.length());
        }).peek(System.out::println).toList();
        System.out.println();

        //Оставить в потоке только уникальные значения

        elements = elements.stream().distinct().toList();

        //Отпечатать в консоль с новой строки

        elements.forEach(System.out::println);

    }
}
