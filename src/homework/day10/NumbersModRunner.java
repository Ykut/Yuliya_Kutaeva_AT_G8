package homework.day10;

import java.util.Arrays;
import java.util.stream.Stream;

public class NumbersModRunner {
    public static void main(String[] args) {
        //������� ����� ������ ����� ����� numbersMod �� 8 ����� (626, 435, 9, 1463268, 24, 2237, 33, 9090) ����� (Stream.of())
        Stream<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);

        //������������� �� �����, ������� ��������� ����� 3
        //numbersMod.filter(integer -> integer.toString().contains("3")).forEach(x -> System.out.println(x));

        //������� ����� �� ��������� ����� � �������� ����� ���������������� �������
        numbersMod.flatMap(integer -> Arrays.stream(integer.toString().split("")))
                .map(s -> {
                    switch (s) {
                        case "0" -> s = "����";
                        case "1" -> s = "����";
                        case "2" -> s = "���";
                        case "3" -> s = "���";
                        case "4" -> s = "������";
                        case "5" -> s = "����";
                        case "6" -> s = "�����";
                        case "7" -> s = "����";
                        case "8" -> s = "������";
                        case "9" -> s = "������";
                    }
                    return s;
                }).toList().forEach(System.out::println);
        //�������� ������ ���������� �����, ������������� � ���������� ������� � ���������� � ������� � ����� ������

        numbersMod.distinct().sorted((s1,s2)->-s1.compareTo(s2)).toList().forEach(System.out::println);
    }
}
