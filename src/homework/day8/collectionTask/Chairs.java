package homework.day8.collectionTask;

import homework.day8.objects.Chair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Chairs {
    public static void main(String[] args) {
        List<Chair> furniture = Arrays.asList(new Chair(1,2), new Chair(4, 2),
                new Chair(2, 4));

        for (Chair chair: furniture) {
            System.out.print(chair.getHeight()* chair.getWidth()+" ");
        }
        System.out.println();
        Map<Integer, Chair> furnitureMap = new HashMap<>();
        for (int i = 0; i < furniture.size(); i++) {
            furnitureMap.put(i, furniture.get(i));
        }
        for (int i:furnitureMap.keySet()) {
            System.out.println(i);
        }
        System.out.println();
        for (Chair chair: furnitureMap.values()){
            System.out.println(chair);
        }
        System.out.println();
        for (Map.Entry<Integer, Chair> obj: furnitureMap.entrySet()) {
            System.out.println(obj.getKey()+"-" +obj.getValue());
        }

    }
}
