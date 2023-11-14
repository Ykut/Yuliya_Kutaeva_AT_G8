package homework.day10;

import java.util.List;
import java.util.stream.Stream;

public class ElementsRunner {
    public static void main(String[] args) {

        List<String> elements = Stream.of(
                "Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb").toList();

        //���� ����� ��������, �� �������� � ��� ��� ����� "e" �� ����� "o", � ���� ������, ��
        // �������� ����� �� ����� ���������� ����� � ���� �����

        elements = elements.stream().map(element -> {
            if ((element.indexOf(element) + 1) % 2 != 0) {
                element = element.replace("e", "o");
                return element;
            } else return element = Integer.toString(element.length());
        }).peek(System.out::println).toList();
        System.out.println();

        //�������� � ������ ������ ���������� ��������

        elements = elements.stream().distinct().toList();

        //���������� � ������� � ����� ������

        elements.forEach(System.out::println);

    }
}
