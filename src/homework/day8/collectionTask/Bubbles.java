package homework.day8.collectionTask;

import homework.day8.objects.Bubble;

import java.util.Arrays;
import java.util.List;

public class Bubbles {
    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"),
                new Bubble(5, "CO"));

        for (Bubble vol: bubbles) {
            System.out.print(vol.getVolume()+" ");
        }

        System.out.println();

        for (Bubble name: bubbles) {
            System.out.print(name.getName()+" ");
        }

        System.out.println();

        int sum=0;
        for (Bubble volume: bubbles) {
            sum+=volume.getVolume();
        }
        System.out.println("־בשטי מבתול "+sum);

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }
}
