package homework.day9.stream;

import java.util.ArrayList;
import java.util.List;

public class ButterfliesRunner {
    public static void main(String[] args) {
        // ������� ������ ������ �������� butterflies (����� new ArrayList)
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        //�������� � ������� �������� �������
        butterflies = butterflies.stream().map(s -> ("\"" + s + "\"")).toList();

        //�������� ������ �� �����, ������� �������� ����� "a" � ����� "�"
        butterflies = butterflies.stream().filter(s -> s.contains("o") && s.contains("a")).toList();
        butterflies.forEach(System.out::println);

    }
}
