package homework.day8.collectionTask;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        for (int num:numbers) {
            System.out.println(num);
        }

        int sum=0;
        for (int num:numbers){
            sum+=num;
        }
        System.out.println("Ñóììà "+sum);

        Collections.sort(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+" ");
        }

        Collections.reverse(numbers);
        System.out.print("\n");

        for (int num:numbers){
            System.out.print(num+" ");
        }
    }
}


