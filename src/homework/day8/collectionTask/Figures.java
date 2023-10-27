package homework.day8.collectionTask;

import java.util.Arrays;
import java.util.List;

public class Figures {
    public static void main(String[] args) {
        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

        for (String str: figures) {
            System.out.println(str);//вывести в файл
        }

        int i=0;
        for(String str2:figures){
            if(!str2.contains("и"))
                i++;
        }

        System.out.println(i);

        for (String figure : figures) {
            System.out.print(figure + " ");
        }
        System.out.print("\n");
         try {
                figures.add(3,"Треугольник");
         }
        catch (UnsupportedOperationException e){
            System.out.println(e.getClass() + " В список figures нельзя добавить элемент");
        }

        for (String str3: figures) {
            System.out.print(str3+" ");
        }
    }
}
