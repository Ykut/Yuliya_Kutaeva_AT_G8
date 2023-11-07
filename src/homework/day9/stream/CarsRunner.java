package homework.day9.stream;

import java.util.stream.Stream;

public class CarsRunner {
    public static void main(String[] args) {
       Stream<String> cars = Stream.of("����", "����", "������", "����", "������", "������", "����");

       //�������� � ������ ������ ���������� �������� ����
       cars = cars.distinct();

       //������������� ������ �� ��������, ������� �������� ����� "�"
        cars = cars.filter(s -> s.contains("�"));

        //���������� 1 ��������
        cars = cars.skip(1);

        //��� �������� �������� � ������� �������
        cars =  cars.map(s->s.toUpperCase());

        //���������� ��� �������� � ������� � ����� ������
       cars.forEach(System.out::println);

    }
}
