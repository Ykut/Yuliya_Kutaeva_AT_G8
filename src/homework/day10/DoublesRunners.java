package homework.day10;

import java.util.List;
import java.util.stream.Stream;

public class DoublesRunners {
    public static void main(String[] args) {
        Stream<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

//        ��������� ������ ����� �� ������
        doubles.map(aDouble -> Math.round(aDouble)).forEach(System.out::println);

//        �� ��������� ����� ������ ������������� ����� ����� ������ ����� ����� ��
//        ��������� ����� � ��������� �� 0 �� ����� �� �������� ������ ������

        List<Integer> newDoubles = doubles.map(Double::intValue).toList();

//        ������ ��������� ��������
        newDoubles.stream().distinct().toString();

//        �������� ������ ����� � ������������ ������ ������ ����� ������� ��������� �� �������� Bubble �
//        ���������� ������� ����������� �����,�������� ������� � ������� ������ ����� �� ��������� ������ �
//        ������ �� ����� "Bubble vol-" + i, ��� i - ����� �� ��������� ������

        //List<Bubble> bubbleList = newDoubles.stream().map();

//        ���������� � ������� ������ �� �������� ������ ������ � ����� ������


//        ����� ����� ����� ����������� ������ ��������� � ���������� � �������
    }
}
