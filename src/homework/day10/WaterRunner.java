package homework.day10;

import homework.day8.objects.Water;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaterRunner {
    public static void main(String[] args) {
        //������� ����� ������ water ������ Water (����� new Stream.of)
        //�� 4 �������� ���� � ������ (����������, ����������, ������, �����)
        // � ������� (���, ���, ���������, ������) ��������������

        List<Water> water = Stream.of(
                new Water("����������", "���"),
                new Water("����������", "���"),
                new Water("������", "���������"),
                new Water("�����", "������")
        ).toList();

//������������� ����, ���� ������� �� "����������"

        water.stream().filter(water1 -> !water1.getColor().equals("����������")).peek(System.out::println).toList();

//������������� � ���������� ������� �� ������

        water.stream().sorted((w1, w2) -> -w1.getSmell().compareTo(w2.getSmell())).peek(System.out::println).toList();

//�� ��������� ������������� ������ ������ ������� �����, � ������� ������ ����� Water
// ����� ����� � ��������� ������ �, ���� ����� �����������

        List<Water> newWater = water.stream().map(water1 -> {
            if (water1.getSmell().contains("�"))
                water1.setSmell(water1.getSmell().replace("�", "��"));
            return water1;
        }).peek(System.out::println).toList();

//���������� ����� ���� �������� � ���� ������

        String smellString = newWater.stream().map(Water::getSmell).collect(Collectors.joining());
        System.out.println(smellString);

//����� ���������� ����� � ��� � ���������� � �������

        System.out.println(Arrays.stream(smellString.split("")).count());

    }
}
