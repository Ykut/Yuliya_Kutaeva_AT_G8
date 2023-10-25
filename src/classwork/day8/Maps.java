package classwork.day8;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {


        Map<Integer, String> words = new HashMap<>();
        String[] array = "мама мыла раму мыла".split(" ");

        for (int i = 0; i < array.length; i++){
            words.put(i,array[i]);
        }

        for (int i: words.keySet()) {
            System.out.println(i);
        }

        for (String str: words.values()) {
            System.out.println(str);
        }

        for (Map.Entry <Integer,String> en:
             words.entrySet()) {
            System.out.println(en.getKey() + en.getValue());
        }


    }
}
