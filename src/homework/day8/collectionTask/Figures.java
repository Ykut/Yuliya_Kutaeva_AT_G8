package homework.day8.collectionTask;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Figures {
    public static void main(String[] args) throws IOException {

        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

        BufferedWriter out = new BufferedWriter(new FileWriter("figures.txt"));
        for (String str: figures) {
            out.write("-"+str);//вывести в файл
        }
        out.close();

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

        for (String str3: figures) {
            System.out.print(str3+" ");
        }
    }
}
