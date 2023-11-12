package homework.day10;

import homework.day8.objects.Sand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class SandboxRunner {
    public static void main(String[] args) throws IOException {
        List<Sand> sandbox = new ArrayList<>();

        //��������� 5 ��������� ����� � ����� (12, 8, 15, 7, 11)
        // � ������� (������, ������, ���������, ���������, ������) ��������������

        sandbox = Arrays.asList(
                new Sand(12, "������"),
                new Sand(8, "������"),
                new Sand(15, "���������"),
                new Sand(7, "���������"),
                new Sand(11, "������")
        );
//������������� ������ ��� �����, ������� ����� ������ 9
// � ��� �������� �������� ����� "�"

        sandbox.stream().filter(sand -> sand.getWeight() > 9 && sand.getName().contains("�"))
                .peek(System.out::println).toList();

//������������� �� ���� � ���������� �������

        sandbox.stream().sorted(Comparator.comparingInt(Sand::getWeight)).peek(System.out::println).toList();

//�� ��������� ������������� ������ ������ ������� �����, � ������� ������ ����� Sand ����� ��� ���������� �� 2,
// � ��� � ������� ��������

        List<Sand> newSandbox = sandbox.stream().map(sand -> {
            sand.setWeight(sand.getWeight() * 2);
            sand.setName(sand.getName().toUpperCase());
            return sand;
        }).peek(System.out::println).toList();

//�� ��������� ������������� ������ ������ ������� ��������� Map, ��� ���� - ��� ���, � �������� - ���

        Map<Integer, String> newSandboxMap = newSandbox.stream().collect(Collectors.toMap(Sand::getWeight, Sand::getName));

//���������� ������ �� ��������� ����� � ���� value:key � ��������� ����

        BufferedWriter out = new BufferedWriter(new FileWriter("SandboxMap.txt"));

        newSandboxMap.forEach((key, value) -> {
            try {
                out.write(key + ":" +value+"\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        out.close();

    }
}
