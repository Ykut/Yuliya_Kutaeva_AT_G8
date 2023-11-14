package homework.day10;

import java.util.List;
import java.util.stream.Stream;

public class NumbersRunner {
    public static void main(String[] args) {
        List<Integer> numbers = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699).toList();

        //В потоке данных проитерировать числа и отпечатать числа в консоль новой строки

        numbers.forEach(System.out::println);
        System.out.println();

        //Отсортировать и снова отпечатать в консоль с новой строки

        numbers.stream().sorted().forEach(System.out::println);
        System.out.println();

        //Посчитать сумму всех чисел и вывести результат в консоль

        Integer sum = numbers.stream().reduce(Integer::sum).get();
        System.out.println(sum);
    }
}
