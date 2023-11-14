package classwork.day10;

import java.util.Arrays;
import java.util.List;

public class
Ranner {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        String firstElem = list.stream().findFirst().orElse("мама");
        String firstElem2 = list.stream().filter("мама"::equals).findFirst().get();
        String firstElem3 = list.stream().skip(4).findFirst().get();
        List<String> firstElem4 = list.stream().skip(3).limit(2).toList();
        List<String> collection = list.stream().filter(s->s.contains("м")).distinct().toList();

    }
}
