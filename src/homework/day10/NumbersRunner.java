package homework.day10;

import java.util.stream.Stream;

public class NumbersRunner {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        //В потоке данных проитерировать числа и отпечатать числа в консоль новой строки
        numbers.forEach(System.out::println);

        //Отсортировать и снова отпечатать в консоль с новой строки
        numbers.sorted().forEach(System.out::println);

        //Посчитать сумму всех чисел и вывести результат в консоль

        Integer sum = numbers.reduce((i1, i2) -> i1+i2).get();
        System.out.println(sum);
    }
}
