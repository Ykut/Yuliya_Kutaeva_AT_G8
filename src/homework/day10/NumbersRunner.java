package homework.day10;

import java.util.List;
import java.util.stream.Stream;

public class NumbersRunner {
    public static void main(String[] args) {
        List<Integer> numbers = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699).toList();

        //� ������ ������ �������������� ����� � ���������� ����� � ������� ����� ������

        numbers.forEach(System.out::println);
        System.out.println();

        //������������� � ����� ���������� � ������� � ����� ������

        numbers.stream().sorted().forEach(System.out::println);
        System.out.println();

        //��������� ����� ���� ����� � ������� ��������� � �������

        Integer sum = numbers.stream().reduce(Integer::sum).get();
        System.out.println(sum);
    }
}
