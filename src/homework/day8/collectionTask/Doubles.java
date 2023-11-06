package homework.day8.collectionTask;

import java.util.Arrays;
import java.util.List;

public class Doubles {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        for (double num: doubles) {
            System.out.print(num + " ");
        }

        double mul = 1;
        for (int i = 0; i < doubles.size(); i++) {
            mul *= doubles.get(i);
        }
        System.out.println("\n������������ " + mul);

        double sum=0;

        for (double num:doubles) {
             sum += num%1;
        }

        System.out.println("����� ������� ������ "+sum);

        for (int i = 0; i < doubles.size(); i++) {

            System.out.print(doubles.get(i).intValue()+" ");
        }

    }
}
