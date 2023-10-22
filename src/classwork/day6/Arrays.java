package classwork.day6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        List<String> mylist2 = new LinkedList<>();

        long t0 = System.currentTimeMillis();

        for (int i=0; i<10000000; i++){
            myList.add("some"+i);
        }

        System.out.println("Время работы первого цикла: "+ (System.currentTimeMillis()-t0));

        t0=System.currentTimeMillis();
        for (int i=0; i<10000000; i++){
            mylist2.add("some"+i);
        }

        System.out.println("Время работы второго цикла: "+ (System.currentTimeMillis()-t0));
    }
}
