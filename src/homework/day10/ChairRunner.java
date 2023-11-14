package homework.day10;

import homework.day8.objects.Bubble;
import homework.day8.objects.Chair;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ChairRunner {
    public static void main(String[] args) throws IOException {
        //������� ����� ������ furniture ������ Chair (����� new Stream.of) furniture �� 3 �������
        //������� (120, 90, 100, 110) � ������� (40, 30, 50, 45) ��������������

        List<Chair> furniture = Stream.of(
                new Chair(120, 40),
                new Chair(90, 30),
                new Chair(100, 50),
                new Chair(110, 45)
        ).toList();

        //������������� ������ �� ������, ������� ���� ��� ����� 100 � ��� ��� ����� 50

        furniture.stream().filter(chair -> (chair.getHeight() >= 100 && chair.getWidth() <= 50))
                .peek(System.out::println).toList();

        //������������� �� ������, � ���� ������ �����, �� �� ������ � ���������� �������

        //furniture.stream().sorted((ch1, ch2) -> ch1.getHeight() );

        //�� ��������� ������������� ������ ������ ������� �����, � ������� ������ ����� Chair ����� ������,
        // �������� �� 2, � ������, ���������� �� ��������� ����� �� 3 �� 8 ������������

        Random random = new Random();

        List<Chair> newFurniture = furniture.stream().peek(chair -> {
            chair.setHeight(chair.getHeight() / 2);
            chair.setWidth(chair.getWidth() * random.nextInt(3, 9));
        }).peek(System.out::println).toList();

        //�� ��������� ������������� ������ ������ ������� �����, �������������� ����� ���������� ���� ����� �������
        // ���������� �� �� ������

        List<Integer> anotherFurniture = newFurniture.stream()
                .map(chair -> (chair.getWidth()* chair.getHeight())).distinct().peek(System.out::println).toList();

        //����� ���������� �������� � ������������ ������

        int maxElem = anotherFurniture.stream().max(Comparator.naturalOrder()).get();

        //������� ����� ������ Bubble � ������� ������ ���������� ����������� ��������
        // � ������ ������ ���������� ����������� ��������,
        // �������������� � ���� ���������� ��������� ������ ����� ����� ����� ��������, ���������� ���� ������

        Bubble bubble = new Bubble(maxElem, (
                Arrays.stream(String.valueOf(maxElem).split("")).map(s -> {
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
                }).collect(Collectors.joining(" ")))
                );

        //���������� ��������� �������� ����������� ������� � ��������� ����

        BufferedWriter out = new BufferedWriter(new FileWriter("Bubble.txt"));

        out.write(bubble.toString());

        out.close();


    }
}
