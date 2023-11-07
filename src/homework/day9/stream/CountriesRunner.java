package homework.day9.stream;

import java.util.stream.Stream;

public class CountriesRunner {
    public static void main(String[] args) {

        Stream<String> countries = Stream.of("������", "����������", "������", "������");

        //������������� ������, ������� �������� � ���� ���� �� ���� ������� �����
        countries = countries.filter(s -> s.matches(".*[���娸������������]+.*"));

        //������������� ������, � �������� ������� ������ 7 ����
        countries = countries.filter(s -> s.length()<7);

        //��������� ��� ������ � ������� �������
        countries = countries.map(String::toUpperCase);

        //�������� � ������� �������� �������
        countries = countries.map(s -> ("\"" + s + "\""));

        //���������� � ������� � ����� ������
        countries.forEach(System.out::println);

    }
}
