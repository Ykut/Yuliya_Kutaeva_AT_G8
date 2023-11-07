package homework.day9.stream;

import java.util.ArrayList;
import java.util.List;

public class ButterfliesRunner {
    public static void main(String[] args) {
        // Создать пустой список стрингов butterflies (через new ArrayList)
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        //Добавить к каждому элементу кавычки
        butterflies = butterflies.stream().map(s -> ("\"" + s + "\"")).toList();

        //Оставить только те слова, которые содержат букву "a" и букву "о"
        butterflies = butterflies.stream().filter(s -> s.contains("o") && s.contains("a")).toList();
        butterflies.forEach(System.out::println);

    }
}
