package homework.day10;

import java.util.stream.Stream;

public class NumbersRunner {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        //� ������ ������ �������������� ����� � ���������� ����� � ������� ����� ������
        numbers.forEach(System.out::println);

        //������������� � ����� ���������� � ������� � ����� ������
        numbers.sorted().forEach(System.out::println);

        //��������� ����� ���� ����� � ������� ��������� � �������

        Integer sum = numbers.reduce((i1, i2) -> i1+i2).get();
        System.out.println(sum);
    }
}
