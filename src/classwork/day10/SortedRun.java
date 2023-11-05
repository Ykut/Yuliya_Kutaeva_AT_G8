package classwork.day10;

import java.util.Arrays;
import java.util.List;

public class SortedRun {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        List<String> elems = list.stream().sorted().toList();

        for (String st:elems)
            System.out.println(st);

        List<String> elems2 = list.stream().sorted((s1,s2)->s1.compareTo(s2)).distinct().toList();
    }
}
