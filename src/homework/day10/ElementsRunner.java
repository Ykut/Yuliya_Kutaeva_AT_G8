package homework.day10;

import java.util.stream.Stream;

public class ElementsRunner {
    public static void main(String[] args) {

        Stream<String> elements = Stream.of(
                "Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");

        //���� ����� ��������, �� �������� � ��� ��� ����� "e" �� ����� "o", � ���� ������, ��
        // �������� ����� �� ����� ���������� ����� � ���� �����

        //Stream<String> elementStream = IntStream.range(1, elements.toArray().length).


        //�������� � ������ ������ ���������� ��������
        //���������� � ������� � ����� ������
        //elementStream.distinct().toList().forEach(System.out::println);


    }
}
