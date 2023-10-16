package homework.day2.cycletask;

import java.util.Random;

public class CreateMass{
    int[] massive;

    public CreateMass(int[] massive) {
        this.massive = massive;
     }

    public void setElements() {
        Random r = new Random();

        for (int i=0; i<massive.length; i++) {
            massive[i] = r.nextInt(massive.length);
        }
        for (int i:massive) {
            System.out.print(massive[i]);
        }
        System.out.println();
    }

}

