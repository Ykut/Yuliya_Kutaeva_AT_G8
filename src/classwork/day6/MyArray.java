package classwork.day6;

import java.util.ArrayList;
import java.util.List;

public class MyArray {
    public static void main(String[] args) {
        List<String> newList = new ArrayList();

        String s = "мама мыла раму мыла";
        String[] inWords = s.split("");

        for (String i: inWords){
            newList.add(i);
        }

        for (int i=0; i<newList.size();i++){
            System.out.println(newList.get(i));
        }

        for (String i:newList){
            System.out.println(i);
        }


    }



}
