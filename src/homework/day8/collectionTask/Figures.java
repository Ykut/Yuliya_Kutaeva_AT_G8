package homework.day8.collectionTask;

import java.util.Arrays;
import java.util.List;

public class Figures {
    public static void main(String[] args) {
        List<String> figures = Arrays.asList("����", "�������������", "����", "�������", "������");

        for (String str: figures) {
            System.out.println(str);//������� � ����
        }

        int i=0;
        for(String str2:figures){
            if(!str2.contains("�"))
                i++;
        }

        System.out.println(i);

        for (String figure : figures) {
            System.out.print(figure + " ");
        }
        System.out.print("\n");
         try {
                figures.add(3,"�����������");
         }
        catch (UnsupportedOperationException e){
            System.out.println(e.getClass() + " � ������ figures ������ �������� �������");
        }

        for (String str3: figures) {
            System.out.print(str3+" ");
        }
    }
}
