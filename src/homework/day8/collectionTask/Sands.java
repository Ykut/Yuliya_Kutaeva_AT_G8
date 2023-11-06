package homework.day8.collectionTask;

import homework.day8.objects.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sands {
    public static void main(String[] args) {
        List<Sand> sandbox = new ArrayList<>();

        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));

        for (Sand weight: sandbox) {
            System.out.print(weight.getWeight()+" ");
        }
        System.out.println();
        for (Sand name: sandbox) {
            System.out.print(name.getName()+" ");
        }
        System.out.println();
        Map<Integer, Sand> sands = new HashMap<>();
        for (int i = 0; i < sandbox.size(); i++) {
            sands.put(i, sandbox.get(i));
        }

        for (int i: sands.keySet()) {
            System.out.println(i);
        }

        for (Sand obj: sands.values()) {
            System.out.println(obj);
        }

        for (Map.Entry<Integer, Sand> pairs: sands.entrySet()) {
            System.out.println(pairs.getKey() + "-" + pairs.getValue());
        }

    }
}
