package classwork.day9;

import java.util.Arrays;
import java.util.List;

public class ListString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("����", "����", "����", "����", "�����");

        long num = list.stream().filter(x->x.equals("����")).count();
    }
}
