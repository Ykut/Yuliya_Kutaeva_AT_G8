package homework.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BirdsRunner {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("�����", "�����", "�����", "������", "�������", "�����");

        //������� �� ������ ����� ������, �������� � ������ ����� "�" �� ����� "�"

        birds = birds.stream().map(s -> s.replace("�", "�")).peek(System.out::println).toList();

        //������� ��� ����� � ���� ������ � ������ ��������

        System.out.println(birds.stream().collect(Collectors.joining("")).toLowerCase());

        //������ ��� ������� ������� �����

        birds = birds.stream().map(s -> s.replace("�", "")).peek(System.out::println).toList();
        System.out.println();

        //������� �� ����� ������ �� ����� "�"
        birds = birds.stream().flatMap(s->Arrays.stream(s.split("�"))).peek(System.out::println).toList();
        System.out.println();

        //���������� � ������� � ����� ������ � ���� --�����--
        birds.forEach(s-> System.out.println("--" + s + "--"));
    }
}
