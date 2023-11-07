package homework.day10;

import java.util.Arrays;
import java.util.List;

public class BirdsRunner {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("�����", "�����", "�����", "������", "�������", "�����");

        //������� �� ������ ����� ������, �������� � ������ ����� "�" �� ����� "�"
        birds = birds.stream().map(s -> s.replace("�", "�")).toList();
        birds.forEach(System.out::println);

        //������� ��� ����� � ���� ������ � ������ ��������
        birds = birds.stream().map(s->s.toLowerCase()).toList();
        birds.forEach(s-> System.out.print(s+" "));

        //������ ��� ������� ������� �����
        birds = birds.stream().map(s -> s.replace("�", "")).toList();
        birds.forEach(s-> System.out.print(s+" "));

        //������� �� ����� ������ �� ����� "�"
        birds = birds.stream().flatMap(s->Arrays.stream(s.split("�"))).toList();
        birds.forEach(System.out::println);

        //���������� � ������� � ����� ������ � ���� --�����--
        birds.forEach(s-> System.out.println("--" + s + "--"));
    }
}
