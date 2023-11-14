package homework.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NumbersModRunner {
    public static void main(String[] args) {
        //������� ����� ������ ����� ����� numbersMod �� 8 ����� (626, 435, 9, 1463268, 24, 2237, 33, 9090) ����� (Stream.of())

        List<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090).toList();

        //������������� �� �����, ������� ��������� ����� 3

        numbersMod = numbersMod.stream().filter(integer -> integer.toString()
                .contains("3")).peek(System.out::println).toList();
        System.out.println();
        //������� ����� �� ��������� ����� � �������� ����� ���������������� �������

        List <String> numbersMod1 = numbersMod.stream().flatMap(integer -> Arrays.stream(integer.toString().split("")))
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
                }).peek(System.out::println).toList();
        System.out.println();
        //�������� ������ ���������� �����, ������������� � ���������� ������� � ���������� � ������� � ����� ������

        numbersMod1.stream().distinct().sorted((s1,s2)->-s1.compareTo(s2)).toList().forEach(System.out::println);
    }
}
