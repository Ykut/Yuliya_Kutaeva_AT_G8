package homework.day9.stream;

import java.util.List;
import java.util.stream.Stream;

public class FiguresRunner {
    public static void main(String[] args) {

        List<String> figures = Stream.of("����", "�������������", "����", "�������", "������").toList();

        //�������� ������ ����� �� ����� �����, ��������������� ���������� ����� � �����
        List<Integer> figuresToNum = figures.stream().map(s -> s.length()).toList();

        //������������� �����, ������� ������ 4

        figuresToNum = figuresToNum.stream().filter(s -> s > 4).toList();
        figuresToNum.forEach(System.out::println);

    }
}
