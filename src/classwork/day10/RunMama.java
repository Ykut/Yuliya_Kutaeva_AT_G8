package classwork.day10;

import java.util.Arrays;
import java.util.List;

public class RunMama {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        Boolean elem = list.stream().anyMatch("мама"::equals);
        System.out.println(elem);

        Boolean elemM = list.stream().allMatch(s -> s.contains("м"));
        System.out.println(elemM);

        List<String> collectElem = list.stream().map(s -> s + "м").toList();

        list.stream().flatMap(str -> Arrays.stream(str.split("а"))).filter(str -> !str.equals("")).toList();

        list.stream().sorted();

        for (String st:list)
            System.out.println(st);






    }
}
