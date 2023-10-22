package classwork.day6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> newList = new HashSet<>();

        String s = "мама мыла раму мыла";
        String[] inWords = s.split(" ");

        for (String i: inWords){
            newList.add(i);
        }

        Iterator<String> iterator = newList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String str: newList) {
            System.out.println(str);
        }

    }
}
